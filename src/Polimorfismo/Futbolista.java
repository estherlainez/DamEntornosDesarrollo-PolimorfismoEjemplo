package Polimorfismo;


/**
 * @author IFC
 * @version
 */


public class Futbolista extends SeleccionFutbol {
/**
 * 
 * Este campo represente el numero que lleva el jugador en la camiseta en la espalda
 * 
 * */
 
	private int dorsal;
	private String demarcacion;

	public Futbolista() {
		super();
	}

	/**
	 * Informacion del deportista
	 * @param id
	 * @param nombre
	 * @param apellidos
	 * @param edad
	 * @param dorsal
	 * @param demarcacion
	 * 
	 */
	public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
		super(id, nombre, apellidos, edad);
		this.dorsal = dorsal;
		this.demarcacion = demarcacion;
	}

	public int getDorsal() {
		return dorsal;
	}

	/**
	 * muestra numero del jugador
	 * @param dorsal
	 */
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getDemarcacion() {
		return demarcacion;
	}

	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}
	/**
	 * muestra un entrenamiento
	 */
	@Override
	public void entrenamiento() {
		System.out.println("Realiza un entrenamiento (Clase Futbolista)");
	}
	/**
	 * modificacion de un metodo que se repite en mas clases, override
	 */
	@Override
	public void partidoFutbol() {
		System.out.println("Juega un Partido (Clase Futbolista)");
	}

	public void entrevista() {
		System.out.println("Da una Entrevista");
	}

}
