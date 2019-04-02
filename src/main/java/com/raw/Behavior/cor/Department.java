package com.raw.Behavior.cor;

public interface Department {

  public abstract void setNext(Department dept);
  public abstract void process(Request request);

}
