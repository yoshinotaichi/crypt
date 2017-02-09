// Crypt.java
//   GUI, Caesar暗号アプリ

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class Crypt {
	// field

	// method
	public static void main(String[] args) {
		WindowMan man = new WindowMan();
	}
}


class WindowMan implements ActionListener{
	// field
	JFrame frame;
	JTextArea taPlain;
	JTextArea taEncrypted;
	JButton buttonEncrypt;
	JScrollPane spPlain;
	JScrollPane spEncrypted;
	JPanel panelButton;

	// method
	public WindowMan() {
		// frameをつくる
		frame = new JFrame("Cryptman");
		frame.setLocation(400, 400);
		frame.setSize(400, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// パーツをつくる
		taPlain = new JTextArea(5, 20);
		spPlain = new JScrollPane(taPlain);

		buttonEncrypt = new JButton("Encrypt");
		buttonEncrypt.addActionListener(this);
		panelButton = new JPanel();
		panelButton.add(buttonEncrypt);

		taEncrypted = new JTextArea(5, 20);
		spEncrypted = new JScrollPane(taEncrypted);

		Container con = frame.getContentPane();
		con.setLayout(new GridLayout(3, 1));
		con.add(spPlain);
		con.add(panelButton);
		con.add(spEncrypted);

		// frameを可視化する
		frame.setVisible(true);
	}

	// actionPerformed(){...}
	pubilc void actionPerformed(ActionEvent){
		
	}
}


class CryptMan {

}