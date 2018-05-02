package pl.samouczekprogramisty.informator.exceptions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collections;

@ControllerAdvice
@SuppressWarnings("unused")
@ResponseBody
public class InformatorExceptionHandler {

    private static ObjectMapper mapper = new ObjectMapper();

    public static class ErrorResponse {
        private static final MultiValueMap<String, String> HEADERS = new LinkedMultiValueMap<>(
                Collections.singletonMap(HttpHeaders.CONTENT_TYPE, Collections.singletonList(MediaType.APPLICATION_JSON_VALUE))
        );
        private final Exception exception;
        private HttpStatus responseStatus;

        ErrorResponse(HttpStatus responseStatus, Exception exception) {
            this.exception = exception;
            this.responseStatus = responseStatus;
        }

        ResponseEntity<String> buildResponse() {
            try {
                return new ResponseEntity<>(mapper.writeValueAsString(this), HEADERS, responseStatus);
            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }
        }

        public int getResponseCode() {
            return responseStatus.value();
        }

        public String getMessage() {
            return exception.getMessage();
        }

        public String getExceptionClass() {
            return exception.getClass().getCanonicalName();
        }
    }

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<String> handleNotFound(NotFoundException exception) {
        return new ErrorResponse(HttpStatus.NOT_FOUND, exception).buildResponse();
    }

    @ExceptionHandler(NumberFormatException.class)
    public ResponseEntity<String> handleNumberFormat(NumberFormatException exception) {
        return new ErrorResponse(HttpStatus.BAD_REQUEST, exception).buildResponse();
    }
}
