package com.javatechie.api.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
@Builder
public class UserResponse {
    private String name;

    private String email;

    private String gender;

    private int age;

    private String nationality;

    private LocalDate birthDate;

    private LocalDate flightBooked;
}
