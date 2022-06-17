package com.valdal14.Java15Features.SealedClasses;

public sealed class BMWParent implements BMWInterface permits ThreeSeries, FiveSeries {
    @Override
    public void startEngine(BMWParent car) {
        BMWInterface.super.startEngine(car);
    }

    @Override
    public void applyColor(String color) {

    }
}
