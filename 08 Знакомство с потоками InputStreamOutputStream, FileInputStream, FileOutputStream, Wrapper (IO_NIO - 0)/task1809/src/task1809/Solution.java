package task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке.
Закрыть потоки.


Requirements:
1. Программа должна два раза считать имена файлов с консоли.
2. Для чтения из файла используй поток FileInputStream, для записи в файл - FileOutputStream
3. Во второй файл нужно записать все байты из первого в обратном порядке.
4. Потоки FileInputStream и FileOutputStream должны быть закрыты.*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите первое имя файла: ");
        FileInputStream file1 = new FileInputStream(reader.readLine());
        System.out.print("Введите второе имя файла: ");
        FileOutputStream file2 = new FileOutputStream(reader.readLine());
        while (file1.available() > 0) {
            byte[] buffer = new byte[file1.available()];
            byte[] reverse = new byte[buffer.length];
            file1.read(buffer);
            for (int z = buffer.length - 1; z >= 0; z--) reverse[buffer.length - z - 1] = buffer[z];
            file2.write(reverse);
        }
        file1.close();
        file2.close();
        reader.close();
    }
}
