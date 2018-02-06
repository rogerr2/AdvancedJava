import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.awt.BorderLayout;
import java.awt.*;

import javax.swing.*;

public class bowser {
		
		public static void main(String[] args) {
		

		JPanel SearchEngine1 = new JPanel(new BorderLayout());
		JPanel SearchEngine2 = new JPanel(new BorderLayout());
		
		JTextField Search1 = new JTextField("http://graceland.brightspace.com");
		JTextField Search2 = new JTextField("http://graceland.brightspace.com");
		
	
		JButton Enter1 = new JButton("Enter");
		JButton Back1 = new JButton("Back");
		
		JButton Enter2 = new JButton("Enter");
		JButton Back2 = new JButton("Back");
		
		
		JPanel searchBarBox1 = new JPanel(new FlowLayout());
		JPanel searchBarBox2 = new JPanel(new FlowLayout());
		
		searchBarBox1.add(Back1, FlowLayout.LEFT);
		searchBarBox1.add(Search1, FlowLayout.CENTER);
		searchBarBox1.add(Enter1, FlowLayout.RIGHT);
		
		SearchEngine1.add(searchBarBox1, BorderLayout.NORTH);
		
		searchBarBox2.add(Back2, FlowLayout.LEFT);
		searchBarBox2.add(Search2, FlowLayout.CENTER);
		searchBarBox2.add(Enter2, FlowLayout.RIGHT);
		
		SearchEngine2.add(searchBarBox2, BorderLayout.NORTH);
		
		
		JTabbedPane tabbedPane = new JTabbedPane();
		tabbedPane.addTab("Tab 1", null, SearchEngine1);
		tabbedPane.addTab("Tab 2",null,SearchEngine2);
		
		
		JPanel tabSection = new JPanel(new BorderLayout());
		tabSection.add(tabbedPane, BorderLayout.NORTH);
		
		JPanel browserBody1 = new JPanel();
		JPanel browserBody2 = new JPanel();
		
		
		JEditorPane browserPane1 = new JEditorPane();
		browserPane1.setEditable(false); 
		
		JEditorPane browserPane2 = new JEditorPane();
		browserPane2.setEditable(false); 
		
		browserBody1.add(browserPane1);
		
		SearchEngine1.add(browserBody1);
		
		browserBody2.add(browserPane2);
		
		SearchEngine2.add(browserBody2);	
		
		Enter1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					  browserPane1.setPage(Search1.getText());
					}catch (IOException e1) {
						System.out.println("error loading page");
					}
			}
		});
		
		Enter2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					  browserPane2.setPage(Search2.getText());
					}catch (IOException e1) {
						System.out.println("error loading page");
					}
			}
		});
		
		
		try {
		  browserPane1.setPage(Search1.getText());
		}catch (IOException e) {
			System.out.println("error loading page");
		}
		
		try {
			  browserPane2.setPage(Search2.getText());
		}catch (IOException e) {
				System.out.println("error loading page");
		}
		
		
		JFrame browserWindow = new JFrame("<Roger Robinson> Web Browser");
		browserWindow.add(tabSection);
	
		browserWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		browserWindow.setSize(1200,900);
		browserWindow.setVisible(true);}


		
		
		
	
}



