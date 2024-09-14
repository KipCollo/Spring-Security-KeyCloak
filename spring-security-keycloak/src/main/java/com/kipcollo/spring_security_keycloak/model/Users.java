package com.kipcollo.spring_security_keycloak.model;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name="Users")
public class Users {

    @Id
    private int userId;
    private String username;
    private String email;
    private String password;

}

