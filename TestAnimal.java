//Importa el paquete que contiene la clase Scanner
	import java.util.*;

//Definicion de la clase
	public class TestAnimal {
		//Definicion del Método principal
		public static void main(String[] args) {

			//Declaración del objeto Animal
			Animal animal1 = new Animal();

			//Declaración del objeto teclado de la clase Scanner
			Scanner teclado = new Scanner(System.in);

			//Pedir el nombre del animal
			System.out.print("Teclee el Nombre del Animal: ");

			//leer y asignar nombre al objeto animal1
				animal1.setNombre(teclado.nextLine());

			//Pedir la edad del animal
				System.out.print("Teclee la edad del animal: ");
				int edad = teclado.nextInt();

			//Asignar edad al objeto animal1
				animal1.setEdad(edad);

			//Informar de los datos del animal
				animal1.nace();
				System.out.printIn("Me llamo " + animal.getnombre() + " y tengo " + animal.getEdad() + "años");
		}
	}