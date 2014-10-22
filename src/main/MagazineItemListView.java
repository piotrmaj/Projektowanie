package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;

public class MagazineItemListView extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public MagazineItemListView() {
		setTitle("Produkty w magazynie");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JList list = new JList();
		contentPane.add(list, BorderLayout.CENTER);
	}

}
