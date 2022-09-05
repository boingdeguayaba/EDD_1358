package adt;

public class Trabajador {
	 private double HoraExtra;
	    private String numeroTrabajador;
	    private String nombre;
	    private String paterno;
	    private String materno;
	    private int horasExtra;
	    private int sueldo;
	    private int anioIngreso;
	    
		public Trabajador(double horaExtra, String numeroTrabajador, String nombre, String paterno, String materno,
				int horasExtra, int sueldo, int anioIngreso) {
			super();
			HoraExtra = 276.5;
			this.numeroTrabajador = numeroTrabajador;
			this.nombre = nombre;
			this.paterno = paterno;
			this.materno = materno;
			this.horasExtra = horasExtra;
			this.sueldo = sueldo;
			this.anioIngreso = anioIngreso;
		}

		public double getHoraExtra() {
			return HoraExtra;
		}

		public void setHoraExtra(double horaExtra) {
			HoraExtra = horaExtra;
		}

		public String getNumeroTrabajador() {
			return numeroTrabajador;
		}

		public void setNumeroTrabajador(String numeroTrabajador) {
			this.numeroTrabajador = numeroTrabajador;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getPaterno() {
			return paterno;
		}

		public void setPaterno(String paterno) {
			this.paterno = paterno;
		}

		public String getMaterno() {
			return materno;
		}

		public void setMaterno(String materno) {
			this.materno = materno;
		}

		public int getHorasExtra() {
			return horasExtra;
		}

		public void setHorasExtra(int horasExtra) {
			this.horasExtra = horasExtra;
		}

		public int getSueldo() {
			return sueldo;
		}

		public void setSueldo(int sueldo) {
			this.sueldo = sueldo;
		}

		public int getAnioIngreso() {
			return anioIngreso;
		}

		public void setAnioIngreso(int añoIngreso) {
			this.anioIngreso = añoIngreso;
		}

		@Override
		public String toString() {
			return "Trabajador [HoraExtra=" + HoraExtra + ", numeroTrabajador=" + numeroTrabajador + ", nombre=" + nombre
					+ ", paterno=" + paterno + ", materno=" + materno + ", horasExtra=" + horasExtra + ", sueldo=" + sueldo
					+ ", anioIngreso=" + anioIngreso + "]";
		}
	    
		public double calcularSueldo() {
			int antiguedad = 2022-this.anioIngreso;
			double total=this.sueldo+(this.sueldo*(antiguedad*0.03))+(this.horasExtra*this.HoraExtra);
			return total;
		}
}
