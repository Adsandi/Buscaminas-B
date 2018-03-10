package control;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToggleButton;

import modelo.Casilla;
import modelo.Dificultad;
import modelo.Tablero;
import vista.BuscaminasUI;

public class ParaBuscaminasUI extends BuscaminasUI{
    JButton casillita = null;
    MyActionListener listener = new MyActionListener(this);
 	Tablero tablero = new Tablero(Dificultad.MEDIO);
 	Casilla casilla = new Casilla();
// 	protected ImageIcon ganador = new ImageIcon(getClass().getResource("/assets/ganador.png"));
 	protected ImageIcon perdedor = new ImageIcon(getClass().getResource("/assets/neh.png")); //esto es para el boton de reinicio
 	//pero primero centremonos en que funcione lo demas y ya veremos si hay tiempo de eso
 	
 	
	
	public ParaBuscaminasUI(){
		
		for (int i = 0; i < botones.length; i++) {
			for (int j = 0; j < botones.length; j++) {
		botones[i][j].addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e) {
				JButton pulsado = (JButton) e.getSource();
				switch (e.getButton()) {
				case 1:
					new Desvelador(tablero).desvelarCasilla((JButton) e.getSource());
					if (tablero.isGanador()) {
						
						
					}
					if(tablero.isPerdedor()){
						contenedor.setBackground(Color.RED);
							
						
					}
					
					break;
				case 3:
					
					new Marcador().marcarCasilla((JButton) e.getSource(), tablero);
					break;
				}
			}
		});
		
			}
			}

		
	
   }
	
	
	
	
	
	
	
	
	



	/*public void rebootGame() { //(prueba, no hacer caso por ahora)
		// TODO Auto-generated method stub
		
		for (int i = 0; i < botones.length; i++) {
			for (int j = 0; j < botones[i].length; j++) {
				botones[i][j].setEnabled(true);
				botones[i][j].setBackground(Color.GRAY);
				
			}
		}
		
	}*/
	
	/*botones[i][j].addMouseListener(new MouseAdapter() {

	public void mousePressed(MouseEvent e) {
		if (e.getButton() == MouseEvent.BUTTON3)
			new Marcador().marcarCasilla((JButton) e.getSource(), tablero);
		
	}
});

botones[i][j].addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {
		
		new Desvelador(tablero).desvelarCasilla((JButton) arg0.getSource());
		if (tablero.isGanador()) {
			
			
		}
		if(tablero.isPerdedor()){
			contenedor.setBackground(Color.RED);
				
			
		}
//		comprobar ganador

	}
});
}
}*/
}
