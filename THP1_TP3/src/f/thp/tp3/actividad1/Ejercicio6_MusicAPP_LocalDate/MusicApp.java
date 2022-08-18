package f.thp.tp3.actividad1.Ejercicio6_MusicAPP_LocalDate;

import java.util.ArrayList;

public class MusicApp {
	private ArrayList<Cancion> listaCanciones;
	private ArrayList<Usuario> listaUsuarios;

	public MusicApp() {
		setListaCanciones(listaCanciones);
		setListaUsuarios(listaUsuarios);
	}

	private void setListaCanciones(ArrayList<Cancion> listaCanciones) {
		this.listaCanciones = new ArrayList<>();
	}

	private void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
		this.listaUsuarios = new ArrayList<>();
	}

	private Cancion buscarCancion(String nombreCancion, String autor) {
		int i = 0;
		Cancion cancionAux = null;
		while (i < listaCanciones.size() && cancionAux == null) {
			if (listaCanciones.get(i).compararCancion(nombreCancion, autor)) {
				cancionAux = listaCanciones.get(i);
			} else {
				i++;
			}
		}
		return cancionAux;
	}

	private Usuario buscarUsuario(String email) {
		int i = 0;
		Usuario usuarioAux = null;
		while (i < listaUsuarios.size() && usuarioAux == null) {
			if (listaUsuarios.get(i).compararUsuario(email)) {
				usuarioAux = listaUsuarios.get(i);
			} else {
				i++;
			}
		}
		return usuarioAux;
	}

	public boolean altaCancion(String nombreCancion, String autor, String genero) {
		boolean pudeAgregar = false;
		if (buscarCancion(nombreCancion, autor) == null) {
			listaCanciones.add(new Cancion(nombreCancion, autor, genero));
			pudeAgregar = true;
		}
		return pudeAgregar;
	}

	public boolean altaUsuario(String email, String apellido, int edad, TipoUsuario tipoUsuario) {
		boolean pudeAgregar = false;
		if (buscarUsuario(email) == null) {
			listaUsuarios.add(new Usuario(email, apellido, edad, tipoUsuario));
			pudeAgregar = true;
		}
		return pudeAgregar;
	}

	public void listarUsuarios() {
		for (Usuario usuario : listaUsuarios) {
			System.out.println(usuario);
		}
	}

	public void listarCancionesPorUsuario(String email) {
		Usuario usuarioAux = buscarUsuario(email);
		TipoResultado tipoResultadoAux = TipoResultado.USUARIO_INEXISTENTE;
		if (usuarioAux != null) {
			usuarioAux.listarCancionesReproducidas();
			tipoResultadoAux = TipoResultado.OPERACION_EXITOSA;
		}
		System.out.println(tipoResultadoAux);
	}

	public TipoResultado escucharCancion(String email, String nombreCancion, String autor) {
		Cancion cancionAux = buscarCancion(nombreCancion, autor);
		Usuario usuarioAux = buscarUsuario(email);
		TipoResultado tipoResultadoAux = TipoResultado.USUARIO_INEXISTENTE;
		if (usuarioAux != null) {
			if (cancionAux != null) {
				if (usuarioAux.getTipoUsuario() != TipoUsuario.PREMIUM) {
					if (usuarioAux.getTipoUsuario() == TipoUsuario.REGISTRADO) {
						tipoResultadoAux = cancionAux.esPremium() ? TipoResultado.CANCION_NO_DISPONIBLE
								: TipoResultado.CANCION_ESCUCHADA;
					} else if (cancionAux.esPremium()) {// CONFIRMO USUARIO GRATUITO
						tipoResultadoAux = TipoResultado.CANCION_NO_DISPONIBLE;
					} else {
						tipoResultadoAux = usuarioAux.calcularLimite() ? TipoResultado.LIMITE_ALCANZADO
								: TipoResultado.CANCION_ESCUCHADA;
					}
				} else {
					tipoResultadoAux = TipoResultado.CANCION_ESCUCHADA; // Usuario y Cancion PREMIUM
				}
			} else {
				tipoResultadoAux = TipoResultado.CANCION_INEXISTENTE;
			}
		}
		if (tipoResultadoAux == TipoResultado.CANCION_ESCUCHADA) {
			usuarioAux.agregarCancionReproducida(cancionAux);
			cancionAux.sumarReproduccion();
		}
		return tipoResultadoAux;
	}

}
