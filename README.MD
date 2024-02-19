<h2>Table de matière</h2>
<ul>
    <li><a href="">Couche Dao</a> 
        <li><a href="">Interface IDao</a></li>
        <li><a href="">Class DaoImpl</a></li>
    </li>
   
    <li><a href="">Couche metier</a>
        <li><a href="">Class DaoImpl2</a></li>
        <li><a href="">Class DaoImplVWS</a></li>
    </li>
    <li><a href="">Couche presentation</a>
        <li><a href="">Class Presentation</a></li>
        <li><a href="">Class Pres2</a></li>
        <li><a href="">Class PresntationSpringXml</a></li>
        <li><a href="">Class PresSpringAnnotations</a></li>
    </li>
    <li><a href="">Couche ext</a>
        <li><a href="">Class DaoImpl2</a></li>
        <li><a href="">Class DaoImplVWS</a></li>
    </li>
    
</ul>

<h2>Injection des dépendances et inversion de controle</h2>
<img src="captures/TP_IOC.png">

<h2>Couche Dao</h2>
<h3>Interface IDao</h3>
<code>package dao;

public interface IDao {

     double getData();
}
</code>

<h3>Class DaoImpl</h3>
<code>
package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao{
@Override
public double getData() {

        System.out.println("Version Base des données");
        double temp=Math.random()*40;
        return temp;
    }
}

</code>