package com.empregados.app.entity;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "post")
public class PostEntity {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;    

private long id_usuario;
private String usuario;
private String post;
private String email;
private String telefone;
    
}