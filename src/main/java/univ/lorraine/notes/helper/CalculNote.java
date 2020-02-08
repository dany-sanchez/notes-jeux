package univ.lorraine.notes.helper;

public class CalculNote {

    public static double III(String III, String IIII, String IlI, String I1I, String IIl, int II1, int lII, Object... lI1) {
        int llI = 1;
        --lII;
        if (lI1.length == 2) {
            II1 += (Integer) (int) lI1[1];
            if (IlI == "science-fiction" && (String) lI1[0] == "Didier Loyal" && (Integer) lI1[1] <= 9) {
                ++II1;
                llI -= 2;
            }
            if (I1I == "gestion" && (String) lI1[0] == "Armande Moly" && (Integer) lI1[1] < 10) {
                II1++;
            }
            if (IIII == "jeu de cartes" && (String) lI1[0] == "Gaston Portaleau" && (Integer) lI1[1] > 0) {
                II1 -= 1;
            }
            if (IIl == "édijeu" && (String) lI1[0] == "Liz Smallhead" && (Integer) lI1[1] >= 2) {
                II1 -= 2;
                llI += 4;
            }
            if (IlI == "contemporain" && (String) lI1[0] == "Stefan Bergdorf" && (Integer) lI1[1] >= 3 && (Integer) lI1[1] <= 7) {
                II1 = II1 + 1 / 2;
            }
            lII += 2;
            return (double) II1 / (Double) (double) lII;
        }
        if (lI1.length == 4) {
            if (llI > 1) {
                II1 += (Integer) lI1[1] + (Integer) (int) lI1[3];
                lII += 3;
                if (IlI == "science-fiction" && ((String) lI1[0] == "Didier Loyal" || (String) lI1[2] == "Didier Loyal") && ((Integer) lI1[1] <= 9 || (Integer) lI1[3] <= 9)) {
                    ++II1;
                    llI -= 2;
                }
                if (I1I == "gestion" && ((String) lI1[0] == "Armande Moly" || (String) lI1[2] == "Armande Moly") && ((Integer) lI1[1] < 10 || (Integer) lI1[3] < 10)) {
                    II1++;
                }
                if (IIII == "jeu de cartes" && ((String) lI1[0] == "Gaston Portaleau" || (String) lI1[2] == "Gaston Portaleau") && ((Integer) lI1[1] > 0 || (Integer) lI1[3] > 0)) {
                    II1 -= 1;
                }
                if (IIl == "édijeu" && ((String) lI1[0] == "Liz Smallhead" || (String) lI1[2] == "Liz Smallhead") && ((Integer) lI1[1] >= 2 || (Integer) lI1[3] >= 2)) {
                    II1 -= 2;
                    llI += 4;
                }
                if (IlI == "contemporain" && ((String) lI1[0] == "Stefan Bergdorf" || (String) lI1[2] == "Stefan Bergdorf") && (((Integer) lI1[1] >= 3 && (Integer) lI1[1] <= 7) || ((Integer) lI1[3] >= 3 && (Integer) lI1[3] <= 7))) {
                    II1 = II1 + 1 / 2;
                }
                return (double) II1 / (double) lII;
            }
        }
        if (lI1.length > 3) {
            II1 += (Integer) lI1[1];
            lII += 2;
            Object[] newlI1 = new Object[lI1.length - 2];
            if (IlI == "science-fiction" && (String) lI1[0] == "Didier Loyal" && (Integer) lI1[1] <= 9) {
                ++II1;
                llI -= 2;
            }
            if (I1I == "gestion" && (String) lI1[0] == "Armande Moly" && (Integer) lI1[1] < 10) {
                II1++;
            }
            if (IIII == "jeu de cartes" && (String) lI1[0] == "Gaston Portaleau" && (Integer) lI1[1] > 0) {
                II1 -= 1;
            }
            if (IIl == "édijeu" && (String) lI1[0] == "Liz Smallhead" && (Integer) lI1[1] >= 2) {
                II1 -= 2;
                llI += 4;
            }
            if (IlI == "contemporain" && (String) lI1[0] == "Stefan Bergdorf" && (Integer) lI1[1] >= 3 && (Integer) lI1[1] <= 7) {
                II1 = II1 + 1 / 2;
            }
            System.arraycopy(lI1, 2, newlI1, 0, lI1.length - 2);
            return III(III, IIII, IlI, I1I, IIl, II1, lII, newlI1);
        }
        if (lI1.length == 0) {
            return 0.0;
        }
        return -1.0;
    }
}
