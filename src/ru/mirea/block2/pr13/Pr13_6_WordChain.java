package ru.mirea.block2.pr13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Pr13_6_WordChain {
    public static String getLine(String[] words) {
        if (words.length == 0) {
            return "";
        }
        String[] res = new String[words.length];
        boolean[] used = new boolean[words.length];
        for (int i = 0; i < words.length; i++) {
            used[i] = true;
            res[0] = words[i];
            if (find(words, used, res, 1)) {
                StringBuilder sb = new StringBuilder(res[0]);
                for (int j = 1; j < res.length; j++) {
                    sb.append(' ').append(res[j]);
                }
                return sb.toString();
            }
            used[i] = false;
        }
        return "Цепочку составить нельзя";
    }

    private static boolean find(String[] words, boolean[] used, String[] res, int k) {
        if (k == words.length) {
            return true;
        }
        String prev = res[k - 1];
        char last = Character.toLowerCase(prev.charAt(prev.length() - 1));
        for (int i = 0; i < words.length; i++) {
            if (!used[i] && Character.toLowerCase(words[i].charAt(0)) == last) {
                used[i] = true;
                res[k] = words[i];
                if (find(words, used, res, k + 1)) {
                    return true;
                }
                used[i] = false;
            }
        }
        return false;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Имя файла: ");
        String name = sc.nextLine();
        Scanner f = new Scanner(new File(name), "UTF-8");
        String[] words = f.nextLine().trim().split(" +");
        f.close();
        System.out.println(getLine(words));
    }
}
