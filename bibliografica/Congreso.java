import java.time.LocalDate;

public class Congreso {
    private String nombreCongreso;
    private String edicion;
    private String ciudad;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String tipo;
    private String frecuencia;
    private String pais;
    private int añoPrimeraCelebracion;

    public Congreso() {

    }

    public Congreso(String nombreCongreso, String edicion, String ciudad, LocalDate fechaInicio,
            LocalDate fechaFin, String tipo, String frecuencia, String pais, int añoPrimeraCelebracion) {
        this.nombreCongreso = nombreCongreso;
        this.edicion = edicion;
        this.ciudad = ciudad;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.tipo = tipo;
        this.frecuencia = frecuencia;
        this.pais = pais;
        this.añoPrimeraCelebracion = añoPrimeraCelebracion;
    }

    public String getNombreCongreso() {
        return nombreCongreso;
    }

    public void setNombreCongreso(String nombreCongreso) {
        this.nombreCongreso = nombreCongreso;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getAñoPrimeraCelebracion() {
        return añoPrimeraCelebracion;
    }

    public void setAñoPrimeraCelebracion(int añoPrimeraCelebracion) {
        this.añoPrimeraCelebracion = añoPrimeraCelebracion;
    }

}
