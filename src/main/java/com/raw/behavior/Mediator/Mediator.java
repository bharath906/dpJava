package com.raw.behavior.Mediator;

public interface Mediator {

        void registerRunway(Runway runway);
        void registerflight(Flight flight);
        boolean isLandOk();
        void setLandingStatus(boolean status);

}
