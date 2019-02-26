package com.example.Port;

public class Port {
    private Integer maxPortContainer=200;
    private Integer portContainercount=150;
    private Integer portShipcount;
    Port arrival;

    public Port(Integer portContainercount, Integer portShipcount) {
        this.portContainercount = portContainercount;
        this.portShipcount = portShipcount;
        this.maxPortContainer=maxPortContainer;
    }

    public Integer getPortContainercount() {
        return portContainercount;
    }

    public void setPortContainercount(Integer portContainercount) {
        this.portContainercount = portContainercount;
    }

    public Integer getPortShipcount() {
        return portShipcount;
    }

    public void setPortShipcount(Integer portShipcount) {
        this.portShipcount = portShipcount;
    }

    public Integer getMaxPortContainer() {
        return maxPortContainer;
    }

    @Override
    public String toString() {
        return "Port{" +
                "portContainercount=" + portContainercount +
                ", portShipcount=" + portShipcount +
                '}';
    }
}

