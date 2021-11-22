import java.util.Random;

import javax.swing.JOptionPane;

public class RegistroContado {
    public void mostrarVenta(){
        JOptionPane.showMessageDialog(null, "");
        //como mostrar todos los datos de registrarVenta();?????
    }
    public void registrarVenta(){

        Ventas ventas = new Ventas();
        int mini=0;
        int id; //Se genera solo
        int fechaV; //No se como guardar una fecha
        int hora; //No se como guardar la hora
        int total= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el total a cobrar"));
        ventas.setTotalCobrar(total);
        do{
            mini=Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cual va a ser su metodo de pago?"
            + "1. Contado\n"
            + "2. Tarjeta"));
            switch(mini){
                case 1:
                JOptionPane.showMessageDialog(null, "Su metodo de pago fue de contado");
                break;
                case 2:
                JOptionPane.showMessageDialog(null, "Su metodo de pago fue en tarjeta");
                break;
            }
        }while(mini!=2);
    }
    public static void idAleatorio(){
        Random aleatorio = new Random();
        int N=aleatorio.nextInt(9);
        System.out.println("El num aleatorio es "+N);
    }
}
