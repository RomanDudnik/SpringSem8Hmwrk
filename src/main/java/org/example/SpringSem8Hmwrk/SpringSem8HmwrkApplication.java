package org.example.SpringSem8Hmwrk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSem8HmwrkApplication {
	/**
	 * Домашнее задание выполнить для одного из пройденных семинаров в проекте с Базой Данных.
	 * Вам необходимо разработать механизм регистрации действий пользователя в вашем Spring Boot приложении. Используйте Spring AOP
	 * для создания журнала действий, в котором будет сохраняться информация о том, какие методы сервиса вызывались, кем и с какими параметрами.
	 *
	 * Создайте аннотацию @TrackUserAction.
	 * Реализуйте aspect, который будет регистрировать действия пользователя, когда вызывается метод, отмеченный этой аннотацией.
	 * Примените аннотацию @TrackUserAction к нескольким методам в слое сервиса.
	 * Результаты регистрации в консоль
	 * @param args
	 */

	public static void main(String[] args) {
		SpringApplication.run(SpringSem8HmwrkApplication.class, args);
	}

}
