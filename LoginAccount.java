package Assignment;

import java.util.Scanner;

public class LoginAccount {
	String BankName,AccountName,AccountEmail;
	int Pin;
	double Balance;
	String AccountNumber,MobileNumber;
	
	void setDetails() {
		this.BankName="HDFC";
		this.AccountName="saibabu";
		this.AccountEmail="saibabubandaru00@gmail.com";
		this.MobileNumber="8309094590";
		this.AccountNumber= "34716629478";
		this.Balance=1000.00;
		this.Pin=123456;
		
	}
	void login() {
		System.out.println("Login with your Account number:");
		Scanner sc = new Scanner(System.in);
		String  an = sc.next();
		System.out.println("Enter your pin");
		int pi=sc.nextInt();
		
		if(AccountNumber==an && Pin==pi) {
			System.out.println("login Sucess...");
		}else {
			System.out.println("Login Faild...");
		}
			
		}
	public static void main(String[] args) { 
		LoginAccount a= new LoginAccount();
		a.setDetails();
		a.login();
		
	}
}
	
	



