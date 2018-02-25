
/**
* Clase que define lo que es una Avioneta y 
* sus variables de instancia.
* 
* @author Antonio Rodriguez Gijon
* @version 1.0
*/
import javax.swing.JOptionPane;
public class Avioneta extends Vehiculo implements PuedeVolar{
	private String aeropuerto;
	private int maxKG;
/**
* Este metodo crea una Avioneta con sus valores por defecto
*/
	public Avioneta(){
		setMatricula(matAleatoria());
		setMarca("Cessna");
		setModelo("172");
		setColor("Blanco");
		setKilometros(0);
		setNumPuertas(2);
		setNumPlazas(2);
		setMaxKG(300);
		numVehiculos++;
	}
	
	public Avioneta(String registration, String brand, String model, String colour, int doors, int squares, int kg){
		setMatricula(registration);
		setMarca(brand);
		setModelo(model);
		setColor(colour);
		setNumPuertas(doors);
		setNumPlazas(squares);
		setMaxKG(kg);
		numVehiculos++;
	}
	
/**
* Metodo set que asigna el valor pasado por parametro al Vehiculo
* @param aero Aeropuerto a asignar
*/	
	public void setAeropuerto(String aero){
		aeropuerto = aero;
	}
/**
* Metodo get que devuelve el valor asignado a una de las propiedad del Vehiculo
*/	
	public String getAeropuerto(){
		return aeropuerto;
	}
/**
* Metodo set que asigna el valor pasado por parametro al Vehiculo
* @param kg Kilogramos maximos a asignar
*/	
	public void setMaxKG(int kg){
		maxKG = kg;
	}
/**
* Metodo get que devuelve el valor asignado a una de las propiedad del Vehiculo
*/	
	public int getMaxKG(){
		return maxKG;
	}
/**
* Metodo circular que realiza dicha accion.
*/	
	@Override public void circular(){
		JOptionPane.showMessageDialog(null, "Esto es una avioneta y mira como vuela.");
	}
/**
* Metodo despegar que realiza dicha accion.
*/	
	public void despegar(){
		JOptionPane.showMessageDialog(null, "La avioneta con matricula " + getMatricula() + " ha despegado.");
	}	
/**
* Metodo atrrizar que realiza dicha accion.
*/	
	public void aterrizar(){
		JOptionPane.showMessageDialog(null, "La avioneta con matricula " + getMatricula() + " ha aterrizado.");
	}
/**
* Metodo arrancar que realiza dicha accion.
*/	
	@Override public void arrancar(){
		JOptionPane.showMessageDialog(null, "La avioneta con matricula " + getMatricula() + " ha arrancado.");
	}
/**
* Metodo acelerar que realiza dicha accion.
*/	
	@Override public void acelerar(){
		JOptionPane.showMessageDialog(null, "La avioneta con matricula " + getMatricula() + " ha acelerado.");
	}
/**
* Metodo frenar que realiza dicha accion.
*/	
	@Override public void frenar(){
		JOptionPane.showMessageDialog(null, "La avioneta con matricula " + getMatricula() + " ha frenado.");
	}
/**
* Metodo toString que muestra las caracteristicas del objeto
*/
	@Override public String toString(){
		return "Caracteristicas del vehiculo: \n Matricula: " + getMatricula() + " \n Marca: " + getMarca() + "\n Modelo: " + getModelo() + " \n Kilometros: " + getKilometros() + "\n Color: " + getColor() + " \n Numero de Puertas: " + getNumPuertas() + " \n Numero de Plazas: " + getNumPlazas() + "\n Maxima Carga :" + getMaxKG();
	}
}