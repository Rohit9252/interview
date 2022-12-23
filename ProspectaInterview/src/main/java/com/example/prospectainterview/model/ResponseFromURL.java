package com.example.prospectainterview.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ResponseFromURL {

    private Integer count;
    private List<Entries> entries = new ArrayList<>();

}
