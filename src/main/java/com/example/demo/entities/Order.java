package com.example.demo.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Digits;

import org.hibernate.validator.constraints.CreditCardNumber;

import java.io.Serializable;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

import com.example.demo.User;

@Data
@Entity
@Table(name = "Taco_Order")
public class Order implements Serializable {

    private static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Date placedAt;

    @PrePersist
    void placedAt(){
        this.placedAt = new Date();
    }

    @ManyToMany(targetEntity = Taco.class)
    private List<Taco>tacos = new ArrayList<>();

    @ManyToOne
    private User user;

    public void addDesign(Taco design){
        tacos.add(design);
    }


    //end::allButValidation[]
    @NotBlank(message="Name is required")
    //tag::allButValidation[]
    private String name;
    //end::allButValidation[]

    @NotBlank(message="Street is required")
    //tag::allButValidation[]
    private String street;
    //end::allButValidation[]

    @NotBlank(message="City is required")
    //tag::allButValidation[]
    private String city;
    //end::allButValidation[]

    @NotBlank(message="State is required")
    //tag::allButValidation[]
    private String state;
    //end::allButValidation[]

    @NotBlank(message="Zip code is required")
    //tag::allButValidation[]
    private String zip;
    //end::allButValidation[]

    @CreditCardNumber(message="Not a valid credit card number")
    //tag::allButValidation[]
    private String ccNumber;
    //end::allButValidation[]

    @Pattern(regexp="^(0[1-9]|1[0-2])([\\/])([1-9][0-9])$",
            message="Must be formatted MM/YY")
    //tag::allButValidation[]
    private String ccExpiration;
    //end::allButValidation[]

    @Digits(integer=3, fraction=0, message="Invalid CVV")
    //tag::allButValidation[]
    private String ccCVV;
}
