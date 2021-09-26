package it.euris.academy.six.data.model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
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
@Table(name = "user")
@Entity
public class User implements Model {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_user")
  private Long id;
  
  @Column(name = "full_user")
  private String fullName;
  
  @OneToMany(mappedBy = "user")//FetchType.Eager?
  private List<Ticket> tickets;

  public User(String userId) {
      if (userId != null) {
          this.id = Long.parseLong(userId);
      }
  }

  @Override
  public Dto toDto() {
    // TODO Auto-generated method stub
    return null;
  }
  

  
}
