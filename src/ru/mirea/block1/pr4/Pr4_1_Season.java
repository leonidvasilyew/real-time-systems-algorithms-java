package ru.mirea.block1.pr4;

public enum Pr4_1_Season {
    WINTER(-10),
    SPRING(10),
    SUMMER(25) {
        @Override
        public String getDescription() {return "Теплое время года";}
    },
    AUTUMN(5);

    private final double temperature;

    Pr4_1_Season(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {return temperature;}
    public String getDescription() {return "Холодное время года";}
}
