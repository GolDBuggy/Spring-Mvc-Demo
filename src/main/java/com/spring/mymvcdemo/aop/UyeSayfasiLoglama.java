package com.spring.mymvcdemo.aop;

import com.spring.mymvcdemo.entity.Uye;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.logging.Logger;

@Aspect
@Component
public class UyeSayfasiLoglama {

    private Logger logger=Logger.getLogger(getClass().getName());

    @Pointcut("execution(* com.spring.mymvcdemo.controller.*.*(..))")
    public void ifadeKontrolSinifi(){}

    @Pointcut("execution(* com.spring.mymvcdemo.services.UyeServiceImpl.*(..))")
    public void ifadeServisSinifi(){}

    @Pointcut("execution(* com.spring.mymvcdemo.dao.UyeDAOimpl.*(..))")
    public void ifadeDAO(){}

    @Before("execution(* com.spring.mymvcdemo.dao.UyeDAOimpl.*(..))")
    public void butunKayıtlar(JoinPoint joinPoint){
        MethodSignature methodSignature=(MethodSignature) joinPoint.getSignature();
        System.out.println(methodSignature.getName()+" Metodu kullanildi!");
        logger.info(methodSignature.getName()+" Metodu kullanildi!");

    }

    @AfterReturning(value = "ifadeDAO()",returning = "sonuc")
    public void listeKaydi(JoinPoint joinPoint, List<Uye> sonuc){
        MethodSignature methodSignature=(MethodSignature) joinPoint.getSignature();

        logger.info(methodSignature.getName()+" Metodu kullanildi ve bu degerler dondu ==> "+sonuc);

    }

}
