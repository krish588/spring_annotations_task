package com.stackroute.config;

import com.stackroute.domain.Actor;
import com.stackroute.domain.BeanLifecycleDemoBean;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBeanConfiguration {


    @Bean(name = "movie")
    public Movie getMovie() {
        Movie movie = new Movie("Maharshi");
        return movie;
    }

    @Bean(name = "actor")
    public Actor getActor() {
        Actor actor = new Actor("Mahesh", "Male", 40);
        return actor;
    }

    @Bean(name="beanlifecycle")
    public BeanLifecycleDemoBean getBeanLifeCycle()
        {
           BeanLifecycleDemoBean beanLifecycleDemoBean=new BeanLifecycleDemoBean();
           return beanLifecycleDemoBean;
        }


}


