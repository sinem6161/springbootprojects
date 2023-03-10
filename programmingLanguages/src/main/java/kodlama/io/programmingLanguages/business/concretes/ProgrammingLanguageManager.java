package kodlama.io.programmingLanguages.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.programmingLanguages.business.abstracts.ProgrammingLanguageService;
import kodlama.io.programmingLanguages.dataAccsess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.programmingLanguages.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

	public ProgrammingLanguageRepository languageRepository;
	
	
	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository languageRepository) {
		
		this.languageRepository = languageRepository;
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		
		return languageRepository.getAll();
	}

	@Override
	public void add(ProgrammingLanguage pl) throws Exception {
		
		if(pl.getName().isEmpty()) {
			throw new Exception("Programming Language's name can not be empty.");
		}else {
			if(languageRepository.getAll().contains(pl)) {
				throw new Exception("This programming language is already exist.");
			}else {
				languageRepository.add(pl);
			}
		}
		
	}

	@Override
	public void delete(ProgrammingLanguage pl) {
		languageRepository.delete(pl);
		
	}

	@Override
	public void update(ProgrammingLanguage pl, ProgrammingLanguage newpl) throws Exception {
		
		if(languageRepository.getAll().contains(newpl)) {
			throw new Exception("This programming language is already exist.");
		}else {
			languageRepository.update(pl,newpl);
		}
		
	}

	@Override
	public ProgrammingLanguage getById(int id) {
		
		return languageRepository.getById(id);
	}

}
