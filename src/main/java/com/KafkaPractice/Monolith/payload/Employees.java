package com.KafkaPractice.Monolith.payload;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Employees {

   // @JsonProperty("employeeId") // Customize JSON property name
    private int id;

   // @JsonProperty("firstName") // Customize JSON property name
    private String firstname;

  //  @JsonProperty("lastName") // Customize JSON property name
    private String lastname;
}
