package com.generation.jadventures.model.dto.adventurer;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder


public class AdventurerDtoBase 
{
    private String name, surname;
    private LocalDate dob;
    private String rank;
    private String role;

}
