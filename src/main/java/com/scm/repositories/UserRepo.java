package com.scm.repositories;

import java.lang.foreign.Linker.Option;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scm.entities.User;

public interface UserRepo extends JpaRepository<User, String> {


// extra method db
//custom query method
// custom finder methods

Optional<User> findByEmail(String email) ;
Optional<User> findByEmailAndPassword(String email, String password) ;
}
