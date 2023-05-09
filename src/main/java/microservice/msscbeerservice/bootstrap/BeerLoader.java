package microservice.msscbeerservice.bootstrap;

import microservice.msscbeerservice.repositories.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import java.util.UUID;

public class BeerLoader implements CommandLineRunner {

    public static final UUID BEER_1_UUID = UUID.fromString("0a818933-087d-47f2-ad83-2f986ed087eb");
    public static final UUID BEER_2_UUID = UUID.fromString("a712d914-61ea-4623-8bd0-32c0f6545bfd");
    public static final UUID BEER_3_UUID = UUID.fromString("026cc3c8-3a0c-4083-a05b-e908048c1b08");

    private BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        //  using data.sql file now
        //  loadBeerObjects();

//
//        loadBeerObjects();
//    }
//
//
//
//    private void loadBeerObjects() {
//        if(beerRepository.count() == 0) {
//            beerRepository.save(Beer.builder()
//                    .beerName("Cool Name")
//                    .beerStyle("IPA")
//                    .quantityToBrew(200)
//                    .minOnHand(12)
//                    .upc(BEER_1_UPC)
//                    .price(new BigDecimal("12.95"))
//                    .build());
//
//            beerRepository.save(Beer.builder()
//                    .beerName("Gato Galáctico")
//                    .beerStyle("PALE_ALE")
//                    .quantityToBrew(200)
//                    .minOnHand(12)
//                    .upc(BEER_2_UPC)
//                    .price(new BigDecimal("11.95"))
//                    .build());
//
//            beerRepository.save(Beer.builder()
//                    .beerName("No Hammers On The Bar")
//                    .beerStyle("PALE_ALE")
//                    .quantityToBrew(200)
//                    .minOnHand(12)
//                    .upc(BEER_3_UPC)
//                    .price(new BigDecimal("11.70"))
//                    .build());
//        }
    }
}
