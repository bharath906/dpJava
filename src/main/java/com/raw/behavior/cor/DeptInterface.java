package com.raw.behavior.cor;

public class DeptInterface implements Department {

  private Department nextDept;


  public void setNext(Department dept) {
    nextDept = dept;
  }

  public void process(Request request) {
           nextDept.process(request);
  }
}
