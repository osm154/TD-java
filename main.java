package tp4;

public class main {
    public static void main(String[] args) {
        Dictionnaire larousse = new Dictionnaire("Larousse", 10);
        larousse.ajouterMot(new motDico("Amour", "Sentiment d'affection intense"));
        larousse.ajouterMot(new motDico("Haïr", "Avoir de la haine"));
        larousse.ajouterMot(new motDico("Détester", "Avoir de l'aversion"));

        larousse.listerDico();

        if (larousse.chercherMot("Joie") == -1) System.out.println("Mot 'Joie' non trouvé");

        int pos = larousse.chercherMot("Amour");
        if (pos != -1) System.out.println(larousse.dico[pos].getMot() + " - " + larousse.dico[pos].getDéfinition());

        System.out.println("Synonymes de 'Détester': " + larousse.nbSynonymes(new motDico("Détester", "Avoir de l'aversion")));

        larousse.supprimerMot("Haïr");
        larousse.listerDico();
    }
}