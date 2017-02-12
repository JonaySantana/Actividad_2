package Control_Versiones_Git;

import javax.swing.JOptionPane;

public class Lanzador {

	public static void main(String[] args) {
		InterfazInicio II = new InterfazInicio();

		int opc = JOptionPane.showConfirmDialog(null, "¿Tienes cuenta de usuario?");
		if (opc == 0) {
			II.InterfazInicio();
		} else {
			if (opc == 1) {
				DatosUsuario DU = new DatosUsuario();
				JOptionPane.showMessageDialog(null, "Vamos a registrarnos");
				String usuN = (String) (JOptionPane.showInputDialog("DNI", null));
				DU.setDNI(usuN);
				II.InterfazInicio();

			} else {
				JOptionPane.showMessageDialog(null, "Hasta pronto");
			}
		}

	}

}
