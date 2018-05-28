package driver;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import users.User;

public class RegisterTest {

	private HRSystem system;

	@Before
	public void before() {
		system = new HRSystem();
	}

	@Test
	public void test() {
		User user1 = new User("s123", "password", "s123@staff.com", "John", "Doe", "1");
		system.register();

		assertEquals(new User("s123", "password", "s123@staff.com", "John", "Doe", "1"), user1);

	}

}
