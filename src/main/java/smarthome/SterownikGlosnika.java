package smarthome;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SterownikGlosnika implements HouseDriver {

    private StacjaPogodowa stacjaPogodowa;

    @Autowired
    public SterownikGlosnika(StacjaPogodowa stacjaPogodowa) {
        this.stacjaPogodowa = stacjaPogodowa;
    }

    public void driverInfo() {
        int temperature = stacjaPogodowa.getTemperature();
        String description = stacjaPogodowa.getDescription();
        System.out.println("Dzień dobry. Dzisiejsza temperatura to " + temperature + "*C i jest " + description + ". Miłego dnia!");
    }
}
