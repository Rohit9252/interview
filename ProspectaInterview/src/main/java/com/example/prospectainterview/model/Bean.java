package com.example.prospectainterview.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bean {

    private String title;
    private String description;

    public Bean() {
    }

    public Bean(String title, String description) {
        this.title = title;
        this.description = description;
    }

}
