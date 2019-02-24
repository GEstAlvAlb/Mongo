package alberto.mongo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.github.lgooddatepicker.components.DatePicker;

import Componentes.JBotones;
import Componentes.PanelBusqueda;
import objetos.Autor;
import objetos.Juego;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Vista extends JFrame implements FocusListener {

	private JPanel contentPane;
	public JLabel lblNewLabel;
	public JLabel lblNewLabel_1;
	public JTextField tfGenero;
	public JTextField tfNombre;
	
	public JLabel lblTalleresAfuera;
	public JBotones botonesCrud;
	public PanelBusqueda<Juego> panelBusqueda;
	public JComboBox<Autor> cbAutor;

	/**
	 * Create the frame.
	 */
	public Vista() {
		setTitle("HolaMongo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 541, 530);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(10, 52, 46, 14);
		contentPane.add(lblNewLabel);

		lblNewLabel_1 = new JLabel("Genero");
		lblNewLabel_1.setBounds(10, 77, 46, 14);
		contentPane.add(lblNewLabel_1);

		tfGenero = new JTextField();
		tfGenero.setBounds(118, 74, 142, 20);
		contentPane.add(tfGenero);
		tfGenero.setColumns(10);

		tfNombre = new JTextField();
		tfNombre.setBounds(118, 49, 142, 20);
		contentPane.add(tfNombre);
		tfNombre.setColumns(10);

		
		

		lblTalleresAfuera = new JLabel("Talleres Afuera");
		lblTalleresAfuera.setFont(new Font("Sitka Text", Font.BOLD, 20));
		lblTalleresAfuera.setBounds(117, 11, 175, 27);
		contentPane.add(lblTalleresAfuera);

		botonesCrud = new JBotones();
		botonesCrud.setBounds(10, 168, 185, 108);
		contentPane.add(botonesCrud);

		panelBusqueda = new PanelBusqueda<>();
		panelBusqueda.setBounds(342, 52, 175, 188);
		contentPane.add(panelBusqueda);

		cbAutor = new JComboBox();
		cbAutor.setBounds(205, 168, 107, 20);
		contentPane.add(cbAutor);

		inicializar();
		setLocationRelativeTo(null);
		setVisible(true);
	}

	private void inicializar() {
	}

	public void focusGained(FocusEvent e) {
	}

	@Override
	public void focusLost(FocusEvent arg0) {
		// TODO Auto-generated method stub
		
	}

//	public void focusLost(FocusEvent e) {
//		String precio = tfPrecio.getText();
//		if (precio.equals(""))
//			return;
//
//		precio = precio.replace("€", "").replace(",", ".").trim();
//		tfPrecio.setText(Util.formatMoneda(Float.valueOf(precio)));
//
//	}
}