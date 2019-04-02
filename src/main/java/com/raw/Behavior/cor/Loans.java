package com.raw.Behavior.cor;

public class Loans implements Department {

  private Department nextDept;


  public void setNext(Department dept) {
    nextDept = dept;
  }

  public void process(Request request) {
         if(request.getDepartment().equals("Loans")){
           System.out.println(" Loans Processign");
         } else {
           nextDept.process(request);
         }
  }


}
