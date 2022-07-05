package T15b;

public class AlumnoControlador implements Crud{

    private int contador;
    private Alumno[] alumnos;

    public AlumnoControlador(int size) {
        this.alumnos = new Alumno[size];
        this.contador = 0;
    }

    public void crear(int codigo,String nombres, String apellidos, Integer dni, String fechaNacimiento){
        this.alumnos[this.contador++] = new Alumno(codigo, nombres, apellidos, dni, fechaNacimiento);
    }
    public void read(){
        for (Alumno a: alumnos) {
            System.out.println("Codigo: "+a.getCodigo());
            System.out.println("Nombre: "+a.getNombres());             
            System.out.println("Apellidos: "+a.getApellidos());  
            System.out.println("Dni: "+a.getDni());  
            System.out.println("Fecha Nacimiento: "+a.getFechaNacimiento());  
            System.out.println("Fecha Nacimiento: "+a.calcularEdad()); 
        }
    }
    public void update(){

    }
    public void delete(){

    }

    @Override
    public void crear() {
        // TODO Auto-generated method stub
        
    }
}
