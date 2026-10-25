package ru.mirea.block2.pr14;

public class Pr14_2_ExactString {
    public static boolean check(String s) {
        return s.matches("abcdefghijklmnopqrstuv18340");
    }

    public static void main(String[] args) {
        String[] a = {"abcdefghijklmnopqrstuv18340", "abcdefghijklmnoasdfasdpqrstuv18340", "abcdefghijklmnopqrstuv1834"};
        for (String s : a) {
            System.out.println(s + " -> " + check(s));
        }
    }
}
