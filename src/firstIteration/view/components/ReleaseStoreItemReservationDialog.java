package firstIteration.view.components;

import dto.StoreItemDTO;
import firstIteration.presenter.IStoreItemListViewPresenter;
import firstIteration.presenter.impl.StoreItemListViewPresenter;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReleaseStoreItemReservationDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
    private JTextField textField;
    private IStoreItemListViewPresenter storeItemListViewPresenter;
	/**
	 * Create the dialog.
	 */
	public ReleaseStoreItemReservationDialog(StoreItemListViewPresenter storeItemListViewPresenter, final StoreItemDTO dto) {
		setBounds(100, 100, 450, 300);
        this.storeItemListViewPresenter = storeItemListViewPresenter;
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
        {
            JLabel lblNewLabel_11 = new JLabel("Zwolnij rezerwacje nast\u0119puj\u0105cej ilo\u015Bci ");
            lblNewLabel_11.setBounds(131, 65, 300, 14);
            contentPanel.add(lblNewLabel_11);
        }
        {
            textField = new JTextField();
            textField.setBounds(141, 97, 131, 20);
            contentPanel.add(textField);
            textField.setColumns(10);
        }
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
                        String result = ReleaseStoreItemReservationDialog.this.storeItemListViewPresenter.
                                onConfimReleaseStoreItemReservationButtonClicked(textField.getText(), dto);
                        if(result == null) {
                            setVisible(false);
                        }
                        else {
                            JOptionPane.showMessageDialog(ReleaseStoreItemReservationDialog.this, result, "Błąd", JOptionPane.ERROR_MESSAGE);
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
