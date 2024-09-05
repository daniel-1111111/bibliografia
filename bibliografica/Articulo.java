import java.util.ArrayList;
import java.util.List;

public class Articulo {
    private String titulo;
    private String correoElectronicoContacto;
    private Boolean poseeCopia;
    private String ubicacionCopia;
    private List<Autor> autores;
    private List<String> palabrasClave;
    private Congreso congreso;
    private InformeTecnico informeTecnico;
    private RevistaCientifica revistaCientifica; 


    public Articulo() {

    }

    public Articulo(String titulo, String correoElectronicoContacto, Boolean poseeCopia,
            String ubicacionCopia, Congreso congreso, InformeTecnico informeTecnico, RevistaCientifica revistaCientifica) {
        this.titulo = titulo;
        this.correoElectronicoContacto = correoElectronicoContacto;
        this.poseeCopia = poseeCopia;
        this.ubicacionCopia = ubicacionCopia;
        this.congreso = congreso;
        this.informeTecnico = informeTecnico;
        this.revistaCientifica = revistaCientifica;
        this.autores = new ArrayList<>();
        this.palabrasClave = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCorreoElectronicoContacto() {
        return correoElectronicoContacto;
    }

    public void setCorreoElectronicoContacto(String correoElectronicoContacto) {
        this.correoElectronicoContacto = correoElectronicoContacto;
    }

    public Boolean getPoseeCopia() {
        return poseeCopia;
    }

    public void setPoseeCopia(Boolean poseeCopia) {
        this.poseeCopia = poseeCopia;
    }

    public String getUbicacionCopia() {
        return ubicacionCopia;
    }

    public void setUbicacionCopia(String ubicacionCopia) {
        this.ubicacionCopia = ubicacionCopia;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    public List<String> getPalabrasClave() {
        return palabrasClave;
    }

    public void setPalabrasClave(List<String> palabrasClave) {
        this.palabrasClave = palabrasClave;
    }

    public Congreso getCongreso() {
        return congreso;
    }

    public void setCongreso(Congreso congreso) {
        this.congreso = congreso;
    }

    public InformeTecnico getInformeTecnico() {
        return informeTecnico;
    }

    public void setInformeTecnico(InformeTecnico informeTecnico) {
        this.informeTecnico = informeTecnico;
    }

    public RevistaCientifica getRevistaCientifica() {
        return revistaCientifica;
    }

    public void setRevistaCientifica(RevistaCientifica revistaCientifica) {
        this.revistaCientifica = revistaCientifica;
    }
    

}
