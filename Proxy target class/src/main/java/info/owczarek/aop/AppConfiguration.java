package info.owczarek.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("info.owczarek.aop")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AppConfiguration {
}
