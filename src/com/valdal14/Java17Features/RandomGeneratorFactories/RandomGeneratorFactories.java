package com.valdal14.Java17Features.RandomGeneratorFactories;

import java.util.function.Function;
import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class RandomGeneratorFactories<R> {

    public static void main(String[] args) {

        RandomGenerator randomGenerator = RandomGeneratorFactory.of("Xoshiro256PlusPlus")
                .create(888);

        // Function
        Function<RandomGeneratorFactory<RandomGenerator>, String> func = f -> f.group() + ":" + f.name();
        System.out.println(randomGenerator.getClass());

        RandomGeneratorFactory.all().map(func)
                .sorted()
                .forEach(System.out::println);

        int i = 0;

        while (i <= 10){
            int num = randomGenerator.nextInt(20);
            System.out.println(num);
            i++;
        }
    }
}
