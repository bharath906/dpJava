package com.raw.dpJava.cof;

public class Payments implements Department {


  private Department nextDept;


  public void setNext(Department dept) {
    nextDept = dept;
  }

  public void process(Request request) {
         if(request.getDepartment().equals("Payments")){
           System.out.println(" Paymnets Processing ");
         } else {
           nextDept.process(request);
         }
  }
}
