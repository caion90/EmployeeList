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

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId_usuario() {
        return this.id_usuario;
    }

    public void setId_usuario(long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPost() {
        return this.post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(int i) {
        this.telefone = i;
    }
    

public void addRepo(PostEntity postEntity){
    this.email = postEntity.email;
    this.id = postEntity.id;
    this.id_usuario = postEntity.id_usuario;
    this.post = postEntity.post;
    this.telefone = postEntity.telefone;
    this.usuario = postEntity.usuario;
}




}

