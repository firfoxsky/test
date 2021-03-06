package com.pengtaoh.mas.dao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 

import java.io.Serializable;

/**
 * Entity mapped to table "DICT_BRAND_ENTITY".
 */
public class DictBrandEntity implements Serializable {

    private Long id;
    private String SerialNumber;
    private String Area;
    private String Attr;
    private String Type;
    private String Desc;
    private String name;
    private Long ModelCreateTime;

    public DictBrandEntity() {
    }

    public DictBrandEntity(Long id) {
        this.id = id;
    }

    public DictBrandEntity(Long id, String SerialNumber, String Area, String Attr, String Type, String Desc, String name, Long ModelCreateTime) {
        this.id = id;
        this.SerialNumber = SerialNumber;
        this.Area = Area;
        this.Attr = Attr;
        this.Type = Type;
        this.Desc = Desc;
        this.name = name;
        this.ModelCreateTime = ModelCreateTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSerialNumber() {
        return SerialNumber;
    }

    public void setSerialNumber(String SerialNumber) {
        this.SerialNumber = SerialNumber;
    }

    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    public String getAttr() {
        return Attr;
    }

    public void setAttr(String Attr) {
        this.Attr = Attr;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getModelCreateTime() {
        return ModelCreateTime;
    }

    public void setModelCreateTime(Long ModelCreateTime) {
        this.ModelCreateTime = ModelCreateTime;
    }

}
