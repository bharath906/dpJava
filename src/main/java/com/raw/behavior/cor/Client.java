package com.raw.behavior.cor;

public class Client {

  public static void main(String args[]){


    // Initializing necessary objects
    Department department = new DeptInterface();
    Department payments = new Payments();
    Department accounts = new Accounts();
    Department loans = new Loans();

    //Setting chain
    department.setNext(payments);
    payments.setNext(accounts);
    accounts.setNext(loans);

    // Payload
    Request payment = new Request("Checking","BoFA","Electronic",10000,"Payments");
    Request account = new Request("Checking","BoFA","Electronic",10000,"Accounts");
    Request loan = new Request("Checking","BoFA","Electronic",10000,"Loans");

    //Payload Processign code
    department.process(payment);
    department.process(account);
    department.process(loan);


  }

}
