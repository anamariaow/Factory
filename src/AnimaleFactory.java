public class AnimaleFactory {
    public static Animale getAnimale(String tipo, String nome) {
        Animale animale = switch (tipo) {
            case "gatto" -> new Gatto(nome);
            case "cane" -> new Cane(nome);
            case "maiale" -> new Maiale(nome);
            default -> null;
        };

        return animale;
    }

    //if (tipo.equals("gatto")) {
    //            animale = new Gatto(nome);
    //        } else if (tipo.equals("cane")) {
    //            animale = new Cane(nome);
    //        } else if (tipo.equals("maiale")) {
    //            animale = new Maiale(nome);
    //        }
    //        return animale;
    //}
}
