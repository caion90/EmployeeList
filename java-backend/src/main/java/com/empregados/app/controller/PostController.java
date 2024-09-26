package com.empregados.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empregados.app.service.PostService;

@RestController
@RequestMapping("/api/v1/post/")
@CrossOrigin()

public class PostController {

    @Autowired
    PostService postService;






}
