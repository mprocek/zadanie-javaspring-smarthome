package smarthome;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SterownikPieca implements HouseDriver {

    private StacjaPogodowa stacjaPogodowa;

    @Autowired
    public SterownikPieca(StacjaPogodowa stacjaPogodowa) {
        this.stacjaPogodowa = stacjaPogodowa;
    }

    public void driverInfo() {
        if (stacjaPogodowa.getTemperature() <= 15) {
            System.out.println("Jest zimno. Uruchamiam piec.");
        } else {
            System.out.println("Jest cieplo. Nie uruchamiam pieca.");
        }
    }
}
