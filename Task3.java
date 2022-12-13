import org.json.JSONArray;
import org.json.JSONObject;

public class Task3 {

    public static void main() {

        JSONArray students = new JSONArray("[" +
                "{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
                "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
                "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]");

        for (int i = 0; i < students.length(); i++) {
            StringBuilder lastName = new StringBuilder((String) students.getJSONObject(i).get("фамилия"));
            StringBuilder grade = new StringBuilder((String) students.getJSONObject(i).get("оценка"));
            StringBuilder subject = new StringBuilder((String) students.getJSONObject(i).get("предмет"));
            System.out.println("Студент(ка) " + lastName + " получил(а) " + grade + " по предмету " + subject);
        }
    }
}