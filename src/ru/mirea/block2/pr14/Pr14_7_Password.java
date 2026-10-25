package ru.mirea.block2.pr14;

public class Pr14_7_Password {
    public static boolean isStrong(String s) {
        return s.matches("\\w{8,}") && s.matches(".*[A-Z].*") && s.matches(".*[a-z].*") && s.matches(".*\\d.*");
    }

    public static void main(String[] args) {
        String[] a = {"F032_Password", "TrySpy1", "smart_pass", "A007", "Qwerty_2026"};
        for (String s : a) {
            if (isStrong(s)) {
                System.out.println(s + " -> надежный");
            } else {
                System.out.println(s + " -> ненадежный");
            }
        }
    }
}
