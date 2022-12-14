package ar.edu.ort.tp1.parcial2.clases;

public class Jugueteria implements ContenedorInteligente<Juguete, Integer> {

	private static final int ALTO_ESTANTERIA = 6;
	private static final int ANCHO_ESTANTERIA = 3;
	private static final int PROFUNDIDAD_ESTANTERIA = 4;
	private static final int ID_TITERE = 0;
	private static final int ID_PELUCHE = 1;
	private static final int ID_PELOTA = 2;
	//private LOJuguetesPorID listaTiteresPorID;
	//private LOJuguetesPorID listaPeluchesPorID;
	//private LOJuguetesPorID listaPelotasPorID;
	private LOJuguetesPorID listaJueguetesPorID;
	private Estante[][] matrizEstantes;
	private double acumVentas = 0;
	private static final String MSG_ERROR = "No se pudo depositar el juguete";

	public Jugueteria() {
		//listaTiteresPorID = new LOJuguetesPorID();
		//listaPeluchesPorID = new LOJuguetesPorID();
		//listaPelotasPorID = new LOJuguetesPorID();
		listaJueguetesPorID = new LOJuguetesPorID(); 
		matrizEstantes = new Estante[ALTO_ESTANTERIA][ANCHO_ESTANTERIA];
		inicializarEstantes();
	}

	private void inicializarEstantes() {
		for (int i = 0; i < matrizEstantes.length; i++) {
			for (int j = 0; j < matrizEstantes[0].length; j++) {
				matrizEstantes[i][j] = new Estante(PROFUNDIDAD_ESTANTERIA);
			}

		}
	}

	public void mostrarVentas() {
		System.out.println("El total de ventas fue de: " + acumVentas);
		System.out.println("--------------------------------------------");
	}

	@Override
	public void guardar(Juguete elemento) {
		if (elemento instanceof Titere) {
			//listaTiteresPorID.add(elemento);
			//ESTANTE 0
			almacenarJuguete(elemento, ID_TITERE);
			listaJueguetesPorID.add(elemento);

		} else if (elemento instanceof Peluche) {
			//ESTANTE 1
			//listaPeluchesPorID.add(elemento);
			almacenarJuguete(elemento, ID_PELUCHE);
			listaJueguetesPorID.add(elemento);
		} else {
			//ESTANTE 2
			//listaPelotasPorID.add(elemento);
			almacenarJuguete(elemento, ID_PELOTA);
			listaJueguetesPorID.add(elemento);
		}

	}

	private void almacenarJuguete(Juguete juguete, int id) {
		int i = 0;
		boolean haylugar = false;
		//EL PROFESOR LO HIZO CON UN DO WHILE CON TRY GUARDANDO y CATCH INCREMENTANDO LA i
		while (i < matrizEstantes.length && !haylugar) {
				if(!matrizEstantes[i][id].estaLleno(i, id)) {
					matrizEstantes[i][id].guardar(juguete);
					haylugar = true;
				}else {
					i++;
				}	
				// NO LLEGUE A TERMINARLO PORQUE HABIA UN ERROR EN EL ENUNCIADO LA PELOTA CON ID 31 SE GUARDA PORQUE TODAVIA HAY LUGAR
			}
			if(!haylugar)
			{
				throw new RuntimeException (MSG_ERROR);
			}
		}

	@Override
	public Juguete recuperarPorId(Integer id) {
		Juguete jugueteAux = null;
		boolean existe = false;
		int i = 0;
		while (i < matrizEstantes.length && !existe) {
			int j = 0;
			while (j < matrizEstantes[0].length && !existe) {
				//El metodo recuperarPorId de Estante no vuelve a poner el juguete en la pila del estante!!!
				jugueteAux = matrizEstantes[i][j].recuperarPorId(id);
				
				if (jugueteAux != null) {
					existe = true;
					//Si el juguete existe lo saco tambien de la lista ordenada 
					listaJueguetesPorID.remove(jugueteAux);
					acumVentas += jugueteAux.getPrecio();
				}else {
					j++;
				}
			}
			i++;
		}
		return jugueteAux;
	}

	public boolean existeJuguete(int idJuguete) {
		return listaJueguetesPorID.exists(idJuguete);
	}

}
