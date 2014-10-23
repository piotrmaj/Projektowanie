package main;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dialog.ModalExclusionType;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import presenter.IStoreItemListViewPresenter;
import view.IStoreItemListView;
import javax.swing.JTable;

public class StoreItemListView extends JFrame implements IStoreItemListView {

	private JPanel contentPane;
	
	private IStoreItemListViewPresenter presenter;
	private JTable table;


	/**
	 * Create the frame.
	 */
	public StoreItemListView() {

		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.EAST);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		Box verticalBox = Box.createVerticalBox();
		verticalBox.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel.add(verticalBox);
		
		JButton btnNewButton = new JButton("potwierd\u017A wys\u0142anie");
		btnNewButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				presenter.onConfirmSendButtonClick();		
			}
		});
		verticalBox.add(btnNewButton);
		
		Component verticalStrut_3 = Box.createVerticalStrut(20);
		verticalBox.add(verticalStrut_3);
		
		JButton btnNewButton_1 = new JButton("Zarezerwuj");
		btnNewButton_1.setAlignmentX(Component.CENTER_ALIGNMENT);
		verticalBox.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Zwolnij rezerwacje");
		btnNewButton_2.setAlignmentX(Component.CENTER_ALIGNMENT);
		verticalBox.add(btnNewButton_2);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		verticalBox.add(verticalStrut);
		
		JButton btnNewButton_3 = new JButton("Dodaj");
		btnNewButton_3.setAlignmentX(Component.CENTER_ALIGNMENT);
		verticalBox.add(btnNewButton_3);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		verticalBox.add(verticalStrut_1);
		
		JButton btnNewButton_4 = new JButton("Edytuj");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				presenter.onEditItemStoreButtonClick();
			}
		});
		btnNewButton_4.setAlignmentX(Component.CENTER_ALIGNMENT);
		verticalBox.add(btnNewButton_4);
		
		Component verticalStrut_2 = Box.createVerticalStrut(20);
		verticalBox.add(verticalStrut_2);
		
		JButton btnNewButton_5 = new JButton("Usu\u0144");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					presenter.onDeleteItemStoreButtonClick();;
			}
		});
		btnNewButton_5.setAlignmentX(Component.CENTER_ALIGNMENT);
		verticalBox.add(btnNewButton_5);
		
		table = new JTable();
		contentPane.add(table, BorderLayout.CENTER);
	}


	@Override
	public void ShowConfirmSendingDialog() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfirmSendingStoreItemDialog confirmDialog = new ConfirmSendingStoreItemDialog();
					confirmDialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	@Override
	public void ShowAddItemDialog() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddEditStoreItemDialog addEditStoreItemDialog = new AddEditStoreItemDialog();
					addEditStoreItemDialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}


	@Override
	public void ShowEditItemDialog() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddEditStoreItemDialog addEditStoreItemDialog = new AddEditStoreItemDialog();
					addEditStoreItemDialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}


	@Override
	public void ShowDeleteStoreItemDialog() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteStoreItemDialog deleteStoreItemDialog = new DeleteStoreItemDialog();
					deleteStoreItemDialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}


	@Override
	public void ShowReservreStoreItemDialog() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void ShowUnreserbeStoreItemDialog() {
		// TODO Auto-generated method stub
		
	}

}
