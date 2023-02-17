import common.File;
import services.CalculService;

public class Main {
    public static void main(String[] args) {

        File file = File.of("C:\\Users\\kekeb\\Documents\\ESGI\\5eme_annee\\clean_architecture\\clean_archi_ex04\\clean_archi_ex4\\src\\main\\java\\input", "numbers.txt");
        String operator = "-";

        InputParser inputParser = new InputParser(file, "C:\\Users\\kekeb\\Documents\\ESGI\\5eme_annee\\clean_architecture\\clean_archi_ex04\\clean_archi_ex4\\src\\main\\java\\input\\numbers.txt");


        var fileContent = inputParser.read();
        System.out.println(fileContent);

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

        System.out.println("---------");
        System.out.println("total = " + result + " " + "(" + CalculService.operators.get(operator) + ")");
    }
}
