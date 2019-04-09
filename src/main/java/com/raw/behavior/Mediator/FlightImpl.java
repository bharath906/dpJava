package com.raw.behavior.Mediator;

public class FlightImpl implements Flight {

  Mediator mediator;

  FlightImpl(Mediator mediator) {
    this.mediator=mediator;
  }

  public void land() {
    if (mediator.isLandOk()) {
      System.out.println("Successfully landed");
      mediator.setLandingStatus(true);
      } else {
      System.out.println("waiting for landing");
    }
  }
  public void getReady() {
    System.out.println("Ready for landing");
  }
}
