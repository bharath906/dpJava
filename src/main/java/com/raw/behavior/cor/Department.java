package com.raw.behavior.cor;

public interface Department {

  public abstract void setNext(Department dept);
  public abstract void process(Request request);

}
