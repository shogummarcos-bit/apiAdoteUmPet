package adoteumpet.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import adoteumpet.api.models.Adotante;
@Repository
public interface AdotanteRepository extends JpaRepository<Adotante,Long> {

}
