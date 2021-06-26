package com.scode.apo.aspect;

import com.scode.apo.model.request.UserRequest;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class UserServiceAspect {

    @Before(value = "execution(* com.scode.apo.service.UserService.*(..)) and args(userRequest)")
    public void beforeAdvice(JoinPoint joinPoint, UserRequest userRequest) {
        log.info("Before method: {}.{}", joinPoint.getSignature().getDeclaringTypeName(), joinPoint.getSignature().getName());
        log.info("Creating User with name: {}", userRequest.getName());
    }

    @After(value = "execution(* com.scode.apo.service.UserService.*(..)) and args(userRequest)")
    public void afterAdvice(JoinPoint joinPoint, UserRequest userRequest) {
        log.info("After method: {}.{}", joinPoint.getSignature().getDeclaringTypeName(), joinPoint.getSignature().getName());
        log.info("Created User with name: {}", userRequest.getName());
    }
}
