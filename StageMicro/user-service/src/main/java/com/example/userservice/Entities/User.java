package com.example.userservice.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUser ;
    private String Fname ;
    private String Lname ;

    private String email ;
    private String Password ;


    private boolean enabled;
    @ManyToOne
    private Role role;

private String phoneNumber;


    @Temporal(TemporalType.DATE)
    private Date createdAt;
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastLogin;
    private String image;
}