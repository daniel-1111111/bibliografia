import java.util.ArrayList;
import java.util.List;

public class Investigador {
    private String nombre;
    private String centroTrabajo;
    private String correoElectronico;
    private List<String> temasEspecificos;
    private List<Autor> ListAutor;

    public Investigador() {
    }

    public Investigador(String nombre, String centroTrabajo, String correoElectronico) {
        this.nombre = nombre;
        this.centroTrabajo = centroTrabajo;
        this.correoElectronico = correoElectronico;
        this.temasEspecificos = new ArrayList<>();
        this.ListAutor = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCentroTrabajo() {
        return centroTrabajo;
    }

    public void setCentroTrabajo(String centroTrabajo) {
        this.centroTrabajo = centroTrabajo;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public List<String> getTemasEspecificos() {
        return temasEspecificos;
    }

    public void setTemasEspecificos(List<String> temasEspecificos) {
        this.temasEspecificos = temasEspecificos;
    }

    public List<Autor> getListAutor() {
        return ListAutor;
    }

    public void setListAutor(List<Autor> ListAutor) {
        this.ListAutor = ListAutor;
    }

    
}
