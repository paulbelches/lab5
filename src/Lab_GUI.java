import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import java.awt.TextArea;

public class Lab_GUI {
	private JFrame frame;
	private JTextField txtAltura;
	private JTextField txtRadio;
	private JTextField txtProfundidad;
	private JTextField txtAncho;
	private JComboBox cbMunicipio;
	private JComboBox cbValvula;
	private JComboBox cbTanque;
	private String[] tanques_disp;
	private JButton btnCantidad;
	private JButton btnModificar;
	private JButton btnInfTanques;
	private JButton btnAbrir;
	private JButton btnCerrar;
	private JButton btnValvulas;
	private JButton btnAgregar;
	private Controlador acueducto;
	private JTextField txtId;
	private JComboBox cbTipo;
	private int contador; 
	private TextArea txtpCuadro;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lab_GUI window = new Lab_GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Lab_GUI() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		contador =1;
		
		acueducto = new Controlador();
		tanques_disp = new String[11];
		tanques_disp[0]="Tanques";
		
		frame = new JFrame();
		frame.setBounds(100, 100, 546, 311);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Dimensiones", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(393, 14, 135, 140);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		//ComboBox
		cbTanque = new JComboBox();
		cbTanque.setToolTipText("");
		for (int i = 0; i < acueducto.getTanques().size(); i++) {
			cbTanque.addItem(acueducto.getTanques().get(i).getId());
		}
		
		cbTanque.setBounds(10, 11, 175, 20);
		frame.getContentPane().add(cbTanque);
		
		cbMunicipio = new JComboBox();
		cbMunicipio.setModel(new DefaultComboBoxModel(new String[] {"Municipio", "Cob\u00E1n", "Chisec ", "Chahal", "Fray Bartolom\u00E9 de las Casas", "Lanqu\u00EDn", "Panz\u00F3s", "Tamah\u00FA", "Tucur\u00FA", "Tactic", "Santa Maria Cahab\u00F3n", "Senah\u00FA", "San Crist\u00F3bal Verapaz", "San Juan Chamelco", "San Pedro Carch\u00E1", "Santa Cruz Verapaz", "Santa Catalina La Tinta ", "Raxruh\u00E1 ", "Cubulco", "Santa Cruz el Chol", "Granados", "Purulh\u00E1", "Rabinal", "Salam\u00E1", "San Miguel Chicaj", "San Jer\u00F3nimo", "Chimaltenango", "San Jose Poaquil", "San Martin Jilotepeque", "San Juan Comalapa", "Santa Apolonia", "Santa Cruz Balany\u00E1", "Tecp\u00E1n Guatemala", "Patz\u00FAn", "Pochuta", "Patzic\u00EDa", "El tejar", "Parramos", "Acatenango", "Yepocapa", "San Andres Itzapa", "Zaragoza", "Chiquimula", "Camotan", "Concepci\u00F3n las Minas", "Esquipulas", "Ipala", "Jocotan", "Olopa", "Quetzaltepeque", "San Jos\u00E9 La Arada", "San Juan Ermita", "San Jacinto", "Guastatoya", "Moraz\u00E1n", "El Jicaro", "San Agustin Acasaguastl\u00E1n", "San Cristobal Acasaguastl\u00E1n", "San Antonio La Paz", "Sanarate", "Sansare", "Escuintla", "Guanagazapa", "Iztapa", "La Democracia", "La Gomera", "Masagua", "Nueva Concepci\u00F3n", "Pal\u00EDn", "San Jos\u00E9", "San Vicente Pacaya", "Santa Lucia Cotzumalguapa", "Siquinal\u00E1", "Tiquisate", "Guatemala", "Santa Catarina Pinula", "San Jos\u00E9 Pinula", "San Jos\u00E9 Del Golfo", "Palencia", "Chinautla", "San Pedro Ayampuc", "Mixco", "San Pedro Sacatep\u00E9quez", "San Juan Sacatep\u00E9quez", "Chuarrancho", "Villa Nueva", "Villa Canales", "Amatitl\u00E1n", "Fraijanes", "San Miguel Petapa", "San Raymundo", "Aguacat\u00E1n", "Chiantla", "Colotenango", "Concepci\u00F3n Huista", "Cuilco", "Huehuetenango", "Jacaltenango", "La Democracia", "La Libertad", "Malacatancito", "Nent\u00F3n", "San Antonio Huista", "San Gaspar Ixchil", "San Ildefonso Ixtahuac\u00E1n", "San Juan Atit\u00E1n", "San Juan Ixcoy", "San Mateo Ixtat\u00E1n", "San Miguel Acat\u00E1n", "San Pedro Necta", "San Pedro Soloma", "San Rafael La Independencia", "San Rafael Petzal", "San Sebasti\u00E1n Coat\u00E1n", "San Sebasti\u00E1n Huehuetenango", "San Ana Huista", "San B\u00E1rbara", "Santa Cruz Barillas", "Santa Eulalia", "Santiago Chimaltenango", "Tectit\u00E1n", "Todos Santos Cuchumat\u00E1n", "Union Cantinil (desde 2005)", "Puerto Barrios", "El Estor", "Livingston", "Los Amates", "Morales", "Jalapa", "Mataquescuintla", "Monjas", "San Pedro Pinula", "San Luis Jilotepeque", "San Manuel Chaparr\u00F3n", "San Carlos Alzatate", "Jutiapa", "Agua Blanca", "Asunci\u00F3n Mita", "Atescatempa", "Comapa", "Conguaco", "El Adelantado", "El Progeso", "Jalpatagua", "Jerez", "Moyuta", "Pasaco", "Quesada", "San Jos\u00E9 Acatempa", "Santa Catarina Mita", "Yupiltepeque", "Zapotitl\u00E1n", "Dolores", "Flores", "La Libertad", "Melchor de Mencos", "Popt\u00FAn", "San Andres", "San Benito", "San Francisco", "San Jos\u00E9", "San Luis", "Santa Ana", "Sayaxch\u00E9", "Quetzaltenango", "Almolonga", "Cabric\u00E1n", "Cajol\u00E1", "Cantel", "Coatepeque", "Colomba", "Concepci\u00F3n Chiquirichapa", "El Palmar", "Flores Costa Cuca", "G\u00E9nova", "Huit\u00E1n", "La Esperanza", "Olintepeque", "San Juan Ostuncalco", "Palestina Los Altos", "Salcaj\u00E1", "San Carlos Sija", "San Francisco La Uni\u00F3n", "San Mart\u00EDn Sacatep\u00E9quez", "San Mateo", "San Miguel Sig\u00FCil\u00E1", "Sibilia", "Zunil", "Santa Cruz del Quich\u00E9", "Canill\u00E1", "Chajul", "Chicam\u00E1n", "Chich\u00E9", "Chichicastenango", "Chinique", "Cun\u00E9n", "Ixc\u00E1n", "Joyabaj", "Nebaj", "Pachalum", "Patzit\u00E9", "Sacapulas", "San Andr\u00E9s Sajcabaj\u00E1", "San Antonio Ilotenango", "San Bartolom\u00E9 Jocotenango", "San Juan Cotzal", "San Pedro Jocopilas", "Uspant\u00E1n", "Zacualpa", "Retalhuleu", "Champerico", "El Asintal", "Nuevo San Carlos", "San Andr\u00E9s Villa Seca", "San Mart\u00EDn Zapotitl\u00E1n", "San Felipe", "San Sebasti\u00E1n", "Santa Cruz Mulu\u00E1", "Antigua Guatemala", "Alotenango", "Ciudad Vieja", "Jocotenango", "Magdalena Milpas Altas", "Pastores", "San Antonio Aguas Calientes", "San Bartolom\u00E9 Milpas Altas", "San Lucas Sacatep\u00E9quez", "San Miguel Due\u00F1as", "San Catarina Barahona", "Santa Lucia Milpas Altas", "Santa Maria De Jes\u00FAs", "Santiago Sacatep\u00E9quez", "Santo Domingo Xenacoj", "Sumpango", "San Marcos", "Ayutla", "Catarina", "Comitancillo", "Concepci\u00F3n Tutuapa", "El Quetzal", "El Rodeo", "El Tumbador", "Esquipulas Palo Gordo", "Ixchigu\u00E1n", "La Reforma", "Malacat\u00E1n", "Nuevo Progreso", "Oc\u00F3s", "Pajapita", "R\u00EDo Blanco", "San Antonio Sacatep\u00E9quez", "San Crist\u00F3bal Cucho", "San Jos\u00E9 Ojetenam", "San Lorenzo", "San Miguel Ixtahuac\u00E1n", "San Pablo", "San Pedro Sacat\u00E9pequez", "San Rafa\u00E9l Pie de la Cuesta", "Sibinal", "Sipacapa", "Tacan\u00E1", "Tajumulco", "Tejutla", "La Blanca", "Cuilapa", "Casillas", "Chiquimulilla", "Guazacap\u00E1n", "Nueva Santa Rosa", "Oratorio", "Pueblo Nuevo Vi\u00F1as", "San Juan Tecuaco", "San Rafa\u00E9l Las Flores", "Santa Cruz Naranjo", "Santa Mar\u00EDa Ixhuat\u00E1n", "Santa Rosa de Lima", "Taxisco", "Barberena", "Solol\u00E1", "Concepci\u00F3n", "Nahual\u00E1", "Panajachel ", "San Andres Semetabaj", "San Antonio Palop\u00F3", "San Jos\u00E9 Chacay\u00E1", "San Juan La Laguna", "San Lucas Tolim\u00E1n", "San Marcos La Laguna", "San Pablo La Laguna", "San Pedro La Laguna", "Santa Catarina Ixtahuacan", "Santa Catarina Palop\u00F3", "Santa Clara La Laguna", "Santa Cruz La Laguna", "Santa Luc\u00EDa Utatl\u00E1n", "Santa Mar\u00EDa Visitaci\u00F3n", "Santiago Atitl\u00E1n", "", "Mazatenango", "Chicacao", "Cuyotenango", "Patulul", "Pueblo Nuevo", "R\u00EDo Bravo", "Samayac", "San Antonio Suchitep\u00E9quez", "San Bernardino", "San Jos\u00E9 El \u00CDdolo", "San Francisco Zapotitl\u00E1n", "San Gabriel", "San Juan Bautista", "San Lorenzo", "San Miguel Pan\u00E1n", "San Pablo Jocopilas", "Santa B\u00E1rbara", "Santo Domingo Suchitep\u00E9quez", "Santo Tomas La Uni\u00F3n", "Zunilito", "San Jos\u00E9 la Maquina ", "Totonicap\u00E1n", "Momostenango", "San Andr\u00E9s Xecul", "San Bartolo", "San Cristobal Totonicap\u00E1n", "San Francisco El Alto", "Santa Luc\u00EDa la Reforma", "Santa Mar\u00EDa Chiquimula", "Caba\u00F1as", "Estanzuela", "Gual\u00E1n", "Huit\u00E9", "La Uni\u00F3n", "R\u00EDo Hondo", "San Diego", "San Jorge", "Teculut\u00E1n", "Usumatl\u00E1n", "Zacapa"}));
		cbMunicipio.setBounds(195, 11, 188, 20);
		frame.getContentPane().add(cbMunicipio);
		
		cbValvula = new JComboBox();
		cbValvula.setModel(new DefaultComboBoxModel(new String[] {"Valvula", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		cbValvula.setBounds(195, 42, 89, 20);
		frame.getContentPane().add(cbValvula);
				
		cbTipo = new JComboBox();
		cbTipo.setModel(new DefaultComboBoxModel(new String[] {"Tipo de tanque", "Circular", "Cubico", "Ortogonal"}));
		cbTipo.setBounds(195, 175, 188, 20);
		frame.getContentPane().add(cbTipo);
		cbTipo.addActionListener(new MiListener());
		
		txtAltura = new JTextField();
		txtAltura.setText("Altura");
		txtAltura.setBounds(10, 22, 115, 20);
		panel.add(txtAltura);
		txtAltura.setColumns(10);
		
		txtRadio = new JTextField();
		txtRadio.setVisible(false);
		txtRadio.setText("Radio");
		txtRadio.setBounds(10, 53, 115, 20);
		panel.add(txtRadio);
		txtRadio.setColumns(10);
		
		txtProfundidad = new JTextField();
		txtProfundidad.setVisible(false);
		txtProfundidad.setText("Profundidad");
		txtProfundidad.setBounds(10, 84, 115, 20);
		panel.add(txtProfundidad);
		txtProfundidad.setColumns(10);
		
		txtAncho = new JTextField();
		txtAncho.setVisible(false);
		txtAncho.setText("Ancho");
		txtAncho.setBounds(10, 115, 115, 20);
		panel.add(txtAncho);
		txtAncho.setColumns(10);

		txtId = new JTextField();
		txtId.setText("ID");
		txtId.setBounds(393, 241, 127, 20);
		frame.getContentPane().add(txtId);
		txtId.setColumns(10);
		
		//Botones
		
		btnValvulas = new JButton("Valvulas");
		btnValvulas.setBounds(195, 73, 89, 23);
		frame.getContentPane().add(btnValvulas);
		btnValvulas.addActionListener(new MiListener());
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(294, 72, 89, 23);
		frame.getContentPane().add(btnCerrar);
		btnCerrar.addActionListener(new MiListener());
		
		btnAbrir = new JButton("Abrir");
		btnAbrir.setBounds(294, 40, 89, 23);
		frame.getContentPane().add(btnAbrir);
		btnAbrir.addActionListener(new MiListener());
		
		btnInfTanques = new JButton("Todos los tanques");
		btnInfTanques.setBounds(195, 107, 188, 23);
		frame.getContentPane().add(btnInfTanques);
		btnInfTanques.addActionListener(new MiListener());
		
		btnCantidad = new JButton("Cantidad disponible");
		btnCantidad.setBounds(195, 141, 188, 23);
		frame.getContentPane().add(btnCantidad);
		btnCantidad.addActionListener(new MiListener());
		
		btnModificar = new JButton("Modificar");
		btnModificar.setBounds(195, 206, 188, 23);
		frame.getContentPane().add(btnModificar);
		btnModificar.addActionListener(new MiListener());
		
		btnAgregar = 
				new JButton("Agregar");
		btnAgregar.setBounds(195, 240, 188, 23);
		frame.getContentPane().add(btnAgregar);
		
		txtpCuadro = new TextArea();
		txtpCuadro.setBounds(10, 37, 175, 224);
		frame.getContentPane().add(txtpCuadro);
		btnAgregar.addActionListener(new MiListener());
		
		
	}
	
	private class MiListener implements ActionListener{

		public void actionPerformed (ActionEvent e) {
			
			//Inicia evento del boton valvulas
			if (e.getSource() == btnValvulas) {
				txtpCuadro.setText("Hay "+Integer.toString(acueducto.cantidadV())+" valvulas abiertas"+"\n"+"en tanques circulares");
			}
			//Finalaiza evento del boton valvulas
			
			//Inicia evento del botonTodos los tanques
			if (e.getSource() == btnInfTanques) {
				if (contador>1) {
					String Informacion ="Hay "+(contador-1)+" tanques disponibles"+"\n"+"en el acueducto actualmente"+"\n"+"Estos son:"+"\n";
					txtpCuadro.setText(Informacion+acueducto.tanques());
				}
				else {
					JOptionPane.showMessageDialog(null, "No tiene tanques por el momento");
				}
			}
			//Finalaiza evento del botonTodos los tanques
			
			//Inicia evento del boton Cantidad disponible
			if (e.getSource() == btnCantidad) {
				if (contador>1) {
					
					txtpCuadro.setText("Actualmente tiene "+acueducto.cantidadR()+" litros  disponibles");
				}
				else {
					JOptionPane.showMessageDialog(null, "No tiene tanques por el momento");
				}
			}
			//Finalaiza evento del boton Cantidad disponible
			
			//Inicia evento del boton agregar
			if (e.getSource() == btnAgregar) {
				if (!(cbTipo.getSelectedIndex()==0)) {
					if(contador < 10) {
						//Si el tipo de tanque es cilindrico entra a hacer estas instrucciones
						if (cbTipo.getSelectedIndex()==1) {
							acueducto.AgregarTanque(cbTipo.getSelectedIndex(), Double.parseDouble(txtAltura.getText()), Double.parseDouble(txtRadio.getText()),0.0,0.0, Long.parseLong(txtId.getText()));;
						}
						//Si el tipo de tanque es cubico entra a hacer estas instrucciones
						if (cbTipo.getSelectedIndex()==2) {
							acueducto.AgregarTanque(cbTipo.getSelectedIndex(), Double.parseDouble(txtAltura.getText()), 0.0, 0.0, 0.0, Long.parseLong(txtId.getText()));;
						}
						//Si el tipo de tanque es ortogonal entra a hacer estas instrucciones
						if (cbTipo.getSelectedIndex()==3) {
							acueducto.AgregarTanque(cbTipo.getSelectedIndex(), Double.parseDouble(txtAltura.getText()), 0.0, Double.parseDouble(txtAncho.getText()), Double.parseDouble(txtProfundidad.getText()), Long.parseLong(txtId.getText()));;
						}
						tanques_disp[contador]=txtId.getText();
						cbTanque.addItem(txtId.getText());
						contador++;
					}
					//Si ya tiene más de diez tanques en el acueducto, mandará este mensaje
					else {
						JOptionPane.showMessageDialog(null, "Ha llegado a su limite de 10 tanques");
					}
					limpiar();
				}
				else {
					JOptionPane.showMessageDialog(null, "Seleccione el tipo de tanque que desea agregar");
				}
				
			}
			//Finalaiza evento del boton agregar
			
			//Inicia evento del boton Modificar
			if (e.getSource() == btnModificar) {
				if (cbTanque.getSelectedIndex()==0) {
					JOptionPane.showMessageDialog(null, "Seleccione un tanque de la lista de tanques ya existentes para modificar"+"\n"+"Seleccionelo según su ID");
				}
				else {
					if(!(cbTipo.getSelectedIndex()==0)) {
						if (cbTipo.getSelectedIndex()==1) {	
							acueducto.modificar(cbTipo.getSelectedIndex(), Double.parseDouble(txtAltura.getText()), Double.parseDouble(txtRadio.getText()), 0.0, 0.0, Long.parseLong(txtId.getText()), (cbTanque.getSelectedIndex()-1));
						}
						//Si el tipo de tanque es cubico entra a hacer estas instrucciones
						if (cbTipo.getSelectedIndex()==2) {
							acueducto.modificar(cbTipo.getSelectedIndex(), Double.parseDouble(txtAltura.getText()), 0.0, 0.0, 0.0, Long.parseLong(txtId.getText()), (cbTanque.getSelectedIndex()-1));
						}
						//Si el tipo de tanque es ortogonal entra a hacer estas instrucciones
						if (cbTipo.getSelectedIndex()==3) {
							acueducto.modificar(cbTipo.getSelectedIndex(), Double.parseDouble(txtAltura.getText()), 0.0, Double.parseDouble(txtAncho.getText()), Double.parseDouble(txtProfundidad.getText()), Long.parseLong(txtId.getText()), (cbTanque.getSelectedIndex()-1));
						}
						tanques_disp[cbTanque.getSelectedIndex()]=txtId.getText();
						cbTanque.removeAllItems();
						for (String s: tanques_disp) {
							cbTanque.addItem(s);
						}
						limpiar();
					}
					else {
						JOptionPane.showMessageDialog(null, "Seleccione el tipo de tanque");
					}
				}
			}
			//Finalaiza evento del boton Modificar
			
			//Inicia evento del boton abrir
			if (e.getSource() == btnAbrir) {
				if (cbTanque.getSelectedIndex()==0) {
					JOptionPane.showMessageDialog(null, "Seleccione un tanque de la lista de tanques existentes para cambiar sus valvulas");
				}
				else {
					if(cbValvula.getSelectedIndex()==0) {
						JOptionPane.showMessageDialog(null, "Seleccione una de las 10 valvulas que desee abrir");
					}
					else {
						if (cbMunicipio.getSelectedIndex()==0) {
							JOptionPane.showMessageDialog(null, "Seleccione uno de los municipios a los que se dirigira la valvula");
						}
						else {
							acueducto.cambiarEstado(cbTanque.getSelectedIndex()-1, cbMunicipio.getSelectedIndex()-1,cbValvula.getSelectedIndex()-1,true );
						}
					}
				}
			}
			//Finalaiza evento del boton abrir
			
			//Inicia evento del boton cerrar
			if (e.getSource() == btnCerrar) {
				if (cbTanque.getSelectedIndex()==0) {
					JOptionPane.showMessageDialog(null, "Seleccione un tanque de la lista de tanques existentes para cambiar sus valvulas");
				}
				else {
					if(cbValvula.getSelectedIndex()==0) {
						JOptionPane.showMessageDialog(null, "Seleccione una de las 10 valvulas que desee abrir");
					}
					else {
						if (cbMunicipio.getSelectedIndex()==0) {
							JOptionPane.showMessageDialog(null, "Seleccione uno de los municipios a los que se dirigira la valvula");
						}
						else {
							acueducto.cambiarEstado(cbTanque.getSelectedIndex()-1, cbMunicipio.getSelectedIndex()-1,cbValvula.getSelectedIndex()-1,false);
						}
					}
				}
			}
			//Finalaiza evento del boton cerrar
			
			//Inicia evento del ComboBox Tipo
			if (e.getSource() == cbTipo) {
				if (cbTipo.getSelectedIndex()==1) {
					txtRadio.setVisible(true);
					txtAncho.setVisible(false);
					txtProfundidad.setVisible(false);
				}
				if (cbTipo.getSelectedIndex()==2) {
					txtRadio.setVisible(false);
					txtAncho.setVisible(false);
					txtProfundidad.setVisible(false);
				}
				if (cbTipo.getSelectedIndex()==3) {
					txtRadio.setVisible(false);
					txtAncho.setVisible(true);
					txtProfundidad.setVisible(true);
				}
			}
			//Finaliza evento del ComboBox Tipo
			
		}
		
	public void limpiar() {
		cbTipo.setSelectedIndex(0);
		txtAltura.setText("Altura");
		txtProfundidad.setText("Profundidad");
		txtAncho.setText("Ancho");
		txtRadio.setText("Radio");
		txtProfundidad.setVisible(false);
		txtAncho.setVisible(false);
		txtRadio.setVisible(false);
		txtId.setText("ID");
	}
		
	}
}
