package com.clean.sample.usecase;

import com.clean.sample.domain.entity.User;
import com.clean.sample.domain.port.IdGenerator;
import com.clean.sample.domain.port.PasswordEncoder;
import com.clean.sample.domain.port.UserRepository;

public final class CreateUser {
    private final UserRepository repository;
    private final PasswordEncoder passwordEncoder;
    private final IdGenerator idGenerator;

    public CreateUser(UserRepository repository, PasswordEncoder passwordEncoder, IdGenerator idGenerator) {
        this.repository = repository;
        this.passwordEncoder = passwordEncoder;
        this.idGenerator = idGenerator;
    }

    public User createUser(final User user) {
        var userToSave = new User.UserBuilder()
                .setId(idGenerator.generate())
                .setEmail(user.getEmail())
                .setPassword(passwordEncoder.encode(user.getEmail() + user.getPassword()))
                .setAge(user.getAge())
                .setUsername(user.getUsername())
                .setPhone(user.getPhone())
                .setFirstName(user.getFirstName())
                .setLastName(user.getLastName())
                .build();
        return repository.create(userToSave);
    }
}
