package com.gradbook.gradbookregistration.configs;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gradbook.gradbookregistration.models.ActivityLogger;
import com.gradbook.gradbookregistration.models.User;
import com.gradbook.gradbookregistration.repositories.UserRepository;
import org.aopalliance.intercept.Joinpoint;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;

@Component
@Aspect
public class RegistrationAspect {

    @Autowired
    private KafkaTemplate<String, String> template;

    @Autowired
    private UserRepository userRepository;

    @After("execution(* com.gradbook.gradbookregistration.controllers..*.*(..))")
    public void trace(JoinPoint joinPoint) throws Exception{

        this.template.send("ums_logger", "IN the registration");
    }

}
