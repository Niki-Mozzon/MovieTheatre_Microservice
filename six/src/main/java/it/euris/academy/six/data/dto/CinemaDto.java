package it.euris.academy.six.data.dto;

import java.time.Instant;
import java.util.List;
import org.springframework.jdbc.core.SqlReturnUpdateCount;
import com.fasterxml.jackson.annotation.JsonIgnore;
import Utils.UT;
import it.euris.academy.six.data.archetype.Dto;
import it.euris.academy.six.data.model.Cinema;
import it.euris.academy.six.data.model.Hall;
import it.euris.academy.six.data.model.Movie;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CinemaDto implements Dto {

  private String id;
  private String name; 
  private String profit;  
  
  @JsonIgnore
  private List<Hall> halls;
  

  @Override
  public Cinema toModel() {
    Cinema cinema = Cinema.builder()
        .id(UT.toLong(id))
        .name(name)
        .profit(UT.toDouble(profit))
        .build();

    return cinema;
    

}
}
