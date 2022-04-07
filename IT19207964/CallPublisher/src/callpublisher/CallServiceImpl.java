package callpublisher;

import java.util.Scanner;

public class CallServiceImpl implements CallService {

	@Override
	public void useCallService() {
		
		System.out.println("");
		System.out.println("*********************************");
		System.out.println("******* Voice Main Menu ******");
		System.out.println("*********************************");
		System.out.println("Prepaid Package               (1)");
		System.out.println("PostPaid Package              (2)");
		System.out.println("*********************************");
		System.out.println("");
		
		System.out.print("Enter Your Package                :");
		Scanner sc1 = new Scanner(System.in);
		int preOrPost = Integer.parseInt(sc1.nextLine());
		System.out.println("");
		
		boolean wrongStatus = false;
		
		do {
			
			if(wrongStatus) {
				System.out.println("");
				System.out.println("***** Invalid Input. Try Again ******");
				System.out.println("");
                System.out.print("Enter Your Package                :");
                preOrPost = Integer.parseInt(sc1.nextLine());
                System.out.println("");
            }
			
			if(preOrPost == 1) {
				wrongStatus = false;
				selectCategory(1);
			} else if(preOrPost == 2) {
				wrongStatus = false;
				selectCategory(2);
			} else {
				wrongStatus = true;
			}
			  
		} while (wrongStatus);
		
	}
	
public void selectCategory(int preOrpostNumber) {
		
		String preOrPaidName = "";
		if(preOrpostNumber == 1) {
			preOrPaidName = "Prepaid";
		} else if(preOrpostNumber == 2) {
			preOrPaidName = "Postpaid";
		}
		
		System.out.println("");
		System.out.println("*********************************");
		System.out.println("******* "+ preOrPaidName + " Category ******");
		System.out.println("*********************************");
		System.out.println("Daily Packages                (1)");
		System.out.println("Budget Packages           	  (2)");
		System.out.println("Unlimited Packages        	  (3)");
		System.out.println("*********************************");
		System.out.println("");
		
		System.out.print("Enter Your Package                :");
		Scanner sc1 = new Scanner(System.in);
		int packages = Integer.parseInt(sc1.nextLine());
		System.out.println("");
		
		boolean wrongStatus = false;
		
		do {
			
			if(wrongStatus) {
				System.out.println("");
				System.out.println("***** Invalid Input. Try Again ******");
				System.out.println("");
                System.out.print("Enter Your Package                :");
                packages = Integer.parseInt(sc1.nextLine());
                System.out.println("");
            }
			
			if(packages == 1) {
				wrongStatus = false;
				priceList(preOrPaidName, 1);
			} else if(packages == 2) {
				wrongStatus = false;
				priceList(preOrPaidName, 2);
			} else if(packages == 3) {
				wrongStatus = false;
				priceList(preOrPaidName, 3);
			} else {
				wrongStatus = true;
			}
			  
		} while (wrongStatus);
	}

public void priceList(String preOrPaidName, int Packages) {
	
	String PackagesName = "";
	if(Packages == 1) {
		PackagesName = "Daily";
	} else if(Packages == 2) {
		PackagesName = "Budget";
	} else if(Packages == 3) {
		PackagesName = "Unlimited";
	}
	
		System.out.println("");
		System.out.println("************************************************");
		System.out.println("******* "+ preOrPaidName + " "+ PackagesName +" Price List ******");
		System.out.println("************************************************");
	
	if(Packages == 1) {
		System.out.println("15 min        Rs.  7+ tax  (1)");
		System.out.println("30 min        Rs. 14+ tax  (2)");
		System.out.println("60 min   	  Rs. 20+ tax  (3)");
	} else if(Packages == 2) {
		System.out.println("150 min       Rs. 60+ tax  (1)");
		System.out.println("250 min       Rs.100+ tax  (2)");
		System.out.println("350 min       Rs.150+ tax  (3)");
	} else if(Packages == 3) {
		System.out.println("07 Days       Rs. 149+ tax (1)");
		System.out.println("20 Days       Rs. 249+ tax (2)");
		System.out.println("30 Days       Rs. 349+ tax (3)");
	}
	
	System.out.println("************************************************");
	System.out.println("");
	
	System.out.print("Enter Your Package                :");
	Scanner sc1 = new Scanner(System.in);
	int packages = Integer.parseInt(sc1.nextLine());
	System.out.println("");
	
	boolean wrongStatus = false;
	
	do {
		
		if(wrongStatus) {
			System.out.println("");
			System.out.println("***** Invalid Input. Try Again ******");
			System.out.println("");
            System.out.print("Enter Your Package                :");
            packages = Integer.parseInt(sc1.nextLine());
            System.out.println("");
        }
		
		if(packages == 1) {
			wrongStatus = false;
			activatePackage(preOrPaidName, PackagesName);
		} else if(packages == 2) {
			wrongStatus = false;
			activatePackage(preOrPaidName, PackagesName);
		} else if(packages == 3) {
			wrongStatus = false;
			activatePackage(preOrPaidName, PackagesName);
		} else {
			wrongStatus = true;
		}
		  
	} while (wrongStatus);
	
}

public void activatePackage(String preOrPaidName, String PackagesName) {
	System.out.println("");
	System.out.println("");
	System.out.println("****************************************************");
	System.out.println("****************************************************");
	System.out.println("Your " + preOrPaidName + " " + PackagesName + " Package Activate Successfully.");
	System.out.println("****************************************************");
	System.out.println("****************************************************");
	System.out.println("");
	System.out.println("");
}

}
