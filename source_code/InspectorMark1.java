package RobotInspectorAPP;
import java.util.*;

public class InspectorMark1 {
	static Scanner teclado;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int utilitychoice;
	String Home ="no"; {
	teclado=new Scanner (System.in);
	
	do{System.out.println("Destination DEEP SPACE");
	System.out.println("ROBOT INSPECTION APP 2019"); 
	System.out.println();
	System.out.println("WELCOME TO THE Robot Inspection APP from FIRST");
	System.out.println("If you want to know which teams are in the Event write 1");
	System.out.println("If you want to know the map of the pits write 2");
	System.out.println("If you are ready to inspect write 3");
	System.out.println("View teams ready to compete write 4");
	System.out.println("View teams on waitlist for inspection write 5");
	System.out.println("View teams rejected on inspection write 6");
	System.out.println("Learn form the Robot Inspection team write 7");
	utilitychoice = teclado.nextInt();
	teclado.nextLine();
	switch (utilitychoice){
	case 1: utilitychoice=1;  EquiposRegistrados();
	System.out.println("Return to Home Text?");
	Home=teclado.nextLine();
	break;
	case 2: utilitychoice=2; MapaDeAreaDePits();
	System.out.println("Return to Home Text?");
	Home=teclado.nextLine();
	break;
	case 4: utilitychoice=4; EquiposListos();
	System.out.println("Return to Home Text?");
	Home=teclado.nextLine();
	break;
	case 5: utilitychoice=5; EquiposenWaitlist();
	System.out.println("Return to Home Text?");
	Home=teclado.nextLine();
	break;
	case 6: utilitychoice=6; EquiposNOListos();
	System.out.println("Return to Home Text?");
	Home=teclado.nextLine();break;
	
	case 7: utilitychoice=7; RobotInspectors();
	System.out.println("Return to Home Text?");
	Home=teclado.nextLine();break;
	case 3: utilitychoice=3; RobotInspection();
	System.out.println("Return to Home Text?");
	Home=teclado.nextLine();
	}
	} while (Home.equals("yes") );
	}
}
public static void EquiposRegistrados() {
String [] equipos = {"6647","7725","118","1780"} ;
System.out.println(equipos);
}
public static void MapaDeAreaDePits() {
System.out.println("6647 is located on pit 1a"+"7725 is located on pit 1b"+
" 118 is located on pit 1c"+ "1780 is located on pit 2a");
}
public static void RobotInspection() {
System.out.println("Initializing Inspection sheet");
System.out.println("Under Programming please wait");
}
public static void EquiposListos() {
String[]Listos= {"6647","7725"};
System.out.println(Listos + "this are the teams that are fully ready to compete ");
}
public static void EquiposenWaitlist() {
	String[]Esperando= {"118"};
	System.out.println(Esperando + "this are the teams that are waiting to be inspected ");
}
public static void EquiposNOListos() {
	String[]NOListos= {"1780"};
	System.out.println(NOListos + "this are the teams that are NEED TO BE REINSPECTED ");
}
public static void RobotInspectors() {
	Usuario [] RobotInspector= new Usuario[1];{
		RobotInspector[0]= new Usuario("Dummy","6647");
		RobotInspector[0].writeOutput();
	}
}	
}
