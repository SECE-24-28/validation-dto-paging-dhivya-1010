package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //for getter setter from lambok
@AllArgsConstructor //for constructor
@NoArgsConstructor //non param constructor
@Entity //object will be converted into relation (table)
public class Student4 {
    @Id
    private int rno;
    private String name;
    private String gender;
    private String tech;

}
