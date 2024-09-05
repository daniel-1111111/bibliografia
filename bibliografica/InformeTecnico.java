public class InformeTecnico {
    private String numeroIdentificacion;
    private String centroPublicacion;
    private String mesPublicacion;
    private int añoPublicacion;

    public InformeTecnico() {
        
    }

    public InformeTecnico(String numeroIdentificacion, String centroPublicacion, String mesPublicacion, int añoPublicacion) {
        this.numeroIdentificacion = numeroIdentificacion;
        this.centroPublicacion = centroPublicacion;
        this.mesPublicacion = mesPublicacion;
        this.añoPublicacion = añoPublicacion;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getCentroPublicacion() {
        return centroPublicacion;
    }

    public void setCentroPublicacion(String centroPublicacion) {
        this.centroPublicacion = centroPublicacion;
    }

    public String getMesPublicacion() {
        return mesPublicacion;
    }

    public void setMesPublicacion(String mesPublicacion) {
        this.mesPublicacion = mesPublicacion;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    
}
