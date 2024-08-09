
package universidad;


public class Asignacion {
     private Alumno alumno;
    private Curso[] cursos;

    public Asignacion(Alumno alumno, Curso[] cursos) {
        this.alumno = alumno;
        this.cursos = cursos;
    }

    public void addCurso(Curso curso) {
        if (curso.verificaEspacio()) {
            curso.asignarAlumno();
            System.out.println("Alumno " + alumno.getNombre() + " asignado al curso " + curso.getTitulo());
        } else {
            System.out.println("El curso " + curso.getTitulo() + " no tiene cupo disponible.");
        }
    }
}
