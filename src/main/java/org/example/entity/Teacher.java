package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.example.embed.FullName;
@Entity
public class Teacher {
    @Id
    private int id;
    private FullName name;
    private String address;
    private String telNo;

    public Teacher(int id, FullName name, String address, String telNo) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.telNo = telNo;
    }

    public Teacher() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public FullName getName() {
        return name;
    }

    public void setName(FullName name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }
}
