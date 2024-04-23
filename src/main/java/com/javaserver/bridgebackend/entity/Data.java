package com.javaserver.bridgebackend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table
public class Data {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "number")
    private int number;
    @Column(name = "response")
    private int response;
    @Column(name = "time")
    private int seconds;

    public Data() {
        // Construtor JPA
    }

    public Data(int number, int seconds) {
        super();
        this.number = number;
        this.seconds = seconds;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public int getSeconds() {
        return seconds;
    }
    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
    public int getResponse() {
        return response;
    }
    public void setResponse(int response) {
        this.response = response;
    }
}
