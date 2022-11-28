package OOP_sem2.dz.util;

import OOP_sem2.dz.data.User;

import java.io.FileWriter;
import java.util.List;

public class WriterToTxt {
    public static void write(List<User> list, String fileName) {
        try (FileWriter fileWriter = new FileWriter(fileName,true)) {
            for (int i = 0; i < list.size(); i++) {
                fileWriter.write(list.get(i) + "\n");
            }
        } catch (Exception e) {
            System.out.println("Файл не найден!");
        }
    }
}