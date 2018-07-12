package smarthome;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SterownikRolet implements HouseDriver {

    private StacjaPogodowa stacjaPogodowa;
    private String description = "słonecznie";

    @Autowired
    public SterownikRolet(StacjaPogodowa stacjaPogodowa) {
        this.stacjaPogodowa = stacjaPogodowa;
    }

    public void driverInfo() {
        if (stacjaPogodowa.getDescription().equals(description)) {
            System.out.println("Jest słonecznie. Zasłaniam rolety.");
        } else {
            System.out.println("Jest pochmurnie. Nie zasłaniam rolet.");
        }
    }
}
