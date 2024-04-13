// Subclasse Passarinho
class Passarinho extends Animal {
  public Passarinho(long id, String nome, int idade, double peso) {
      super(id, nome, idade, peso);
      getHabilidades().add("voar");
  }

  @Override
  public String sound() {
      return "piu";
  }
}
