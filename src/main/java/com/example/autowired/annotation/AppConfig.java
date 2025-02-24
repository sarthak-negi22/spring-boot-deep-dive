package com.example.autowired.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration      // used to mark the class as source of bean definitions, helps find beans programmatically instead of xml config

//  used to specify base packages for component scanning, tells spring to looks for components  within the specifies package and register them as beans.
@ComponentScan(basePackages = "com.example.autowired.annotation")
public class AppConfig {

}
