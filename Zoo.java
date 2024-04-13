import java.util.ArrayList;

// Classe Zoo
class Zoo {
  private ArrayList<Animal> pets;

  public Zoo() {
      pets = new ArrayList<>();
  }

  // Adiciona um animal à lista
  public void addAnimal(Animal animal) {
      pets.add(animal);
  }

  // Retorna a lista de animais
  public ArrayList<Animal> listAnimals() {
      return pets;
  }

  // Remove um animal da lista dado um ID
  public boolean removeAnimal(long id) {
      for (Animal animal : pets) {
          if (animal.getId() == id) {
              pets.remove(animal);
              return true;
          }
      }
      return false;
  }
}