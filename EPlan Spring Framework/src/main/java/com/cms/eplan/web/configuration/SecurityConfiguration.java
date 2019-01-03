package com.cms.eplan.web.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

/**
 * 
 * @author Tamilselvan T Date : 03-01-2019
 *
 */

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

	@Autowired
	public void configGlobalSecurity(AuthenticationManagerBuilder authenticate) throws Exception {
		
		authenticate.inMemoryAuthentication().withUser("admin").password("{noop}admin").roles("USER");
	}
}
