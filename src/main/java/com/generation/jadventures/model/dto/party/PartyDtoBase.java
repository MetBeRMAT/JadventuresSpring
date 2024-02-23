package com.generation.jadventures.model.dto.party;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder


public class PartyDtoBase 
{
    private String name;
    private String authentication_seal;
    private String motto;
    
}
