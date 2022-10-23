package RobotInspectorAPP;

import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class DatosdeUsuario {
	static JRadioButton yes;
	static JRadioButton radioButton_1;
	static int Count;
	static int neucount;
	static int bca;
public DatosdeUsuario() {}
	private String  usuario1="";
private String pass1="";
@SuppressWarnings("deprecation")
public int probarPass() {
	usuario1=FrontPage.textField.getText();
	pass1=FrontPage.passwordField.getText();
	if(usuario1.equals("test")&&pass1.equals("test")) {
		return 1;
	}
	else {
		return 0;
	}
}

public void PassInspects() {}
	private float robotweight;
	private float redbumperweight;
	private float bluebumperweight;
	private static float itemsweight;
public float weightpass() {
	
	robotweight= Float.parseFloat(InitialInspection.txt.getText());
	if(robotweight>125) {
		return 1;
	}
	else {
		return 0;
	}
}
public float weightpass2() {
	
	robotweight= Float.parseFloat(InitialInspection.textField_3.getText());
	if(robotweight>125) {
		return 1;
	}
	else {
		return 0;
	}
}
public float bumperweightpass() {
	redbumperweight = Float.parseFloat(InitialInspection.textField_1.getText());
	bluebumperweight= Float.parseFloat(InitialInspection.textField_2.getText());
	if(redbumperweight>15&&bluebumperweight>15) {
		return 1;
	}
	else if(redbumperweight>15&&bluebumperweight<=15) {
		return 2;
	}
	else if (redbumperweight<=15&&bluebumperweight>15) {
		return 3;
	}
	else {
		return 0;
	}
	
}
public float otherconfig() {
	robotweight= Float.parseFloat(MoreCONFIG.weight.getText());
	if(robotweight>125) {
		return 1;
	}
	else {
		return 0;
	}
}
public static void itemsweight() {
	String itemsweightinput;
	itemsweightinput=JOptionPane.showInputDialog("Weight of all Items");
	int n = Integer.parseInt(itemsweightinput );
	
	if(n==JOptionPane.YES_OPTION) {
		if(itemsweightinput==null) {
		
	}
	else {
	 itemsweight = Float.parseFloat(itemsweightinput);
	 if(itemsweight>150) {
		 JOptionPane.showMessageDialog(null,"Items violate <I3>");
	 }
	 else {
		 JOptionPane.showMessageDialog(null,"Items follow <I3>");
	 }
	 }} else if(n==JOptionPane.CANCEL_OPTION) {
		 yes.setSelected(false);
		 radioButton_1.setSelected(true);
	 }
}
public boolean BCA() {
	if(bca==1) {
		
		return true;
	}else {
		return false;
	}
}
}