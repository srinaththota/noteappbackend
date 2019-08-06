package loginservice.loginservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import loginservice.message.Message;

@Component
public class MessageDaoService {

	private static List<Message> messages=new ArrayList<>();
	private static int messagesCount=3;
	static {
		messages.add(new Message(1,"Computer Science","How to learn programming"));
		messages.add(new Message(2,"Mathematices","Statistics"));
		messages.add(new Message(3,"History","Geography"));
	}
	
	public List<Message> findMessages() {
		return messages;
	}
	
	public Message save(Message message) {
		if(message.getUserId()==0) {
			message.setUserId(++messagesCount);
		}
		messages.add(message);
		return message;
	}
	
	public Message saveAll(List<Message> multiMessages) {
		for(Message msg:multiMessages) {
		if(msg.getUserId()==0) {
			msg.setUserId(++messagesCount);
		}
			messages.add(msg);
		}
		
		return new Message(-4,"No category","All messages are added");
	}
	
	public Message findMessage(String message) {
		Message findMessage=null;
		System.out.println(message);
		for(Message msg:messages) {
			if(msg.getMessage().equals(message)) {
				System.out.println(message);
				return msg;
			}
			else {
				System.out.println(msg.getMessage());
			}
		}
		return new Message(-1,"no category","message could not found");
	}
	
	public Message deleteMessage(String message) {
		boolean flag=false;
		Message messageToDelete = null;
		for(Message msg:messages) {
			if(msg.getMessage()==message) {
				flag=true;
				messageToDelete=msg;
			}				
		}
		if(!flag) {
		return new Message(-1,"no category","message could not found");
		}
		else {
			messages.remove(messageToDelete);
			return new Message(-2,"any category","message has been deleted");
		}
	}
}
