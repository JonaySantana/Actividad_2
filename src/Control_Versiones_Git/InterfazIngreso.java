package Control_Versiones_Git;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class InterfazIngreso extends JFrame {
	DatosUsuario DU = new DatosUsuario();
	private static final long serialVersionUID = 1L;
	JTextField tf1, tf2, tf3; // Se generan los campos de texto
	JLabel label1, label2, label3;// Se generan los textos
	JButton Ingresar, Cancelar, Salir;// se generan los botones

	public InterfazIngreso() {
		// iniciamos los JTextField
		tf1 = new JTextField(50);
		tf2 = new JTextField(50);
		tf3 = new JTextField(50);

		// iniciamos los JLabel
		label1 = new JLabel("Dni");
		label2 = new JLabel("Saldo");
		label3 = new JLabel("Cantidad");

		// iniciamos los JButton
		Ingresar = new JButton("Ingresar");
		Cancelar = new JButton("Cancelar");
		Salir = new JButton("Salir");

		setTitle("Ingresos");
		Toolkit mipantalla = Toolkit.getDefaultToolkit();
		Dimension tamanoPantalla = mipantalla.getScreenSize();
		int alturaPantalla = tamanoPantalla.height;
		int anchoPantalla = tamanoPantalla.width;
		Container pantalla = getContentPane();
		pantalla.setLayout(new FlowLayout());
		pantalla.setPreferredSize(new Dimension(anchoPantalla / 2, alturaPantalla / 5));
		setLocation(anchoPantalla / 4, alturaPantalla / 4);
		setResizable(false);

		// A�adimos los componentes de la interfaz grafica
		pantalla.add(label1);
		pantalla.add(tf1);
		tf1.setText(DU.getDNI());
		tf1.setEditable(false);
		pantalla.add(label2);
		pantalla.add(tf2);
		tf2.setText(String.valueOf(DU.getSaldoU()));
		tf2.setEditable(false);
		pantalla.add(label3);
		pantalla.add(tf3);
		pantalla.add(Ingresar);
		pantalla.add(Cancelar);
		pantalla.add(Salir);

		// Acciones para los botones
		Ingresar.addActionListener(new event());
		Cancelar.addActionListener(new event());
		Salir.addActionListener(new event());

	}

	static double cant;

	private class event implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			if (e.getActionCommand().equals("Ingresar")) {
				Operaciones Op = new Operaciones();
				InterfazInicio II = new InterfazInicio();

				Op.setCantidad(Double.parseDouble(tf3.getText()));
				Op.Ingreso();
				dispose();
				II.InterfazInicio();

			}
			if (e.getActionCommand().equals("Cancelar")) {
				tf3.setText("");
			}
			if (e.getActionCommand().equals("Salir")){
				System.exit(0);
			}
		}
	}
}
