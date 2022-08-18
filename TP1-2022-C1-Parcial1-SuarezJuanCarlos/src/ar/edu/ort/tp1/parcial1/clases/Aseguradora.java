package ar.edu.ort.tp1.parcial1.clases;

import java.util.ArrayList;

public class Aseguradora implements Mostrable {

	private static final String TXT_ASEGURANDO = "Asegurando a %s por con un premio mensual de: $%.2f\n";
	private static final String TXT_ENCABEZADO = "Sistema de estadísticas de la compañia aseguradora ";
	private static final String MSG_ESTADISTICA_CANT_TECNO = "La cantidad de tenedores de Tecnología de género femenino es: ";
	private static final String MSG_ESTADISTICA_PREMIO_MAY_HOGAR = "El premio mayor de los seguros de hogar es: ";
	private static final String MSG_ESTADISTICA_PROMEDIO_EDAD = "La edad promedio de los asegurados es: %.3f";
	private String nombreAseguradora;
	private ArrayList<Asegurado> asegurados;
	private ArrayList<Seguro> seguros;
	private int contadorTecnoFemenino = 0;
	private int acumEdadAseguradosConSeguroVigente = 0;
	private int contadorAseguradosConSeguroVigente = 0;

	public Aseguradora(String nombreAseguradora) {
		super();
		setNombreAseguradora(nombreAseguradora);
		this.asegurados = new ArrayList<>();
		this.seguros = new ArrayList<>();
	}

	private void setNombreAseguradora(String nombreAseguradora) {
		this.nombreAseguradora = nombreAseguradora;
	}

	public void agregarCliente(Asegurado aseguradoRecibido) {
		String dniAux = aseguradoRecibido.getDni();
		if (dniAux != null && !existeAsegurado(dniAux)) {
			asegurados.add(aseguradoRecibido);
		}
	}

	private boolean existeAsegurado(String dniRecibido) {
		int i = 0;
		boolean existeAsegurado = false;
		while (i < asegurados.size() && !existeAsegurado) {
			existeAsegurado = asegurados.get(i++).comparaDni(dniRecibido);
		}
		return existeAsegurado;
	}

	public Seguro generarSeguroTecnologia(float valorReposicionRecibido, String marcaRecibido, String modeloRecibido) {
		return new SeguroTecnologia(valorReposicionRecibido, marcaRecibido, modeloRecibido);
	}

	public Seguro generarSeguroHogar(int metrosCuadradosRecibidos, Provincia provinciaRecibida) {
		return new SeguroHogar(metrosCuadradosRecibidos, provinciaRecibida);
	}

	public void asegurar(String dniRecibido, Seguro seguroRecibido) {
		Asegurado aseguradoAux = buscarAsegurado(dniRecibido);
		if (aseguradoAux != null) {
			System.out.printf(texto(), aseguradoAux.texto(), seguroRecibido.calcularPremio());
			seguroRecibido.setAsegurado(dniRecibido);
			seguros.add(seguroRecibido);
			if (aseguradoAux.getGenero() == Genero.FEMENINO && seguroRecibido instanceof SeguroTecnologia) {
				contadorTecnoFemenino++;
			}
			acumEdadAseguradosConSeguroVigente += aseguradoAux.getEdad();
			contadorAseguradosConSeguroVigente++;
		}
	}

	private Asegurado buscarAsegurado(String dniRecibido) {
		int i = 0;
		Asegurado aseguradoAux = null;
		while (i < asegurados.size() && aseguradoAux == null) {
			if (asegurados.get(i).comparaDni(dniRecibido)) {
				aseguradoAux = asegurados.get(i);
			} else {
				i++;
			}
		}
		return aseguradoAux;
	}

	private float buscoMayorPremio() {
		float maxPremio = 0;
		for (Seguro seguro : seguros) {
			float maxAux = seguro.calcularPremio();
			if (maxPremio < maxAux) {
				maxPremio = maxAux;
			}
		}
		return maxPremio;
	}

	private float calcularPromedioEdadAsegurados() {
		return (float) acumEdadAseguradosConSeguroVigente / contadorAseguradosConSeguroVigente;
	}

	@Override
	public void mostrar() {
		System.out.println(TXT_ENCABEZADO + this.nombreAseguradora);
		System.out.println(MSG_ESTADISTICA_PREMIO_MAY_HOGAR + buscoMayorPremio());
		System.out.println(MSG_ESTADISTICA_CANT_TECNO + contadorTecnoFemenino);
		System.out.printf(MSG_ESTADISTICA_PROMEDIO_EDAD, calcularPromedioEdadAsegurados());
	}

	@Override
	public String texto() {
		return TXT_ASEGURANDO;
	}

}
