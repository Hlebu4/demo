package lesson32;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class Weather implements Function<WeatherData, String> {

    private final Map<Predicate<String>, String> weather;

    public Weather() {
        this.weather = new LinkedHashMap<>();
        weather.put(v -> v.equals("солнечно") , "Не забудьте солнцезащитный крем!");
        weather.put(v -> v.equals("облачно") , "Может быть, понадобится зонт.");
        weather.put(v -> v.equals("дождь") , "Не забудьте зонт!");

    }


    @Override
    public String apply(WeatherData weatherData) {

        if (weatherData.getTemperature() > 50 && weatherData.getTemperature() < -50) {
            return "Некорректные входящие данные";
        }
        for (Map.Entry<Predicate<String>, String> entry : weather.entrySet()){
            if (entry.getKey().test(weatherData.getWeatherDescription())) {
                return entry.getValue();
            }
        }

        return "Сегодняшняя погода"+ weatherData.getWeatherDescription()  ;
    }

}

