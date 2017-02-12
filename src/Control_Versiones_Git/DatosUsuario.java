package Control_Versiones_Git;

public class DatosUsuario {
	private static String DNI="54094614-V";
	private static double saldoU;
	private static double margen=50;
	public DatosUsuario(){

	}
	
	
 	//String DNI[] =new String[50];
	//double SaldoU[]=new double[50];
	
	
	public String getDNI() {
		return DNI;
	}
	public static double getMargen() {
		return margen;
	}


	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public double getSaldoU() {
		return saldoU;
	}
	public void setSaldoU(double saldoU) {
		DatosUsuario.saldoU = saldoU;
		//System.out.print(this.saldoU);
	}	
	
}
