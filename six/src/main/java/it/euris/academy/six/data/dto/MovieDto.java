package it.euris.academy.six.data.dto;


import it.euris.academy.six.data.archetype.Dto;
import it.euris.academy.six.data.model.Movie;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MovieDto implements Dto {

  private String idMovie;
  private String nameMovie;
  
  @Override
  public Movie toModel() {
  

    return null;
  }
  


}
