import java.util.ArrayList;
//William Enrique Caamal Caamal
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Matematicas", 5);
        Curso curso2 = new Curso("Fisica", 4);
        Curso curso3 = new Curso("Quimica", 3);

        ArrayList<Estudiante> EstudiantesFmat = new ArrayList<>();

        EstudiantesFmat.add(new Estudiante("Ana", curso1));
        EstudiantesFmat.add(new Estudiante());
        EstudiantesFmat.add(new Estudiante("Miguel"));
        EstudiantesFmat.add(new Estudiante("Luis"));
        EstudiantesFmat.add(new Estudiante("Ana", curso2));

        for(Estudiante e : EstudiantesFmat){
            System.out.println(e.getInfoEstudiante());
        }
    }   
}