package org.example.SpringSem8Hmwrk.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class NoteTimeTrackerAspect {
    /**
     *  Метод для подсчета продолжительности выполнения метода
     */
    @Around("execution(* org.example.SpringSem8Hmwrk.service.NoteServiceImplement.*(..))")
    public Object aroundMethodExecution(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Long startTime;
        // Сохранение времени начала выполнения метода
        startTime = System.currentTimeMillis();
        Object result = proceedingJoinPoint.proceed();
        // Подсчет продолжительности выполнения
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Продолжительность выполнения: " + duration + " миллисекунд");
        return result;
    }
}
