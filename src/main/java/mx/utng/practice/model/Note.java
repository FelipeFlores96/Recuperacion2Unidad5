package mx.utng.practice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="notes")
public class Note {
	@Id @GeneratedValue
	private Long id;
	@Column(length=50)
	private String tittle;
	@Column(length=50)
	private String description;
	@Column(length=50)
	private String importance;
	
	public Note( String tittle, String description, String importance) {
		super();
		this.tittle = tittle;
		this.description = description;
		this.importance = importance;
	}

	public Note() {
		this("","","");
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImportance() {
		return importance;
	}

	public void setImportance(String importance) {
		this.importance = importance;
	}

	@Override
	public String toString() {
		return "Note [id=" + id + ", tittle=" + tittle + ", description=" + description + ", importance=" + importance
				+ "]";
	}
	
	
	
	
}

