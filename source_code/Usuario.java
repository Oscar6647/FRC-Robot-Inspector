package RobotInspectorAPP;

public class Usuario {
	private String name;
	private String numID;
	private String IN;
	private double equipos;
	public Usuario ()
    {
        name = "No name yet";
        IN="No Teams are involved with this User";
    }
    public Usuario (String initialName, String AsTeams)
    {
        name = initialName;
        IN= AsTeams;
    }
    public void setName (String newName)
    {
        name = newName;
    }
    public String getName ()
    {
        return name;
    }

    public void writeOutput ()
    {
        System.out.println ("Name: " + name);
        System.out.println("Associated Teams:"+ IN);
    }
    public boolean hasSameName (Usuario otherPerson)
    {
        return this.name.equalsIgnoreCase (otherPerson.name);
    }
	public String getID() {
		return numID;
	}
	public double getequipos() {
		return equipos;
	}
	public String getIN() {
		return IN;
	}

}
