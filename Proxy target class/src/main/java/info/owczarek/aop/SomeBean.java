package info.owczarek.aop;

import org.springframework.stereotype.Component;

@Component("someBean")
public class SomeBean implements SomeBeanInterface {
	public String someMethod() {
		return "some value";
	}
}
