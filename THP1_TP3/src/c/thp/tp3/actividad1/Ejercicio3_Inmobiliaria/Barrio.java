package c.thp.tp3.actividad1.Ejercicio3_Inmobiliaria;

import java.util.ArrayList;

public class Barrio {
	private String nombreBarrio;
	private ArrayList<Propiedad> listaPropiedades;

	public Barrio(String nombreBarrio) {
		setNombreBarrio(nombreBarrio);
		setListaPropiedades(listaPropiedades);
	}

	private void setNombreBarrio(String nombreBarrio) {
		this.nombreBarrio = nombreBarrio;
	}

	private void setListaPropiedades(ArrayList<Propiedad> listaPropiedads) {
		this.listaPropiedades = new ArrayList<>();
	}

	public void mostrarPropiedades() {
		if (listaPropiedades.size() > 0) {
			for (Propiedad propiedad : listaPropiedades) {
				System.out.println(propiedad);
			}
		} else {
			System.out.println("  EL BARRIO NO TIENE PROPIEDADES");
		}

	}

	public void mostrarPropiedades(Tipo_Propiedad tipoPropiedad) {
		if (listaPropiedades.size() > 0) {
			ArrayList<Propiedad> listaPropiedadesAux = buscarPropiedadMismoTipo(tipoPropiedad);
			for (Propiedad propiedad : listaPropiedadesAux) {
				System.out.println(propiedad);
			}
		} else {
			System.out.println("  EL BARRIO NO TIENE PROPIEDADES");
		}
	}

	private ArrayList<Propiedad> buscarPropiedadMismoTipo(Tipo_Propiedad tipoPropiedad) {
		ArrayList<Propiedad> listaPropiedadesAux = new ArrayList<>();
		for (Propiedad propiedad : listaPropiedades) {
			if (propiedad.compararTipo(tipoPropiedad)) {
				listaPropiedadesAux.add(propiedad);
			}
		}
		return listaPropiedadesAux;
	}

	public boolean compararBarrio(String nombreBarrio) {
		return this.nombreBarrio.equals(nombreBarrio);
	}

	private Propiedad buscarPropiedad(String domicilio) {
		int i = 0;
		Propiedad propiedadAux = null;
		while (i < listaPropiedades.size() && propiedadAux == null) {
			if (listaPropiedades.get(i).compararPropiedad(domicilio)) {
				propiedadAux = listaPropiedades.get(i);
			} else {
				i++;
			}
		}
		return propiedadAux;
	}

	public boolean agregarPropiedad(String domicilio, double precio, Tipo_Propiedad tipoPropiedad) {
		boolean pudeAgregar = false;
		if (buscarPropiedad(domicilio) == null) {
			listaPropiedades.add(new Propiedad(domicilio, precio, tipoPropiedad));
			pudeAgregar = true;
		}
		return pudeAgregar;
	}

	public boolean agregarPropiedad(Propiedad propiedad) {
		return this.listaPropiedades.add(propiedad);
	}

	public Propiedad borrarPropiedad(String domicilio) {
		// boolean pudeBorrar = false;
		Propiedad propiedadAux = buscarPropiedad(domicilio);
		if (propiedadAux != null) {
			// pudeBorrar =
			this.listaPropiedades.remove(propiedadAux);
		}
		return propiedadAux;
	}

	public int cantidadPropiedades() {
		return listaPropiedades.size();

	}

	@Override
	public String toString() {
		return " Barrio: " + nombreBarrio;
	}

}
