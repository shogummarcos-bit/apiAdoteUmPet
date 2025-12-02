package adoteumpet.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import adoteumpet.api.models.Pets;

@Repository
public interface PetsRepository extends JpaRepository<Pets,Long>{
List<Pets> finByDisponivelTrue();

}
