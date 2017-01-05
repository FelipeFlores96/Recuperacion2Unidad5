package mx.utng.practice.controller;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;

import mx.utng.practice.model.Note;
import mx.utng.practice.repository.NoteRepository;


@Named
@ViewScoped
public class NoteController {

	
	@Autowired
	private NoteRepository noteRepository;
	private Note note=new Note();
	private List<Note>notes;
	private boolean editMode=false;
	
	@PostConstruct
	public void init(){
		setNotes(noteRepository.findAll());
	}
	public void save(){
		noteRepository.save(note);
		if(!editMode){
			getNotes().add(note);
		}
		note=new Note();
		setEditMode(false);
	}
	
	public void delete(Note note){
		noteRepository.delete(note);
		notes.remove(note);
	}
	public void update(Note note){
		setNote(note);
		setEditMode(true);
	}
	public void cancel(){
		note =new Note();
		setEditMode(false);
	}
	public Note getNote() {
		return note;
	}
	public void setNote(Note note) {
		this.note = note;
	}
	public List<Note> getNotes() {
		return notes;
	}
	public void setNotes(List<Note> notes) {
		this.notes = notes;
	}
	public boolean isEditMode() {
		return editMode;
	}
	public void setEditMode(boolean editMode) {
		this.editMode = editMode;
	}
}
