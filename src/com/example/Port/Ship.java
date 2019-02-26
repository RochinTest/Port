package com.example.Port;

public class Ship extends Thread {
    private Integer shipContainerCount;
    private Integer maxShipContainer = 20;
    Main load;
    Port arrival;

    Ship(Integer shipContainerCount) {
        this.shipContainerCount = shipContainerCount;
    }

    public Integer getShipContainerCount() {
        return shipContainerCount;
    }

    public void setShipContainerCount(Integer shipContainerCount) {
        this.shipContainerCount = shipContainerCount;
    }
}

