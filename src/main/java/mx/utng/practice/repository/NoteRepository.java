package mx.utng.practice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import mx.utng.practice.model.Note;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long>{

	
	@Query("select note from Note note")
	public List<Note> findAll();
}
