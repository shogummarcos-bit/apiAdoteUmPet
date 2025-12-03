package adoteumpet.api.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import adoteumpet.api.models.Adotante;
import adoteumpet.api.repository.AdotanteRepository;

@Service
public class AdotanteServices {
@Autowired
private AdotanteRepository adotanteRepository;
public Adotante salvarAdotante(Adotante adotante){
    return adotanteRepository.save(adotante);
}
public List<Adotante> listarTodos(){
    return adotanteRepository.findAll();
}
public Optional<Adotante> buscarPorId(Long id){
    return adotanteRepository.findById(id);
}
}
