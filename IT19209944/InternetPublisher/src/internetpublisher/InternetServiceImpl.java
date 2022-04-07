package internetpublisher;

import java.util.Scanner;

public class InternetServiceImpl implements InternetService {

	@Override
	public void useInternetService() {
		
		System.out.println("");
		System.out.println("*********************************");
		System.out.println("******* Internet Main Menu ******");
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
		System.out.println("4G Packages                   (1)");
		System.out.println("3G Packages              	  (2)");
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
			PackagesName = "4G";
		} else if(Packages == 2) {
			PackagesName = "3G";
		} else if(Packages == 3) {
			PackagesName = "Unlimited";
		}
		
			System.out.println("");
			System.out.println("************************************************");
			System.out.println("******* "+ preOrPaidName + " "+ PackagesName +" Price List ******");
			System.out.println("************************************************");
		
		if(Packages == 1) {
			System.out.println("4G Any Time     5 GB        Rs. 500.00   (1)");
			System.out.println("4G Any Time    70 GB        Rs. 3000.00  (2)");
			System.out.println("4G Any Time   150 GB        Rs. 5000.00  (3)");
		} else if(Packages == 2) {
			System.out.println("3G Any Time    20 GB        Rs. 700.00  (1)");
			System.out.println("3G Any Time    90 GB        Rs. 2500.00  (2)");
			System.out.println("3G Any Time   200 GB       	Rs. 5500.00  (3)");
		} else if(Packages == 3) {
			System.out.println("Youtube     		   			 30 Days       Rs. 249.00  (1)");
			System.out.println("Youtube + Facebook    			 30 Days       Rs. 349.00  (2)");
			System.out.println("Youtube + Facebook + Whatsapp    30 Days       Rs. 449.00  (3)");
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
