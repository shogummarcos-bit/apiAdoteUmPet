package adoteumpet.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import adoteumpet.api.models.Pets;
import adoteumpet.api.services.PetsServices;

@RestController
@RequestMapping("/api/pets")
public class PetsController {
@Autowired PetsServices petService;
@PostMapping
public ResponseEntity<Pets> cadastrarPets(@RequestBody Pets pet){
    Pets novoPet=petService.adicionarPets(pet);
    return ResponseEntity.ok(novoPet);
}
@GetMapping
public ResponseEntity<List<Pets>> listarPets(){
    List<Pets> pets=petService.listarTodos();
    return ResponseEntity.ok(pets);
}
@GetMapping("/disponiveis")
public ResponseEntity<List<Pets>> listarDispoonivel(){
    List<Pets> pet=petService.listarDisponivel();
    return ResponseEntity.ok(pet);
}
}

