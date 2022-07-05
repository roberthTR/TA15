package T15b;
import java.time.*;
import java.time.temporal.ChronoUnit;

abstract public class Persona {
    protected String nombres;
    protected String apellidos;
    protected int dni;
    protected String fechaNacimiento;

    Persona(String nombres, String apellidos, Integer dni, String fechaNacimiento){
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;


    }
    public String getNombres() {
        return nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public Integer getDni() {
        return dni;
    }
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public int calcularEdad(){
        int edad = 0;
        LocalDate fNacimiento = LocalDate.parse(getFechaNacimiento());;
        edad = (int) ChronoUnit.YEARS.between(fNacimiento, LocalDate.now());
        return edad;
    }
}
