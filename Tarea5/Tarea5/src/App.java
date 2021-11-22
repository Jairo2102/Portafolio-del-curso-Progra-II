import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        int opcion = 0;
        RegistroCliente Nuevoregistro = new RegistroCliente();
        RegistroVentasCredito Nuevaventa = new RegistroVentasCredito();
        RegistroContado Nuevocontado = new RegistroContado();
        do{
            opcion =Integer.parseInt(
                JOptionPane.showInputDialog(null,
                "¿Qué desea realizar?\n"
                + "1. Registrar clientes de crédito\n"
                + "2. Registrar ventas de contado\n"
                + "3. Registrar ventas de crédito\n"
                + "4. Salir"));

                switch (opcion){
                    //1. Registrar clientes de crédito
                    case 1:
                    do{
                        opcion =Integer.parseInt(
                            JOptionPane.showInputDialog(null,
                            "¿Qué desea realizar?\n"
                            + "1. Registro de nuevo cliente de crédito\n"
                            + "2. Ver todos los clientes de crédito\n"
                            + "3. Modificar un cliente de crédito\n"
                            + "4. Eliminar un cliente de crédito\n"
                            + "5. Volver al menu principal"));

                            switch (opcion){
                                case 1:
                                Nuevoregistro.registro();
                                break;
                                case 2:
                                //2. Ver todos los clientes de crédito
                                JOptionPane.showMessageDialog(null, "Funciona!!");
                                break;
                                case 3:
                                //3. Modificar un cliente de crédito
                                JOptionPane.showMessageDialog(null, "Funciona!!");
                                break;
                                case 4:
                                //4. Eliminar un cliente de crédito
                                JOptionPane.showMessageDialog(null, "Funciona!!");
                                break;
                            }
                    }while (opcion != 5);
                    break;

                    //2. Registrar ventas de contado
                    case 2:
                    do{
                        opcion =Integer.parseInt(
                            JOptionPane.showInputDialog(null,
                            "¿Qué desea realizar?\n"
                            + "1. Ver las ventas hechas de contado\n"
                            + "2. Registrar una nueva ventana\n"
                            + "3. Volver al menu principal"));

                            switch (opcion){
                                case 1:
                                //1. Ver las ventas hechas de contado
                                JOptionPane.showMessageDialog(null, "Funciona!!");
                                break;
                                case 2:
                                Nuevocontado.registrarVenta();
                                
                                break;
                            }
                    }while (opcion != 3);
                    break;

                    case 3:
                    do{
                        opcion =Integer.parseInt(
                            JOptionPane.showInputDialog(null,
                            "¿Qué desea realizar?\n"
                            + "1. Ver las ventas de crédito\n"
                            + "2. Registrar venta de crédito\n"
                            + "3. Volver al menu principal"));

                            switch (opcion){
                                case 1:
                                //1. Ver las ventas de crédito
                                JOptionPane.showMessageDialog(null, "Funciona!!");
                                break;
                                case 2:
                                //2. Registrar venta de crédito
                                Nuevaventa.registrarVentaCredito();
                                do{
                                    opcion =Integer.parseInt(
                                    JOptionPane.showInputDialog(null,
                                    "¿Qué desea realizar?\n"
                                    + "1. Mostrar lista de clientes de crédito\n"
                                    + "2. Ver las ventas de crédito de un cliente\n"
                                    + "3. Registrar venta de crédito\n"
                                    + "4. Volver al menu principal"));

                                    switch(opcion){
                                        case 1:
                                        //Mostrar lista de clientes de credito
                                        break;
                                        case 2:
                                        //ver las ventas de credito de un cliente
                                        break;
                                        case 3:
                                        //ver todas las ventas de credito
                                        break;
                                    }
                                }while(opcion!=4);
                                break;
                            }
                    }while (opcion != 3);
                    break;
                }
        }while (opcion != 4);
    }
}

