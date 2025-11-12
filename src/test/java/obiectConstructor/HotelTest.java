package obiectConstructor;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class HotelTest {
    @Test
    public void HotelTest() {
        // 1. Hotel de 3 stele
        List<String> facilitatiTreiStele = Arrays.asList("Mic Dejun Inclus", "Piscina interioara", "Wi-fi Gratuit");
        Hotel hotelTreiStele = new Hotel(
                "GrandPlaza",
                "Bulevardul Victoriei , nr 10",
                "Bucuresti",
                "Romania",
                3,
                facilitatiTreiStele
        );
        hotelTreiStele.calculeazaPretCamera();
        hotelTreiStele.prezentareHotel();

        // 2. Hotel de 1 stea
        List<String> facilitatiUnuStea = Arrays.asList("Parcare", "Camera cu TV");
        Hotel hotelUnuStea= new Hotel(
                "Hotel Simplu",
                "Strada Garii, nr 5",
                "Cluj Napoca",
                "Romania",
                1,
                facilitatiUnuStea
        );

        hotelUnuStea.prezentareHotel();
        hotelUnuStea.calculeazaPretCamera();

        //3. Hotel cu clasificare necunoscuta (Exemplu: 5 stele)
        List<String> facilitatiCinciStele = Arrays.asList("Serviciu limuzina", "Spa si Wellness", "Restaurant Gourmet");
        Hotel hotelNecunoscut = new Hotel(
                "Luxor Palace",
                "Fifth Avenue, 101",
                "New York",
                "SUA",
                5,
                facilitatiCinciStele
        );
        hotelNecunoscut.prezentareHotel();
        hotelNecunoscut.calculeazaPretCamera();
    }


}
