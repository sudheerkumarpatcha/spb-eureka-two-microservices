package com.spb.postservice.service;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.spb.postservice.model.Post;
import com.spb.postservice.model.PostResponse;

@Service
public class PostServiceService {
	
	private final Map<Long,Post> posts=new HashMap<>();

	public Post savePost(Post post) {
		posts.put(post.getMessageId(), post);
		return post;
	}

	public Post getPost(Long postId) {
		return posts.get(postId);
	}

	public PostResponse getAllPosts() {
		PostResponse postResponse=new PostResponse();
		postResponse.setPosts(posts.entrySet().stream().map(e->e.getValue()).collect(Collectors.toList()));
		return postResponse;
	}
	
	
	
	

	
}
