/**
* Clase que define lo que es un Autobus y 
* sus variables de instancia.
* 
* @author Antonio Rodriguez Gijon
* @version 1.0
*/
import javax.swing.JOptionPane;
public class Autobus extends Vehiculo implements PuedeCircular{
	private String recorrido;
	private boolean esEscolar;
/**
* Este metodo crea un Autobus con sus valores por defecto
*/
	public Autobus(){
		setMatricula(matAleatoria());
		setMarca("IVECO");
		setModelo("Daily");
		setColor("Azul");
		setKilometros(0);
		setNumPuertas(4);
		setNumPlazas(60);
		numVehiculos++;
	}
	public Autobus(String registration, String brand, String model, String colour, int doors, int squares, String recorrido){
		setMatricula(registration);
		setMarca(brand);
		setModelo(model);
		setColor(colour);
		setNumPuertas(doors);
		setNumPlazas(squares);
		setRecorrido(recorrido);
		numVehiculos++;
	}
/**
* Metodo set que asigna el valor pasado por parametro al Vehiculo
* @param route Recorrido a asignar
*/	
	public void setRecorrido(String route){
		recorrido = route;
	}
/**
* Metodo get que devuelve el valor asignado a una de las propiedad del Vehiculo
*/
	public String getRecorrido(){
		return recorrido;
	}
/**
* Metodo set que asigna el valor pasado por parametro al Vehiculo
* @param school Tipo a asignar
*/	
	public void setEsEscolar(boolean school){
		esEscolar = school;
	}
/**
* Metodo get que devuelve el valor asignado a una de las propiedad del Vehiculo
*/
	public boolean getEsEscolar(){
		return esEscolar;
	}
/**
* Metodo circular que realiza dicha accion.
*/		
	@Override public void circular(){
		JOptionPane.showMessageDialog(null, "Esto es un autobus y los autobuses pueden circular por carreteras, autovías y autopistas");
	}
/**
* Metodo aparcar que realiza dicha accion.
*/	
	public void aparcar(){
		JOptionPane.showMessageDialog(null, "El autobus con matricula " + getMatricula() + " ha sido aparcado.");
	}
/**
* Metodo abrirPuertas que realiza dicha accion.
*/	
	public void abrirPuertas(){
		JOptionPane.showMessageDialog(null, "El autobus con matricula " + getMatricula() + " ha abierto sus puertas.");
	}
/**
* Metodo arrancar que realiza dicha accion.
*/	
	@Override public void arrancar(){
		JOptionPane.showMessageDialog(null, "El autobus con matricula " + getMatricula() + " ha arrancado.");
	}
/**
* Metodo acelerar que realiza dicha accion.
*/	
	@Override public void acelerar(){
		JOptionPane.showMessageDialog(null, "El autobus con matricula " + getMatricula() + " ha acelerado.");
	}
/**
* Metodo frenar que realiza dicha accion.
*/	
	@Override public void frenar(){
		JOptionPane.showMessageDialog(null, "El autobus con matricula " + getMatricula() + " ha frenado.");
	}
/**
* Metodo toString que muestra las caracteristicas del objeto
*/
	@Override public String toString(){
		return "Caracteristicas del vehiculo: \n Matricula: " + getMatricula() + " \n Marca: " + getMarca() + "\n Modelo: " + getModelo() + " \n Kilometros: " + getKilometros() + "\n Color: " + getColor() + " \n Numero de Puertas: " + getNumPuertas() + " \n Numero de Plazas: " + getNumPlazas() + "\n Recorrido :" + getRecorrido();
	}
	
}