package enigma.car_rent.utils;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SearchCarRequest {
    private String name;
    private Boolean available;

}
