package firstIteration.view.components;

import dto.StoreItemDTO;
import firstIteration.presenter.IStoreItemListViewPresenter;
import firstIteration.presenter.impl.StoreItemListViewPresenter;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ReserveStoreItemDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
    private IStoreItemListViewPresenter storeItemListViewPresenter;

	/**
	 * Create the dialog.
	 */
	public ReserveStoreItemDialog(StoreItemListViewPresenter storeItemListViewPresenter, final StoreItemDTO dto) {
		setBounds(100, 100, 450, 300);
        this.storeItemListViewPresenter = storeItemListViewPresenter;
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
            {
			JLabel lblId = new JLabel("Id");
			lblId.setBounds(25, 11, 100, 14);
			contentPanel.add(lblId);
		}
		{
			JLabel lblNewLabel = new JLabel("Produkt");
			lblNewLabel.setBounds(25, 36, 100, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Nazwa");
			lblNewLabel_1.setBounds(25, 61, 100, 14);
			contentPanel.add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Dost\u0119pna ilo\u015B\u0107");
			lblNewLabel_2.setBounds(25, 86, 100, 14);
			contentPanel.add(lblNewLabel_2);
		}
		{
			JLabel lblNewLabel_3 = new JLabel("Cena");
			lblNewLabel_3.setBounds(25, 111, 100, 14);
			contentPanel.add(lblNewLabel_3);
		}
		{
			JLabel lblNewLabel_4 = new JLabel("Jednostka");
			lblNewLabel_4.setBounds(25, 136, 100, 14);
			contentPanel.add(lblNewLabel_4);
		}
		{
			JLabel lblNewLabel_5 = new JLabel(String.valueOf(dto.getId()));
			lblNewLabel_5.setBounds(140, 11, 200, 14);
			contentPanel.add(lblNewLabel_5);
		}
		{
			JLabel lblNewLabel_6 = new JLabel(dto.getDescription());
			lblNewLabel_6.setBounds(140, 36, 200, 14);
			contentPanel.add(lblNewLabel_6);
		}
		{
			JLabel lblNewLabel_7 = new JLabel(dto.getName());
			lblNewLabel_7.setBounds(140, 61, 200, 14);
			contentPanel.add(lblNewLabel_7);
		}
		{
			JLabel lblNewLabel_8 = new JLabel(String.valueOf(dto.getAvailable()));
			lblNewLabel_8.setBounds(140, 86, 200, 14);
			contentPanel.add(lblNewLabel_8);
		}
		{
			JLabel lblNewLabel_9 = new JLabel(String.valueOf(dto.getPrice()));
			lblNewLabel_9.setBounds(140, 111, 200, 14);
			contentPanel.add(lblNewLabel_9);
		}
		{
			JLabel lblNewLabel_10 = new JLabel(dto.getUnit());
			lblNewLabel_10.setBounds(140, 136, 200, 14);
			contentPanel.add(lblNewLabel_10);
		}
		{
			JLabel lblNewLabel_11 = new JLabel("Potwierdz rezerwacje nast\u0119puj\u0105cej ilo\u015Bci ");
			lblNewLabel_11.setBounds(101, 161, 400, 14);
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
                okButton.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        String result = ReserveStoreItemDialog.this.storeItemListViewPresenter.onConfimReserveStoreItemButtonClicked(textField.getText(), dto);
                        if(result == null) {
                            setVisible(false);
                        }
                        else {
                            JOptionPane.showMessageDialog(ReserveStoreItemDialog.this, result, "Błąd", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                });
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						setVisible(false);
					}
				});
				buttonPane.add(cancelButton);
			}
		}
	}
}
