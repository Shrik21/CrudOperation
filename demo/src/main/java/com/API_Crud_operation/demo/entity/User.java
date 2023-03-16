package com.API_Crud_operation.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

/**
 * @author - nitin created on 16 Mar,2023 6:01 pm
 */

@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "first_name", nullable = false, length = 255)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 255)
    private String lastName;



}
