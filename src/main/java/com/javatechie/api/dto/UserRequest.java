package com.javatechie.api.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.javatechie.api.advice.ValidCustom;
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
public class UserRequest {
    @NotNull(message = "username shouldn't be null")
    @NotBlank(message = "username shouldn't be blank")
    @NotEmpty(message = "username shouldn't be empty")
    private String name;

    @Email(message = "invalid email address")
    private String email;

    @Pattern(regexp = "^\\d{10}$",message = "invalid mobile number entered ")
    private String mobile;

    private String gender;

    @Min(18)
    @Max(60)
    private int age;

    @NotBlank
    private String nationality;

    @NotNull
    @Pattern(regexp = "^(?=.*[A-Z]).{8,}$",
            message = "Password should contains at least one UpperCase and special character and should be at least 8 chars long")
    @ValidCustom(message = "should not contain numbers")
    private String password;

    @Past
    @NotNull
    private LocalDate birthDate;

    @Future
    @NotNull
    private LocalDate flightBooked;
}
