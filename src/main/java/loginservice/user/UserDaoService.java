package loginservice.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

	private static List<User> users=new ArrayList<>();
	
	static {
		users.add(new User(1,"srinath","srinath"));
	}
}
