package it.euris.academy.six.data.dto;



import java.security.KeyStore.PrivateKeyEntry;
import org.springframework.jdbc.core.SqlReturnUpdateCount;
import Utils.UT;
import it.euris.academy.six.data.archetype.Dto;
import it.euris.academy.six.data.model.Hall;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class HallDto implements Dto {

  private String idHall;
  private String nameHall;
  private String capacityHall;
  private Boolean emptyHall;
  private Boolean entrance;
  private String profit;
  private String starting;
  
  @Override
  public Hall toModel() {
    return Hall.builder().id(UT.toLong(idHall))
        .name(nameHall)
        .capacity(UT.toInteger(capacityHall))
        .profit(UT.toLong(profit))
        .starting(UT.toInstant(starting))
        .build();
  }
  
  public TicketDto createTicketDto() {
    return null;
    
  }
  
  public Boolean isEmpty() {
    return emptyHall;
  }
  
}  
  
 
