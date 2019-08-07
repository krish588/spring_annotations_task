package com.stackroute.config;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBeanConfiguration
{
    @Bean(name = "movie")
    public Movie getMovie(){
        Movie movie=new Movie();
        movie.setMovie_name("Maharshi");
        return movie;
    }
    @Bean(name = "actor")
    public Actor getActor(){
        Actor actor=new Actor();
        actor.setActor_name("Mahesh");
        actor.setActor_gender("Male");
        actor.setActor_age(40);
        return actor;
    }
}

