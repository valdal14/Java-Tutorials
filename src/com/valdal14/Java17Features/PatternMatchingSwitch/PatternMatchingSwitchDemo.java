package com.valdal14.Java17Features.PatternMatchingSwitch;

public class PatternMatchingSwitchDemo {

    public static double getPerimeter(Shape shape){
        if(shape instanceof Circle c){
            return 2 * Math.PI * c.radius();
        } else if (shape instanceof Rectangle r) {
            return 2 * r.l() * r.w();
        } else {
            throw new IllegalArgumentException();
        }
    }

    // New Switch Pattern Instance
    public static double getPerimeterUsingSwitchPatternMatching(Shape shape){
        return switch (shape){
            case Circle c -> 2 * Math.PI * c.radius();
            case Rectangle r -> 2 * r.l() * r.w();
            default -> throw new IllegalStateException("Unexpected value: " + shape);
        };
    }

    public static void main(String[] args) {

        double circlePerimeter = getPerimeter(new Circle(10.0));
        System.out.println(circlePerimeter);

        double newPerim = getPerimeterUsingSwitchPatternMatching(new Rectangle(2.3, 3.4));
        System.out.println(newPerim);
    }
}
