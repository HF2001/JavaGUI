import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;

public class TextEditor1 {
	public class GUIWindow {
		
		JList<String> list1;
		JLabel label1;
		JTextField text1;
		JButton button1;
		DefaultListModel<String> listmodel;
		
		
		JFrame thisGUI;

		public static void main(String[] args) {
			new GUIWindow();
	
}

		public GUIWindow() {
			System.out.println("Hello World");
			thisGUI = new JFrame();
			thisGUI.setTitle("My First GUI");
			thisGUI.setSize(408, 400);
			thisGUI.setResizable(false);
			thisGUI.setLocationRelativeTo(null);
			thisGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}	
}	