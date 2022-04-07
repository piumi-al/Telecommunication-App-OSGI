package loanpublisher;

import java.util.Scanner;

public class LoanServiceImpl implements LoanService {

		public void useLoanService() {
		
		System.out.println("");
		System.out.println("*********************************");
		System.out.println("******* Loan Main Menu ******");
		System.out.println("*********************************");
		System.out.println("One time reaload loan               (1)");
		System.out.println("Automatic reload loan               (2)");
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
				preOrPaidName = "One-time Reload Loan";
			} else if(preOrpostNumber == 2) {
				preOrPaidName = "Automatic Reload Loan";
			}
			
			System.out.println("");
			System.out.println("*********************************");
			System.out.println("******* "+ preOrPaidName + " Category ******");
			System.out.println("*********************************");
			System.out.println("Activate "+ preOrPaidName + "              (1)");
			System.out.println("*********************************");
			System.out.println("");
			
			System.out.print("Activate Your Package                :");
			Scanner sc1 = new Scanner(System.in);
			int packages = Integer.parseInt(sc1.nextLine());
			System.out.println("");
			
			boolean wrongStatus = false;
			
			do {
				
				if(wrongStatus) {
					System.out.println("");
					System.out.println("***** Invalid Input. Try Again ******");
					System.out.println("");
	                System.out.print("Activate Your Package                :");
	                packages = Integer.parseInt(sc1.nextLine());
	                System.out.println("");
	            }
				if(packages == 1) {
					wrongStatus = false;
					activatePackage(preOrPaidName);
				} else if(packages == 2) {
					wrongStatus = false;
					activatePackage(preOrPaidName);
				}  else {
					wrongStatus = true;
				}
				
			} while (wrongStatus);
		}


public void activatePackage(String preOrpostNumber) {
	
	System.out.println("");
	System.out.println("");
	System.out.println("****************************************************");
	System.out.println("****************************************************");
	System.out.println("Your " + preOrpostNumber + " Package Activate Successfully.");
	System.out.println("****************************************************");
	System.out.println("****************************************************");
	System.out.println("");
	System.out.println("");

}
}
