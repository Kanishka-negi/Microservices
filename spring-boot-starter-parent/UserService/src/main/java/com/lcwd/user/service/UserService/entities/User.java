package com.lcwd.user.service.UserService.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name= "micro_users")
@Getter
@Setter
public class User {

    @Id
    @Column(name="ID")
    private String userId;

    @Column(name="NAME", length=20)
    private String name;

    @Column(name="EMAIL")
    private String email;

    @Column(name="ABOUT")
    private String about;
    
    
    @Transient  //Use @Transient to prevent certain fields from being persisted  //Suitable for fields that are derived or temporary and should not be stored
    private List<Rating> ratings =new ArrayList<>();
}
