
public class Game {
	private TableroJuego tablero = new TableroJuego(Constantes.size);
	private TableroOcultas ocultas = new TableroOcultas(Constantes.size);

	public void play() {
		boolean ganador = false;
		do {
			ocultas.mostrarTablero();
			if (this.realizarJugada())
				ganador = ocultas.comprobarParejas();
		} while (!ganador);
	}

	/**
	 * controla la jugada actual
	 * 
	 * @param tablero
	 * @param ocultas
	 * @return
	 */
	public boolean realizarJugada() {
		int[] origen;
		do {
			origen = CoupleParts.pedirCoordenada();
		} while (!revelarPosicion(origen));
		ocultas.mostrarTablero();
		int[] destino;
		do {
			destino = CoupleParts.pedirCoordenada();
		} while (!revelarPosicion(destino));
		ocultas.mostrarTablero();
		boolean comprobacion = tablero.comprobarParejas(origen, destino);
		CoupleParts.pausar(1);
		if (!comprobacion) {
			//TODO juntar las dos llamadas en un solo metodo
			ocultas.ocultarPosiciones(origen);
			ocultas.ocultarPosiciones(destino);
		}
		ocultas.mostrarTablero();
		return comprobacion;
	}
	
	public  boolean revelarPosicion(int[] origen) {
		boolean retorno = false;
		if (ocultas.getValueAt(origen) == -1) {
			ocultas.setValueAt(origen, tablero.getValueAt(origen));
			retorno = true;
		}
		return retorno;
	}

	public static void main(String[] args) {
		new Game().play();
	}
}
