package microservice.msscbeerservice.services;

import lombok.RequiredArgsConstructor;
import microservice.msscbeerservice.domain.Beer;
import microservice.msscbeerservice.repositories.BeerRepository;
import microservice.msscbeerservice.web.controller.NotFoundExeption;
import microservice.msscbeerservice.web.mappers.BeerMapper;
import microservice.msscbeerservice.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class BeerServiceImpl implements BeerService {

    private final BeerRepository beerRepository;
    private final BeerMapper beerMapper;

    @Override
    public BeerDto getById(UUID beerId) {

        return beerMapper.beerToBeerDto(
                beerRepository.findById(beerId).orElseThrow(NotFoundExeption::new)
        );
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {

        return beerMapper.beerToBeerDto(beerRepository.save(beerMapper.beerDtoToBeer(beerDto)));
    }

    @Override
    public BeerDto updateBeer(UUID beerId, BeerDto beerDto) {
        Beer beer = beerRepository.findById(beerId).orElseThrow(NotFoundExeption::new);
        beer.setBeerName((beerDto.getBeerName()));
        beer.setBeerStyle((beerDto.getBeerStyle().name()));
        beer.setPrice((beerDto.getPrice()));
        beer.setUpc((beerDto.getUpc()));

        return beerMapper.beerToBeerDto(beerRepository.save(beer));
    }
}
