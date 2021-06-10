package com.crud.tasks.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreatedTrelloCardBadges {

    @JsonProperty("votes")
    private int votes;

    @JsonProperty("attachmentsByType")
    private CreatedTrelloCardTrelloAttachmentsByType attachmentsByType;
}
