public class Main {
    public static void main(String[] args) {
        String tipo = "maiale";
        String nome = "Tom";
        Animale animale = AnimaleFactory.getAnimale(tipo, nome); //logica di creazione isolata in AnimaleFactory

        System.out.println("animale: " + animale);
    }
}