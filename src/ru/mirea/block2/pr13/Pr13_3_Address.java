package ru.mirea.block2.pr13;

import java.util.StringTokenizer;

public class Pr13_3_Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String flat;

    private void fill(String[] p) {
        country = p[0].trim();
        region = p[1].trim();
        city = p[2].trim();
        street = p[3].trim();
        house = p[4].trim();
        building = p[5].trim();
        flat = p[6].trim();
    }

    public static Pr13_3_Address bySplit(String s) {
        Pr13_3_Address a = new Pr13_3_Address();
        a.fill(s.split(","));
        return a;
    }

    public static Pr13_3_Address byTokenizer(String s) {
        StringTokenizer st = new StringTokenizer(s, ",.;");
        String[] p = new String[7];
        for (int i = 0; i < 7; i++) {
            p[i] = st.nextToken();
        }
        Pr13_3_Address a = new Pr13_3_Address();
        a.fill(p);
        return a;
    }

    @Override
    public String toString() {
        return "Страна: " + country + "\nРегион: " + region + "\nГород: " + city + "\nУлица: " + street +
                "\nДом: " + house + "\nКорпус: " + building + "\nКвартира: " + flat + "\n";
    }
}
