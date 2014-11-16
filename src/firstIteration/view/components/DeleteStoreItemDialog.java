package firstIteration.view.components;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dto.StoreItemDTO;
import firstIteration.presenter.IStoreItemListViewPresenter;
import firstIteration.presenter.impl.StoreItemListViewPresenter;

public class DeleteStoreItemDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	protected  StoreItemDTO storeitem;
	private IStoreItemListViewPresenter presenter;

	/**
	 * Create the dialog.
	 * @param storeItemListViewPresenter 
	 */
	public DeleteStoreItemDialog(IStoreItemListViewPresenter storeItemListViewPresenter, final StoreItemDTO storeitem) {
		
		presenter = storeItemListViewPresenter;
		this.storeitem = storeitem;
		
		setBounds(100, 100, 289, 236);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new GridLayout(0, 1, 0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel);
			GridBagLayout gbl_panel = new GridBagLayout();
			gbl_panel.columnWidths = new int[]{0, 0, 0};
			gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
			gbl_panel.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
			gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
			panel.setLayout(gbl_panel);
			{
				JLabel label = new JLabel("id");
				GridBagConstraints gbc_label = new GridBagConstraints();
				gbc_label.insets = new Insets(0, 0, 5, 5);
				gbc_label.gridx = 0;
				gbc_label.gridy = 0;
				panel.add(label, gbc_label);
			}
			{
				JLabel label = new JLabel(Integer.toString(storeitem.getId()));
				GridBagConstraints gbc_label = new GridBagConstraints();
				gbc_label.insets = new Insets(0, 0, 5, 0);
				gbc_label.gridx = 1;
				gbc_label.gridy = 0;
				panel.add(label, gbc_label);
			}
			{
				JLabel label = new JLabel("Produkt");
				GridBagConstraints gbc_label = new GridBagConstraints();
				gbc_label.insets = new Insets(0, 0, 5, 5);
				gbc_label.gridx = 0;
				gbc_label.gridy = 1;
				panel.add(label, gbc_label);
			}
			{
				JLabel label = new JLabel("New label");
				GridBagConstraints gbc_label = new GridBagConstraints();
				gbc_label.insets = new Insets(0, 0, 5, 0);
				gbc_label.gridx = 1;
				gbc_label.gridy = 1;
				panel.add(label, gbc_label);
			}
			{
				JLabel label = new JLabel("Nazwa");
				GridBagConstraints gbc_label = new GridBagConstraints();
				gbc_label.insets = new Insets(0, 0, 5, 5);
				gbc_label.gridx = 0;
				gbc_label.gridy = 2;
				panel.add(label, gbc_label);
			}
			{
				JLabel label = new JLabel(storeitem.getName());
				GridBagConstraints gbc_label = new GridBagConstraints();
				gbc_label.insets = new Insets(0, 0, 5, 0);
				gbc_label.gridx = 1;
				gbc_label.gridy = 2;
				panel.add(label, gbc_label);
			}
			{
				JLabel lblIloJednostekDo = new JLabel("Ilo\u015B\u0107 jednostek do usunni\u0119cia");
				GridBagConstraints gbc_lblIloJednostekDo = new GridBagConstraints();
				gbc_lblIloJednostekDo.insets = new Insets(0, 0, 5, 5);
				gbc_lblIloJednostekDo.gridx = 0;
				gbc_lblIloJednostekDo.gridy = 3;
				panel.add(lblIloJednostekDo, gbc_lblIloJednostekDo);
			}
			{
				JLabel label = new JLabel(Integer.toString(storeitem.getAvailable()));
				GridBagConstraints gbc_label = new GridBagConstraints();
				gbc_label.insets = new Insets(0, 0, 5, 0);
				gbc_label.gridx = 1;
				gbc_label.gridy = 3;
				panel.add(label, gbc_label);
			}
			{
				JLabel label = new JLabel("Cena");
				GridBagConstraints gbc_label = new GridBagConstraints();
				gbc_label.insets = new Insets(0, 0, 5, 5);
				gbc_label.gridx = 0;
				gbc_label.gridy = 4;
				panel.add(label, gbc_label);
			}
			{
				JLabel label = new JLabel(Float.toString(storeitem.getPrice()));
				GridBagConstraints gbc_label = new GridBagConstraints();
				gbc_label.insets = new Insets(0, 0, 5, 0);
				gbc_label.gridx = 1;
				gbc_label.gridy = 4;
				panel.add(label, gbc_label);
			}
			{
				JLabel label = new JLabel("Jednostka");
				GridBagConstraints gbc_label = new GridBagConstraints();
				gbc_label.insets = new Insets(0, 0, 5, 5);
				gbc_label.gridx = 0;
				gbc_label.gridy = 5;
				panel.add(label, gbc_label);
			}
			{
				JLabel label = new JLabel(storeitem.getUnit());
				GridBagConstraints gbc_label = new GridBagConstraints();
				gbc_label.insets = new Insets(0, 0, 5, 0);
				gbc_label.gridx = 1;
				gbc_label.gridy = 5;
				panel.add(label, gbc_label);
			}
			{
				JLabel lblNewLabel = new JLabel("Ilo\u015B\u0107 ca\u0142kowika");
				GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
				gbc_lblNewLabel.insets = new Insets(0, 0, 0, 5);
				gbc_lblNewLabel.gridx = 0;
				gbc_lblNewLabel.gridy = 6;
				panel.add(lblNewLabel, gbc_lblNewLabel);
			}
			{
				JLabel lblNewLabel_1 = new JLabel(Integer.toString(storeitem.getCount()));
				GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
				gbc_lblNewLabel_1.gridx = 1;
				gbc_lblNewLabel_1.gridy = 6;
				panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Anuluj");
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
				JButton cancelButton = new JButton("Usu\u0144");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						presenter.onConfirmDeleteItemStoreButtonClick(storeitem);
						setVisible(false);
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
