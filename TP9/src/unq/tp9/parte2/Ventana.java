package unq.tp9.parte2;

import java.awt.Rectangle;

import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

public class Ventana extends JFrame {
	
	public Ventana(DefaultListModel<String> listModel){
		 this.setLayout(new BoxLayout(this.getContentPane(),BoxLayout.Y_AXIS));
		 this.setBounds(new Rectangle(180,180));
		 this.setVisible(true);
		 JLabel label=new JLabel("Lista de palabras");
		 label.setBounds(new Rectangle(40,40));
		 this.add(label);
		 listModel.addElement("casa");
		 listModel.addElement("arbol");
		 listModel.addElement("perro");
		 listModel.addElement("telefono");
		 listModel.addElement("brazo");
		 JList lista=new JList(listModel);
		 lista.setBounds(new Rectangle(110,160));
		 this.add(lista);
		}

	@Override
	public void setVisible(boolean b) {
		super.setVisible(b);
	}
	
	public static void main(DefaultListModel<String> listaDefault) {
		new Ventana(new DefaultListModel<String>());
		}

}
