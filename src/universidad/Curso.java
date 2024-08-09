
package universidad;


public class Curso {
     private int id;
    private String titulo;
    private int numMaxAlumnos;
    private int creditos;
    private Catedratico catedratico;
    private int alumnosAsignados = 0;

    public Curso(int id, String titulo, int numMaxAlumnos, int creditos, Catedratico catedratico) {
        this.id = id;
        this.titulo = titulo;
        this.numMaxAlumnos = numMaxAlumnos;
        this.creditos = creditos;
        this.catedratico = catedratico;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumMaxAlumnos() {
        return numMaxAlumnos;
    }

    public void setNumMaxAlumnos(int numMaxAlumnos) {
        this.numMaxAlumnos = numMaxAlumnos;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public Catedratico getCatedratico() {
        return catedratico;
    }

    public void setCatedratico(Catedratico catedratico) {
        this.catedratico = catedratico;
    }

    public boolean verificaEspacio() {
        return alumnosAsignados < numMaxAlumnos;
    }

    public void asignarAlumno() {
        if (verificaEspacio()) {
            alumnosAsignados++;
        } else {
            System.out.println("No hay espacio en el curso " + titulo);
        }
    }
}
