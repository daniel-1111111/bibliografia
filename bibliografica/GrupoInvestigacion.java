import java.util.ArrayList;
import java.util.List;

public class GrupoInvestigacion {
    private String nombreGrupo;
    private String descripcion;
    private String sede;
    private List<Investigador> investigadores;
    private List<Articulo> articulos;

    public GrupoInvestigacion() {
    
    }

    public GrupoInvestigacion(String nombreGrupo, String descripcion, String sede) {
        this.nombreGrupo = nombreGrupo;
        this.descripcion = descripcion;
        this.sede = sede;
        this.investigadores = new ArrayList<>();
        this.articulos = new ArrayList<>();
    }


    public String getNombreGrupo() {
        return nombreGrupo;
    }

    public void setNombreGrupo(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public List<Investigador> getInvestigadores() {
        return investigadores;
    }

    public void setInvestigadores(List<Investigador> investigadores) {
        this.investigadores = investigadores;
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(List<Articulo> articulos) {
        this.articulos = articulos;
    }
    
}
