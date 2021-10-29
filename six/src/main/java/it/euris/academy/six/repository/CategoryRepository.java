package it.euris.academy.six.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import it.euris.academy.six.data.model.Cinema;

public interface CategoryRepository extends JpaRepository<Cinema, Long> {

}
