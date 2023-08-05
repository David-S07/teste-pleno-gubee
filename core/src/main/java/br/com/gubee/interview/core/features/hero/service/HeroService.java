package br.com.gubee.interview.core.features.hero.service;

import br.com.gubee.interview.core.features.hero.exception.HeroCadastradoException;
import br.com.gubee.interview.core.features.hero.repository.HeroRepository;
import br.com.gubee.interview.model.Hero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service
public class HeroService {

/*    @Autowired
    private HeroRepository repository;

    public Hero salvar(Hero hero) {
        Boolean exists = repository.existsById(hero.getId());
        if(exists && hero.getId() != null) {
            throw new HeroCadastradoException(hero.getId());
        }

        return repository.save(hero);
    }*/
}
