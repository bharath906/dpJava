package com.raw.dpJava.cof;

public interface Department {

  public abstract void setNext(Department dept);
  public abstract void process(Request request);

}
