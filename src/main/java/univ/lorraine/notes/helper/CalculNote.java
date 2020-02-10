package univ.lorraine.notes.helper;

public class CalculNote {

    public static double calculNote(String nomJeu, String typeJeu, String themeJeu, String genreJeu, String editeurJeu, int nb1, int nb2, Object... nomsNotesTesteurs) {
        int nb3 = 1;
        --nb2;
        if (nomsNotesTesteurs.length == 2) {
            nb1 += (Integer) (int) nomsNotesTesteurs[1];
            if (themeJeu == "science-fiction" && (String) nomsNotesTesteurs[0] == "Didier Loyal" && (Integer) nomsNotesTesteurs[1] <= 9) {
                ++nb1;
                nb3 -= 2;
            }
            if (genreJeu == "gestion" && (String) nomsNotesTesteurs[0] == "Armande Moly" && (Integer) nomsNotesTesteurs[1] < 10) {
                nb1++;
            }
            if (typeJeu == "jeu de cartes" && (String) nomsNotesTesteurs[0] == "Gaston Portaleau" && (Integer) nomsNotesTesteurs[1] > 0) {
                nb1 -= 1;
            }
            if (editeurJeu == "édijeu" && (String) nomsNotesTesteurs[0] == "Liz Smallhead" && (Integer) nomsNotesTesteurs[1] >= 2) {
                nb1 -= 2;
                nb3 += 4;
            }
            if (themeJeu == "contemporain" && (String) nomsNotesTesteurs[0] == "Stefan Bergdorf" && (Integer) nomsNotesTesteurs[1] >= 3 && (Integer) nomsNotesTesteurs[1] <= 7) {
                nb1 = nb1 + 1 / 2;
            }
            nb2 += 2;
            return (double) nb1 / (Double) (double) nb2;
        }
        if (nomsNotesTesteurs.length == 4) {
            if (nb3 > 1) {
                nb1 += (Integer) nomsNotesTesteurs[1] + (Integer) (int) nomsNotesTesteurs[3];
                nb2 += 3;
                if (themeJeu == "science-fiction" && ((String) nomsNotesTesteurs[0] == "Didier Loyal" || (String) nomsNotesTesteurs[2] == "Didier Loyal") && ((Integer) nomsNotesTesteurs[1] <= 9 || (Integer) nomsNotesTesteurs[3] <= 9)) {
                    ++nb1;
                    nb3 -= 2;
                }
                if (genreJeu == "gestion" && ((String) nomsNotesTesteurs[0] == "Armande Moly" || (String) nomsNotesTesteurs[2] == "Armande Moly") && ((Integer) nomsNotesTesteurs[1] < 10 || (Integer) nomsNotesTesteurs[3] < 10)) {
                    nb1++;
                }
                if (typeJeu == "jeu de cartes" && ((String) nomsNotesTesteurs[0] == "Gaston Portaleau" || (String) nomsNotesTesteurs[2] == "Gaston Portaleau") && ((Integer) nomsNotesTesteurs[1] > 0 || (Integer) nomsNotesTesteurs[3] > 0)) {
                    nb1 -= 1;
                }
                if (editeurJeu == "édijeu" && ((String) nomsNotesTesteurs[0] == "Liz Smallhead" || (String) nomsNotesTesteurs[2] == "Liz Smallhead") && ((Integer) nomsNotesTesteurs[1] >= 2 || (Integer) nomsNotesTesteurs[3] >= 2)) {
                    nb1 -= 2;
                    nb3 += 4;
                }
                if (themeJeu == "contemporain" && ((String) nomsNotesTesteurs[0] == "Stefan Bergdorf" || (String) nomsNotesTesteurs[2] == "Stefan Bergdorf") && (((Integer) nomsNotesTesteurs[1] >= 3 && (Integer) nomsNotesTesteurs[1] <= 7) || ((Integer) nomsNotesTesteurs[3] >= 3 && (Integer) nomsNotesTesteurs[3] <= 7))) {
                    nb1 = nb1 + 1 / 2;
                }
                return (double) nb1 / (double) nb2;
            }
        }
        if (nomsNotesTesteurs.length > 3) {
            nb1 += (Integer) nomsNotesTesteurs[1];
            nb2 += 2;
            Object[] newListTesteurs = new Object[nomsNotesTesteurs.length - 2];
            if (themeJeu == "science-fiction" && (String) nomsNotesTesteurs[0] == "Didier Loyal" && (Integer) nomsNotesTesteurs[1] <= 9) {
                ++nb1;
                nb3 -= 2;
            }
            if (genreJeu == "gestion" && (String) nomsNotesTesteurs[0] == "Armande Moly" && (Integer) nomsNotesTesteurs[1] < 10) {
                nb1++;
            }
            if (typeJeu == "jeu de cartes" && (String) nomsNotesTesteurs[0] == "Gaston Portaleau" && (Integer) nomsNotesTesteurs[1] > 0) {
                nb1 -= 1;
            }
            if (editeurJeu == "édijeu" && (String) nomsNotesTesteurs[0] == "Liz Smallhead" && (Integer) nomsNotesTesteurs[1] >= 2) {
                nb1 -= 2;
                nb3 += 4;
            }
            if (themeJeu == "contemporain" && (String) nomsNotesTesteurs[0] == "Stefan Bergdorf" && (Integer) nomsNotesTesteurs[1] >= 3 && (Integer) nomsNotesTesteurs[1] <= 7) {
                nb1 = nb1 + 1 / 2;
            }
            System.arraycopy(nomsNotesTesteurs, 2, newListTesteurs, 0, nomsNotesTesteurs.length - 2);
            return calculNote(nomJeu, typeJeu, themeJeu, genreJeu, editeurJeu, nb1, nb2, newListTesteurs);
        }
        if (nomsNotesTesteurs.length == 0) {
            return 0.0;
        }
        return -1.0;
    }
}
