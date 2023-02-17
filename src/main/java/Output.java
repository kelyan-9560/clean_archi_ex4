import common.Operator;

import java.util.ArrayList;

public class Output {
    final ArrayList<Integer> numbers;
    final String operator;
    final Integer result;

    public Output(ArrayList<Integer> numbers, String operator, Integer result) {
        this.numbers = numbers;
        this.operator = operator;
        this.result = result;
    }

    public static Output of(ArrayList<Integer> numbers, String operator, Integer result){
        return new Output(numbers, operator, result);
    }

    public void constructOutput(){
        System.out.println(numbers.get(0));
        for (int i = 1; i < numbers.size(); i++) {
            System.out.println(operator + numbers.get(i));
        }
        System.out.println("---------");
        System.out.println("total = " + result + " " + "(" + Operator.operators.get(operator) + ")");
    }
}
