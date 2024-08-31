public class ValidationDataService {
    public static void validate(Data userData) throws Exception {
        if (userData.lines[0].length() > 10 || userData.lines[1].length() > 10) {//|| ( isInteger(userData.lines[1]) && Integer.parseInt(userData.lines[1]) > 10)) {
            throw new Exception("Строка должна быть не длиннее 10 символов");
        }



    }

    private static boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static void validateIsNotDigit(String userText) throws Exception {
        if (Character.isDigit(userText.charAt(0))) {
            throw new Exception("Первым аргументом должна быть строка!");
        }
    }
}
