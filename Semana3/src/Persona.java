public class Persona {
    public int id;
    String nombre;
    String apellido;
    int edad;
    // protected significa que las subclases sí pueden tener 
    //acceso al campo o método. Es el intermedio entre public y private

    //Hacemos llamado al método en otra clase mediante this.me en este caso. "this.***"
    
    protected String me;

    public Persona(){}
    //public Persona(int id){
    //this.id = id;   
    //}

    //public Persona (int id, String nombre){
    //  this.id = id;
    //this.nombre = nombre;
    //}

    public Persona (int id, String nombre, String apellido){
        this.id = id;
        this.nombre = nombre;
        this.apellido= apellido;
    }


     public void setId(int id){
          if (this.id <= 0) {
               this.id = id; 
         }
    }
      //Override me permite sobrescribir un metodo, un comportamientro, 
      //un miembro de mi ancestro
    @Override
    public String toString (){
        String me= " ID: " + Integer.toString(this.id);
        me += " Nombre: " + this.nombre;
        me += " Apellido: " + this.apellido;
        me += " Edad: " + Integer.toString(this.edad);
        return me;
    }
}
