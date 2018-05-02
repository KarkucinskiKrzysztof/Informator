package pl.samouczekprogramisty.informator.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.samouczekprogramisty.informator.exceptions.NotFoundException;
import pl.samouczekprogramisty.informator.model.Speaker;
import pl.samouczekprogramisty.informator.model.dao.SpeakerDao;
import pl.samouczekprogramisty.informator.view.SpeakerView;

@RestController
@RequestMapping("/speakers")
@SuppressWarnings("unused")
public class SpeakerController {

    private static final Logger LOG = LoggerFactory.getLogger(SpeakerController.class);

    @Autowired
    private SpeakerDao dao;

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public SpeakerView speaker(@PathVariable("id") Integer id, @PathVariable("id") Speaker speaker) {
        if (speaker == null) {
            throw new NotFoundException(String.format("Speaker with id %s wasn't found!", id));
        }
        return new SpeakerView(speaker);
    }

}

