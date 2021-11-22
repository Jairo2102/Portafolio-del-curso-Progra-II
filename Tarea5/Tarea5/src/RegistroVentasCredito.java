import javax.swing.JOptionPane;
public class RegistroVentasCredito {
    public void mostrarListaClientes(){
        //debe mostrar el id y el nombre
    }
    public void verVentasCredito(){
        //solicitar el id del cliente, depues mostrar todas las ventas de credito
    }

    public void registrarVentaCredito(){
        Ventas ventas = new Ventas();
        int id; //Se genera solo o se pone
        int fechaV; //No se como guardar una fecha
        int hora; //No se como guardar la hora

        int total= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el total a cobrar"));
        ventas.setTotalCobrar(total);

//ID del cliente de crédito (Si no existe deberá mostrar un error)
//Monto de la venta de crédito (Debe registrarlo el usuario y debe almacenarse en un atributo de tipo double
//ID de la venta (Automático consecutivo)
//Fecha de la venta (Automático cuándo se registra la venta, no se le pide al usuario, se genera de forma interna en el constructor del objeto VentaCredito)
//Hora de la venta (Automático cuándo se registra la venta, no se le pide al usuario, se genera de forma interna en el constructor del objeto VentaCredito)
    }
}
