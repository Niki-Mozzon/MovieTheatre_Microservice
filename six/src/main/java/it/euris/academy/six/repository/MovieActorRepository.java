package it.euris.academy.six.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import it.euris.academy.six.data.model.MovieActor;
import it.euris.academy.six.data.model.key.MovieActorKey;

public interface MovieActorRepository extends JpaRepository<MovieActor, MovieActorKey> {

}
