package kodlama.io.programmingLanguages.dataAccsess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.programmingLanguages.dataAccsess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.programmingLanguages.entities.concretes.ProgrammingLanguage;

@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository{
	
	List<ProgrammingLanguage> programmingLanguages;
	
	

	public InMemoryProgrammingLanguageRepository() {
		programmingLanguages = new ArrayList<ProgrammingLanguage>();
		programmingLanguages.add(new ProgrammingLanguage(1, "Java"));
		programmingLanguages.add(new ProgrammingLanguage(2, "C#"));
		programmingLanguages.add(new ProgrammingLanguage(3, "Python"));
		programmingLanguages.add(new ProgrammingLanguage(4, "C++"));
		
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		return programmingLanguages;
	}

	@Override
	public void add(ProgrammingLanguage pl) {
		programmingLanguages.add(pl);
		
	}

	@Override
	public void delete(ProgrammingLanguage pl) {
		programmingLanguages.remove(pl);
		
	}

	@Override
	public void update(ProgrammingLanguage pl, ProgrammingLanguage newpl) {
		programmingLanguages.set(programmingLanguages.indexOf(pl), newpl);
		
	}

	@Override
	public ProgrammingLanguage getById(int id) {
		return programmingLanguages.get(id);
	}

}
