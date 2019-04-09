package com.raw.behavior.Mediator;

public class AppMediator {


  public static void main (String args[]) {

    Mediator mediator = new MediatorImpl();

    Runway runway = new RunwayImpl(mediator);

    Flight flight = new FlightImpl(mediator);
    Flight flightIndia = new FlightIndia(mediator);

    mediator.registerflight(flight);
    mediator.registerRunway(runway);


    ((FlightImpl) flight).getReady();
    ((FlightIndia) flightIndia).getReady();

          runway.land();
          flight.land();
          flightIndia.land();

  }

}
