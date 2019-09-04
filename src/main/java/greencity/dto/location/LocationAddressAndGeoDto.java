package greencity.dto.location;

import greencity.constant.ValidationConstants;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LocationAddressAndGeoDto {
    @NotBlank(message = ValidationConstants.EMPTY_PLACE_ADDRESS)
    @Length(
        min = ValidationConstants.PLACE_ADDRESS_MIN_LENGTH,
        max = ValidationConstants.PLACE_ADDRESS_MAX_LENGTH)
    private String address;

    @NotNull(message = ValidationConstants.EMPTY_VALUE_OF_LATITUDE)
    private Double lat;

    @NotNull(message = ValidationConstants.EMPTY_VALUE_OF_LONGITUDE)
    private Double lng;
}
