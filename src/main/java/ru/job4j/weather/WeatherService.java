package ru.job4j.weather;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

@Service
public class WeatherService {

    private final Map<Integer, Weather> weathers = new ConcurrentHashMap<>();

    {
        weathers.put(1, new Weather(1, "Msc", 24));
        weathers.put(2, new Weather(2, "SPb", 23));
        weathers.put(3, new Weather(3, "Bryansk", 19));
        weathers.put(4, new Weather(4, "Smolensk", 22));
        weathers.put(5, new Weather(5, "Kiev", 18));
        weathers.put(6, new Weather(6, "Minsk", 20));
    }

    public Mono<Weather> findById(Integer id) {
        return Mono.justOrEmpty(weathers.get(id));
    }

    public Flux<Weather> all() {
        return Flux.fromIterable(weathers.values());
    }

    public Flux<Weather> allMax(Integer temp) {
        var col = weathers.values()
                .stream().filter(weaTemp -> weaTemp.getTemperature() > temp)
                .collect(Collectors.toList());

        return Flux.fromIterable(col);
    }

    public Mono<Weather> findMax() {
        var optionalWeather = weathers.values()
                .stream().max(Weather::compareTo);
        var rsl = optionalWeather.orElse(new Weather(1, "Null City", 100));
        return Mono.justOrEmpty(rsl);
    }
}