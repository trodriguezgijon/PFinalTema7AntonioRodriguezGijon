/**
* Clase que define lo que es una parque y crea objetos Vehiculo.
* 
* @author Antonio Rodriguez Gijon
* @version 1.0
*/
import javax.swing.*;
import java.util.*;
/**
* Metodo main, en el cual existe un menu que da las opciones para construir.
*
* @param args Lineas del programa
*/
public class Parque{
	public static void main(String [] args){
		ArrayList <Vehiculo> parking = new ArrayList <Vehiculo>();
		boolean salir = false;
		int opcion = 0;
		String matriculabuscar = "";
		int auxiliar = 0;
		int opcion2 = 0;
		do{
			try{
				
				opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Fabrica de Vehiculos Antonio Rodriguez S.L. \n Selecciona una de las siguientes opciones:\n 1. Fabricar coche \n 2. Fabricar autobus \n 3. Fabricar motocicleta \n 4. Fabricar yate\n 5. Fabricar avioneta\n 6. Arrancar Vehiculo \n 7. Acelerar Vehiculo \n 8. Frenar Vehiculo \n 9. Mostrar caracteristicas de un coche\n 10. Salir del programa\n"));
				switch(opcion){
					case 1:
						if(Vehiculo.getNumVehiculos() == Vehiculo.getMaxVehiculos()){
							JOptionPane.showMessageDialog(null, "Almacen lleno, no es posible almacenar ningun vehiculo mas");
						}
						else{
							try{
								opcion2 = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Coche con parametros por defecto. \n 2. Coche con tus valores."));
								switch(opcion2){
									case 1: 
										Vehiculo co = new Coche();
										parking.add(co);
										JOptionPane.showMessageDialog(null, co.toString());
									break;
									case 2:
										Vehiculo c = new Coche(JOptionPane.showInputDialog(null, "Introduzca la matricula"), JOptionPane.showInputDialog(null, "Introduzca la marca"), JOptionPane.showInputDialog(null, "Introduzca el modelo"), JOptionPane.showInputDialog(null, "Introduzca el color"), Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca el numero de puertas")), Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca el numero de plazas")), Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca el numero de airbags")));
										parking.add(c);
										JOptionPane.showMessageDialog(null, c.toString());
									break;
									default:
										JOptionPane.showMessageDialog(null, "La opci\u00f3n elegida no existe");	
									break;
								}
							}
							catch(Exception e){
								JOptionPane.showMessageDialog(null, "La opci\u00f3n elegida no es numerica");
							}
						}
					break;
					case 2:
						if(Vehiculo.getNumVehiculos() == Vehiculo.getMaxVehiculos()){
							JOptionPane.showMessageDialog(null, "Almacen lleno, no es posible almacenar ningun vehiculo mas");
						}
						else{
							try{
								opcion2 = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Autobus con parametros por defecto. \n 2. Autobus con tus valores."));
								switch(opcion2){
									case 1: 
										Vehiculo auto = new Autobus();
										parking.add(auto);
										JOptionPane.showMessageDialog(null, auto.toString());
									break;
									case 2:
										Vehiculo au = new Autobus(JOptionPane.showInputDialog(null, "Introduzca la matricula"), JOptionPane.showInputDialog(null, "Introduzca la marca"), JOptionPane.showInputDialog(null, "Introduzca el modelo"), JOptionPane.showInputDialog(null, "Introduzca el color"), Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca el numero de puertas")), Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca el numero de plazas")), JOptionPane.showInputDialog(null, "Introduzca el recorrido"));
										parking.add(au);
										JOptionPane.showMessageDialog(null, au.toString());
									break;
									default:
										JOptionPane.showMessageDialog(null, "La opci\u00f3n elegida no existe");	
									break;
								}
							}
							catch(Exception e){
								JOptionPane.showMessageDialog(null, "La opci\u00f3n elegida no es numerica");
							}
						}
					break;
					case 3:
						if(Vehiculo.getNumVehiculos() == Vehiculo.getMaxVehiculos()){
							JOptionPane.showMessageDialog(null, "Almacen lleno, no es posible almacenar ningun vehiculo mas");
						}
						else{
							try{
								opcion2 = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Motocicleta con parametros por defecto. \n 2. Motocicleta con tus valores."));
								switch(opcion2){
									case 1: 
										Vehiculo moto = new Motocicleta();
										parking.add(moto);
										JOptionPane.showMessageDialog(null, moto.toString());
									break;
									case 2:
										Vehiculo m = new Motocicleta(JOptionPane.showInputDialog(null, "Introduzca la matricula"), JOptionPane.showInputDialog(null, "Introduzca la marca"), JOptionPane.showInputDialog(null, "Introduzca el modelo"), JOptionPane.showInputDialog(null, "Introduzca el color"), Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca el numero de puertas")), Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca el numero de plazas")), Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca la potencia del motor.")));
										parking.add(m);
										JOptionPane.showMessageDialog(null, m.toString());
									break;
									default:
										JOptionPane.showMessageDialog(null, "La opci\u00f3n elegida no existe");	
									break;
								}
							}
							catch(Exception e){
								JOptionPane.showMessageDialog(null, "La opci\u00f3n elegida no es numerica");
							}
						}
					break;
					case 4:
						if(Vehiculo.getNumVehiculos() == Vehiculo.getMaxVehiculos()){
							JOptionPane.showMessageDialog(null, "Almacen lleno, no es posible almacenar ningun vehiculo mas");
						}
						else{
							try{
								opcion2 = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Motocicleta con parametros por defecto. \n 2. Motocicleta con tus valores."));
								switch(opcion2){
									case 1: 
										Vehiculo y = new Yate();
										parking.add(y);
										JOptionPane.showMessageDialog(null, y.toString());
									break;
									case 2:
										Vehiculo ya = new Yate(JOptionPane.showInputDialog(null, "Introduzca la matricula"), JOptionPane.showInputDialog(null, "Introduzca la marca"), JOptionPane.showInputDialog(null, "Introduzca el modelo"), JOptionPane.showInputDialog(null, "Introduzca el color"), Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca el numero de puertas")), Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca el numero de plazas")), Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca el numero de motores.")));
										parking.add(ya);
										JOptionPane.showMessageDialog(null, ya.toString());
									break;
									default:
										JOptionPane.showMessageDialog(null, "La opci\u00f3n elegida no existe");	
									break;
								}
							}
							catch(Exception e){
								JOptionPane.showMessageDialog(null, "La opci\u00f3n elegida no es numerica");
							}			
						}
					break;
					case 5:
						if(Vehiculo.getNumVehiculos() == Vehiculo.getMaxVehiculos()){
							JOptionPane.showMessageDialog(null, "Almacen lleno, no es posible almacenar ningun vehiculo mas");
						}
						else{
							try{
								opcion2 = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Motocicleta con parametros por defecto. \n 2. Motocicleta con tus valores."));
								switch(opcion2){
									case 1: 
										Vehiculo av = new Avioneta();
										parking.add(av);
										JOptionPane.showMessageDialog(null, av.toString());
									break;
									case 2:
										Vehiculo ave = new Avioneta(JOptionPane.showInputDialog(null, "Introduzca la matricula"), JOptionPane.showInputDialog(null, "Introduzca la marca"), JOptionPane.showInputDialog(null, "Introduzca el modelo"), JOptionPane.showInputDialog(null, "Introduzca el color"), Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca el numero de puertas")), Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca el numero de plazas")), Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca el peso maximo.")));
										parking.add(ave);
										JOptionPane.showMessageDialog(null, ave.toString());
									break;
									default:
										JOptionPane.showMessageDialog(null, "La opci\u00f3n elegida no existe");	
									break;
								}
							}
							catch(Exception e){
								JOptionPane.showMessageDialog(null, "La opci\u00f3n elegida no es numerica");
							}
						}
					break;
					case 6:
						matriculabuscar = JOptionPane.showInputDialog(null, "Introduzca la matricula del vehiculo para arrancar:");
						auxiliar = buscaVehiculo(parking, matriculabuscar);
						if(auxiliar == -1){
							JOptionPane.showMessageDialog(null, "La matricula especificada no ha sido encontrada");
						}
						else{
							parking.get(auxiliar).arrancar();
						}
					break;
					case 7:
						matriculabuscar = JOptionPane.showInputDialog(null, "Introduzca la matricula del vehiculo para acelerar:");
						auxiliar = buscaVehiculo(parking, matriculabuscar);
						if(auxiliar == -1){
							JOptionPane.showMessageDialog(null, "La matricula especificada no ha sido encontrada");
						}
						else{
							parking.get(auxiliar).acelerar();
						}
					break;
					case 8:
						matriculabuscar = JOptionPane.showInputDialog(null, "Introduzca la matricula del vehiculo para frenar:");
						auxiliar = buscaVehiculo(parking, matriculabuscar);
						if(auxiliar == -1){
							JOptionPane.showMessageDialog(null, "La matricula especificada no ha sido encontrada");
						}
						else{
							parking.get(auxiliar).frenar();
						}
					break;
					case 9:
						matriculabuscar = JOptionPane.showInputDialog(null, "Introduzca la matricula del vehiculo para mostrar:");
						auxiliar = buscaVehiculo(parking, matriculabuscar);
						if(auxiliar == -1){
							JOptionPane.showMessageDialog(null, "La matricula especificada no ha sido encontrada");
						}
						else{
							JOptionPane.showMessageDialog(null, parking.get(auxiliar).toString());
						}
					break;
					case 10:
						salir = true;
						JOptionPane.showMessageDialog(null, "Gracias por utilizar este programa. \n Un saludo Antonio");
					break;
					default:
						JOptionPane.showMessageDialog(null, "La opci\u00f3n elegida no existe");	
					break;
				}
			}
			catch(Exception e){
				JOptionPane.showMessageDialog(null, "La opcion elegida no es numerica");
			}
		}while(salir == false);
	}
/**
* Metodo que busca los vehiculos almacenados en el ArrayList.
* 
* @param parkingAuxiliar ArrayList que almacena todos los objetos Vehiculo creados hasta el momento.
* @param matri Matricula que vamos a buscar dentro del array.
* @return Posicion donde se encuentra el vehiculo. 
*/
	public static int buscaVehiculo(ArrayList<Vehiculo> parkingAuxiliar, String matri){
		int encontrado = -1;
			for(int j = 0; j < parkingAuxiliar.size(); j++){
				if(parkingAuxiliar.get(j) != null && matri.equals(parkingAuxiliar.get(j).getMatricula())){
					encontrado = j;
					return encontrado;
				}
			}
		return encontrado;
	}
}