package mx.utng.practice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import mx.utng.practice.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long>{

	@Query("select roll from Role roll")
	public List<Role> findAll();
	
}
