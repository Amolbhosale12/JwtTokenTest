package com.MultigenesysTask.BackendTask.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
class AppConfig {

    //below method generally create user in memory accordingly your choice.
    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails userDetails = User.builder().
                username("amol")
                .password(passwordEncoder().encode("amol")).roles("ADMIN").
                build();
        UserDetails userDetails1=User.builder().username("pramol").password(passwordEncoder().encode("pramol")).roles("ADMIN").build();
        return new InMemoryUserDetailsManager(userDetails,userDetails1);
    }

    // below method for encoding password.
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration builder) throws Exception {
        return builder.getAuthenticationManager();
    }
}