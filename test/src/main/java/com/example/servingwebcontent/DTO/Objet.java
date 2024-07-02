package com.example.servingwebcontent.DTO;

import java.util.Random;

public class Objet {

    private Long id;
    private String name;

    public Objet() {
        super();
        this.id = new Random().nextLong();
    }

    public Objet(String name) {
        super();
        this.id = new Random().nextLong();
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
