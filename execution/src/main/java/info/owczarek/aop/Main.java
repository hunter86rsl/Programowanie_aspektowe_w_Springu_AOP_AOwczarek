package info.owczarek.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import info.owczarek.aop.package1.AnotherBean;
import info.owczarek.aop.package1.subpackage.ThirdBean;
import info.owczarek.aop.package2.SomeBean;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

		SomeBean someBean = context.getBean("someBean", SomeBean.class);
		AnotherBean anotherBean = context.getBean("anotherBean", AnotherBean.class);
		ThirdBean thirdBean = context.getBean("thirdBean", ThirdBean.class);
		
		someBean.setSomething(null);
		someBean.setAnotherThing(null);
		someBean.getSomething();
		someBean.anotherMethod();
		someBean.setInteger(1);
		someBean.setTwoParameters(null, null);
		
		anotherBean.setSomething(null);
		anotherBean.setAnotherThing(null);
		anotherBean.getSomething();
		anotherBean.anotherMethod();
		anotherBean.setInteger(1);
		anotherBean.setTwoParameters(null, null);
		
		thirdBean.setSomething(null);
		thirdBean.setAnotherThing(null);
		thirdBean.getSomething();
		thirdBean.anotherMethod();
		thirdBean.setInteger(1);
		thirdBean.setTwoParameters(null, null);
	}
}
