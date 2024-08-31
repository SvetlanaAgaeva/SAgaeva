public class Calculator {
    public static String calculate(Data userData) throws Exception {
        String result = "";
        if (userData.action == '+') {

            result = "\"" + (userData.lines[0] + userData.lines[1]) + "\"";
        } else if (userData.action == '-') {


            result = "\"" + userData.lines[0].replace(userData.lines[1], "") + "\"";

        } else if (userData.action == '*' || userData.action == '/') {
            if (Integer.parseInt(userData.lines[1]) > 10) {
                throw new Exception(" число должно быть от 1 до 10");
            }
            if (userData.lines[1].contains("\"")) {
                throw new Exception("делить и умножать можно только на число(уберите кавычки)");
            } else {
                //userData.lines[0] = userData.lines[0].replace("\"", "");
                if (userData.action == '*') {
                    int multiplier = Integer.parseInt(userData.lines[1]);
                    result = "\"" + userData.lines[0].repeat(multiplier) + "\"";

                } else {
                    int divider = userData.lines[0].length() / Integer.parseInt(userData.lines[1]);
                    result = "\"" + userData.lines[0].substring(0, divider) + "\"";

                }


            }
        }
        return result;
    }
}
