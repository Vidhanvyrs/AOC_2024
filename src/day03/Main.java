package day03;


import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Day03_2024 day03 = new Day03_2024();
        Day03_2_2024 day03_2 = new Day03_2_2024();
        int mul = day03.NorthPoleMultiplier("src/resources/input2.txt");
        int do_mul = day03_2.RegexMultiplier("src/resources/input2.txt");
        System.out.println(mul);
        System.out.println(do_mul);
    }
}
