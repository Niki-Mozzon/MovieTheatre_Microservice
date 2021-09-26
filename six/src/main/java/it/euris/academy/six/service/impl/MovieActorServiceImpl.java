package it.euris.academy.six.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.euris.academy.six.data.dto.MovieActorDto;
import it.euris.academy.six.repository.MovieActorRepository;
import it.euris.academy.six.service.MovieActorService;

@Service
public class MovieActorServiceImpl implements MovieActorService{

  @Autowired
  private MovieActorRepository movieActorRepository;

  @Override
  public MovieActorDto getById(Long movieId,Long actorId) {
    return movieActorRepository.findByMovieAndActor(movieId, actorId).toDto();
  }

  @Override
  public List<MovieActorDto> getAll() {
    return null;
  }

  @Override
  public MovieActorDto add(MovieActorDto dto) {
    return null;
  }

  @Override
  public MovieActorDto update(MovieActorDto dto) {
    return null;
  }

  @Override
  public Boolean delete(Long id) {
    return null;
  }
}
