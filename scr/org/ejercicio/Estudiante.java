public class Estudiante {
    private String nombreEstudiante;
    private Curso curso;
    
    public Estudiante(){
        this.nombreEstudiante = " ";
        this.curso = null;   
    }

    public Estudiante(String nombre, Curso curso){
        this.nombreEstudiante = nombre;
        this.curso = curso;
    }

    public Estudiante(String nombre){
        this.nombreEstudiante = nombre;
        this.curso = null;
    }


public String getInfoEstudiante(){
    return "Nombre: " + nombreEstudiante + "  Curso: " + (curso == null ? "No asignado" : curso.toString());
}

    @Override
    public String toString(){
        return "Nombre: "+nombreEstudiante+" Curso: "+curso;
    }

    public String getNombreEstudiante(){
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombre){
        this.nombreEstudiante = nombre;
    }

    public Curso getCurso(){
        return curso;
    }

    public void setCurso(Curso curso){
        this.curso = curso;
    }


} 