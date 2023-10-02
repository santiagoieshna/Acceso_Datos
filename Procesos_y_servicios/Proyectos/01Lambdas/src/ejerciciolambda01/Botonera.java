package ejerciciolambda01;

import javax.swing.JButton;

public class Botonera {
	JButton[][] botonera;

	public Botonera() {
		super();
		iniciarBotonera();
	}

	private void iniciarBotonera() {
		for (int i = 0; i < botonera.length; i++) {
			for (int j = 0; j < botonera.length; j++) {
				botonera[i][j] = new JButton();
				botonera[i][j].addActionListener(e->{
					
				});
			}
		}

	}
}
