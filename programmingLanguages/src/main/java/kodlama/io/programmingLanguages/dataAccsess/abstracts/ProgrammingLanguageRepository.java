package kodlama.io.programmingLanguages.dataAccsess.abstracts;

import java.util.List;

import kodlama.io.programmingLanguages.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageRepository {
	
	List<ProgrammingLanguage> getAll();
	void add(ProgrammingLanguage pl);
	void delete(ProgrammingLanguage pl);
	void update(ProgrammingLanguage pl, ProgrammingLanguage newpl);
	ProgrammingLanguage getById(int id);

}
