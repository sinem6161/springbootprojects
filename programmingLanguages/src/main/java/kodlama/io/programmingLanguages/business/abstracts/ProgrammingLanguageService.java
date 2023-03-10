package kodlama.io.programmingLanguages.business.abstracts;

import java.util.List;

import kodlama.io.programmingLanguages.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {

	List<ProgrammingLanguage> getAll();
	void add(ProgrammingLanguage pl) throws Exception;
	void delete(ProgrammingLanguage pl);
	void update(ProgrammingLanguage pl, ProgrammingLanguage newpl) throws Exception;
	ProgrammingLanguage getById(int id);
}
