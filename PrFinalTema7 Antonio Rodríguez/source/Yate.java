/**
* Clase que define lo que es un Yate y 
* sus variables de instancia.
* 
* @author Antonio Rodriguez Gijon
* @version 1.0
*/
import javax.swing.JOptionPane;
public class Yate extends Vehiculo implements PuedeNavegar{
	private boolean tieneCocina;
	private int numMotores;

/**
* Este metodo crea un Yate con sus valores por defecto
*/
	public Yate(){
		setMatricula(matAleatoria());
		setMarca("Lagoon");
		setModelo("510-RX_ST");
		setColor("Gris");
		setKilometros(0);
		setNumPuertas(2);
		setNumPlazas(2);
		numVehiculos++;
	}
	public Yate(String registration, String brand, String model, String colour, int doors, int squares, int motores){
		setMatricula(registration);
		setMarca(brand);
		setModelo(model);
		setColor(colour);
		setNumPuertas(doors);
		setNumPlazas(squares);
		setNumMotores(motores);
		numVehiculos++;
	}
/**
* Metodo set que asigna el valor pasado por parametro al Vehiculo
* @param kitchen Cocina a asignar
*/	
	public void setCocina(boolean kitchen){
		tieneCocina = kitchen;
	}
/**
* Metodo get que devuelve el valor asignado a una de las propiedad del Vehiculo
*/	
	public boolean getCocina(){
		return tieneCocina;
	}
/**
* Metodo set que asigna el valor pasado por parametro al Vehiculo
* @param motores Motores a asignar
*/	
	public void setNumMotores(int motores){
		numMotores = motores;
	}
/**
* Metodo get que devuelve el valor asignado a una de las propiedad del Yate
*/	
	public int getNumMotores(){
		return numMotores;
	}
/**
* Metodo circular que realiza dicha accion.
*/	
	@Override public void circular(){
		JOptionPane.showMessageDialog(null, "Esto es un yate y los yates pueden circular por el agua.");
	}
/**
* Metodo frenar que realiza dicha accion.
*/	
	public void atracar(){
		JOptionPane.showMessageDialog(null, "El yate con matricula " + getMatricula() + " ha  atracado.");
	}
/**
* Metodo zarpar que realiza dicha accion.
*/	
	public void zarpar(){
		JOptionPane.showMessageDialog(null, "El yate con matricula " + getMatricula() + " ha zarpado.");
	}
/**
* Metodo arrancar que realiza dicha accion.
*/	
	@Override public void arrancar(){
		JOptionPane.showMessageDialog(null, "El yate con matricula " + getMatricula() + " ha arrancado.");
	}
/**
* Metodo acelerar que realiza dicha accion.
*/	
	@Override public void acelerar(){
		JOptionPane.showMessageDialog(null, "El yate con matricula " + getMatricula() + " ha acelerado.");
	}
/**
* Metodo frenar que realiza dicha accion.
*/	
	@Override public void frenar(){
		JOptionPane.showMessageDialog(null, "El yate con matricula " + getMatricula() + " ha frenado.");
	}
/**
* Metodo toString que muestra las caracteristicas del objeto
*/
	@Override public String toString(){
		return "Caracteristicas del vehiculo: \n Matricula: " + getMatricula() + " \n Marca: " + getMarca() + "\n Modelo: " + getModelo() + " \n Kilometros: " + getKilometros() + "\n Color: " + getColor() + " \n Numero de Puertas: " + getNumPuertas() + " \n Numero de Plazas: " + getNumPlazas() + "\n Motores :" + getNumMotores();
	}
}