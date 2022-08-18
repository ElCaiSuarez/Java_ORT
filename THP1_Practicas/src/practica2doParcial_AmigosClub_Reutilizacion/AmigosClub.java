package practica2doParcial_AmigosClub_Reutilizacion;

import java.util.ArrayList;

public class AmigosClub {
	private ArrayList<Socio> listaSocios;
	private final static int EDAD_MINIMA = 0;
	private final static int EDAD_MAXIMA = 120;

	public AmigosClub() {
		this.listaSocios = new ArrayList<>();
	}

	private Socio buscarSocio(String nombreSocio) {
		int i = 0;
		Socio socioAux = null;
		while (i < listaSocios.size() && socioAux == null) {
			if (listaSocios.get(i).compararNombreSocio(nombreSocio)) {
				socioAux = listaSocios.get(i);
			} else {
				i++;
			}
		}
		return socioAux;
	}

	public TipoResultado agregarSocio(String nombreSocio, int edadSocio) {
		TipoResultado resultadoAux = TipoResultado.YA_EXISTE;
		if (edadSocio < EDAD_MINIMA || edadSocio > EDAD_MAXIMA || nombreSocio.isEmpty()) {
			resultadoAux = TipoResultado.ERROR;
		} else {
			if (buscarSocio(nombreSocio) == null) {

				listaSocios.add(new Socio(nombreSocio, edadSocio));
				resultadoAux = TipoResultado.OK;
			}
		}
		return resultadoAux;
	}

	public TipoResultado establecerAmistad(String nombreSocio, String nombreAmigo) {// Juan / Ana
		TipoResultado resultadoAux = TipoResultado.NOMBRES_IGUALES;
		if (!nombreSocio.equals(nombreAmigo)) {
			Socio socioAux = buscarSocio(nombreSocio);
			Socio socioAux2 = buscarSocio(nombreAmigo);
			if (socioAux != null && socioAux2 != null) {
				Socio amigoAux = socioAux.buscarAmigo(nombreAmigo);
				if (amigoAux == null) {
					socioAux.agregarAmigo(nombreAmigo, socioAux2.getEdadSocio());
					socioAux2.agregarAmigo(nombreSocio, socioAux.getEdadSocio());
					resultadoAux = TipoResultado.OK;
				} else {
					resultadoAux = TipoResultado.YA_SON_AMIGOS;
				}
			} else {
				resultadoAux = TipoResultado.NO_EXISTE;
			}
		}
		return resultadoAux;
	}

	public TipoResultado deshacerAmistad(String nombreSocio, String nombreAmigo) {
		TipoResultado resultadoAux = TipoResultado.NOMBRES_IGUALES;
		if (!nombreSocio.equals(nombreAmigo)) {
			Socio socioAux = buscarSocio(nombreSocio);
			Socio socioAux2 = buscarSocio(nombreAmigo);
			if (socioAux != null && socioAux2 != null) {
				Socio amigoAux = socioAux.buscarAmigo(nombreAmigo);
				if (amigoAux != null) {
					socioAux.eliminarAmigo(nombreAmigo);
					socioAux2.eliminarAmigo(nombreSocio);
					resultadoAux = TipoResultado.OK;
				} else {
					resultadoAux = TipoResultado.NO_SON_AMIGOS;
				}
			} else {
				resultadoAux = TipoResultado.NO_EXISTE;
			}
		}
		return resultadoAux;
	}

	public void listarSociosConPromedios() {
		System.out.println("Socios con edad promedio de sus amigos: ");
		for (Socio socio : listaSocios) {
			double promedioEdadAmigos = socio.obtenerPromedio();
			if (promedioEdadAmigos > 0) {
				System.out.println(socio.getNombreSocio() + " - " + promedioEdadAmigos);
			} else {
				System.out.println(socio.getNombreSocio() + " - no tiene amigos");
			}
		}
	}

	public void listarSocio(String nombreSocio) {
		System.out.println(buscarSocio(nombreSocio));
	}

	public void listarSocios() {
		for (Socio socio : listaSocios) {
			System.out.println(socio);
		}
	}

}
