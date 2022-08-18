package e.thp.tp3.actividad1.Ejercicio5_OrtFLIX_ABM_Reutilizacion;

import java.util.ArrayList;

public class Cliente {
	private String nombreCliente;
	private String dni; // LLAVE
	private double saldo;
	private TipoCategoria categoria;
	private ArrayList<Pelicula> listaPeliculasOK;
	private final static double SALDO_INICIAL = 0;

	public Cliente(String nombreCiente, String dni, double saldo, TipoCategoria tipoCategoria) {
		setNombreCliente(nombreCiente);
		setDni(dni);
		setSaldo(saldo);
		setTipoCategoria(tipoCategoria);
		setlistaPeliculasOK(listaPeliculasOK);
	}

	private void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	private void setDni(String dni) {
		this.dni = dni;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	private void setTipoCategoria(TipoCategoria tipoCategoria) {
		this.categoria = tipoCategoria;
	}

	private void setlistaPeliculasOK(ArrayList<Pelicula> listaPeliculasOK) {
		this.listaPeliculasOK = new ArrayList<>();
	}

	@Override
	public String toString() {
		return "Cliente: " + nombreCliente + ", dni: " + dni + ", saldo: " + saldo + ", categoria: " + categoria + "]";
	}

	public boolean compararCliente(String dni) {
		return this.dni.equals(dni);
	}

	public boolean esDeudor() {
		return this.saldo > 0;
	}
	
	public TipoCategoria getTipoCategoria() {
		return this.categoria;
	}
	
	public boolean agregarPelicula(Pelicula pelicula) {
		return this.listaPeliculasOK.add(pelicula);
	}
	
	public double getSaldo() {
		return this.saldo;
	}
}
