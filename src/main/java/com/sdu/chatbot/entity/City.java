package com.sdu.chatbot.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class City {

    @Id
    @GenericGenerator(name = "uuid", strategy = "uuid")
    @GeneratedValue(generator = "uuid")
    private String id;
    @Column
    private String cname;
}
