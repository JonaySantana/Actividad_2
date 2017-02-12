package Control_Versiones_Git;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class InterfazInicio {

	public void InterfazInicio() {

			Operaciones OP = new Operaciones();
			int operacion = JOptionPane.showOptionDialog(null, "Seleccione una operacion", "Selector de opciones",
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, // null
																							// para
																							// icono
																							// por
																							// defecto.
					new Object[] { "Ingreso", "Retirada", "Consulta", "Salir" }, "opcion 1");

			if (operacion == 0) {
				InterfazIngreso IIngreso = new InterfazIngreso();
				IIngreso.pack();
				IIngreso.setVisible(true);
				IIngreso.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			} else {
				if (operacion == 1) {
					InterfazRetirada IRetirada = new InterfazRetirada();
					IRetirada.pack();
					IRetirada.setVisible(true);
					IRetirada.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				} else {
					if (operacion == 2) {
						OP.Consulta();

					}if(operacion==3){
						System.exit(0);
					}
						
					
				}
			}


	}
}
