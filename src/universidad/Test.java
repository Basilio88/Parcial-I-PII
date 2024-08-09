
package universidad;


public class Test {
   public static void main(String[] args) {
        Catedratico cat1 = new Catedratico("Dr. Juan Pérez", "Av. Siempre Viva", "12345678", "Matemáticas");
        Catedratico cat2 = new Catedratico("Dra. María López", "Calle Falsa 123", "87654321", "Física");
        Catedratico cat3 = new Catedratico("Ing. Carlos Sánchez", "Av. Principal", "11223344", "Programación");

        Curso curso1 = new Curso(101, "Cálculo", 2, 4, cat1);
        Curso curso2 = new Curso(102, "Física I", 5, 3, cat2);
        Curso curso3 = new Curso(103, "Introducción a la Programación", 5, 4, cat3);

        Alumno alumno1 = new Alumno("Pedro Ramirez", "Calle A", "99988877", 18);
        Alumno alumno2 = new Alumno("Ana Garcia", "Calle B", "88877766", 19);
        Alumno alumno3 = new Alumno("Luis Martinez", "Calle C", "77766655", 20);

        Asignacion asignacion1 = new Asignacion(alumno1, new Curso[]{curso1, curso2, curso3});
        Asignacion asignacion2 = new Asignacion(alumno2, new Curso[]{curso1, curso2, curso3});
        Asignacion asignacion3 = new Asignacion(alumno3, new Curso[]{curso1, curso2, curso3});

        asignacion1.addCurso(curso1);
        asignacion2.addCurso(curso1); // Este curso ya no tiene cupo después de asignar al alumno2
        asignacion3.addCurso(curso2);

        alumno1.imprimirDatos();
        alumno2.imprimirDatos();
        alumno3.imprimirDatos();

        cat1.imprimirDatos();
        cat2.imprimirDatos();
        cat3.imprimirDatos();
    }  

    static void main(String[] args) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
