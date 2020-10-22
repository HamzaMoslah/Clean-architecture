package com.clean.sample.domain.port;

import com.clean.sample.domain.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    Optional<User> findById(String id);

    List<User> findAllUsers();

    User create(User user);

    Optional<User> findByEmail(String email);
}
