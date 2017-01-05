package mx.utng.practice.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import mx.utng.practice.model.Pet;
import mx.utng.practice.repository.PetRepository;


@Named
@ViewScoped
public class PetController {

	
	@Autowired
	private PetRepository petRepository;
	private Pet pet=new Pet();
	private List<Pet>pets;
	private boolean editMode=false;
	
	@PostConstruct
	public void init(){
		setPets(petRepository.findAll());
	}
	public void save(){
		petRepository.save(pet);
		if(!editMode){
			getPets().add(pet);
		}
		pet=new Pet();
		setEditMode(false);
	}
	
	public void delete(Pet pet){
		petRepository.delete(pet);
		pets.remove(pet);
	}
	public void update(Pet pet){
		setPet(pet);
		setEditMode(true);
	}
	public void cancel(){
		pet =new Pet();
		setEditMode(false);
	}
	public Pet getPet() {
		return pet;
	}
	public void setPet(Pet pet) {
		this.pet = pet;
	}
	public List<Pet> getPets() {
		return pets;
	}
	public void setPets(List<Pet> pets) {
		this.pets = pets;
	}
	public boolean isEditMode() {
		return editMode;
	}
	public void setEditMode(boolean editMode) {
		this.editMode = editMode;
	}
	
}