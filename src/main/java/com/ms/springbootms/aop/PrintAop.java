package com.ms.springbootms.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PrintAop {


    @Pointcut("execution(public * com.ms.springbootms.service..*(..)))")
    public void PrintAop(){

    }

    @Before("PrintAop()")
    public void doBeforeGame(){
        System.out.println("aop里的打印方法执行。。。。。");
    }
}
