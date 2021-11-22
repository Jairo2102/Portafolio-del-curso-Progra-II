
import javax.swing.JOptionPane;

public class RegistroCliente {
    
    public static void registro (){

        Cliente cliente = new Cliente();
        
        String ncliente = JOptionPane.showInputDialog(null, "Bienvenido a la pulperia don Paco" + "\nIngrese su nombre por favor:");
        cliente.setnombre(ncliente);
        int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su número de identificación:"));
        cliente.setId(id); 
        int tel = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su número de teléfono:"));
        cliente.settel(tel); 
        String correo = JOptionPane.showInputDialog(null, "Ingrese su correo electrónico:");
        cliente.setcorreo(correo);

    }
}
