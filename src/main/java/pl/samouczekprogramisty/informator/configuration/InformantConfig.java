package pl.samouczekprogramisty.informator.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan("pl.samouczekprogramisty.informator")
@EnableSpringDataWebSupport
public class InformantConfig implements WebMvcConfigurer {
}