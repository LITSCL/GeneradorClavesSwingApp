package cl.litscl.generadorclavesswingapp;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.concurrent.ThreadLocalRandom;
import java.awt.event.ActionEvent;

public class StartFrame extends JFrame {
	private JPanel contentPane;
	private JTextField textFieldClaveGenerada;
	private JRadioButton rdbtn8;
	private JRadioButton rdbtn10;
	private JRadioButton rdbtn12;
	private JRadioButton rdbtn14;
	private JRadioButton rdbtn16;
	private JRadioButton rdbtn18;
	private JCheckBox chckbxMayusculas;
	private JCheckBox chckbxMinusculas;
	private JCheckBox chckbxNumeros;
	private JCheckBox chckbxSimbolos;
	private JButton btnCopiar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartFrame frame = new StartFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public StartFrame() {
		this.setTitle("GeneradorClavesSwingApp");
		setIconImage(Toolkit.getDefaultToolkit().getImage(StartFrame.class.getResource("/cl/litscl/generadorclavesswingapp/image/startframe.png")));	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		chckbxMayusculas = new JCheckBox("Mayúsculas");
		chckbxMayusculas.setSelected(true);
		chckbxMayusculas.setBounds(331, 7, 97, 23);
		contentPane.add(chckbxMayusculas);
		
		chckbxMinusculas = new JCheckBox("Minúsculas");
		chckbxMinusculas.setSelected(true);
		chckbxMinusculas.setBounds(331, 33, 97, 23);
		contentPane.add(chckbxMinusculas);
		
		chckbxNumeros = new JCheckBox("Números");
		chckbxNumeros.setSelected(true);
		chckbxNumeros.setBounds(331, 59, 97, 23);
		contentPane.add(chckbxNumeros);
		
		chckbxSimbolos = new JCheckBox("Simbolos");
		chckbxSimbolos.setSelected(true);
		chckbxSimbolos.setBounds(331, 85, 97, 23);
		contentPane.add(chckbxSimbolos);
		
		rdbtn8 = new JRadioButton("8");
		rdbtn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtn8.isSelected()) {
					rdbtn10.setSelected(false);
					rdbtn12.setSelected(false);
					rdbtn14.setSelected(false);
					rdbtn16.setSelected(false);
					rdbtn18.setSelected(false);
				}
				else {
					rdbtn8.setSelected(true);
				}
			}
		});
		rdbtn8.setBounds(6, 7, 109, 23);
		contentPane.add(rdbtn8);
		
		rdbtn10 = new JRadioButton("10");
		rdbtn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtn10.isSelected()) {
					rdbtn8.setSelected(false);
					rdbtn12.setSelected(false);
					rdbtn14.setSelected(false);
					rdbtn16.setSelected(false);
					rdbtn18.setSelected(false);
				}
				else {
					rdbtn10.setSelected(true);
				}
			}
		});
		rdbtn10.setBounds(6, 33, 109, 23);
		contentPane.add(rdbtn10);
		
		rdbtn12 = new JRadioButton("12");
		rdbtn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtn12.isSelected()) {
					rdbtn8.setSelected(false);
					rdbtn10.setSelected(false);
					rdbtn14.setSelected(false);
					rdbtn16.setSelected(false);
					rdbtn18.setSelected(false);
				}
				else {
					rdbtn12.setSelected(true);
				}
			}
		});
		rdbtn12.setBounds(6, 59, 109, 23);
		contentPane.add(rdbtn12);
		
		rdbtn14 = new JRadioButton("14");
		rdbtn14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtn14.isSelected()) {
					rdbtn8.setSelected(false);
					rdbtn10.setSelected(false);
					rdbtn12.setSelected(false);
					rdbtn16.setSelected(false);
					rdbtn18.setSelected(false);
				}
				else {
					rdbtn14.setSelected(true);
				}
			}
		});
		rdbtn14.setBounds(6, 85, 109, 23);
		contentPane.add(rdbtn14);
		
		rdbtn16 = new JRadioButton("16");
		rdbtn16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtn16.isSelected()) {
					rdbtn8.setSelected(false);
					rdbtn10.setSelected(false);
					rdbtn12.setSelected(false);
					rdbtn14.setSelected(false);
					rdbtn18.setSelected(false);
				}
				else {
					rdbtn16.setSelected(true);
				}
			}
		});
		rdbtn16.setBounds(6, 111, 109, 23);
		contentPane.add(rdbtn16);
		
		rdbtn18 = new JRadioButton("18");
		rdbtn18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtn18.isSelected()) {
					rdbtn8.setSelected(false);
					rdbtn10.setSelected(false);
					rdbtn12.setSelected(false);
					rdbtn14.setSelected(false);
					rdbtn16.setSelected(false);
				}
				else {
					rdbtn18.setSelected(true);
				}
			}
		});
		rdbtn18.setSelected(true);
		rdbtn18.setBounds(6, 137, 109, 23);
		contentPane.add(rdbtn18);
		
		JButton btnGenerar = new JButton("Generar");
		btnGenerar.addActionListener(e -> generarClave(e));
		btnGenerar.setBounds(339, 227, 89, 23);
		contentPane.add(btnGenerar);
		
		textFieldClaveGenerada = new JTextField();
		textFieldClaveGenerada.setBounds(6, 228, 198, 20);
		contentPane.add(textFieldClaveGenerada);
		textFieldClaveGenerada.setColumns(10);
		
		btnCopiar = new JButton();
		btnCopiar.setBounds(214, 223, 30, 30);
		ImageIcon imagen = new ImageIcon(StartFrame.class.getResource("/cl/litscl/generadorclavesswingapp/image/save.png"));
		ImageIcon icono = new ImageIcon(imagen.getImage().getScaledInstance(btnCopiar.getWidth(), btnCopiar.getHeight(), Image.SCALE_DEFAULT));
		btnCopiar.setIcon(icono);
		btnCopiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
            String texto = textFieldClaveGenerada.getText();
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            Transferable transferable = new StringSelection(texto);
            
            clipboard.setContents(transferable, null);
            textFieldClaveGenerada.requestFocusInWindow();
            textFieldClaveGenerada.selectAll();
			}
		});
		contentPane.add(btnCopiar);
	}

	private void generarClave(ActionEvent e) {
		JRadioButton longitudes[] = {rdbtn8, rdbtn10, rdbtn12, rdbtn14, rdbtn16, rdbtn18};
		
		boolean mayusculas = false;
		if (chckbxMayusculas.isSelected()) {
			mayusculas = true;
		}
		
		boolean minusculas = false;
		if (chckbxMinusculas.isSelected()) {
			minusculas = true;
		}
		
		boolean numeros = false;
		if (chckbxNumeros.isSelected()) {
			numeros = true;
		}
		
		boolean simbolos = false;
		if (chckbxSimbolos.isSelected()) {
			simbolos = true;
		}
		
		boolean caracteresSeleccionados[] = {mayusculas, minusculas, numeros, simbolos};
		
		if (!mayusculas && !minusculas && !numeros && !simbolos) {
			textFieldClaveGenerada.setText("");
			JOptionPane.showMessageDialog(this, "No se ha podido generar la contraseña", "Error", JOptionPane.ERROR_MESSAGE);
		}
		else {
			int longitudSeleccionada = -1;
			for (JRadioButton radioButton : longitudes) {
				if (radioButton.isSelected()) {
					longitudSeleccionada = Integer.parseInt(radioButton.getText());
					break;
				}
			}
			
			String cadenaMayusculas = "ABCDEFGHIJKLMNOPQRXYZ";
			String cadenaMinusculas = "abcdefghijklmnopqrxyz";
			String cadenaNumeros = "0123456789";
			String cadenaSimbolos = "#$%&";
			
			String caracteresPermitidos = "";
			String caracteresObligatorios = "";
			String claveGenerada = "";
			
			int contador = 0;
			if (caracteresSeleccionados[0]) {
				caracteresPermitidos+=cadenaMayusculas;
				caracteresObligatorios+=generarCadena(2, cadenaMayusculas, 0, cadenaMayusculas.length());
				contador+=2;
			}
			if (caracteresSeleccionados[1]) {
				caracteresPermitidos+=cadenaMinusculas;
				caracteresObligatorios+=generarCadena(2, cadenaMinusculas, 0, cadenaMinusculas.length());
				contador+=2;
			}
			if (caracteresSeleccionados[2]) {
				caracteresPermitidos+=cadenaNumeros;
				caracteresObligatorios+=generarCadena(2, cadenaNumeros, 0, cadenaNumeros.length());
				contador+=2;
			}
			if (caracteresSeleccionados[3]) {
				caracteresPermitidos+=cadenaSimbolos;
				caracteresObligatorios+=generarCadena(2, cadenaSimbolos, 0, cadenaSimbolos.length());
				contador+=2;
			}

			if (contador == 8 && longitudSeleccionada == 8) {
				claveGenerada = revolverCadena(caracteresObligatorios);
			}
			else {
				claveGenerada = caracteresObligatorios;
				claveGenerada+=generarCadena(longitudSeleccionada - contador, caracteresPermitidos, 0, caracteresPermitidos.length());
				claveGenerada = revolverCadena(claveGenerada);
			}
			
			textFieldClaveGenerada.setText(claveGenerada);
		}
	}
	
	protected static String revolverCadena(String cadena) {
		String cadenaSuma = "";
		String cadenaResta = cadena;
		for (int i = cadena.length(); i >= 2; i--) {
			int aleatorio = (int)(Math.random() * i + 1);
			cadenaSuma = cadenaSuma + cadenaResta.substring(aleatorio - 1, aleatorio);
			cadenaResta = cadenaResta.substring(0, aleatorio - 1) + cadenaResta.substring(aleatorio, i);
		}
		String cadenaRevuelta = cadenaSuma + cadenaResta;
        
		return cadenaRevuelta;
	}
	
	protected static String generarCadena(int longitud, String caracteres, int minimo, int maximo) {
		String cadenaGenerada = "";
		for (int i = 0; i < longitud; i++) {
			int indiceAleatorio = ThreadLocalRandom.current().nextInt(minimo, maximo);
			char caracterAleatorio = caracteres.charAt(indiceAleatorio);
			cadenaGenerada+=caracterAleatorio;
		}
		return cadenaGenerada;
	}
}