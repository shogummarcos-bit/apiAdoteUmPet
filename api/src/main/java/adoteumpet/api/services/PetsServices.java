package adoteumpet.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import adoteumpet.api.repository.PetsRepository;
import adoteumpet.api.models.Pets;

@Service
public class PetsServices {
@Autowired
private PetsRepository petRepository;
public Pets adicionarPets(Pets pet){
    return petRepository.save(pet);

}
public List<Pets> listartodos(){
    return petRepository.findAll();
}
public Optional<Pets> buscrPorId(Long id){
    return petRepository.findById(id);
}
public List<Pets> listarDisponivel(){
    return petRepository.finByDisponivelTrue();
}
}
