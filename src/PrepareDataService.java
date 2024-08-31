public class PrepareDataService {
    public static Data prepare(String userText) throws Exception {
        Data result = new Data();


        if (userText.contains(" + ")) {
            result.lines = userText.split(" \\+ ");
            result.lines[0] = result.lines[0].replace("\"", "");
            result.lines[1] = result.lines[1].replace("\"", "");
            result.action = '+';

        } else if (userText.contains(" - ")) {
            result.lines = userText.split(" - ");
            result.lines[0] = result.lines[0].replace("\"", "");
            result.lines[1] = result.lines[1].replace("\"", "");
            result.action = '-';
        } else if (userText.contains(" * ")) {
            result.lines = userText.split(" \\* ");
            if (Integer.parseInt(result.lines[1]) > 10) {
                throw new Exception(" число должно быть от 1 до 10");
            }
            result.action = '*';
        } else if (userText.contains(" / ")) {
            result.lines = userText.split(" / ");
            if (Integer.parseInt(result.lines[1]) > 10) {
                throw new Exception(" число должно быть от 1 до 10");
            }
                result.action = '/';


        } else
            throw new Exception("некоректно введен знак действия");

        result.lines[0] = result.lines[0].replace("\"", "");
        result.lines[1] = result.lines[1].replace("\"", "");

        return result;
    }
}
