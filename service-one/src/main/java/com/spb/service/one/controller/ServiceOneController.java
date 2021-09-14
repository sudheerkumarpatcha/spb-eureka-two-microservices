package com.spb.service.one.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spb.service.one.model.Post;
import com.spb.service.one.model.PostResponse;
import com.spb.service.one.service.ServiceOneService;

@RestController
@RequestMapping("/serviceone")
public class ServiceOneController {
	
	@Autowired
	private ServiceOneService serviceOneService;
	
	@PostMapping("/post")
	public Post saveMessage(@RequestBody final Post post) {
		return serviceOneService.savePost(post);
	}
	
	@GetMapping("/post/{postId}")
	public Post getPost(@PathVariable("postId") final Long postId) {
		return serviceOneService.getPost(postId);
	}
	
	@GetMapping("/posts")
	public PostResponse getAllPosts(){
		return serviceOneService.getAllPost();
	}
	

}
