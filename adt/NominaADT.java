package adt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import adt.ArregloADT;

public class NominaADT {
	private ArregloADT nomina;
	private Object lineas;

	public NominaADT(ArregloADT nomina) {
		super();
		this.nomina = nomina;
		File f = new File(System.getProperty("user.dir") + "/src/adt/junio.dat");
		try {
			FileReader fr = new FileReader(f);
			BufferedReader buff = new BufferedReader(fr);
			String cad;
			while ((cad = buff.readLine()) != null) {
				System.out.println(cad);
			}
			buff.close();
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public float listarSueldos() {
		for (int i = 0; i < this.nomina.getLongitud(); i++) {
			emp = this.nomina.getElemento(i);
			System.out.println("ID {" emp.getNumeroTrabajador() "}" "Sueldo {"emp.calcularSueldo "}");
		}

	public String mayorAntiguedad() {
		int mayor = 2023;
		int idx = 0;
		for (int i = 0; i < this.nomina.getLongitud(); i++) {
			Object emp = this.nomina.getElemento(i);
			idx = i;
			mayor = this.nomina.getAnioIngreso();
			return (String) this.nomina.getElemento(i);
		}
	}
}
