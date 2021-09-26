package it.euris.academy.six.service;

import java.util.List;
import it.euris.academy.six.data.dto.MovieActorDto;

public interface MovieActorService {

  public MovieActorDto getById(Long id);

  public List<MovieActorDto> getAll(Long id);

  public MovieActorDto add(MovieActorDto dto);

  public MovieActorDto update(MovieActorDto dto);

  public Boolean delete(Long id);
}
