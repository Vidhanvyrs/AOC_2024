package day01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Day01_2_2024 {
    public int findSum (String filePath) throws FileNotFoundException {
        int sum = 0;
        //read the file
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);
        List<Integer> leftlist = new ArrayList<>();
        List<Integer> rightlist = new ArrayList<>();
        while(scanner.hasNextLine()){
            String currentLine= scanner.nextLine().trim();//first line of text file
            if (currentLine.isEmpty()) {
                continue;
            }
            String[] parts = currentLine.split("\\s+");
            if (parts.length == 2) {
                try {
                    int num1 = Integer.parseInt(parts[0]);
                    int num2 = Integer.parseInt(parts[1]);
                    leftlist.add(num1);
                    rightlist.add(num2);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number format in line: " + currentLine);
                }
            }else{
                System.out.println("Skipping invalid line" + currentLine);
            }
        }
        System.out.println(leftlist);
        System.out.println(rightlist);

        for(int num : leftlist) {
            int count = 0;
            for (int inner : rightlist) {
                if (num == inner) count++;
            }
            int mul = num * count;
            sum += mul;
        }
        scanner.close();

        return sum;
    }
}