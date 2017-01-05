package mx.utng.practice.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import mx.utng.practice.model.Customer;
import mx.utng.practice.model.Role;
import mx.utng.practice.repository.RoleRepository;

@Named
@ViewScoped
public class RoleController {
	
	@Autowired
	private RoleRepository roleRepository;
	private Role role =new Role();
	private List<Role>roles;
	private boolean editMode=false;
	
	@PostConstruct
	public void init(){
		setRoles(roleRepository.findAll());
	}
	
	public void save(){
		roleRepository.save(role);
		if(!editMode){
			getRoles().add(role);
		}
		role=new Role();
		setEditMode(false);
	}
	
	public void delete(Role role){
		roleRepository.delete(role);
		roles.remove(role);
	}
	public void update(Role role){
		setRole(role);
		setEditMode(true);
	}
	public void cancel(){
		role =new Role();
		setEditMode(false);
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public boolean isEditMode() {
		return editMode;
	}

	public void setEditMode(boolean editMode) {
		this.editMode = editMode;
	}
	
}
