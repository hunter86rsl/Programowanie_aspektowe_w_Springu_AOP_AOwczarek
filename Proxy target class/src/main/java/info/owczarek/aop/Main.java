package info.owczarek.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

		SomeBean someBean = context.getBean("someBean", SomeBean.class);
		someBean.someMethod();
	}
}
