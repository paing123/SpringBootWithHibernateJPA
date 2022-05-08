package com.bluestone.codetest.customannotation;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.jboss.logging.Logger;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CustomAspect {
	
	private static final Logger log = LoggerFactory.logger(CustomAspect.class);

	@Around("execution(public * com.bluestone.codetest..*(..)) && @target(custom)")
	public Object scanCustomAnnotation(ProceedingJoinPoint joinPoint, Custom custom) throws Throwable{

		Object result = joinPoint.proceed();
		String annotationName = custom.name();
		String targetClassName = joinPoint.getTarget().getClass().getSimpleName();

		log.info("[name = "+annotationName+", className = "+targetClassName+"]");		
		return result;
	}
}
