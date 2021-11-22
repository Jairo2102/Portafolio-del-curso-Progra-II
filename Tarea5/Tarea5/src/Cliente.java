public class Cliente {


    private String nombre;
    private int id;
    private int tel;
    private String correo;

//Contructor*********************************
    public Cliente(){}
//Nombre*************************************
        public String getnombre() {
            return nombre;
        }
        public void setnombre(String nombre) {
            this.nombre = nombre;
        }
//Cedula******************************************
        void setId(int valor){
            if(id <= 0){
                id = valor;    
            }
        }
            
        public int  getId(){return id;}
//Teléfono****************************************
void settel(int ntel){
    if(tel <= 0){
        tel = ntel;    
    }
}
            public int  gettel(){return tel;}
//Correo******************************************
        public String getcorreo() {
            return correo;
    }
        public void setcorreo(String correo) {
             this.correo = correo;
        }

}

