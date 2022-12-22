package com.example.k8s_demo.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Primary;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "messages")
@Getter
@Setter
public class Message {

    @Id
    private Integer id;

    @Column(name = "msg")
    private String msg;
}
