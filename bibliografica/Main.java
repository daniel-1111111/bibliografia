import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // grupo investigacion
        GrupoInvestigacion grupoInvestigacion = new GrupoInvestigacion("Grupo de Genética Avanzada",
                "Grupo dedicado a la investigación en genética",
                "Laboratorio 3");

        // investigadores
        Investigador investigador = new Investigador("Dr. Laura Gómez", "Instituto de Investigación",
                "laura.gomez@instituto.edu");
        Investigador investigador2 = new Investigador("Dr. Juan Pérez", "Universidad de Ciencias",
                "juan.perez@universidad.edu");
        grupoInvestigacion.getInvestigadores().add(investigador);
        grupoInvestigacion.getInvestigadores().add(investigador2);
        investigador.getTemasEspecificos().add("La ciencia y su poder");
        investigador2.getTemasEspecificos().add("la quimica y biologia en la sociedad");
        // InformeTecnico
        InformeTecnico informeTecnico = new InformeTecnico("1234", "Centro de Investigación ABC", "Marzo", 2023);

        // Crear objetos Congreso
        Congreso congreso = new Congreso("Congreso Internacional de Ciencia", "1ª Edición", "Madrid",
                LocalDate.of(2024, 8, 15),
                LocalDate.of(2024, 8, 20),
                "Internacional", "Anual", "España", 2000);

        // RevistaCientifica
        RevistaCientifica revistaCientifica = new RevistaCientifica("Revista de Ciencias", "Editorial XYZ",
                2015, "Mensual", "45", "123-130", 2023);
        revistaCientifica.getTemasAbordados().add("Quimica");
        revistaCientifica.getTemasAbordados().add("Biologia");

        // Crear objetos Autor
        Autor autor = new Autor("Dr. Juan Pérez", "Universidad de Ciencias", "juan.perez@universidad.edu");
        investigador2.getListAutor().add(autor);
        // Crear objetos Investigador
        Articulo articulo = new Articulo("Investigación sobre Genética", "contacto@investigacion.edu", true,
                "Estantería A", congreso, informeTecnico, revistaCientifica);
        articulo.getAutores().add(autor);
        articulo.getPalabrasClave().add("Genética");
        grupoInvestigacion.getArticulos().add(articulo);

        // Mostrar datos para verificar
        System.out.println("Grupo de Investigación:");
        System.out.println("Nombre: " + grupoInvestigacion.getNombreGrupo());
        System.out.println("Descripción: " + grupoInvestigacion.getDescripcion());
        System.out.println("Sede: " + grupoInvestigacion.getSede());

        System.out.println("\nInvestigadores:");
        for (Investigador inv : grupoInvestigacion.getInvestigadores()) {
            System.out.println("Nombre: " + inv.getNombre());
            System.out.println("Centro de Trabajo: " + inv.getCentroTrabajo());
            System.out.println("Correo Electrónico: " + inv.getCorreoElectronico());
            System.out.println("Temas Específicos: " + inv.getTemasEspecificos());
        }

        System.out.println("\nArtículos:");
        for (Articulo art : grupoInvestigacion.getArticulos()) {
            System.out.println("Título: " + art.getTitulo());
            System.out.println("Palabras Clave: " + art.getPalabrasClave());
            System.out.println("Ubicación de Copia: " + art.getUbicacionCopia());
            System.out.println("Autor o autores: ");
            for (Autor a : art.getAutores()) {
                System.out.println("Nombre: " + a.getNombre());
                System.out.println("Centro de Trabajo: " + a.getCentroTrabajo());
                System.out.println("Correo Electrónico: " + a.getCorreoElectronico());
            }
        }
    }
}
