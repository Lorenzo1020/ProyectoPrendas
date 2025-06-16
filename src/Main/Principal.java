package Main;

import Dominio.Ropas;
import Implementacion.LogicaMetodos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declarar la coleccion de objeto
		Ropas ropa1 = new Ropas("Prada", 240, "Gris", 5);
		Ropas ropa2 = new Ropas("Mege", 450, "Azul", 6);

		// Instancia de clase----Ya tenemos acceso a todo lo que contenga esa clase
		LogicaMetodos imp = new LogicaMetodos();

		// Guardar
		imp.guardar(ropa1);
		imp.guardar(ropa2);

		// Mostrar
		System.out.println(imp.mostrar());

		// Buscar
		Ropas ropaEnco = null;
		ropaEnco = imp.buscar(1);
		System.out.println("Se encontro " + ropaEnco);

		// Editar
		// Actualizando el objeto
		ropaEnco.setColor("Rojo");
		// Actualizar en la lista
		imp.editar(1, ropaEnco);

		// Mostrar
		System.out.println(imp.mostrar());

		// Eliminar
		imp.elimimar(0);

		// Mostrar
		System.out.println(imp.mostrar());

		// Realizar nuevo proyecto
		// ProyectoPantallas
		// Paquetes
		// Clase Pantallas
		// Atributos: clave, marca, precio, stock
		// Interface---para declarar los metodos del crud
		// Implementacion---La logica a los metodos
		// La clase Principal --- para probar que esten funcionado los metodos

	}

}
