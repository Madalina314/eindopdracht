import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

 class Login extends JFrame {
 	private JButton Login;
 	private JTextField user;
 	private JPasswordField pass;
 	
 	public Login(){
 		super("Login");
 		setLayout(new FlowLayout());
 		System.out.println("init");
 		
 		user=new JTextField(15);
 		add(user);
 		pass=new JPasswordField(15);
 		add(pass);
 		Login=new JButton("Login");
 		Login.addActionListener(new ButtonListener());
 		add(Login);
 	}
 	
 	public class ButtonListener implements ActionListener{
 		public void actionPerformed(ActionEvent e){
 			System.out.println("button pressed");
 			if(user.equals("blue")&&pass.equals("blue")){
 				JOptionPane.showMessageDialog(null, "Logged in");
 			} else {
 				JOptionPane.showMessageDialog(null, "Failed");
 			}
 		}
 	}
 }