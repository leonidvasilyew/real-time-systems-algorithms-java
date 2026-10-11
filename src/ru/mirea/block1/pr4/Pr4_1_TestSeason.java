package ru.mirea.block1.pr4;

public class Pr4_1_TestSeason {
    public static void love(Pr4_1_Season s) {
        switch (s) {
            case WINTER: System.out.println("Я люблю зиму"); break;
            case SPRING: System.out.println("Я люблю весну"); break;
            case SUMMER: System.out.println("Я люблю лето"); break;
            case AUTUMN: System.out.println("Я люблю осень"); break;
        }
    }

    public static void main(String[] args) {
        Pr4_1_Season s = Pr4_1_Season.SUMMER;
        System.out.printf("Любимое: %s, %.1f C, %s%n", s, s.getTemperature(), s.getDescription());
        love(s);
        for (Pr4_1_Season t : Pr4_1_Season.values()) {
            System.out.printf("%s: %.1f C, %s%n", t, t.getTemperature(), t.getDescription());
        }
    }
}
