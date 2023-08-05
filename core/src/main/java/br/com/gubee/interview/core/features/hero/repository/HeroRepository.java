package br.com.gubee.interview.core.features.hero.repository;

import br.com.gubee.interview.model.Hero;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface HeroRepository extends JpaRepository<Hero, Integer> {

/*    boolean existsById(UUID id);*/
}
