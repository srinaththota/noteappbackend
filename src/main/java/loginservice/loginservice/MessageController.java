package loginservice.loginservice;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import loginservice.message.*;

@RestController
public class MessageController {
 
	
	@Autowired
	private MessageDaoService messageDaoService;
	
	@CrossOrigin
	@GetMapping(path="/messages")
	public List<Message> getAllMessages(){
		return messageDaoService.findMessages();
	}

	//to find message
	@CrossOrigin
	@GetMapping(path="/messages/{message}")
	public Message getMessage(@PathVariable String message){
		return messageDaoService.findMessage(message);

	}
	//create single message
	@CrossOrigin
	@PostMapping(path="/message")
	public Message createMessage(@RequestBody Message message) {
		Message msg=messageDaoService.save(message);
		
		return new Message(msg.getUserId(),message.getCategory(),message.getMessage()+" "+"has been created under category  "+message.getCategory());
		
	}
	
	//create multiple message
		@CrossOrigin
		@PostMapping("/multimessages")
		public Message createMultiMessages(@RequestBody List<Message> messages) {
			Message msg=messageDaoService.saveAll(messages);
			
			return new Message(msg.getUserId(),msg.getCategory(),msg.getMessage());
			
		}
	//to delete message
}