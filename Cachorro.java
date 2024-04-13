// Subclasse Cachorro
class Cachorro extends Animal {
  public Cachorro(long id, String nome, int idade, double peso) {
      super(id, nome, idade, peso);
      getHabilidades().add("cheirar");
  }

  @Override
  public String sound() {
      return "au";
  }
}

