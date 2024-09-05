import java.util.ArrayList;
import java.util.List;

public class Autor {
    private String nombre;
    private String centroTrabajo;
    private String correoElectronico;
    private List<String> temasEspecificos;

    public Autor() {
    }

    public Autor(String nombre, String centroTrabajo, String correoElectronico) {
        this.nombre = nombre;
        this.centroTrabajo = centroTrabajo;
        this.correoElectronico = correoElectronico;
        this.temasEspecificos = new ArrayList<>();
    }

    public Autor(String nombre, String centroTrabajo, String correoElectronico, List<String> temasEspecificos) {
        this.nombre = nombre;
        this.centroTrabajo = centroTrabajo;
        this.correoElectronico = correoElectronico;
        this.temasEspecificos = temasEspecificos != null ? temasEspecificos : new ArrayList<>();
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
    
}
