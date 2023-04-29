package microservice.msscbeerservice.web.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
//@Getter(lazy = true) for expensive operation. Will calculate and cache the value. Any additional get, will be read from cache
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {

    @Null //defensive coding!, these are read only properties we do the in case a malicious actor tries to set this properties
    private UUID id;

    @Null //defensive coding!, these are read only properties we do the in case a malicious actor tries to set this properties
    private Integer version;


    @Null //defensive coding!, these are read only properties we do the in case a malicious actor tries to set this properties
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssZ", shape = JsonFormat.Shape.STRING)
    private OffsetDateTime createDate;

    @Null //defensive coding!, these are read only properties we do the in case a malicious actor tries to set this properties
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssZ", shape = JsonFormat.Shape.STRING)
    private OffsetDateTime lastModifiedDate;

    @NotBlank
    private String beerName;

    @NotNull
    private BeerStyleEnum beerStyle;

    @NotNull
    private String upc;

    @JsonFormat(shape = JsonFormat.Shape.STRING)
    @NotNull @Positive
    private BigDecimal price;

    private Integer quantityInHand;


}
