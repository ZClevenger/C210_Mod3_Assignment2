package account;
import account.Account;
import java.util.*;
import java.text.*;

/**
 * @author Red Team
 * Sam Allen
 * Zachary Clevenger
 * Amber Ferrebee
 * Angela Johnson
 * Bethanie Munrkes
 */
public class UserAccounts {
	
	public static void main(String[] args) {
		// class defines an array of 8 accounts as an instance variable
		Account[] userAccountsArray = new Account[8];
		for (int i = 0; i < userAccountsArray.length; i++) {
			userAccountsArray[i] = new Account(i, 50.0);
		}
		boolean userIdInput = false;
		//******************************************** 373
		//********************************************
		// When the user enters a correct id, the system displays a menu
		/** Main menu
		 * 1: check balance
		 * 2: withdraw
		 * 3: deposit
		 * 4: exit
		 * Enter a choice: 
		 * (1)The balance is 50.0
		 * (2)Enter an amount to withdraw: 
		 * (2)The balance is 25.0
		 * (3)Enter an amount to deposit: 
		 * (3)The balance is 35.0
		 * (4)Enter an id:
		 **/
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an id: ");
		int userInputId = input.nextInt();
		while (userInputId < 0 || userInputId > 7) {
			System.out.println("Please enter an existing account id: ");
			userInputId = input.nextInt();			
		}
		// Create scanner for menu options
		Scanner menuChoice = new Scanner(System.in);
		System.out.println("Main menu");
		System.out.println("1: check balance");
		System.out.println("2: withdraw");
		System.out.println("3: deposit");
		System.out.println("4: exit");
		int choice = menuChoice.nextInt();
		if (choice == 1) {
			double giveBalance = userAccountsArray[userInputId].getBal();
			System.out.println(giveBalance);
		} else if (choice == 2) {
					
			} else if (choice == 3) {
					
				// Option 4 exits the main menu
				// So,  if option 4 is chosen, the system will prompt the user again to enter 
				// another id.
				// The system will keep running indefinitely
			} else if (choice == 4) {
				
			}
		
		
}
}