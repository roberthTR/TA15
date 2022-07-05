package T15b;

public class DocenteControlador implements Crud{

    private int contador;
    private Docente[] docentes;

    public DocenteControlador(int size){
        this.docentes = new Docente[size];
        this.contador = 0;
    }
    
    
    public void crear(String grado,String titulo,String nombres, String apellidos, Integer dni, String fechaNacimiento){
        this.docentes[this.contador++] = new Docente(grado, titulo, nombres, apellidos, dni, fechaNacimiento);
        
    }
    public void read(){
        for (Docente d : docentes) {
            System.out.println("Grado: "+d.getGrado()); 
            System.out.println("Titulo: "+d.getTitulo());
            System.out.println("Nombre: "+d.getNombres());             
            System.out.println("Apellidos: "+d.getApellidos());  
            System.out.println("Dni: "+d.getDni());  
            System.out.println("Fecha Nacimiento: "+d.getFechaNacimiento());  
            System.out.println("Fecha Nacimiento: "+d.calcularEdad()); 
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
