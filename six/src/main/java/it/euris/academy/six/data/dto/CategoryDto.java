package it.euris.academy.six.data.dto;

import java.util.List;
import it.euris.academy.six.data.archetype.Dto;
import it.euris.academy.six.data.archetype.Model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDto implements Dto {

  private String idCategory;
  private String nameCategory;
  private List<MovieDto> moviesCategory;
  
  
  @Override
  public Model toModel() {
    // TODO Auto-generated method stub
    return null;
  }
  
}
