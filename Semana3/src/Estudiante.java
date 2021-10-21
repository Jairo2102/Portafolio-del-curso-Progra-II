public class Estudiante extends Persona{
    private int nota;
    public Estudiante(){}
    public Estudiante(int id, String nombre, String apellido){
        //super sirve para hacer referencia a métodos de mi ancestro Estudiante es metodo nieto
        // y Persona es método abuelo
        super (id, nombre, apellido);
    }
     
    // Seters y Geters métodos que me permiten tener acceso a 
    //los atributos privados de la clase.
    public void setNota(int value){
        this.nota = value;
    }
    public int getNota(){return this.nota;}
    public String toString (){
        this.me = super.toString() + " Nota: "
            + Integer.toString(this.nota);
        return this.me;
    }
}
