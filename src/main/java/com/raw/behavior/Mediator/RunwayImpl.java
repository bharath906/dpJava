package com.raw.behavior.Mediator;

public class RunwayImpl implements Runway {

  private Mediator mediator;

  RunwayImpl(Mediator mediator){
    this.mediator=mediator;
    mediator.setLandingStatus(true);
  }


  public void land() {
    System.out.println("Landing permission granted..");
    mediator.setLandingStatus(true);
  }
}
