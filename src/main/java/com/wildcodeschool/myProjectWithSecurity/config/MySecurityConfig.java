package com.wildcodeschool.myProjectWithSecurity.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http	    
        .authorizeRequests()
        .antMatchers("/avengers/assemble").hasRole("AVENGER")
        .antMatchers("/secret-bases").hasRole("DIRECTOR")
        .antMatchers("/").permitAll()
        .anyRequest().authenticated()
        .and()
        .formLogin()
	    .and()
	    .httpBasic();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//	    auth.inMemoryAuthentication().withUser("user").password("password").roles("");

		PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
//	    auth.inMemoryAuthentication().withUser("user").password(encoder.encode("password")).roles("");

		auth.inMemoryAuthentication()
			.withUser("Steve Guy")
			.password(encoder.encode("none"))
			.roles("")
			.and()
			.withUser("Tony Stark")
			.password(encoder.encode("IronMan"))
			.roles("AVENGER")
			.and()
			.withUser("Nick Fury")
			.password(encoder.encode("oneEyed"))
			.roles("DIRECTOR", "AVENGER")
			;

	}

}