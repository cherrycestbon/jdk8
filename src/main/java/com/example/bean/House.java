package com.example.bean;

import lombok.Data;

/**
 * @author lenovo
 */
@Data
public class House {
    private Integer id;
    private Integer ownerid;
    private String housename;
    private String address;

    public House(Integer id, Integer ownerid, String housename, String address) {
        this.id = id;
        this.ownerid = ownerid;
        this.housename = housename;
        this.address = address;
    }
}
