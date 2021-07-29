/**
 * @author Bathala Haresh
 * @since 29/07/2021
 * Purpose: USER REGISTRATION PROBLEM: user registrartion problem needs to ensure all validations are in place during the user entry
 */
package userregistration;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;
@SpringBootApplication
public class UserRegistrationMain {
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		UserRegistrationimpl userRegistrationimpl=new UserRegistrationimpl();
		System.out.println("Enter your First Name : ");
		String firstName=sc.next();
		userRegistrationimpl.firstNameValidate(firstName);
		System.out.println("Enter your Last Name : ");
		String lastName=sc.next();
		userRegistrationimpl.lastNameValidate(lastName);

		System.out.println("Enter your email : ");
		String email=sc.next();
		userRegistrationimpl.emailValidate(email);
		
		System.out.println("Enter your Password : ");
		String password=sc.next();
		userRegistrationimpl.passwordValidate(password);
		

		System.out.println("Enter your PhoneNumber : ");
		String phoneNumber=sc.next();
		userRegistrationimpl.phoneNumberValidate(phoneNumber);
		
	}

}




