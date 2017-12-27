package info.owczarek.aop;

import org.springframework.stereotype.Component;

@Component
public class SomeBean {
	public String someMethod() {
		return "some value";
	}
	
	public void throwSomeException() {
		throw new RuntimeException();
	}
}
