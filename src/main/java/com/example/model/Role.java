package com.example.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by Je.vinci.Inc. on 2017. 4. 6..
 */

@Data
@Entity
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @ManyToMany(mappedBy = "roles")
    private Set<User> users;
}
