public class Curso{
    private String nombreCurso;
    private int creditos;

    public Curso(String nombre, int creditos){
        this.nombreCurso = nombre;
        this.creditos = creditos;
    }
    
    @Override
    public String toString(){
        return nombreCurso+" ("+creditos +" Creditos)";
    }
}