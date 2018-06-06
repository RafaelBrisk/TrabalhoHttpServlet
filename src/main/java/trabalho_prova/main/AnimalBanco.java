package trabalho_prova.main;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import trabalho_prova.main.model.Animal;

public final class AnimalBanco {

	private static AnimalBanco instance;
	
	private Map<Long, Animal> animais = new HashMap<Long, Animal>();
	private Long id = 0L;
	
	private AnimalBanco() {
		
	}
	
	public static final synchronized AnimalBanco getInstance() {
		if (instance == null) instance = new AnimalBanco();
		return instance;
	}
	
	public Animal addAnimal(Animal animal) {
		id++;
		animal.setId(id);
		animais.put(id, animal);
		return animal;
	}
	
	public Collection<Animal> getAll() {
		return this.animais.values();
	}
	
}
