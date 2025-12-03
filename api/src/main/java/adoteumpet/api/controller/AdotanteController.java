package adoteumpet.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import adoteumpet.api.repository.AdotanteRepository;
import adoteumpet.api.repository.PetsRepository;
import adoteumpet.api.services.AdotanteServices;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import adoteumpet.api.models.Adotante;

@RestController
@RequestMapping("/api/adotante")
public class AdotanteController /*~~(Could not parse as Java)~~>*/{

@Autowired
private AdotanteServices adotanteServices;
@PostMapping("path")
public ResponseEntity<Adotante> cadastrarAdotante(@RequestBody Adotante adotante) {
   Adotante novoAdotante=adotanteServices.salvarAdotante(adotante);
   return ResponseEntity.ok(novoAdotante);
}
@GetMapping
public ResponseEntity<List<Adotante>> listarAdotantes() {
    List<Adotante> adotantes=adotanteServices.listarTodos();
    return ResponseEntity.ok(adotantes);
}
@GetMapping("/{id}")
public ResponseEntity<Adotante> buscarAdotantePorId(@PathVariable Long id) {
    Optional<Adotante> adotante=adotanteServices.buscarPorId(id);
    return ResponseEntity.ok(adotante);
}



}
