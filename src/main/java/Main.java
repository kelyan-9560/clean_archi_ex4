import parser.InputParser;
import services.CalculService;

public class Main {
    public static void main(String[] args) {
        InputParser inputParser = new InputParser("C:\\Users\\kekeb\\Documents\\ESGI\\5eme_annee\\clean_architecture\\clean_archi_ex04\\clean_archi_ex4\\src\\main\\java\\input\\numbers.txt");
        String operator = "+";

        var fileContent = inputParser.read();

        CalculService calculService = new CalculService();
        Integer result = 0;
        switch (operator){
            case "+":
                result = calculService.sum(fileContent);
                break;
            case "-":
                result = calculService.subtract(fileContent);
                break;
            case "*":
                result = calculService.multiply(fileContent);
                break;
            default:
                System.out.println("Non pris en compte");
                break;
        }

        Output output = Output.of(fileContent, operator, result);
        output.constructOutput();
    }
}
