package smarthome;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class StacjaPogodowa {

    private int temperature;
    private String description;

    public StacjaPogodowa() {
        this.downloadWeather();
    }

    public void downloadWeather(){
        System.out.println("Stacja pogodowa pobiera informacje o temperaturze.");
        this.randomWeather();
    }

    public void randomWeather() {
        Random random = new Random();
        description = "słonecznie";
        temperature = random.nextInt(60) - 25;
        if (temperature < 15) {
            description = "pochmurnie";
        }
    }

    public int getTemperature() {
        return temperature;
    }

    public String getDescription() {
        return description;
    }
}
