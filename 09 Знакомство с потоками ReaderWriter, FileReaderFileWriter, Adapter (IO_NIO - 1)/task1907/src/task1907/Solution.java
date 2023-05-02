package task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Считаем слово
Считать с консоли имя файла.
Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов "world", которые встречаются в файле.
Закрыть потоки.


Requirements:
1. Программа должна считывать имя файла с консоли (используй BufferedReader).
2. BufferedReader для считывания данных с консоли должен быть закрыт.
3. Программа должна считывать содержимое файла (используй FileReader c конструктором принимающим String).
4. Поток чтения из файла (FileReader) должен быть закрыт.
5. Программа должна выводить в консоль количество слов "world", которые встречаются в файле.*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите имя файла: ");
        BufferedReader file = new BufferedReader(new FileReader(reader.readLine()));
        int count = 0;
        String word = "world";
        while (file.ready()) {
            String line = file.readLine();
            String[] words = line.toString().split("\\W");
            for (String s : words)
                if (s.equals(word))
                    count++;
        }
        reader.close();
        file.close();
        System.out.printf("Количество слов <WORLD> встречающихся в файле: %d", count);
    }
}
