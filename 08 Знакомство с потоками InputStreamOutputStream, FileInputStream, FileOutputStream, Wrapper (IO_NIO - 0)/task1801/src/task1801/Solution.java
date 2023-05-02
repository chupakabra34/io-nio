package task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
Ввести с консоли имя файла.
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода.


Requirements:
1. Программа должна считывать имя файла с консоли.
2. Для чтения из файла используй поток FileInputStream.
3. В консоль должен выводиться максимальный байт, считанный из файла.
4. Поток чтения из файла должен быть закрыт.*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите имя файла: ");
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        int max = 0;
        if (fileInputStream.available() > 0) max = fileInputStream.read();
        while (fileInputStream.available() > 0) {
            int value = fileInputStream.read();
            if (max < value) max = value;
        }
        System.out.printf("Максимальный байт в файле: %d", max);
        fileInputStream.close();
    }
}
