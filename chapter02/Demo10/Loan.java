package cn.jxufe.java.chapter2.demo10;

import java.util.Date;

public class Loan {
	private double annuInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private Date loanDate;

	public Loan() {
		// TODO Auto-generated constructor stub
		this(2.5, 1, 1000); // 相当于直接调用下面的构造方法
	}

	public Loan(double annuInterestRate, int numberOfYears, double loanAmount) {
		this.annuInterestRate = annuInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
		loanDate = new Date();
	}

	public double getAnnuInterestRate() {
		return annuInterestRate;
	}

	public void setAnnuInterestRate(double annuInterestRate) {
		this.annuInterestRate = annuInterestRate;
	}

	public int getNumberOfYears() {
		return numberOfYears;
	}

	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public Date getLoanDate() {
		return loanDate;
	}

	public void setLoanDate(Date loanDate) {
		this.loanDate = loanDate;
	}

	public double getMonthlyPayment() {
		double monthlyInterestRate = annuInterestRate / 1200;
		double monthlyPayment = loanAmount * monthlyInterestRate
				/ (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
		return monthlyPayment;
	}

	public double getTotalPayment() {
		double totalPayment = getMonthlyPayment() * numberOfYears * 12;
		return totalPayment;
	}

}
