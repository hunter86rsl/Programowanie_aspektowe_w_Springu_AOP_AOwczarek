package info.owczarek.aop;

import java.util.logging.Logger;

public class SimpleBeanImpl implements SimpleBean {

	public void doSomething() {
		Logger.getLogger(this.getClass().getName()).info("I'm doing sth");
		
	}

}
