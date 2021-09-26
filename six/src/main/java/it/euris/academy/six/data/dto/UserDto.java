package it.euris.academy.six.data.dto;

import java.util.List;
import it.euris.academy.six.data.archetype.Dto;
import it.euris.academy.six.data.archetype.Model;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class UserDto implements Dto{

  private String idUser;
  private String nameUser;
  private List<TicketDto> ticketsUser;
  @Override
  public Model toModel() {
    // TODO Auto-generated method stub
    return null;
  }

}
