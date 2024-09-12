package com.generation.jadventures.model.dto.guild;

import java.util.List;

import com.generation.jadventures.entities.Quest;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
public class GuildDtoWQuest extends GuildDtoBase
{
    private Integer id;
    private String authentication_seal;
    private String seal_img_url;
    private List<Quest> posted_quests;
}
