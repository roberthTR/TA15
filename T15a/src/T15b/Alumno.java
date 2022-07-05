package T15b;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alumno extends Persona { //implements Crud

    private int codigo;

    public Alumno(int codigo, String nombres, String apellidos, Integer dni, String fechaNacimiento) {
        super(nombres, apellidos, dni, fechaNacimiento);
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void mostrarDatos1(){
        System.out.println ("Alumno: " + getCodigo() + " " + getNombres() + " " +  getApellidos() + "\n"+
                "DNI del Alumno: " +getDni()+ "\n"+ "Fecha de Nacimiento: "+getFechaNacimiento()); }

    @Override
    public int calcularEdad(){
    int edad = 0;
    LocalDate fNacimiento = LocalDate.parse(getFechaNacimiento());;
    edad = (int) ChronoUnit.YEARS.between(fNacimiento, LocalDate.now());
    return edad;
    }            
}
