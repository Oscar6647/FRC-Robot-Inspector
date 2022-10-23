package RobotInspectorAPP;
public class   RobotInspector extends Usuario {
private String numID;
private String IN; 
public String getID(){
	return numID;
}
public void  setID(String newnumID) {
	numID = newnumID;
}
public String getIN() {
	return IN;
}
public void  setIN(String newTeamIN) {
	IN = newTeamIN;
}
public RobotInspector() {
	super();
	numID="0";
}
public void reset(String newName, String newnumID) {
	setID(newnumID);
	setName(newName);
}
public RobotInspector (String initialName, String initialnumID, String IN ) {
	super(initialName, IN);
	numID=initialnumID;
}
public void writeOutput() {
	System.out.println("Name: "+ getName());
	System.out.println("Equipos asociados: "+ getIN());
}

}
