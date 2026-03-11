package com.scm.entities;

import java.util.*;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Contact { 

    @Id
    private String id;
    private String name ;
    private String email ;
    private String phoneNumber ;
    private String address ;
    private String picture ;
    private String description ;
    private boolean favorite = false ;
    private List<SocialLink> socialLinks = new ArrayList<>();


}
