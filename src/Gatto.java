public class Gatto extends Animale {
    public Gatto(String nome) {
        super(nome);
    }

    @Override
    public String toString() {
        return "Gatto{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
