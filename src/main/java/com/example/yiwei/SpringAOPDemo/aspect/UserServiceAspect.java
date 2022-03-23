package com.example.yiwei.SpringAOPDemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UserServiceAspect {

    @Before(value = "execution(* com.example.yiwei.SpringAOPDemo.service.UserService.*(..)) && args(id, username)")
    public void beforeAdvice(JoinPoint joinPoint, String id, String username) {
        System.out.println("Before method:" + joinPoint.getSignature());

        System.out.println("Creating a user with name - " + username + " and id - " + id);
    }

    @After(value = "execution(* com.example.yiwei.SpringAOPDemo.service.UserService.*(..)) && args(id, username)")
    public void afterAdvice(JoinPoint joinPoint, String id, String username) {
        System.out.println("After method:" + joinPoint.getSignature());

        System.out.println("Successfully created a user with name - " + id + " and id - " + username);
    }
}
