package com.idugalic.queryside.project.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@Configuration
@EnableResourceServer
class SecurityConfiguration extends ResourceServerConfigurerAdapter {


	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.requestMatchers().and().authorizeRequests().antMatchers("/projects/**").permitAll();

	}

}
