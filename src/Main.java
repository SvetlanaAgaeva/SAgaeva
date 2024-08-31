import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("введи выражение по принципу:\"a\" + \"b\", \"a\" - \"b\", \"a\" * b, \"a\" / b");
        System.out.println("в выражении должно быть не более 10 символов ,число должно быть целым от 1 до 10," +
                "первым аргументом должна быть строка!");
        Scanner userInput = new Scanner(System.in);
        String userText = userInput.nextLine();
        ValidationDataService.validateIsNotDigit(userText);
        Data userData = PrepareDataService.prepare(userText);
        ValidationDataService.validate(userData);
        String result = Calculator.calculate(userData);


        if (result.length() >= 40) {
            result = result.substring(0, 39) + "...";
        }
        System.out.println(result);


    }
}