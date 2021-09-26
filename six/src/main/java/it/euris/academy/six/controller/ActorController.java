package it.euris.academy.six.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import it.euris.academy.six.data.dto.ActorDto;
import it.euris.academy.six.service.ActorService;

@RestController
@RequestMapping("/actors")
public class ActorController {

  @Autowired
  ActorService ActorService;

  @GetMapping("/v6")
  public List<ActorDto> getAll() {
      return ActorService.getAll();
  }

  @GetMapping("/v6/{id}")
  public ActorDto getById(@PathVariable("id") Long id) {
      return ActorService.getById(id);
  }

  @DeleteMapping("/v6/{id}")
  public Boolean delete(@PathVariable("id") Long id) {
      return ActorService.delete(id);
  }

  @PostMapping("/v6")
  public ActorDto insert(@RequestBody ActorDto ActorDto) {
      return ActorService.add(ActorDto);
  }

  @PutMapping("/v6")
  public ActorDto update(@RequestBody ActorDto ActorDto) {
      return ActorService.update(ActorDto);
  }

  @PatchMapping("/v6")
  public ActorDto patch(@RequestBody ActorDto ActorDto) {
      return ActorService.update(ActorDto);
  }
  
}
