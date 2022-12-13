import java.util.Arrays;
import java.util.logging.*;
import java.io.IOException;

public class Task2 {
    public static void main(String[] args) {

        Logger logger = Logger.getLogger(Task2.class.getName());
        FileHandler fh = null;
        try {
            fh = new FileHandler("log.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        int[] mas = { 8, 20, 17, 6, 9, 5 };

        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length - 1; i++) {

                if (mas[i] > mas[i + 1]) {
                    isSorted = false;
                    buf = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = buf;
                }
                logger.info(Arrays.toString(mas));
            }
        }
    }
}
