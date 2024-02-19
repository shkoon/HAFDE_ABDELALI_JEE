package presentation;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {

    public static void main(String[] args) {
        try {
            Scanner scanner=new Scanner(new File("config.txt"));
            String daoClassName=scanner.nextLine();
            Class cDao=Class.forName(daoClassName);
            IDao dao=(IDao)cDao.newInstance();

            String metierClassName=scanner.nextLine();
            Class cMetier=Class.forName(metierClassName);
            IMetier metier=(IMetier) cMetier.newInstance();

            Method method=cMetier.getMethod("setDao",IDao.class);
            method.invoke(metier,dao);

            System.out.println("Résultat="+metier.calcul());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
