package com.empregados.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.empregados.app.entity.PostEntity;
import com.empregados.app.repository.PostRepository;

public class PostService {

    @Autowired
    PostRepository postRepository;

    public Page<PostEntity> findAll() {
        PageRequest Pageable = PageRequest.of(0, 10);
        return postRepository.findAll(Pageable);
    }

}
