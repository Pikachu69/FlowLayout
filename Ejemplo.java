//# FlowLayout
//Repositorio para conocer mas acerca de FlowLayout de la clase swing, Java
import javax.swing.*;
import java.awt.*;

class Ejemplo extends JFrame{
  JButton primero = new JButton("Primero");
  JButton anterior = new JButton("Anterior");
  JButton siguiente = new JButton("Siguiente");
  JButton ultimo = new JButton("último");
  
 Ejemplo(){
   //Añadimos el formato de FlowLayout al JFrame
   this.setLayout(new FlowLayout());
   //Se añaden componentes
   add(primero);
   add (anterior);
   add (siguiente);
   add (ultimo);

setTitle("Ejemplos FlowLayout");
	setSize(400,400);
setVisible(true);
} 

public static void main(String[] args){
new Ejemplo();
  
}  
  
  
  
  }

