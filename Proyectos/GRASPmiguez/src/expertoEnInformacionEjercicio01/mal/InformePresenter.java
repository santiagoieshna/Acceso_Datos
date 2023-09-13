package expertoEnInformacionEjercicio01.mal;

public class InformePresenter {
	Informe informe = new Informe();


	public void calcultaeTotal() {
		int total = 0;
		for (Integer parcial : informe.getParciales()) {
			total = total + parcial;
		}
	}
}

