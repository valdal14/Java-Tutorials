package com.valdal14.objectsclassmethods.example;

public class PowerBills {

    private int meterNumber;
    private String name;
    private String address;

    public int getMeterNumber() {
        return meterNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public PowerBills(int meterNumber, String name, String address) {
        this.meterNumber = meterNumber;
        this.name = name;
        this.address = address;
    }

    @Override
    public int hashCode() {
        return this.getMeterNumber();
    }

    @Override
    public boolean equals(Object obj) {
        // cast the obj to Powerbills
        PowerBills powerBills = (PowerBills) obj;
        return powerBills.getMeterNumber() == this.getMeterNumber();
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("The customer with firstname: " + this.getName());
        sb.append(" and location: " + this.getAddress());
        sb.append(" has a meter number equals to: " + this.getMeterNumber());
        return sb.toString();
    }
}
