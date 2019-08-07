package com.stackroute.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {

    public BeanLifecycleDemoBean()
    {

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing a bean");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroying a bean");
    }
}
