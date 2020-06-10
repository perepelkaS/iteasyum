package lesson27;

import java.io.IOException;
import java.sql.SQLException;

public class MainExceptions {
    public static void main(String[] args) {

    }
    static void httpHandler(Object request, Object response) throws Exception {
        logic();
    }
    static void logic() throws IOException, SQLException, Exception {
        String template = loadFromFile();
        Object data = loadFromDb();
        Object result = compileTemplate(template, data);
    }

    private static Object compileTemplate(String template, Object data) throws Exception {
        return null;
    }

    private static Object loadFromDb() throws SQLException {
        return null;
    }

    private static String loadFromFile() throws IOException {
        return null;
    }

}
