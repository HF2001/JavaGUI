package TextEditor1;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class TextEditor1 {
	JFrame EditorWindow;
	JTextArea TextArea;
	
	
	
	
	public static void main(String[] args) {
		new TextEditor1();
	}
		
	public TextEditor1(){
		//Window
		EditorWindow = new JFrame();
		EditorWindow.setVisible(true);
		EditorWindow.setTitle("Edit");
		EditorWindow.setSize(400,400);
		EditorWindow.setResizable(false);				
		//Text Area
		TextArea = new JTextArea();
		TextArea.setVisible(true);
        TextArea.setColumns(20);

        TextArea.setRows(5);
		TextArea.setFont(new Font("Serif", Font.ITALIC, 16));
	}
	
	//Add Action Listeners Here

}
