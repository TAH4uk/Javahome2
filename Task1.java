import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        Map<String, String> params1 = new HashMap<String, String>();
        params1.put("Имя", "Иванов");
        params1.put("Страна", "Россия");
        params1.put("Город", "Омск");
        params1.put("Возраст", null);
        System.out.println(getQuery(params1));
    }

    public static String getQuery(Map<String, String> params) {
        StringBuilder s = new StringBuilder();
        for (Map.Entry<String, String> pair : params.entrySet()) {
            if (pair.getValue() != null) {
                s.append(pair.getKey() + " = " + pair.getValue() + " и ");
            }
        }
        s.delete(s.toString().length() - 5, s.toString().length());
        return s.toString();
    }
}