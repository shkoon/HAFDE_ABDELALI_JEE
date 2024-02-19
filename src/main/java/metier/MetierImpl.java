package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier{
    private IDao dao;
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }
    @Override
    public double calcul() {
        double temp=dao.getData();
        double res =temp*540/Math.cos(temp*Math.PI);
        return res;
    }
    /*
    Injecter dans la variable dao un objet
    d'une classe qui implémente l'interface IDao
     */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
