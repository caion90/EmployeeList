package com.empregados.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empregados.app.entity.PostEntity;
import com.empregados.app.repository.PostRepository;
import com.empregados.app.service.PostService;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/v1/post/")
@CrossOrigin()

public class PostController {

    @Autowired
    PostService postService;

    @GetMapping("get")
    public String getMethod(@RequestParam String param) {
        return postService.findAll();
    }
    


}
