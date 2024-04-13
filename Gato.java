// Subclasse Gato
class Gato extends Animal {
  public Gato(long id, String nome, int idade, double peso) {
      super(id, nome, idade, peso);
      getHabilidades().add("agilidade");
  }

  @Override
  public String sound() {
      return "miau";
  }
}