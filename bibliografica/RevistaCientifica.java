import java.util.ArrayList;
import java.util.List;

public class RevistaCientifica {
    private String nombreRevista;
    private String editor;
    private int añoInicioPublicacion;
    private String frecuenciaPublicacion;
    private String numeroRevista;
    private String paginasRelevantes;
    private int añoPublicacion;
    private List<String> temasAbordados;

    public RevistaCientifica() {
        this.temasAbordados = new ArrayList<>();
    }

    public RevistaCientifica(String nombreRevista, String editor, int añoInicioPublicacion,
            String frecuenciaPublicacion, String numeroRevista, String paginasRelevantes,
            int añoPublicacion) {
        this.nombreRevista = nombreRevista;
        this.editor = editor;
        this.añoInicioPublicacion = añoInicioPublicacion;
        this.frecuenciaPublicacion = frecuenciaPublicacion;
        this.numeroRevista = numeroRevista;
        this.paginasRelevantes = paginasRelevantes;
        this.añoPublicacion = añoPublicacion;
        this.temasAbordados = new ArrayList<>();
    }

    public String getNombreRevista() {
        return nombreRevista;
    }

    public void setNombreRevista(String nombreRevista) {
        this.nombreRevista = nombreRevista;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public int getAñoInicioPublicacion() {
        return añoInicioPublicacion;
    }

    public void setAñoInicioPublicacion(int añoInicioPublicacion) {
        this.añoInicioPublicacion = añoInicioPublicacion;
    }

    public String getFrecuenciaPublicacion() {
        return frecuenciaPublicacion;
    }

    public void setFrecuenciaPublicacion(String frecuenciaPublicacion) {
        this.frecuenciaPublicacion = frecuenciaPublicacion;
    }

    public String getNumeroRevista() {
        return numeroRevista;
    }

    public void setNumeroRevista(String numeroRevista) {
        this.numeroRevista = numeroRevista;
    }

    public String getPaginasRelevantes() {
        return paginasRelevantes;
    }

    public void setPaginasRelevantes(String paginasRelevantes) {
        this.paginasRelevantes = paginasRelevantes;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public List<String> getTemasAbordados() {
        return temasAbordados;
    }

    public void setTemasAbordados(List<String> temasAbordados) {
        this.temasAbordados = temasAbordados;
    }

}
