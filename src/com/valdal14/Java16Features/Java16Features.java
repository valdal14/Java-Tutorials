package com.valdal14.Java16Features;

/**
 *  JAVA 16 FEATURES ---------------------------------------------------------------------------------------------
 *      -> instance of pattern matching is now final:
 *          -> object instanceof String str
 *      -> TIME FORMAT:
 *
 *         LocalTime time = LocalTime.parse("11:30:09.123456");
 *         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hma B");
 *         System.out.println(time.format(formatter)); // 1130AM in the morning
 *
 *      -> RECORDS:
 *          -> Records are not also available in inner classes. See below...
 *
 *      -> default methods inside an interface can be involved inside a proxy Object
 *          -> very useful for developing frameworks
 *          -> Proxy is java.lang.reflect.Proxy
 *
 *      -> VECTOR API WAS INTRODUCED
 *
 *      -> JNI (Java Native Interface) to access C and C++ methods was introduced the FLA or Foreign Linked API
 *
 *  --------------------------------------------------------------------------------------------------------------
 *
 *
 */
public class Java16Features {

    public static void main(String[] args) {
        Inner inner = new Inner();
        Inner.product iphone = new Inner.product("iPhone 13", "Good", 1.345);
        String status = iphone.getModelInfo();
        System.out.println(status);
    }

    static class Inner {
        record product(String name, String condition, double price){

            public String getModelInfo(){
                return this.name + " is an a " + this.condition + " condition " + " and sold for " + price + " euros";
            }
        }
    }
}
