package com.stackroute;

import com.stackroute.config.AppConfig;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        Movie movie = (Movie) context.getBean("movie");
        System.out.println(movie);

        Movie movie1 = (Movie) context.getBean("movie1");
        System.out.println(movie1);

        Movie movie2 = (Movie) context.getBean("movie2");
        System.out.println(movie2);


        //Checking scope
        System.out.println(movie==movie1);

    }

}
