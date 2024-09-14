package com.kipcollo.spring_security_keycloak.repository;

import com.kipcollo.spring_security_keycloak.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Integer, Users> {
}
