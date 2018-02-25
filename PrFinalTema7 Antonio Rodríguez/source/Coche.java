/**
* Clase que define lo que es un Coche y 
* sus variables de instancia.
* 
* @author Antonio Rodriguez Gijon
* @version 1.0
*/
import javax.swing.JOptionPane;
public class Coche extends Vehiculo implements PuedeCircular{
	private int numAirbags;
	private boolean techoSolar;
	private boolean radio;

/**
* Este metodo crea un coche con sus valores por defecto
*/
	public Coche(){
		setMatricula(matAleatoria());
		setMarca("Porsche");
		setModelo("Carrera");
		setColor("Gris");
		setKilometros(0);
		setNumPuertas(2);
		setNumPlazas(2);
		numVehiculos++;
	}
	public Coche(String registration, String brand, String model, String colour, int doors, int squares, int air){
		setMatricula(registration);
		setMarca(brand);
		setModelo(model);
		setColor(colour);
		setNumPuertas(doors);
		setNumPlazas(squares);
		setNumAirbags(air);
		numVehiculos++;
	}
/**
* Metodo set que asigna el valor pasado por parametro al Vehiculo
* @param air Airbags a asignar
*/	
	public void setNumAirbags(int air){
		numAirbags = air;
	}
/**
* Metodo get que devuelve el valor asignado a una de las propiedad del Vehiculo
*/		
	public int getNumAirbags(){
		return numAirbags;
	}
/**
* Metodo set que asigna el valor pasado por parametro al Vehiculo
* @param solar Techo a asignar
*/	
	public void setTechoSolar(boolean solar){
		techoSolar = solar;
	}
/**
* Metodo get que devuelve el valor asignado a una de las propiedad del Vehiculo
*/		
	public boolean getTechoSolar(){
		return techoSolar;
	}
/**
* Metodo set que asigna el valor pasado por parametro al Vehiculo
* @param radio Radio a asignar
*/	
	public void setRadio(boolean radio){
		this.radio = radio;
	}
/**
* Metodo get que devuelve el valor asignado a una de las propiedad del Vehiculo
*/		
	public boolean getRadio(){
		return radio;
	}
/**
* Metodo aparcar que realiza dicha accion.
*/	
	public void aparcar(){
		JOptionPane.showMessageDialog(null,"El coche con matricula " + getMatricula() + " ha sido aparcado.");
	}
/**
* Metodo que añade techo solar, pinta el coche y deja kilometros a 0.
*@param colo Color al que se va a pintar el coche.
*/
	public void tunear(String colo){
		if(getTechoSolar() == true){
			setKilometros(0);
			setColor(colo);
			JOptionPane.showMessageDialog(null, "Kilometros actualizados a " + getKilometros() +" km por el mecanico. \n Pintado el coche de " + getColor() + "Techo Solar ya instalado.");
		}
		else{
			setTechoSolar(true);
			setKilometros(0);
			setColor(colo);
			JOptionPane.showMessageDialog(null, "Kilometros actualizados a " + getKilometros() +" km por el mecanico. \n Pintado el coche de " + getColor() + "\n Instalado Techo Solar.");
		}
	}
/**
* Metodo circular que realiza dicha accion.
*/	
	@Override public void circular(){
		JOptionPane.showMessageDialog(null, "Esto es un coche y los coches pueden circular por carreteras, autovías y autopistas");
	}
/**
* Metodo arrancar que realiza dicha accion.
*/		
	@Override public void arrancar(){
		JOptionPane.showMessageDialog(null, "El coche con matricula " + getMatricula() + " ha arrancado.");
	}
/**
* Metodo acelerar que realiza dicha accion.
*/	
	@Override public void acelerar(){
		JOptionPane.showMessageDialog(null, "El coche con matricula " + getMatricula() + " ha acelerado.");
	}
/**
* Metodo frenar que realiza dicha accion.
*/		
	@Override public void frenar(){
		JOptionPane.showMessageDialog(null, "El coche con matricula " + getMatricula() + " ha frenado.");
	}

/**
* Metodo toString que muestra las caracteristicas del objeto
*/
	@Override public String toString(){
		return "Caracteristicas del vehiculo: \n Matricula: " + getMatricula() + " \n Marca: " + getMarca() + "\n Modelo: " + getModelo() + " \n Kilometros: " + getKilometros() + "\n Color: " + getColor() + " \n Numero de Puertas: " + getNumPuertas() + " \n Numero de Plazas: " + getNumPlazas() + "\n Airbags :" + getNumAirbags();
	}
}