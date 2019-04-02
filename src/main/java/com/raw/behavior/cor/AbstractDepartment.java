package com.raw.behavior.cor;

public class AbstractDepartment implements Department {

  protected Department nextDept;

  public void setNext(Department dept) {
    dept=nextDept;
  }

  public void process(Request request) {
    /* TO DO Abstract method features */
  }
}
