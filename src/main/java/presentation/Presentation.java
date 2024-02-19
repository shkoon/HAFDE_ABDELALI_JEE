package presentation;

import ext.DaoImpl2;
import metier.MetierImpl;

public class Presentation {

    public static void main(String[] args) {

        /*
        Injection des dépendances par
        instanciation statique => new
         */
        DaoImpl2 dao=new DaoImpl2();
        MetierImpl metier=new MetierImpl(dao);
        System.out.println("Résultat="+metier.calcul());
    }
}
