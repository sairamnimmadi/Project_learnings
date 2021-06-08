package org.epam.springcoreannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        @SuppressWarnings("resource")
		ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfiguration.class);
        
        Samsung phone = factory.getBean(Samsung.class);
       
        phone.config();
    }
}
