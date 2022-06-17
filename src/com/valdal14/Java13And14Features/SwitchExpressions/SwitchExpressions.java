package com.valdal14.Java13And14Features.SwitchExpressions;

public class SwitchExpressions {

    public static void main(String[] args) {

        var key = 2;

        String result = switch (key){
            case 1:{
                yield "Choice 1";
            }
            case 2: {
                yield "Choice 2";
            }
            default:
                yield "Invalid Choice";
        };

        System.out.println(result);

        // ----------------------------

        var httpResponse = 200;

        String response = switch (httpResponse){
          case 200 -> {
              yield "200 OK";
          }
          case 204 -> {
              yield "201 Not found";
          }
            default -> throw new IllegalStateException("Unexpected value: " + httpResponse);
        };

        System.out.println(response);

    }
}
