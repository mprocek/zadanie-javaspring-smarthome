package smarthome;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class LoadDrivers {

    private List<HouseDriver> houseDriverList = new ArrayList<HouseDriver>();

    @Autowired
    public LoadDrivers(SterownikGlosnika sterownikGlosnika, SterownikPieca sterownikPieca, SterownikRolet sterownikRolet) {
        houseDriverList.add(sterownikGlosnika);
        houseDriverList.add(sterownikPieca);
        houseDriverList.add(sterownikRolet);
    }
}
