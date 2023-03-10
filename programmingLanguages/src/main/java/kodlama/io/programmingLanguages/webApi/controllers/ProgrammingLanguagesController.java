package kodlama.io.programmingLanguages.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import kodlama.io.programmingLanguages.business.abstracts.ProgrammingLanguageService;
import kodlama.io.programmingLanguages.entities.concretes.ProgrammingLanguage;

@RestController
@RequestMapping("/api/programminglanguages")
public class ProgrammingLanguagesController {
	private ProgrammingLanguageService languageService;

	@Autowired
	public ProgrammingLanguagesController(ProgrammingLanguageService languageService) {
		this.languageService = languageService;
	}
	
	@GetMapping("/getall")
	public List<ProgrammingLanguage> getAll(){
		return languageService.getAll();
	}
	
	@GetMapping("/add")
	public void add(ProgrammingLanguage pl) throws Exception{
		languageService.add(pl);
	}
	
	@GetMapping("/delete")
	public void delete(ProgrammingLanguage pl) {
		languageService.delete(pl);
	}
	
	@GetMapping("/update")
	public void update(ProgrammingLanguage pl, ProgrammingLanguage newpl) throws Exception{
		languageService.update(pl, newpl);
	}
	
	@GetMapping("/getbyid")
	public ProgrammingLanguage getById(int id) {
		return languageService.getById(id);
	}
	
	
	

}
