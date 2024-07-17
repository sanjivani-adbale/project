package com.bank.program;

public class BankAccount {

	int accno;
	String accnm;
	double balance;
	static int totalAccounts;
	static double totalBankBalance;
	//static int nextAccountNo=111;
	
	public BankAccount(int accno, String accnm, double balance) {

		this.accno = accno;
		this.accnm = accnm;
		this.balance = balance;
		totalAccounts++;
		totalBankBalance = totalBankBalance + balance;
			
	}

	// getters and setters
	public int getAccno() {

		return accno;
	}

	public void setAccno(int accno) {
			this.accno = accno;	
	}

	public String getAccnm() {
		return accnm;
	}

	public void setAccnm(String accnm) {
		
		this.accnm = accnm;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
	static void getTotalAccounts() {
		System.out.println("Total Account Present in Bank : "+totalAccounts);
	}
	
	void depositMoney(int accNo, double amount) {
		if(this.accno == accNo) {
		balance = balance + amount;
		totalBankBalance = totalBankBalance +amount;
		System.out.println("After deposit " + amount + " Total Balance is " + balance);
		}else {
			System.out.println("Account is not exist in bank!");
		}
	}

	
	void withdrawMoney(int accNo, double amount) {
		if (balance >= amount && this.accno == accNo) {
			balance =balance - amount;
			totalBankBalance = totalBankBalance - amount;
			System.out.println("After withdrawing " + amount + " Total balance is " + balance);
		} else {
			System.out.println("Account number mismatch!");
		}
	}

	
	static void getTotalBankBalance() {
		System.out.println("Total Bank Balance : " +totalBankBalance);
	}


	void dislpayAccount(int accNo) {
		if(accNo == accno) {
			System.out.println("------------Account Info------------");
			System.out.println("Account number :" + this.accno);
			System.out.println("Account holder name :" + this.accnm);
			System.out.println("Account balance :" + this.balance);
		}else {
			System.out.println("Account is not exist in bank!");
		}		
	}

	public static void main(String[] args) {

		BankAccount b = new BankAccount(111, "sanjivani", 5000);
		BankAccount b1 = new BankAccount(112, "poonam", 6000);
		BankAccount b2 = new BankAccount(113, "nilesh", 7000);

		b.dislpayAccount(111);
		System.out.println("------------------------");
		b.depositMoney(111,1000);
		System.out.println("------------------------");
		b.withdrawMoney(114,500);
		//b.dislpayAccount();
		
		System.out.println("------------------------");
		BankAccount.getTotalAccounts();
		BankAccount.getTotalBankBalance();
		
		
		//b2.dislpayAccount();

	}

}
