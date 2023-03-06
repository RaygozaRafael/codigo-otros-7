/*
 * Pide al usuario un pais mediante la consola y si se encuentra almacenada en la lista de paises
 * Este le devuelve al usuario la capital de dicho pais
 * 
 * En caso de que no encuentre el pais le solicita al usuario que ingrese la capital de dicho pais 
 * 
 * No soporta faltas de ortografía
 */
//Se cambio el nombre de la clase a uno mas representativo de la actividad
import java.util.HashMap;
import java.util.Scanner;


public class CodigoOtros {

	public static void main(String args[]) { //Se agrego todo el codigo al main
		
    Scanner s = new Scanner(System.in); //Se importo la libreria de Scanner y se agrego el argumento "System.in"

    HashMap<String, String> capitales = new HashMap<>();//Se importo Hashmap y se cambio a String,String

    capitales.put("Canadá", "Otawwa");
    capitales.put("Estados Unidos", "Washington DC");
    capitales.put("México", "México DF");
    capitales.put("Belice", "Belmopán");
    capitales.put("Costa rica", "San José");
    capitales.put("El Salvador", "San Salvador"); //Se agrego el valor despues de la llave
    capitales.put("Guatemala", "Ciudad de Guatemala");
    capitales.put("Honduras", "Tegucigalpa");
    capitales.put("Nicaragua", "Managua");
    capitales.put("Panamá", "Panamá");
   
    String c = ""; //Se cambio Sting por String

    do {
      System.out.print("Escribe el nombre de un país y te diré su capital: "); //System.in a System.out
      c = s.nextLine(); //Se cambio a nextLine();
      
      if (!c.equals("salir")) { //equal a equals | ToDo Agregar Salir
        if (capitales.containsKey(c)) { //cambio a containsKey
          System.out.print("La capital de " + c); //System.print a System.out.print
          System.out.println(" es " + capitales.get(c) );//Se cambio put a get
        } else {
          System.out.print("No conozco la respuesta ");
          System.out.print("¿cuál es la capital de " + c + "?: ");
          capitales.put(c, s.nextLine()); //Se elimino la asignacion de capitales y se coloco la entrada de teclado en capitales
          								//ToDo Agregar una validacion para que no se inserte vacio o especiales
          System.out.println("Gracias por enseñarme nuevas capitales");
        }
      }
    } while (!c.equals("salir")); //wile a While y se agrego ) 
  }

}