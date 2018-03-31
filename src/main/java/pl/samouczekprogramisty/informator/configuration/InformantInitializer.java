package pl.samouczekprogramisty.informator.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class InformantInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] {InformantConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
}