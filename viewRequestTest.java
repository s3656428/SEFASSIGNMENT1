package driver;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

import users.User;

public class viewRequestTest {

	private HRSystem system;

	@Before
	public void before() {
		system = new HRSystem();
	}

	@Test
	public void test() {

		
		System.out.println("Would you like to accept or deny the request? '1' for accept, anything for deny");
		Scanner scan = new Scanner(System.in);
		String choose = scan.nextLine();
		if(choose.equals("1")) {
			System.out.println("accept");
			assertEquals("1", choose);
		}else {
			System.out.println("deny");
		}
		
		scan.close();
	}
			
		
}
