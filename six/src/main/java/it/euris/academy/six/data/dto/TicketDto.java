package it.euris.academy.six.data.dto;

import it.euris.academy.six.data.archetype.Dto;
import it.euris.academy.six.data.archetype.Model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class TicketDto implements Dto {

  private String idTicket;
  private String seatTicket;
  private String userTicket;
  private String projectionTicket;
  @Override
  public Model toModel() {
    // TODO Auto-generated method stub
    return null;
  }
}
