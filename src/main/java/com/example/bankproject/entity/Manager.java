package com.example.bankproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Setter
@Getter
@Entity
@Table(name = "manager")
@AllArgsConstructor
@NoArgsConstructor

/**
 * id INT NOT NULL,
 * first_name varchar(50),
 * last_name varchar(50),
 * status INT(1) NOT NULL,
 * reated_at TIMESTAMP NOT NULL,
 * update_at TIMESTAMP NOT NULL
 */

public class Manager {
    @Id
    @Column(name ="id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "status")
    private int status;

    @Column(name = "created_at")
    private int createdAt;

    @Column(name = "updated_at")
    private int updateAT;

}