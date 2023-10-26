package org.generation.colecciones;

import java.util.HashMap;
import java.util.Scanner;

public class Colecciones {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		//Variables que van a almacenar las traducciones
		String palabra;
		
		//HashMap para almacenar palabras
		HashMap<String, String> dictionary= new HashMap<>();
		
		dictionary.put("recordar", "remember");
		dictionary.put("olvidar", "forgot");
		dictionary.put("duro", "hard");
		dictionary.put("cansado", "tired");
		dictionary.put("siempre", "always");
		dictionary.put("esperar", "wait");
		dictionary.put("cambiar", "change");
		dictionary.put("numero", "number");
		dictionary.put("llamada", "calls");
		dictionary.put("ahora", "now");
		dictionary.put("ser", "be");
		dictionary.put("golpear", "hit");
		dictionary.put("correr", "run");
		dictionary.put("solo", "alone");
		dictionary.put("llorando", "crying");
		dictionary.put("roto", "broke");
		dictionary.put("corazon", "heart");
		dictionary.put("mañana", "morning");
		dictionary.put("ocho", "eight");
		dictionary.put("historia", "story");
		
		do {
		      System.out.print("Escribe una palabra para averiguar su traduccion al ingles ");
		      palabra = scanner.next();
		      
		      if (!palabra.equals("salir")) {
		        if (dictionary.containsKey(palabra)) { 
		          System.out.println("La traduccion de " + palabra +" es " + dictionary.get(palabra));
		        } else {
		          System.out.println("La plabra no se encuentra en el diccionario :(");
		        }
		      }	  
		    } while (!palabra.equals("salir"));
				scanner.close(); //Cierra scanner por buena practica
			}
		}