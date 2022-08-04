package org.example.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name= "COUNTRY_DATA")
public class Country {

    //CONSTRUCTOR

    //PROPS
    @Id
    @GeneratedValue
    private int id;

    private String name;

    @OneToOne
    private Capital capital;


    // NON LOMBOK METHODS
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setCountryCapital(int countryCapitalId) {
//        this.countryCapital = countryCapitalId;
//    }
}
