package microservice.msscbeerservice.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {

    @Null //defensive coding!, these are read only properties we do the in case a malicious actor tries to set this properties
    private UUID id;

    @Null //defensive coding!, these are read only properties we do the in case a malicious actor tries to set this properties
    private Integer version;

    @Null //defensive coding!, these are read only properties we do the in case a malicious actor tries to set this properties
    private OffsetDateTime createDate;

    @Null //defensive coding!, these are read only properties we do the in case a malicious actor tries to set this properties
    private OffsetDateTime lastModifiedDate;

    @NotBlank
    private String beerName;

    @NotNull
    private BeerStyleEnum beerStyle;

    @NotNull @Positive
    private Long upc;

    @NotNull @Positive
    private BigDecimal price;

    private Integer quantityInHand;


}
