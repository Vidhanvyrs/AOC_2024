import day01.Day01_2024;
import day01.Day01_2_2024;
import day02.Day02_2024;
import day02.Day02_2_2024;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
      Day01_2024 day01 = new Day01_2024();
      Day01_2_2024 day01_2 = new Day01_2_2024();
      Day02_2024 day02 = new Day02_2024();
        Day02_2_2024 day02_2 = new Day02_2_2024();
//      int sum = day01.findSum("src/resources/input.txt"); //text file path
//       int sum2 = day01_2.findSum("src/resources/input.txt");
//        int isSafe = day02.findSafeLevel("src/resources/input2.txt");
           int isSafe2 = day02_2.findSafeLevel("src/resources/input2.txt");
        System.out.println(isSafe2);
    }
}