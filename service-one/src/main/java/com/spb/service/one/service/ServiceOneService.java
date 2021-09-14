package com.spb.service.one.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.spb.service.one.model.Post;
import com.spb.service.one.model.PostResponse;

@Service
public class ServiceOneService {

	@Autowired
	private RestTemplate restTemplate;

	public Post savePost(final Post post) {
		String url = "http://POST-SERVICE/postservice/post";
		return restTemplate.postForObject(url, post, Post.class);
	}

	public Post getPost(final Long postId) {
		String url = "http://POST-SERVICE/postservice/post/" + postId;
		return restTemplate.getForObject(url, Post.class);
	}

	public PostResponse getAllPost() {
		String url = "http://POST-SERVICE/postservice/posts";
		return  restTemplate.getForObject(url, PostResponse.class);
	}

}
