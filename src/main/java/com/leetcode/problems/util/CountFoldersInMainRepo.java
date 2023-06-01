package com.leetcode.problems.util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;


public class CountFoldersInMainRepo {

    public static void main(String[] args) {
        // Установка кодировки UTF-8
        System.setProperty("file.encoding", "UTF-8");

        // Путь к корневой папке проекта LeetCodeProblems
        String projectRoot = System.getProperty("user.dir");

        // Подсчет количества папок задач
        Path problemsDir = Path.of(projectRoot + "/src/main/java/com/leetcode/problems");
        long numProblems = 0;
        try {
            numProblems = Files.list(problemsDir)
                    .filter(Files::isDirectory)
                    .count() - 2;
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*
        // Обновление значения в файле README.md
        String readmePath = projectRoot + "/README.md";
        try {
            List<String> readmeLines = Files.readAllLines(Path.of(readmePath), StandardCharsets.UTF_8);
            String updatedLine = "Решено общее количество задач: **" + numProblems + "**";
            readmeLines.set(7, updatedLine);

            // Запись обновленных строк в файл с указанием кодировки UTF-8
            BufferedWriter writer = new BufferedWriter(new FileWriter(readmePath, StandardCharsets.UTF_8));
            for (String line : readmeLines) {
                writer.write(line);
                writer.newLine();
            }
            writer.close();

            System.out.println("Количество решенных задач: " + numProblems);
        } catch (IOException e) {
            e.printStackTrace();
        }
        */


    }
}



