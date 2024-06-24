package com.example.warehouse_final.dao;


import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Repository
public class UserDao {
    /*

    private final static List<UserDetails> APPLICATION_USERS = Arrays.asList(
            new User(
                    "Mads.Bøgh@mail.com",
                    "password",
                    Collections.singleton(new SimpleGrantedAuthority("ROLE_AMIN"))
            ),
            new User(
                    "Lars.Nielsen@mail.com",
                    "password",
                    Collections.singleton(new SimpleGrantedAuthority("ROLE_USER"))

            ));

    public UserDetails findUserByEmail(String email) {
        return APPLICATION_USERS.stream()
                .filter(user -> user.getUsername().equals(email))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("User not found"));
    }

     */
}
