import ua.lviv.lgs.domain.User;
import ua.lviv.lgs.service.UserService;
import ua.lviv.lgs.service.impl.UserServiceImpl;

public class MainTest {
	public static void main(String[] args) {
		
		UserService userService = new UserServiceImpl();
		userService.create(new User("test@test", "test", "test", "test"));
		
	}
}
