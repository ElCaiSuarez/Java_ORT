package e.thp.tp3.actividad1.Ejercicio5_OrtFLIX_ABM_Reutilizacion;

import java.util.ArrayList;

public class Ortflix {
	private ArrayList<Cliente> listaClientes;
	private ArrayList<Cliente> listaNegraClientes;
	private ArrayList<Pelicula> listaPeliculasPremium;
	private ArrayList<Pelicula> listaPeliculasStandard;

	public Ortflix() {
		setListaClientes(listaClientes);
		setListaNegraClientes(listaNegraClientes);
		setListaPeliculasPremium(listaPeliculasPremium);
		setListaPeliculasStandard(listaPeliculasStandard);
	}

	private void setListaClientes(ArrayList<Cliente> listaClientes) {
		this.listaClientes = new ArrayList<>();
	}

	private void setListaNegraClientes(ArrayList<Cliente> listaNegraClientes) {
		this.listaNegraClientes = new ArrayList<>();
	}

	private void setListaPeliculasPremium(ArrayList<Pelicula> listaPeliculasPremium) {
		this.listaPeliculasPremium = new ArrayList<>();
	}

	private void setListaPeliculasStandard(ArrayList<Pelicula> listaPeliculasStandard) {
		this.listaPeliculasStandard = new ArrayList<>();
	}

	public void listarClientes() {
		for (Cliente cliente : listaClientes) {
			System.out.println(cliente);
		}
	}

	public void listaNegraClientes() {
		for (Cliente cliente : listaNegraClientes) {
			System.out.println(cliente);
		}
	}

	private Cliente buscarCliente(String dni) {
		int i = 0;
		Cliente clienteBuscado = null;
		while (i < listaClientes.size() && clienteBuscado == null) {
			if (listaClientes.get(i).compararCliente(dni)) {
				clienteBuscado = listaClientes.get(i);
			} else {
				i++;
			}
		}
		return clienteBuscado;
	}

	private Cliente buscarCliente(String dni, ArrayList<Cliente> listaClientes) {
		int i = 0;
		Cliente clienteBuscado = null;
		while (i < listaClientes.size() && clienteBuscado == null) {
			if (listaClientes.get(i).compararCliente(dni)) {
				clienteBuscado = listaClientes.get(i);
			} else {
				i++;
			}
		}
		return clienteBuscado;
	}

	public int agregarCliente(String nombreCliente, String dni, double saldo, TipoCategoria tipoCategoria) {
		Cliente clienteAux = buscarCliente(dni);
		Cliente clienteAux2 = buscarCliente(dni, listaNegraClientes);
		int opcion = 0;
		if (clienteAux == null) {
			listaClientes.add(new Cliente(nombreCliente, dni, saldo, tipoCategoria));
			if (clienteAux2 != null && clienteAux2.getSaldo() > 0) {
				opcion = 3;
			} else {
				opcion = 7;
			}
		} else {
			opcion = 6;
		}
		return opcion;
	}

	private Pelicula buscarPelicula(String nombrePelicula, ArrayList<Pelicula> listaPeliculas) {
		int i = 0;
		Pelicula peliculaBuscada = null;
		while (i < listaPeliculas.size() && peliculaBuscada == null) {
			if (listaPeliculas.get(i).compararNombre(nombrePelicula)) {
				peliculaBuscada = listaPeliculas.get(i);
			} else {
				i++;
			}
		}
		return peliculaBuscada;
	}

	private boolean agregarPelicula(String nombrePelicula, ArrayList<Pelicula> listaPeliculas) {
		boolean pudeAgregar = false;
		if (buscarPelicula(nombrePelicula, listaPeliculas) == null) {
			listaPeliculas.add(new Pelicula(nombrePelicula));
			pudeAgregar = false;
		}
		return pudeAgregar;
	}

	public boolean agregarPeliculaStandard(String nombrePelicula) {
		return agregarPelicula(nombrePelicula, listaPeliculasStandard);
	}

	public boolean agregarPeliculaPremium(String nombrePelicula) {
		return agregarPelicula(nombrePelicula, listaPeliculasPremium);
	}

	private void listarPeliculas(ArrayList<Pelicula> listaPeliculas) {
		for (Pelicula pelicula : listaPeliculas) {
			System.out.println(pelicula);
		}
	}

	public void listarPeliculasPremium() {
		System.out.println(TipoCategoria.PREMIUM);
		listarPeliculas(listaPeliculasPremium);
	}

	public void listarPeliculasStandard() {
		System.out.println(TipoCategoria.STANDARD);
		listarPeliculas(listaPeliculasStandard);
	}

	public TipoResultado verPelicula(String dni, String nombrePelicula) {
		Cliente clienteAux = buscarCliente(dni);
		Pelicula peliculaAux = null;
		int posicion = 0;
		if (clienteAux == null) {
			posicion = 2;
		} else {
			if (!clienteAux.esDeudor()) {
				if (clienteAux.getTipoCategoria().equals(TipoCategoria.STANDARD)) {
					peliculaAux = buscarPelicula(nombrePelicula, listaPeliculasStandard);
					if (peliculaAux != null) {
						;
						posicion = 5;// Devuelvo OK x STANDARD
						clienteAux.agregarPelicula(peliculaAux);// Agrego al historial de peliculas vistas por el
																// cliente con servicio Standard
					} else {
						peliculaAux = buscarPelicula(nombrePelicula, listaPeliculasPremium);
						if (peliculaAux != null && clienteAux.getTipoCategoria().equals(TipoCategoria.PREMIUM)) {
							posicion = 5;// Devuelvo OK x PREMIUM
							clienteAux.agregarPelicula(peliculaAux);// Agrego al historial de peliculas vistas por el
																	// cliente con servicio Premium
						} else if (peliculaAux != null) {
							posicion = 4;// Devuelvo CONTENIDO_NO_DISPONIBLE PORQUE CLIENTE NO ES PREMIUM
						} else {
							posicion = 2;// Devuelvo CONTENIDO_INEXISTENTE
						}
					}
				}
			} else {
				posicion = 3;
			}
		}
		return devuelvoTipoResultadoCategoria(posicion);
	}

	private TipoResultado devuelvoTipoResultadoCategoria(int posicion) {
		TipoResultado tipoResultadoAux = null;
		switch (posicion) {
		case 1:
			tipoResultadoAux = TipoResultado.CLIENTE_INEXISTENTE;// LISTO
			break;
		case 2:
			tipoResultadoAux = TipoResultado.CONTENIDO_INEXISTENTE;// LISTO
			break;
		case 3:
			tipoResultadoAux = TipoResultado.CLIENTE_DEUDOR;// LISTO
			break;
		case 4:
			tipoResultadoAux = TipoResultado.CONTENIDO_NO_DISPONIBLE;// LISTO
			break;
		case 5:
			tipoResultadoAux = TipoResultado.OK;// LISTO
			break;
		case 6:
			tipoResultadoAux = TipoResultado.CLIENTE_EXISTENTE;
			break;
		case 7:
			tipoResultadoAux = TipoResultado.ALTA_OK;
			break;
		default:
			break;
		}
		return tipoResultadoAux;
	}

	public boolean darDeBaja(String dni) {
		boolean pudeBorrar = false;
		Cliente clienteEliminado = buscarCliente(dni);
		if (clienteEliminado != null) {
			listaClientes.remove(clienteEliminado);
			pudeBorrar = true;
			if (clienteEliminado.getSaldo() > 0) {
				listaNegraClientes.add(clienteEliminado);
			}
		}
		return pudeBorrar;
	}

	public TipoResultado darDeAlta(String nombreCliente, String dni, TipoCategoria tipoCategoria) {
		return devuelvoTipoResultadoCategoria(agregarCliente(nombreCliente, dni, 0, tipoCategoria));
	}

	public void depurarListaNegra(double saldo) {
		for (int i = 0; i < listaNegraClientes.size(); i++) {
			if (listaNegraClientes.get(i).getSaldo() <= saldo) {
				listaNegraClientes.remove(i);
			}
		}

	}

}
