import java.util.ArrayList;

public class Output {
    final ArrayList<Integer> numbers;
    final String operator;

    public Output(ArrayList<Integer> numbers, String operator) {
        this.numbers = numbers;
        this.operator = operator;
    }

    public static Output of(ArrayList<Integer> numbers, String operator){
        return new Output(numbers, operator);
    }



    public void constructOutput(){
        // TODO

        for (Integer number : numbers) {
            System.out.println("+" + number);
        }


    }




}
