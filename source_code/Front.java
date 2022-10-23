package RobotInspectorAPP;
import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
public class Front extends JPanel{
ImageIcon imagen;
String nombre;
public Front(String nombre) {
	this.nombre=nombre;
}
public void paint (Graphics g) {
	Dimension tamanio=getSize();
	imagen=new ImageIcon (getClass().getResource(nombre));
	g.drawImage(imagen.getImage(), 0, 0, tamanio.width, tamanio.height, null);
	setOpaque (false);
	super.paint(g);
}
}
