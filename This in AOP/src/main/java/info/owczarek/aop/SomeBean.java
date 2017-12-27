package info.owczarek.aop;

import org.springframework.stereotype.Component;

@Component("someBean")
public class SomeBean{
	public void method1() {
		method2();
	}
	
	public void method2() {
	}
}
