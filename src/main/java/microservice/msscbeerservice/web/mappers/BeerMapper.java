package microservice.msscbeerservice.web.mappers;

import microservice.msscbeerservice.domain.Beer;
import microservice.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
    BeerDto BeerToBeerDto(Beer beer);
    Beer BeerDtoToBeer(BeerDto dto);
}
