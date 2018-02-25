/**
* Clase que define lo que es un Vehiculo y 
* sus variables de instancia.
* 
* @author Antonio Rodriguez Gijon
* @version 1.0
*/
import javax.swing.JOptionPane;
abstract public class Vehiculo{
	private String matricula;
	private String marca;
	private String modelo;
	private String color;
	private double kilometros = 0;
	private int numPuertas;
	private int numPlazas;
	static int numVehiculos = 0;
	final static int maxVehiculos = 5;

/**
* Este metodo crea un Vehiculo con sus valores por defecto
*/
	public Vehiculo(){
		setMatricula(matAleatoria());
		setMarca("Generica");
		setModelo("Generico");
		setColor("Azul");
		setKilometros(0);
		setNumPuertas(2);
		setNumPlazas(4);
		numVehiculos++;
	}
	public Vehiculo(String registration, String brand, String model, String colour, double km, int doors, int squares){
		setMatricula(registration);
		setMarca(brand);
		setModelo(model);
		setColor(colour);
		setKilometros(km);
		setNumPuertas(doors);
		setNumPlazas(squares);
		numVehiculos++;
	}
	public static int getMaxVehiculos(){
		return maxVehiculos;
	}
	
	public static int getNumVehiculos(){
		return numVehiculos;
	}
	public void setMatricula(String registration){
		matricula = registration;
	}
/**
* Metodo get que devuelve el valor asignado a una de las propiedad del Vehiculo
*/	
	public String getMatricula(){
		return matricula;
	}
/**
* Metodo set que asigna el valor pasado por parametro al Vehiculo
* @param brand MAtricula a asignar
*/	
	public void setMarca(String brand){
		marca = brand;
	}
/**
* Metodo get que devuelve el valor asignado a una de las propiedad del Vehiculo
*/	
	public String getMarca(){
		return marca;
	}
/**
* Metodo set que asigna el valor pasado por parametro al Vehiculo
* @param model Modelo a asignar
*/	
	public void setModelo(String model){
		modelo = model;
	}
/**
* Metodo get que devuelve el valor asignado a una de las propiedad del Vehiculo
*/	
	public String getModelo(){
		return modelo;
	}
/**
* Metodo set que asigna el valor pasado por parametro al Vehiculo
* @param colour Color a asignar
*/		
	public void setColor(String colour){
		color = colour;
	}
/**
* Metodo get que devuelve el valor asignado a una de las propiedad del Vehiculo
*/		
	public String getColor(){
		return color;
	}
/**
* Metodo set que asigna el valor pasado por parametro al Vehiculo
* @param km Kilometros a asignar
*/		
	public void setKilometros(double km){
		kilometros = km;
	}
/**
* Metodo get que devuelve el valor asignado a una de las propiedad del Vehiculo
*/		
	public double getKilometros(){
		return kilometros;
	}
/**
* Metodo set que asigna el valor pasado por parametro al Vehiculo
* @param doors Puertas a asignar
*/	
	public void setNumPuertas(int doors){
		numPuertas = doors;
	}
/**
* Metodo get que devuelve el valor asignado a una de las propiedad del Vehiculo
*/		
	public int getNumPuertas(){
		return numPuertas;
	}
/**
* Metodo set que asigna el valor pasado por parametro al Vehiculo
* @param squares Plazas a asignar
*/	
	public void setNumPlazas(int squares){
		numPlazas = squares;
	}
/**
* Metodo get que devuelve el valor asignado a una de las propiedad del Vehiculo
*/	
	public int getNumPlazas(){
		return numPlazas;
	}
/**
* Metodo arrancar por definir en los hijos.
*/	
	public abstract void arrancar();
/**
* Metodo arrancar por definir en los hijos.
*/		
	public abstract void acelerar();
/**
* Metodo arrancar por definir en los hijos.
*/	
	public abstract void frenar();
/**
* Metodo toString que muestra las caracteristicas del objeto
*/
	@Override public String toString(){
		return "Caracteristicas del vehiculo: \n Matricula: " + getMatricula() + " \n Marca: " + getMarca() + "\n Modelo: " + getModelo() + " \n Kilometros: " + getKilometros();
	}
	
/**
* Metodo que devuelve una matricula aleatoria.
*
* @return Matricula devuelta.
*/
	public static String matAleatoria(){
		String aux = Integer.toString((int)(100000 * Math.random()));
		return aux;
	}

}