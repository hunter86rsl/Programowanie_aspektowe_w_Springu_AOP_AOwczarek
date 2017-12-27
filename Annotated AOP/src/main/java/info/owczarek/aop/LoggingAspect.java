package info.owczarek.aop;


import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	private Logger logger = Logger.getLogger(getClass().getName());
	
	@Pointcut("execution(* *(..))")
	public void allMethods() {}

	//@Before("execution(* *(..))")
	@Before("allMethods()")
	public void logBefore(JoinPoint joinPoint) {
		logger.info("Before method " + joinPoint.getSignature().getName());
	}

	@After("execution(* *(..))")
	public void logAfter(JoinPoint joinPoint) {
		logger.info("After method " + joinPoint.getSignature().getName());
	}
	
	@AfterReturning(pointcut="allMethods()", returning = "returnedValue")
	public void logAfterReturninig(Object returnedValue) {
		logger.info("Returned value: " + returnedValue);
	}

	@AfterThrowing(pointcut="allMethods()", throwing="exception")
	public void logAfterThrowing(JoinPoint joinPoint, Throwable exception) {
		logger.info("Method " + joinPoint.getSignature().getName() + " has thrown " + exception);
	}
	
	@Around("allMethods()")
	public Object logExecutionTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		long start = System.currentTimeMillis();
		Object methodExecutionResult =  proceedingJoinPoint.proceed();
		long end = System.currentTimeMillis();
		logger.info("Execution time: " + (end-start) + "ms");
		
		return methodExecutionResult;
	}
}
