package com.spb.postservice.model;

import java.io.Serializable;

public class Post implements Serializable{
	
	private static final long serialVersionUID = -7315736519674821123L;
	
	private String message;
	private Long messageId;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Long getMessageId() {
		return messageId;
	}
	public void setMessageId(Long messageId) {
		this.messageId = messageId;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Post [message=");
		builder.append(message);
		builder.append(", messageId=");
		builder.append(messageId);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	

}
