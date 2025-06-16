package Implementacion;

import java.util.ArrayList;
import java.util.List;

import Dominio.Ropas;
import Interface.Metodos;

public class LogicaMetodos implements Metodos {

	private List<Ropas> lista = new ArrayList<Ropas>();

	// Polimorfismo de sobreescritura
	@Override
	public void guardar(Ropas ropa) {
		// TODO Auto-generated method stub
		lista.add(ropa);
	}

	@Override
	public List<Ropas> mostrar() {
		// TODO Auto-generated method stub
		return lista;
	}

	@Override
	public Ropas buscar(int indice) {
		// TODO Auto-generated method stub
		Ropas ropaEncotra = lista.get(indice);

		return ropaEncotra;
	}

	@Override
	public void editar(int indice, Ropas ropa) {
		// TODO Auto-generated method stub
		lista.set(indice, ropa);
	}

	@Override
	public void elimimar(int indice) {
		// TODO Auto-generated method stub
		lista.remove(indice);
	}

}
