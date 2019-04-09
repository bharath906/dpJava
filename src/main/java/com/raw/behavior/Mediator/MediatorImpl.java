package com.raw.behavior.Mediator;

public class MediatorImpl implements Mediator {

  Flight flight;
  Runway runway;
  boolean status = true;
  public void registerRunway(Runway runway) {
        runway=runway;

  }

  public void registerflight(Flight flight) {
        flight=flight;
  }

  public boolean isLandOk() {
    return status;
  }

  public void setLandingStatus(boolean status) {
        status = status;
  }
}
