package com.stackroute.config;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBeanConfiguration
{


    @Bean(name = "movie")
    public Movie getMovie(){
        Actor actor=new Actor("Mahesh","Male",40);
        Movie movie=new Movie("Maharshi",actor);
        return movie;
    }
    @Bean(name = "movie1")
    public Movie getMovie1(){
        Actor actor1=new Actor("Prabhas","Male",40);
        Movie movie1=new Movie("Bahubali",actor1);
        return movie1;
    }
    @Bean(name = "movie2")
    public Movie getMovie2(){
        Actor actor1=new Actor("Anushka","Female",40);
        Movie movie1=new Movie("Arundathi",actor1);
        return movie1;
    }
    }


