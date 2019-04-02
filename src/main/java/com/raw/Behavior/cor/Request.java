package com.raw.Behavior.cor;


public class Request {

  private String accountType;
  private String bank;
  private String paymentMeth;
  private double amount;
  private String department;

  public Request(String accountType, String bank, String paymentMeth, double amount, String department) {
    this.accountType = accountType;
    this.bank = bank;
    this.paymentMeth = paymentMeth;
    this.amount = amount;
    this.department = department;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public String getBank() {
    return bank;
  }

  public void setBank(String bank) {
    this.bank = bank;
  }

  public String getPaymentMeth() {
    return paymentMeth;
  }

  public void setPaymentMeth(String paymentMeth) {
    this.paymentMeth = paymentMeth;
  }

  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

}
