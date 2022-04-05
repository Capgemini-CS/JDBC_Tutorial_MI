package com.example.capgemini.demo.model.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TutorialDTO {
    private long id;
    private String title;
    private String description;
    private boolean published;

    public TutorialDTO(String title, String description, boolean published) {
        this.title = title;
        this.description = description;
        this.published = published;
    }
}
