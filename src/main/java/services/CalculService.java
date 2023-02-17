package services;

import java.util.ArrayList;
import java.util.Map;

public class CalculService {

    private Integer add(Integer a, Integer b) {
        return a + b;
    }
    public Integer sum(ArrayList<Integer> numbers) {
        Integer sum = 0;
        for (Integer number : numbers) {
            sum = add(sum, number);
        }
        return sum;
    }

    public Integer multiply(ArrayList<Integer> numbers) {
        int product = 1;
        for (Integer number : numbers) {
            product = product * number;
        }
        return product;
    }

    public Integer subtract(ArrayList<Integer> numbers) {
        int difference = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            difference = difference - numbers.get(i);
        }
        return difference;
    }
}
