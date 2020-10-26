package com.clean.sample.springapp.config;

import com.clean.sample.domain.port.IdGenerator;
import com.clean.sample.domain.port.PasswordEncoder;
import com.clean.sample.domain.port.UserRepository;
import com.clean.sample.inmem.InMemoryUserRepository;
import com.clean.sample.sha256.Sha256PasswordEncoder;
import com.clean.sample.usecase.CreateUser;
import com.clean.sample.usecase.FindUser;
import com.clean.sample.usecase.LoginUser;
import com.clean.sample.uuid.UuidGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public UserRepository userRepository() {
        return new InMemoryUserRepository();
    }

    @Bean
    public IdGenerator idGenerator() {
        return new UuidGenerator();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new Sha256PasswordEncoder();
    }

    @Bean
    public CreateUser createUser(
            final UserRepository userRepository,
            final PasswordEncoder passwordEncoder,
            final IdGenerator idGenerator) {
        return new CreateUser(userRepository, passwordEncoder, idGenerator);
    }

    @Bean
    public FindUser findUser(final UserRepository userRepository) {
        return new FindUser(userRepository);
    }

    @Bean
    public LoginUser loginUser(final UserRepository userRepository, final PasswordEncoder passwordEncoder) {
        return new LoginUser(userRepository, passwordEncoder);
    }

}
