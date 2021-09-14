package com.AutorisiCarti.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class Author {
    private String fristName;
    private String lastName;

}
