package com.valdal14.abstraction;

public final class SeriesThree extends BMW {

    private int modelNumber;
    private String modelName;

    public SeriesThree(int modelNumber, String modelName) {
        this.modelNumber = modelNumber;
        this.modelName = modelName;
    }

    private static enum modelColor {
        RED, WHITE, BLUE, BLACK, SILVER
    }

    public int getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    @Override
    void accelerate(SeriesThree model) {
        System.out.printf("This model is %s and this is the accelerate method \n", this.getModelName());
    }

    @Override
    void breakEngine(SeriesThree model) {
        System.out.printf("This model is %s and this is the break method \n", this.getModelName());
    }

//    finalMethodInsideAbstractClass()' cannot override 'finalMethodInsideAbstractClass()' in 'com.valdal14.abstraction.BMW'; overridden method is final
//    @Override
//    public void finalMethodInsideAbstractClass(){
//
//    }

}
