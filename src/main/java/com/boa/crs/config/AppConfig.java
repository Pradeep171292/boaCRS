package com.boa.crs.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration
@Import(AdminConfig.class)
public class AppConfig {

}
