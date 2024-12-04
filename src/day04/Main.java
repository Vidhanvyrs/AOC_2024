package day04;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Day04_2024 day04 = new Day04_2024();
        int counter = day04.CountXMAS("src/resources/input4.txt");
        System.out.println(counter);
    }
}
