package T15b;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Docente extends Persona{

    private String grado;

    private String titulo;

    public Docente(String grado,String titulo,String nombres, String apellidos, Integer dni, String fechaNacimiento) {
        super(nombres, apellidos, dni, fechaNacimiento);
        this.grado = grado;
        this.titulo = titulo;
    }

    public String getGrado() {
        return grado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void mostrarDatos2(){
        System.out.println ("Docente: " + getTitulo() + " " + getNombres() + " " +  getApellidos() + getGrado() + "\n"+
                "DNI del docente: " +getDni()+ "\n"+ "Fecha de Nacimiento: "+getFechaNacimiento()+ "Edad: "+calcularEdad()); }

    @Override
    public int calcularEdad(){
        int edad = 0;
        LocalDate fNacimiento = LocalDate.parse(getFechaNacimiento());;
        edad = (int) ChronoUnit.YEARS.between(fNacimiento, LocalDate.now());
        return edad;
    }
}
