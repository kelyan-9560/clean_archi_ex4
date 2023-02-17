package logger;

public class Logger {
    public static void start(){
        System.out.println("Start");
    }

    public static void valueParsed(String value){
        System.out.println("parsed value = " + value);
    }

    public static void action(String action, String value, String line){
        System.out.println(action + " : " + value + " on line " + line);
    }

    public static void result(String result){
        System.out.println("Total = " + result);
    }

    public static void end(){
        System.out.println("End of program");
    }
}
