package com.system.chatappmessage;

import java.io.Serializable;

public class ChatMessage implements Serializable {
 
	private static final long serialVersionUID = 1L;
	/*
	 * transient- it is a keyword which is used while serialization process i don't want that specific data
	 * to be serialized 
	 * 
	 * i want to this object data to be saved inside the file system and to be shared by using
	 * across network so ill need a special permission to do this that why ill implement the tag
	 * interface serializable or marker interface that will give me the permission to do serialization
	 * if i will remove the implements Serialization then ill get runtime exception because im not allowing/giving permission to seralize this class to share information
	 * to other   
	 * 
	 * serialVersionUID -> it is a unique code which should be same while decompilation because it 
	 * is matched that both has same class if not then throws exception 
	 * if we explicitly don't write then compiler will add by generating with hashcode .we will get the exception
	 * while de compilation we need to have same serialVersionUID constant.
	 * 
	 *  
	 */
 
	private transient String messageId;
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


