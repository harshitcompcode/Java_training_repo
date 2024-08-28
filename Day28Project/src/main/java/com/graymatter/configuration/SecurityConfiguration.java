package com.graymatter.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class SecurityConfiguration {

    @Bean
    public UserDetailsService getUserDetails() {

        UserDetails admin = User.withUsername("Harshit")
                .password(encodePassword().encode("Harshit"))
                .roles("ADMIN")
                .build();

        UserDetails user = User.withUsername("user")
                .password(encodePassword().encode("user"))
                .roles("USER")
                .build();

        return new InMemoryUserDetailsManager(admin, user);
    }

    @Bean
    public PasswordEncoder encodePassword() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    	
    	
    	//return http.csrf().disable()
    	//.authorizeHttpRequests()
    	//.requestMatchers("/demo").permitAll()
    	//.requestMatchers("/name/**").authenticated()
    	//.and()
    	//.formLogin()
    	//.and()
    	//.build();
    	//}
    	
    	
    	
        http.csrf().disable()
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/demo").hasAnyRole("USER","ADMIN")
                .requestMatchers("/name/**").hasRole("ADMIN")
                .anyRequest().authenticated()
            )
            .formLogin(form->form.loginPage("/login")
            		.loginProcessingUrl("/login")
            		.permitAll());

        return http.build();
    }
     
    
    
    
    
    
    
}


