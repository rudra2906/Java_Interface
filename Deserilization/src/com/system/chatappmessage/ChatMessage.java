package com.system.chatappmessage;

import java.io.Serializable;

public class ChatMessage implements Serializable {
 
	private static final long serialVersionUID = 1L;
	
	private String messageId;
	private String senderName;
	private String recipientName;
	private String message;
	public ChatMessage(String messageId, String senderName, String recipientName, String message) {
		this.messageId = messageId;
		this.senderName = senderName;
		this.recipientName = recipientName;
		this.message = message;
	}
	public String getMessageId() {
		return messageId;
	}
	public String getSenderName() {
		return senderName;
	}
	public String getRecipientName() {
		return recipientName;
	}
	public String getMessage() {
		return message;
	}
	public String messageInfo() 
	{
		StringBuilder sb = new StringBuilder();
		sb.append("Message Id: ").append(messageId).append("\nSender Name: ").append(senderName).append("\nRecipient Name: ").append(recipientName).append("\nMessage: ").append(message);
		return sb.toString();
	}
	
}


