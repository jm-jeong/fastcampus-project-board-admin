package com.fastcampus.projectboardadmin.config;

import static org.springframework.security.config.Customizer.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		return http
			.authorizeHttpRequests(auth -> auth.anyRequest().permitAll())
			.formLogin(withDefaults())
			.logout(logout -> logout.logoutSuccessUrl("/"))
			.oauth2Login(withDefaults())
			.build();
	}

}