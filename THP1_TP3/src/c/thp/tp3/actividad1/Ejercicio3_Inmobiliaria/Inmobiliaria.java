package c.thp.tp3.actividad1.Ejercicio3_Inmobiliaria;

import java.util.ArrayList;

public class Inmobiliaria {
	private String nombreInmobiliaria;
	private ArrayList<Barrio> listaBarrios;

	public Inmobiliaria(String nombreInmobiliaria) {
		setNombreInmobiliaria(nombreInmobiliaria);
		setListaBarrios(listaBarrios);
	}

	private void setNombreInmobiliaria(String nombreInmobiliaria) {
		this.nombreInmobiliaria = nombreInmobiliaria;
	}

	private void setListaBarrios(ArrayList<Barrio> listaBarrios) {
		this.listaBarrios = new ArrayList<>();
	}

	public void mostrarPropiedades() {
		if (listaBarrios.size() > 0) {
			for (Barrio barrio : listaBarrios) {
				System.out.println(barrio);
				barrio.mostrarPropiedades();
			}
		} else {
			System.out.println("NO HAY BARRIOS");
		}
	}

	public void mostrarPropiedades(Tipo_Propiedad tipoPropiedad) {
		for (Barrio barrio : listaBarrios) {
			barrio.mostrarPropiedades(tipoPropiedad);
		}
	}

	private Barrio buscarBarrio(String nombreBarrio) {
		int i = 0;
		Barrio barrioAux = null;
		while (i < listaBarrios.size() && barrioAux == null) {
			if (listaBarrios.get(i).compararBarrio(nombreBarrio)) {
				barrioAux = listaBarrios.get(i);
			} else {
				i++;
			}
		}
		return barrioAux;
	}

	public boolean agregarBarrio(String nombreBarrio) {
		boolean pudeAgregar = false;
		if (buscarBarrio(nombreBarrio) == null) {
			listaBarrios.add(new Barrio(nombreBarrio));
			pudeAgregar = true;
		}
		return pudeAgregar;
	}

	public ArrayList<Barrio> obtenerBarrioMaxProp() {
		ArrayList<Barrio> listaBarriosAux = new ArrayList<>();
		int maxPropAux = 0;
		for (Barrio barrio : listaBarrios) {
			int temporal = barrio.cantidadPropiedades();
			if (temporal >= maxPropAux) {
				if (temporal > maxPropAux) {
					listaBarriosAux.clear();
					maxPropAux = temporal;
				}
				listaBarriosAux.add(barrio);
			}
		}
		return listaBarriosAux;
	}

	public boolean agregarPropiedad(String nombreBarrio, String domicilio, double precio,
			Tipo_Propiedad tipoPropiedad) {
		boolean pudeAgregar = false;
		Barrio barrioAux = buscarBarrio(nombreBarrio);
		if (barrioAux != null) {
			pudeAgregar = barrioAux.agregarPropiedad(domicilio, precio, tipoPropiedad);
		}
		return pudeAgregar;
	}

	public Propiedad borrarPropiedad(String domicilio) {
		Propiedad propiedadAux = null;
		int i = 0;
		while (i < listaBarrios.size() && propiedadAux == null) {
			propiedadAux = listaBarrios.get(i).borrarPropiedad(domicilio);
			i++;
		}
		return propiedadAux;
	}

	public boolean cambiarPropiedadDeBarrio(String domicilio, String nombreBarrio) {
		boolean pudeCambiar = false;
		Barrio barrioDestino = buscarBarrio(nombreBarrio);
		if (barrioDestino != null) {
			Propiedad propiedadAux = borrarPropiedad(domicilio);
			if (propiedadAux != null) {
				// SOBRECARGA de metodo agregarPropiedad de Barrio
				pudeCambiar = barrioDestino.agregarPropiedad(propiedadAux);
			} else {
				System.out.println("NO EXISTE LA PROPIEDAD");
			}
		} else {
			System.out.println("NO EXISTE EL BARRIO");
		}
		return pudeCambiar;
	}

	@Override
	public String toString() {
		return "Inmobiliaria: " + nombreInmobiliaria;
	}

}
