/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructura de Datos
 * Sección: 10
 * 20/08/2015
 * Hoja de Trabajo 4
 *
 */

import java.awt.EventQueue;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.PriorityQueue;
import javax.swing.JButton;
import javax.swing.JTextField;

public class InterfazGrafica {

		private JFrame frame;
		private JTextField textField;
		private JFileChooser fc;
		private File file;
		private JButton btnSeleccionarArchivo;
		private JButton buttonCalcular;

		 public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						InterfazGrafica window = new InterfazGrafica();
						window.frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
		
		public InterfazGrafica(){
			initialize();
		}
		
		public void initialize(){
			frame = new JFrame();
			frame.setBounds(100, 100, 622, 250);
			frame.setTitle("HDT 8, Andre Rodas y Diego Morales");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			
			JLabel label1 = new JLabel("Sistema de atencion");
			label1.setFont(new Font("Tahoma", Font.BOLD, 25));
			label1.setBounds(10,0,300,100);
			frame.getContentPane().add(label1);
			
			btnSeleccionarArchivo = new JButton("Seleccionar Archivo");
			btnSeleccionarArchivo.setBounds(362, 100, 174, 23);
			btnSeleccionarArchivo.addActionListener(new Evento());
			frame.getContentPane().add(btnSeleccionarArchivo);
			
			textField = new JTextField();
			textField.setText("[Path de archivo]");
			textField.setBounds(20, 100, 332, 23);
			frame.getContentPane().add(textField);
			textField.setColumns(10);
			
			buttonCalcular = new JButton("Ordenar Pacientes");
			buttonCalcular.setBounds(20, 150, 174, 23);
			buttonCalcular.addActionListener(new Evento());
			frame.getContentPane().add(buttonCalcular);
			
			JLabel lblResultados = new JLabel("Observar en consola resultados!");
			lblResultados.setBounds(230, 150, 300, 23);
			frame.getContentPane().add(lblResultados);
					
			fc = new JFileChooser();
		}
		

		private class Evento implements ActionListener{


			public void actionPerformed(ActionEvent a) {
			
				if(a.getSource()==btnSeleccionarArchivo){
					int returnVal = fc.showOpenDialog(frame);
			        if (returnVal == JFileChooser.APPROVE_OPTION) {
			        	System.out.println("Archivo seleccionado");
			            file = fc.getSelectedFile();
			            textField.setText(file.getAbsolutePath());
			        } 
				}
				else
				{
					try {
						System.out.println("\n------------------\n| Pruebas de lectura |\n----------------");
						Paciente [] pacientes = new Paciente [4];
						BufferedReader br = new BufferedReader(new FileReader(file));
					    String line = null;
					    try {
					    	int i=0;
					    	while ((line = br.readLine()) != null) {
					    		System.out.println(line);
					    		if (line.replace("\\s+","").length()>10) {
					    			System.out.println(line.replace("\\s+","").charAt(line.length()-1));
					    			pacientes[i] = new Paciente(line,line.replace("\\s+","").charAt(line.length()-1));
					    			i++;
					    		}
							}
					    	
					    	/*----------------
							| Priority Queue |
							----------------*/
							System.out.println("\n------------------\n| Priority Queue |\n----------------");
							PriorityQueue<Paciente> pq = new PriorityQueue<Paciente>();
							
							//Agregar pacientes a la Priority Queue
							for(i=0; i<pacientes.length; i++){
								pq.add(pacientes[i]);
							}
							
							//Imprimir pacientes del Priority Queue
							for(i=0; i<pacientes.length; i++){
								System.out.println(pq.poll());
							}
				    		
				    		/*----------------
				    		|   Vector Heap  |
				    		----------------*/
				    		System.out.println("\n----------------\n| Vector Heap |\n--------------");

				    		VectorHeap vh = new VectorHeap();

				    		//Agregar pacientes a la Priority Queue
				    		for(i=0; i<pacientes.length; i++){
				    			vh.add(pacientes[i]);
				    		}
				    		//Imprimir pacientes del Priority Queue
				    		for(i=0; i<pacientes.length; i++){
				    			System.out.println(vh.remove());
				    		}
				    		
				    		
						} 
					    catch (IOException e) {
					    	e.printStackTrace();
					    }
					} 
					
					catch ( Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
		
		
}
