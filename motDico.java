package tp4;

public class motDico {
    private static int compteur = 0;
    private int num;
    private String mot;
    private String definition;

    public motDico(String mot, String definition) {
        this.num = ++compteur;
        this.mot = mot;
        this.definition = definition;
    }

    public String getMot() {
        return this.mot;
    }

    public String getDéfinition() {
        return this.definition;
    }

    public void setDéfinition(String s) {
        this.definition = s;
    }

    public void setMot(String s) {
        this.mot = s;
    }

    public boolean synonyme(motDico m) {
        return this.definition.equals(m.getDéfinition());
    }

    public String toString() {
        return "Num: " + num + ", Mot: " + mot + ", Définition: " + definition;
    }
}