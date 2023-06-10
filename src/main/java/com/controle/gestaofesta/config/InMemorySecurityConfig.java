package com.controle.gestaofesta.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.provisioning.InMemoryUserDetailsManagerConfigurer;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;


@Configuration
public class InMemorySecurityConfig {
	
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) 
			throws Exception{
        // Adiciona autenticação em memória
        InMemoryUserDetailsManagerConfigurer<AuthenticationManagerBuilder> 
        inMemoryAuth = auth.inMemoryAuthentication();
        
        // Personaliza a autenticação em memória
        inMemoryAuth
            .withUser("ronaldo").password("{noop}123").roles("USER")
            .and()
            .withUser("neymar").password("{noop}123").roles("USER");
        
        // Configura o UserDetailsService padrão
        UserDetailsService userDetailsService = new InMemoryUserDetailsManager();
        auth.userDetailsService(userDetailsService);
    }

		
	}

	
	
	



