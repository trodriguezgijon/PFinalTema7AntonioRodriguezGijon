/**
* Clase que define lo que es una Motocicleta y 
* sus variables de instancia.
* 
* @author Antonio Rodriguez Gijon
* @version 1.0
*/
import javax.swing.JOptionPane;
public class Motocicleta extends Vehiculo implements PuedeCircular{
	private int potenciaMotor;
	private boolean maletero;
	
/**
* Este metodo crea una Motocicleta con sus valores por defecto
*/
	public Motocicleta(){
		setMatricula(matAleatoria());
		setMarca("Yamaha");
		setModelo("500");
		setColor("Azul");
		setKilometros(0);
		setNumPuertas(0);
		setNumPlazas(2);
		numVehiculos++;
	}
	public Motocicleta(String registration, String brand, String model, String colour, int doors, int squares, int power){
		setMatricula(registration);
		setMarca(brand);
		setModelo(model);
		setColor(colour);
		setNumPuertas(doors);
		setNumPlazas(squares);
		setPotenciaMotor(power);
		numVehiculos++;
	}
/**
* Metodo set que asigna el valor pasado por parametro al Vehiculo
* @param power Potencia a asignar
*/	
	public void setPotenciaMotor(int power){
		potenciaMotor = power;
	}
/**
* Metodo get que devuelve el valor asignado a una de las propiedad del Vehiculo
*/	
	public int getPotenciaMotor(){
		return potenciaMotor;
	}
/**
* Metodo set que asigna el valor pasado por parametro al Vehiculo
* @param boo Maletero a asignar
*/	
	public void setMaletero(boolean boo){
		maletero = boo;
	}
/**
* Metodo get que devuelve el valor asignado a una de las propiedad del Vehiculo
*/		
	public boolean getMaletero(){
		return maletero;
	}
/**
* Metodo circular que realiza dicha accion.
*/	
	@Override public void circular(){
		JOptionPane.showMessageDialog(null, "Esto es una motocicleta y las motocicletas pueden circular por carreteras, autovías y autopistas");
	}
/**
* Metodo aparcar que realiza dicha accion.
*/	
	public void aparcar(){
		JOptionPane.showMessageDialog(null, "La motocicleta con matricula " + getMatricula() + " ha sido aparcada.");
	}	
/**
* Metodo brincar que realiza dicha accion.
*/	
	public void brincar(){
		JOptionPane.showMessageDialog(null, "La motocicleta con matricula " + getMatricula() + " ha brincado.");
	}
/**
* Metodo arrancar que realiza dicha accion.
*/	
	@Override public void arrancar(){
		JOptionPane.showMessageDialog(null, "La motocicleta con matricula " + getMatricula() + " ha arrancado.");
	}
/**
* Metodo acelerar que realiza dicha accion.
*/	
	@Override public void acelerar(){
		JOptionPane.showMessageDialog(null, "La motocicleta con matricula " + getMatricula() + " ha acelerado.");
	}
/**
* Metodo frenar que realiza dicha accion.
*/	
	@Override public void frenar(){
		JOptionPane.showMessageDialog(null, "La motocicleta con matricula " + getMatricula() + " ha frenado.");
	}

/**
* Metodo toString que muestra las caracteristicas del objeto
*/
	@Override public String toString(){
		return "Caracteristicas del vehiculo: \n Matricula: " + getMatricula() + " \n Marca: " + getMarca() + "\n Modelo: " + getModelo() + " \n Kilometros: " + getKilometros() + "\n Color: " + getColor() + " \n Numero de Puertas: " + getNumPuertas() + " \n Numero de Plazas: " + getNumPlazas() + "\n Potencia Motor :" + getPotenciaMotor();
	}
}