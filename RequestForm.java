package resources;
import java.util.*;

public class RequestForm {

	private String firstName;
	private String lastName;
	private String resource;
	private String startTime;
	private String endTime;
	private String activity;
	private String location;

	public RequestForm(){

	}

	public void requestStaff(){
		//enters number of staff needed
		//loops for x number of staff for course coord to enter name

		Scanner scan = new Scanner(System.in);
		System.out.print("Number of staff needed: ");
		int staffNo = scan.nextInt();

		for (int i = 0; i < staffNo; i++)
		{

		}
	}

	public static void requestResources(String[] resourceList){
		//enters number of resources needed
		//loops for x number of resources
		Scanner res = new Scanner(System.in);

		int totalRes = 0;
		while(totalRes < resourceList.length) {
			if(resourceList[totalRes] == null) {
			break;
			}
			else {
				totalRes++;
			}
		}

		System.out.println("How many resources are required?");
		int numResources = res.nextInt();

		if(numResources == 0){
			System.out.println("You have chosen 0 resources, ending request.");
		}
		else{
			System.out.println("Here are the available resources:");

			for(int i = 0; i < resourceList.length; i++){
				if(resourceList[i] != null) {
					System.out.println("1: " + resourceList[i]);
					}
			}

			for(int i = 0; i < numResources; i++){
				int j = i + 1;
				int check = 0;
				while(check == 0) {
					System.out.println("For item " + j + ", please enter the number corresponding to your desired resource: ");
					int numChoose = res.nextInt();
					if(numChoose > 0 && numChoose < 50) {
						if(resourceList[numChoose] != null) {

								System.out.println("You chose " + resourceList[numChoose] + ".");
								check = 1;
						}
						else {
							System.out.println("You have chosen an invalid number, please try again.");
						}
					}
					else {
						System.out.println("You have chosen an invalid number, please try again.");
					}
				}
			}
		}

		res.close();
	}

	public void submit(){
	//display request for approver	- printf function?
	}
}
