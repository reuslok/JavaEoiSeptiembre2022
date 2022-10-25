package es.eoi.app;

public class JMFMatrix {
	
	private String str;
	private int alto;
	private int ancho;
	private String[][] ArrStr;
	public void MatrixSTR(int alto, int ancho,String str) 
	{

		this.alto = alto;
		this.ancho=ancho;
		this.str = str;
		String[][] ArrStr= new String[alto][ancho];
		
		
	}
	public String[][] GetArrStr() {
		return ArrStr;
		
	}
	public void SetArrStr(String[][] ArrStr) {
		this.ArrStr = ArrStr;
	}
}