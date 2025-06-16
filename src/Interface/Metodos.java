package Interface;

import java.util.List;

import Dominio.Ropas;

public interface Metodos {

	// Metodos tenemos 2 cosas:
	// 1---Funciones(Tienen valor de retorno)
	// Contemplar lo siguiente: Que tipo de retorno tendra, ver si recibira
	// parametros o no, si va a recibir parametros cuantos y de que tipo
	// modificarDeAcceso tipoRetorno nombreFuncion (Los parametros)

	// 2---Procedimientos(No tienen valor de retorno)
	// ver si recibira parametros o no, si va a recibir parametros cuantos y de que
	// tipo
	// modificarDeAcceso void(vacio) nombreProcedimiento (Los parametros)

	// Procedimiento
	public void guardar(Ropas ropa);

	// Funcion
	public List<Ropas> mostrar();

	public Ropas buscar(int indice);

	public void editar(int indice, Ropas ropa);

	public void elimimar(int indice);

}
