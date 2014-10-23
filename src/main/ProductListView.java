package main;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

public class ProductListView extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public ProductListView() {
		setTitle("Produkty w magazynie");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JTable table = new JTable();
		contentPane.add(table, BorderLayout.CENTER);
	}

}
