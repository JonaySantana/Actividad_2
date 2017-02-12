package Control_Versiones_Git;

import javax.swing.JOptionPane;

public class Operaciones {
	private double cantidad = 0;
	public double result = 0;
	private double saldo = 0;

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	/*
	 * public double getResult() { return result; } public void setResult(double
	 * result) { this.result = result; }
	 */

	DatosUsuario DU = new DatosUsuario();

	public void Ingreso() {
		saldo = DU.getSaldoU();
		result = cantidad + saldo;
		// System.out.print(result);
		DU.setSaldoU(result);

	}

	public void Retirada() {
		saldo = DU.getSaldoU();
		double margen = DU.getMargen();
		if (cantidad + margen <= saldo) {
			if (cantidad <= saldo) {
				result = saldo - cantidad;
				DU.setSaldoU(result);
			}
		} else {
			JOptionPane.showMessageDialog(null, "Fondos insuficientes");
		}

	}

	public void Consulta() {
		// System.out.print(DU.getSaldoU());
		String consulta = "Usuario: " + DU.getDNI() + "\n";
		consulta = consulta + "Saldo: " + String.valueOf(DU.getSaldoU()) + "\n";
		JOptionPane.showMessageDialog(null, consulta);
		InterfazInicio II = new InterfazInicio();
		II.InterfazInicio();

	}

}
