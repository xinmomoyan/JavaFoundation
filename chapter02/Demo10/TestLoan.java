package cn.jxufe.java.chapter2.demo10;

import java.util.Scanner;

public class TestLoan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter annual interest rate,for example,8.25:");
		double annualInterestRate = input.nextDouble();

		System.out.println("enter number of years as an integer: ");
		int numberOfYears = input.nextInt();

		System.out.println("enter loan amount,for example,12000: ");
		double loanAmount = input.nextDouble();

		Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);
		
		//注意此处的 printf
		System.out.printf("the loan was created on %s\n" + "the monthly payment is %.2f\nThe total paymen is %.2f\n",
				loan.getLoanDate().toString(), loan.getMonthlyPayment(), loan.getTotalPayment());

	}

}
