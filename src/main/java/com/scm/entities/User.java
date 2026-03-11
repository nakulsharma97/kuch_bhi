package com.scm.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.Id;

@Entity(name = "user")
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    @Id
    private String userId;
    @Column(name = "user_name", nullable = false)
    private String name;
    @Column(unique = true, nullable = false)
    private String email;
    private String password;
    @Lob
    private String about;
    @Lob
    private String profilePic;
    private String phonenumber;
    // information

    private boolean enables = false;
    private boolean emailVerified = false;
    private boolean phoneVerified = false;

    // SELF GOOGLE , FACEBOOK, TWITTER, LINKEDING, GITHUB
    private Providers provider = Providers.SELF;
    private String providerID;
 
    // add more field if needed
}
