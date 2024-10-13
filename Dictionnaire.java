package tp4;

public class Dictionnaire {
    private int nbMots;
    motDico[] dico;
    private String nom;

    public Dictionnaire(String nom, int tailleMax) {
        this.nom = nom;
        this.dico = new motDico[tailleMax];
        this.nbMots = 0;
    }

    public void ajouterMot(motDico m) {
        if (nbMots < dico.length) {
            dico[nbMots++] = m;
        }
    }

    public void supprimerMot(String ch) {
        int index = chercherMot(ch);
        if (index != -1) {
            for (int i = index; i < nbMots - 1; i++) {
                dico[i] = dico[i + 1];
            }
            dico[--nbMots] = null;
        }
    }

    public int chercherMot(String ch) {
        for (int i = 0; i < nbMots; i++) {
            if (dico[i].getMot().equals(ch)) return i;
        }
        return -1;
    }

    public void listerDico() {
        for (int i = 0; i < nbMots; i++) {
            System.out.println(dico[i]);
        }
    }

    public int nbSynonymes(motDico m) {
        int count = 0;
        for (int i = 0; i < nbMots; i++) {
            if (dico[i].synonyme(m)) count++;
        }
        return count;
    }
}





