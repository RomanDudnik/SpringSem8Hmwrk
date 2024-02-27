package org.example.SpringSem8Hmwrk.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class NoteActionTrackerAspect {

    /**
     * Метод для регистрации действий метода
     * @param joinPoint
     */
    @Before("@annotation(TrackNoteAction)")
    public void beforeMethodExecution(JoinPoint joinPoint){
        // Получение информации о методе, классе и параметрах
        String methodName = joinPoint.getSignature().getName();
        String className = joinPoint.getTarget().getClass().getSimpleName();
        Object[] methodArgs = joinPoint.getArgs();

        // Регистрация действия пользователя
        System.out.println("Метод " + methodName + " класса " + className + " был вызван с параметрами:");
        for (Object arg : methodArgs) {
            System.out.println(arg);
        }
    }

    /**
     * Метод для регистрации выполнения метода
     * @param joinPoint
     */

    @AfterReturning("@annotation(TrackNoteAction)")
    public void afterMethodExecution(JoinPoint joinPoint){
        // Получение информации о методе и классе
        String methodName = joinPoint.getSignature().getName();
        String className = joinPoint.getTarget().getClass().getSimpleName();

        // Регистрация выполнения метода
        System.out.println("Метод " + methodName + " класса " + className + " был выполнен.");
    }
}