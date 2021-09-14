package com.spb.service.one.model;

import java.io.Serializable;
import java.util.List;

public class PostResponse implements Serializable{
	
	private static final long serialVersionUID = 2493156870931662762L;
	
	private List<Post> posts;

	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PostResponse [posts=");
		builder.append(posts);
		builder.append("]");
		return builder.toString();
	}
	

}
