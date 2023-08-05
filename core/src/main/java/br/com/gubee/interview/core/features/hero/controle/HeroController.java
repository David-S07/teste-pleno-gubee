package br.com.gubee.interview.core.features.hero.controle;

import br.com.gubee.interview.core.features.hero.exception.HeroCadastradoException;
import br.com.gubee.interview.core.features.hero.repository.HeroRepository;
import br.com.gubee.interview.core.features.hero.service.HeroService;
import br.com.gubee.interview.model.Hero;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

//@RestController
//@RequestMapping("/api/clientes")
//@CrossOrigin("http://localhost:4200")
public class HeroController {

    /*private final HeroRepository repository;
    private final HeroService service;


    @Autowired
    public HeroController(HeroRepository repository, HeroService service) {
        this.repository = repository;
        this.service = service;
    }

    @GetMapping
    public List<Hero> obterTodos() {
        return repository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Hero salvar(@RequestBody @Valid Hero hero) {
        try {
            return service.salvar(hero);
        } catch (HeroCadastradoException e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
        }
    }

    @GetMapping("{id}")
    public Hero acharPorId(@PathVariable Integer id) {
        return repository.findById(id).orElseThrow(() ->
                new ResponseStatusException(HttpStatus.NOT_FOUND, "Herói não encontrado"));
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletar(@PathVariable Integer id) {
        repository.findById(id).
                map(hero -> {
                    repository.delete(hero);
                    return Void.TYPE;
                }).orElseThrow(() ->
                new ResponseStatusException(HttpStatus.NOT_FOUND, "Herói não encontrado"));
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void atualizar(@PathVariable Integer id, @RequestBody Hero heroAtualizado) {
        repository.findById(id).
                map(heroi -> {
                    heroi.setName(heroAtualizado.getName());
                    heroi.setRace(heroAtualizado.getRace());
                    heroi.setPowerStatsId(heroAtualizado.getPowerStatsId());
                    heroi.setEnabled(heroAtualizado.isEnabled());
                    heroi.setCreatedAt(heroAtualizado.getCreatedAt());
                    heroi.setUpdatedAt(heroAtualizado.getUpdatedAt());
                    return repository.save(heroi);
                }).orElseThrow(() ->
                new ResponseStatusException(HttpStatus.NOT_FOUND, "Herói não encontrado"));
    }*/
}
