package firstIteration.view.components;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ConfirmSendingStoreItemDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;

	/**
	 * Create the dialog.
	 */
	public ConfirmSendingStoreItemDialog() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.NORTH);
			GridBagLayout gbl_panel = new GridBagLayout();
			gbl_panel.columnWidths = new int[]{0, 0, 0};
			gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
			gbl_panel.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
			gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			panel.setLayout(gbl_panel);
			{
				JLabel lblId = new JLabel("id");
				GridBagConstraints gbc_lblId = new GridBagConstraints();
				gbc_lblId.insets = new Insets(0, 0, 5, 5);
				gbc_lblId.gridx = 0;
				gbc_lblId.gridy = 0;
				panel.add(lblId, gbc_lblId);
			}
			{
				JLabel lblNewLabel = new JLabel("New label");
				GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
				gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
				gbc_lblNewLabel.gridx = 1;
				gbc_lblNewLabel.gridy = 0;
				panel.add(lblNewLabel, gbc_lblNewLabel);
			}
			{
				JLabel lblNewLabel_1 = new JLabel("Produkt");
				GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
				gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
				gbc_lblNewLabel_1.gridx = 0;
				gbc_lblNewLabel_1.gridy = 1;
				panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
			}
			{
				JLabel lblNewLabel_2 = new JLabel("New label");
				GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
				gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 0);
				gbc_lblNewLabel_2.gridx = 1;
				gbc_lblNewLabel_2.gridy = 1;
				panel.add(lblNewLabel_2, gbc_lblNewLabel_2);
			}
			{
				JLabel lblNewLabel_3 = new JLabel("Nazwa");
				GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
				gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
				gbc_lblNewLabel_3.gridx = 0;
				gbc_lblNewLabel_3.gridy = 2;
				panel.add(lblNewLabel_3, gbc_lblNewLabel_3);
			}
			{
				JLabel lblNewLabel_4 = new JLabel("New label");
				GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
				gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 0);
				gbc_lblNewLabel_4.gridx = 1;
				gbc_lblNewLabel_4.gridy = 2;
				panel.add(lblNewLabel_4, gbc_lblNewLabel_4);
			}
			{
				JLabel lblNewLabel_5 = new JLabel("Dost\u0119pna ilo\u015B\u0107");
				GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
				gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
				gbc_lblNewLabel_5.gridx = 0;
				gbc_lblNewLabel_5.gridy = 3;
				panel.add(lblNewLabel_5, gbc_lblNewLabel_5);
			}
			{
				JLabel lblNewLabel_6 = new JLabel("New label");
				GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
				gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 0);
				gbc_lblNewLabel_6.gridx = 1;
				gbc_lblNewLabel_6.gridy = 3;
				panel.add(lblNewLabel_6, gbc_lblNewLabel_6);
			}
			{
				JLabel lblNewLabel_7 = new JLabel("Cena");
				GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
				gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
				gbc_lblNewLabel_7.gridx = 0;
				gbc_lblNewLabel_7.gridy = 4;
				panel.add(lblNewLabel_7, gbc_lblNewLabel_7);
			}
			{
				JLabel lblNewLabel_8 = new JLabel("New label");
				GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
				gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 0);
				gbc_lblNewLabel_8.gridx = 1;
				gbc_lblNewLabel_8.gridy = 4;
				panel.add(lblNewLabel_8, gbc_lblNewLabel_8);
			}
			{
				JLabel lblNewLabel_9 = new JLabel("Jednostka");
				GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
				gbc_lblNewLabel_9.insets = new Insets(0, 0, 0, 5);
				gbc_lblNewLabel_9.gridx = 0;
				gbc_lblNewLabel_9.gridy = 5;
				panel.add(lblNewLabel_9, gbc_lblNewLabel_9);
			}
			{
				JLabel lblNewLabel_10 = new JLabel("New label");
				GridBagConstraints gbc_lblNewLabel_10 = new GridBagConstraints();
				gbc_lblNewLabel_10.gridx = 1;
				gbc_lblNewLabel_10.gridy = 5;
				panel.add(lblNewLabel_10, gbc_lblNewLabel_10);
			}
		}
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
			{
				Box verticalBox = Box.createVerticalBox();
				panel.add(verticalBox);
				{
					JRadioButton rdbtnNewRadioButton = new JRadioButton("Nowe zlecenie");
					verticalBox.add(rdbtnNewRadioButton);
				}
				{
					JLabel lblNewLabel_11 = new JLabel("Potwierdz wys\u0142anie nast\u0119puj\u0105cej ilo\u015Bci");
					verticalBox.add(lblNewLabel_11);
				}
				{
					Box horizontalBox = Box.createHorizontalBox();
					verticalBox.add(horizontalBox);
					{
						JLabel lblIlo = new JLabel("Ilo\u015B\u0107");
						horizontalBox.add(lblIlo);
					}
					{
						textField = new JTextField();
						horizontalBox.add(textField);
						textField.setColumns(1);
					}
				}
				{
					JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Rezerwacje");
					verticalBox.add(rdbtnNewRadioButton_1);
				}
				{
					JLabel lblWybierzZZarezerwowanych = new JLabel("Wybierz z zarezerwowanych");
					verticalBox.add(lblWybierzZZarezerwowanych);
				}
				{
					JComboBox comboBox = new JComboBox();
					verticalBox.add(comboBox);
				}
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						setVisible(false);
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						setVisible(false);
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
