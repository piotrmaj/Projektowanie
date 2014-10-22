package main;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ReserveProductsView extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;

	/**
	 * Create the dialog.
	 */
	public ReserveProductsView() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblId = new JLabel("Id");
			lblId.setBounds(25, 11, 46, 14);
			contentPanel.add(lblId);
		}
		{
			JLabel lblNewLabel = new JLabel("Produkt");
			lblNewLabel.setBounds(25, 36, 46, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Nazwa");
			lblNewLabel_1.setBounds(25, 61, 46, 14);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Dost\u0119pna ilo\u015B\u0107");
			lblNewLabel_2.setBounds(25, 86, 81, 14);
			contentPanel.add(lblNewLabel_2);
		}
		{
			JLabel lblNewLabel_3 = new JLabel("Cena");
			lblNewLabel_3.setBounds(25, 111, 46, 14);
			contentPanel.add(lblNewLabel_3);
		}
		{
			JLabel lblNewLabel_4 = new JLabel("Jednostka");
			lblNewLabel_4.setBounds(25, 136, 56, 14);
			contentPanel.add(lblNewLabel_4);
		}
		{
			JLabel lblNewLabel_5 = new JLabel("New label");
			lblNewLabel_5.setBounds(81, 11, 46, 14);
			contentPanel.add(lblNewLabel_5);
		}
		{
			JLabel lblNewLabel_6 = new JLabel("New label");
			lblNewLabel_6.setBounds(81, 36, 46, 14);
			contentPanel.add(lblNewLabel_6);
		}
		{
			JLabel lblNewLabel_7 = new JLabel("New label");
			lblNewLabel_7.setBounds(81, 61, 46, 14);
			contentPanel.add(lblNewLabel_7);
		}
		{
			JLabel lblNewLabel_8 = new JLabel("New label");
			lblNewLabel_8.setBounds(104, 86, 46, 14);
			contentPanel.add(lblNewLabel_8);
		}
		{
			JLabel lblNewLabel_9 = new JLabel("New label");
			lblNewLabel_9.setBounds(81, 111, 46, 14);
			contentPanel.add(lblNewLabel_9);
		}
		{
			JLabel lblNewLabel_10 = new JLabel("New label");
			lblNewLabel_10.setBounds(91, 136, 46, 14);
			contentPanel.add(lblNewLabel_10);
		}
		{
			JLabel lblNewLabel_11 = new JLabel("Potwierdz rezerwacje nast\u0119puj\u0105cej ilo\u015Bci ");
			lblNewLabel_11.setBounds(101, 161, 201, 14);
			contentPanel.add(lblNewLabel_11);
		}
		{
			textField = new JTextField();
			textField.setBounds(128, 178, 134, 20);
			contentPanel.add(textField);
			textField.setColumns(10);
		}
		{
			JLabel lblIlo = new JLabel("Ilo\u015B\u0107:");
			lblIlo.setBounds(95, 181, 32, 14);
			contentPanel.add(lblIlo);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
