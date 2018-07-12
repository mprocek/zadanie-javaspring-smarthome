package smarthome;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SmartHome {

    private List<HouseDriver> houseDriverList;

    @Autowired
    public SmartHome(List<HouseDriver> houseDriverList) {
        this.houseDriverList = houseDriverList;
    }

    public void driverHome() {
        for (HouseDriver driver : houseDriverList) {
            driver.driverInfo();
        }
    }
}
