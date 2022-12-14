import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class PDF {

    public static void main(String[] args) {
        String outputFileName = "C:\\Users\\olegv\\Desktop\\ТестPDF.txt"; // Путь к файлу
        System.out.println("Введите текст чтобы его записать в файл.");
        System.out.println("Чтобы закрыть закончить программу - exit");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            try (BufferedWriter writter = new BufferedWriter(new FileWriter(outputFileName))) {
                String line;
                while (!(line = reader.readLine()).equals("exit")) { // Прерывание цикла при написании строки exit
                    writter.write(line);
                }
            }
        }
        catch (IOException e) {  // Отвечает за ошибку
            e.printStackTrace();
        }
    }
}