package com.clean.sample.config;

import com.clean.sample.inmem.InMemoryUserRepository;
import com.clean.sample.domain.port.IdGenerator;
import com.clean.sample.domain.port.PasswordEncoder;
import com.clean.sample.domain.port.UserRepository;
import com.clean.sample.sha256.Sha256PasswordEncoder;
import com.clean.sample.usecase.CreateUser;
import com.clean.sample.usecase.FindUser;
import com.clean.sample.usecase.LoginUser;
import com.clean.sample.uuid.UuidGenerator;

public class ManualConfig {

    private final UserRepository userRepository = new InMemoryUserRepository();
    private final IdGenerator idGenerator = new UuidGenerator();
    private final PasswordEncoder passwordEncoder = new Sha256PasswordEncoder();

    public CreateUser createUser() {
        return new CreateUser(userRepository, passwordEncoder, idGenerator);
    }

    public FindUser findUser() {
        return new FindUser(userRepository);
    }

    public LoginUser loginUser() {
        return new LoginUser(userRepository, passwordEncoder);
    }
}