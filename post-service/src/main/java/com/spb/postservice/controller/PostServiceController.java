package com.spb.postservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spb.postservice.model.Post;
import com.spb.postservice.model.PostResponse;
import com.spb.postservice.service.PostServiceService;

@RestController
@RequestMapping("/postservice")
public class PostServiceController {

	@Autowired
	private PostServiceService postServiceService;
	
	@PostMapping("/post")
	public Post savePost(@RequestBody final Post post) {
		return postServiceService.savePost(post);
	}
	
	@GetMapping("/post/{postId}")
	public Post getPost(@PathVariable("postId") final Long postId) {
		return postServiceService.getPost(postId);
	}
	
	@GetMapping("/posts")
	public PostResponse getAllPost(){
		return postServiceService.getAllPosts();
	}
}
