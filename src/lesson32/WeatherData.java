package lesson32;

public class WeatherData {

    private Double temperature;
    private String weatherDescription ;

    public WeatherData(Double temperature, String weatherDescription) {
        this.temperature = temperature;
        this.weatherDescription = weatherDescription;
    }

    public Double getTemperature() {
        return temperature;
    }

    public String getWeatherDescription() {
        return weatherDescription;
    }

    @Override
    public String toString() {
        return "WeatherData{" +
                "temperature=" + temperature +
                ", weatherDescription='" + weatherDescription + '\'' +
                '}';
    }
}
