package com.raw.dpJava.cof;

public class Accounts implements Department {

  private Department nextDept;


  public void setNext(Department dept) {
    nextDept = dept;
  }

  public void process(Request request) {
         if(request.getDepartment().equals("Accounts")){
           System.out.println(" Accounts Processign");
         } else {
           nextDept.process(request);
         }
  }


}
