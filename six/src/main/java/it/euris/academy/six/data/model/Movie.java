package it.euris.academy.six.data.model;

import java.sql.Time;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import it.euris.academy.six.data.archetype.Model;
import it.euris.academy.six.data.dto.MovieDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "movie")
public class Movie implements Model {

  @Id
  @Column(name = "id_movie")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "name_movie")
  private String name;
  
  @Column(name = "director_movie")
  private String director;
  
  @Column(name = "producer_movie")
  private String producer;
  
  @Column(name = "category_movie")
  private String category;
  
  @Column(name = "Length_movie")
  private Time length;
  
  @Column(name = "Minimum_age_movie")
  private Integer minimumAge;   

  public Movie(String movieId) {
    if (movieId != null) {
      this.id = Long.parseLong(movieId);
    }

  }



  @Override
  public MovieDto toDto() {
    return null;
  }

}


