package mx.utng.practice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import mx.utng.practice.model.Pet;

@Repository
public interface PetRepository extends JpaRepository<Pet,Long>{

	@Query("select pete from Pet pete")
	public List<Pet> findAll();
	
	
}
