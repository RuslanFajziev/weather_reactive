package ru.job4j.weather;

public class Weather implements Comparable<Weather> {
    private int id;

    private String city;

    private int temperature;

    public Weather(int id, String city, int temperature) {
        this.id = id;
        this.city = city;
        this.temperature = temperature;
    }

    public int getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public int compareTo(Weather inputWeather) {
        return this.getTemperature() - inputWeather.getTemperature();
    }
}