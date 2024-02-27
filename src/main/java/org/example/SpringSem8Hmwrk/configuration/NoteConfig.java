package org.example.SpringSem8Hmwrk.configuration;

import org.example.SpringSem8Hmwrk.aspects.NoteActionTrackerAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Конфигурация для работы ТРЕКИНГА с заметками
 */
@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class NoteConfig {
    @Bean
    public NoteActionTrackerAspect noteActionTrackerAspect() {
        return new NoteActionTrackerAspect();
    }
}
