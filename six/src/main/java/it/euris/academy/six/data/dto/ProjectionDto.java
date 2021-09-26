package it.euris.academy.six.data.dto;

import java.util.List;
import it.euris.academy.six.data.archetype.Dto;
import it.euris.academy.six.data.archetype.Model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProjectionDto implements Dto {

  private String idProjection;
  private String timeProjection;
  private String movieProjection;
  private String hallProjection;
  private List<TicketDto> ticketsProjection;
  @Override
  public Model toModel() {
    // TODO Auto-generated method stub
    return null;
  }

}
