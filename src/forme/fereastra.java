package forme;

import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;

public class fereastra {
	
	private JButton buton_forme;
	private JFrame fereastra1;
	private JButton buton_linie;
	private JButton buton_triunghi;
	private JButton buton_cerc;
	private JButton buton_patrulater;
	private JButton buton_poligon;
	private JButton buton_intoarcere;

	public fereastra() {
		super();
		fereastra1 = new JFrame("EditorGrafic");
		initInterfata();
	}
	
	private void initInterfata(){
		fereastra1.setSize(new Dimension(900, 600));
		fereastra1.setVisible(true);
		fereastra1.setLayout(null);
		
		buton_forme = new JButton("Forme");
		buton_linie = new JButton("Linie");
		buton_triunghi = new JButton("Triunghi");
		buton_cerc = new JButton("Cerc");
		buton_patrulater = new JButton("Patrulater");
		buton_poligon = new JButton("Poligon"); 
		buton_intoarcere = new JButton("Iesire");
		
		buton_forme.setBounds(10, 50, 200, 50);
		buton_linie.setBounds(10, 100, 100, 50);
		buton_triunghi.setBounds(10, 150, 100, 50);
		buton_cerc.setBounds(10, 200, 100, 50);
		buton_patrulater.setBounds(10, 250, 100, 50);
		buton_poligon.setBounds(10, 300, 100, 50);
		buton_intoarcere.setBounds(10, 350, 100, 50);
		
		fereastra1.add(buton_forme);
		fereastra1.add(buton_linie);
		fereastra1.add(buton_triunghi);
		fereastra1.add(buton_cerc);
		fereastra1.add(buton_patrulater);
		fereastra1.add(buton_poligon);
		fereastra1.add(buton_intoarcere);
		
			
	}
	
	public JFrame GetFrame() {
		return fereastra1;
	}
	
}
