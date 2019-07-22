package com.engvoc.eslearn.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Users")
@EqualsAndHashCode(of = "id")
@Getter
@Setter
public class User {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String username;
    private String userpic;
    private String email;
    private String gender;
    private String locale;
    private LocalDateTime lastVisit;

    public User() {
    }
}
