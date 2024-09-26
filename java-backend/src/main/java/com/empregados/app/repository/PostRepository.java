package com.empregados.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Jpa21Utils;

import com.empregados.app.entity.PostEntity;

public interface PostRepository extends JpaRepository<PostEntity, Long>{
    
}