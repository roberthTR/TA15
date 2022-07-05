package T15b;

public class Main {
    public static void main(String[] args) {

        DocenteControlador dc = new DocenteControlador(2);
        dc.crear("Mag.","Ing.","Freddy", "Clayderman", 17568452, "1999");
        
        dc.crear("Mag.","Ing.","Juan", "Huapalla", 71648861, "1992");

        AlumnoControlador ac = new AlumnoControlador(1);

        ac.crear(2019160036,"Roberth", "TORRES RIMAC", 73141714,"1999");
        
        dc.read();
        ac.read();
    }
}
