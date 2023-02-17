import common.File;
import exception.ParsingException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class InputParser {
    final File file;
    final String filePath;

    public InputParser(File file, String filePath) {
        this.file = file;
        this.filePath = filePath;
    }

    public ArrayList<Integer> read(){
        var numbers = new ArrayList<Integer>();
        try{
            var reader = new BufferedReader(new FileReader(filePath));

            String line = reader.readLine();
            while(line != null && !line.equals("")){
                var number = parseLine(line);
                numbers.add(number);

                line = reader.readLine();
            }
        } catch (Exception e){
            System.out.println("Error reading file");
        }

        return numbers;
    }


    private Integer parseLine(String character) throws ParsingException {
        int number;
        try{
            number = Integer.parseInt(character);
        } catch (Exception e){
            throw new ParsingException("Error parsing line");
        }
        return number;
    }
}
