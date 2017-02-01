package br.com.viniciusls.hourcontrol.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by vinicius.silva on 01/02/2017.
 */
public class ProjectInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { ProjectConfiguration.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        //return new Class[] { FirebaseConfig.class };
        return null;
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
}