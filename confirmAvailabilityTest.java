package resources;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class confirmAvailabilityTest {

	@Test
	public void test() {

		System.out.println("Are you available? '1' for available, anything for deny");
		Scanner scan = new Scanner(System.in);
		String choose = scan.nextLine();
		if(choose.equals("1")) {
			System.out.println("Confirmation sent to " + "firstName" + " " +
					"lastName" + " at " + "email");
			assertEquals("1", choose);
		}
			
		
	}

}
