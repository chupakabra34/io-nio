package task1906;

import java.io.*;
import java.util.ArrayList;

/* 
Четные символы
Считать с консоли 2 имени файла.
Вывести во второй файл все символы с четным порядковым номером (нумерация начинается с 1).

Пример первого файла:
text in file
Вывод во втором файле:
eti ie
Закрыть потоки ввода-вывод


Requirements:
1. Программа должна считывать имена файлов с консоли (используй BufferedReader).
2. BufferedReader для считывания данных с консоли должен быть закрыт.
3. Программа должна считывать содержимое первого файла (используй FileReader c конструктором String).
4. Поток чтения из файла (FileReader) должен быть закрыт.
5. Программа должна записывать во второй файл все символы из первого файла с четным порядковым номером (используй FileWriter).
6. Поток записи в файл (FileWriter) должен быть закрыт.*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите первое имя файла: ");
        FileReader file1 = new FileReader(reader.readLine());
        System.out.print("Введите второе имя файла: ");
        FileWriter file2 = new FileWriter(reader.readLine());
        int z = 1;
        while (file1.ready()) {
            int value = file1.read();
            if (z % 2 == 0)
                file2.write(value);
            z++;
        }
        file1.close();
        file2.close();
    }
}
