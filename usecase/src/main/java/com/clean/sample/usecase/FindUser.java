package com.clean.sample.usecase;

import com.clean.sample.domain.entity.User;
import com.clean.sample.domain.port.UserRepository;

import java.util.List;
import java.util.Optional;

public final class FindUser {
    private final UserRepository repository;

    public FindUser(UserRepository repository) {
        this.repository = repository;
    }

    public Optional<User> findById(final Long id) {
        return repository.findById(id);
    }

    public List<User> findAllUsers() {
        return repository.findAllUsers();
    }
}
