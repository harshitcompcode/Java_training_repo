package com.graymatter.entities;

import org.hibernate.validator.constraints.Range;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Builder
@AllArgsConstructor
@Entity
@Table(name = "project22Person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long AdharNum;

    @Size(min = 3, message = "person must be more than 3 chars length")
    @Column(name = "personName")
    private String name;

    @NotBlank
    @Pattern(regexp = "[6789][0-9]{9}", message = "mobile number must be of 10 length starting with either 6,7,8,9")
    private String mobileNum;

    @Range(min = 18, message = "Age must be more than 18 to cast vote")
    private int age;

    @Email
    private String email;
}
