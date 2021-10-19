public class Persona {
    private int id ;
    public String nombre;
    public String apellido;
    public short edad;

    void setId(int valor){
        if(id <= 0){
            id = valor;    
        }
    }
        
    public int  getId(){return id;}
    



    public void saludar(){
        System.out.println(mensaje());

    }

    public String imprimir(){
        return "Soy " + nombre;

    }

    private String mensaje(){
        return"Hola me llamo " + nombre + " y mi ID es " + id;
    }

}
