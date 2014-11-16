package firstIteration.view.components;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dialog.ModalExclusionType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.AbstractTableModel;

import dto.StoreItemDTO;
import firstIteration.presenter.IStoreItemListViewPresenter;
import firstIteration.presenter.impl.StoreItemListViewPresenter;
import firstIteration.view.IStoreItemListView;

public class StoreItemListView extends JFrame implements IStoreItemListView {

	private JPanel contentPane;

	private IStoreItemListViewPresenter presenter;
	private JTable table;
    private List<StoreItemDTO> items;
	Object[][] data;

	/**
	 * Create the frame.
	 */
	public StoreItemListView(List<StoreItemDTO> items) {

		presenter = new StoreItemListViewPresenter(this);
        this.items = items;

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
				int id =1;
				presenter.onConfirmSendButtonClick(id);
			}
		});
		verticalBox.add(btnNewButton);

		Component verticalStrut_3 = Box.createVerticalStrut(20);
		verticalBox.add(verticalStrut_3);

		JButton btnNewButton_1 = new JButton("Zarezerwuj");
		btnNewButton_1.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnNewButton_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				presenter.onReserveButtonClick();
				
			}
		});
		verticalBox.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Zwolnij rezerwacje");
		btnNewButton_2.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnNewButton_2.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				presenter.onReleaseButtonClick();
			}
		});
		verticalBox.add(btnNewButton_2);

		Component verticalStrut = Box.createVerticalStrut(20);
		verticalBox.add(verticalStrut);

		JButton btnNewButton_3 = new JButton("Dodaj");
		btnNewButton_3.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				presenter.onAddItemStoreButtonlClick();
			}
		});
		verticalBox.add(btnNewButton_3);

		Component verticalStrut_1 = Box.createVerticalStrut(20);
		verticalBox.add(verticalStrut_1);

		JButton btnNewButton_4 = new JButton("Edytuj");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int id =2;
				presenter.onEditItemStoreButtonClick(id);
			}
		});
		btnNewButton_4.setAlignmentX(Component.CENTER_ALIGNMENT);
		verticalBox.add(btnNewButton_4);

		Component verticalStrut_2 = Box.createVerticalStrut(20);
		verticalBox.add(verticalStrut_2);

		JButton btnNewButton_5 = new JButton("Usu\u0144");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Object selectedObject = null;
				int selectedRowIndex = table.getSelectedRow();
				if(selectedRowIndex != -1) {
					selectedObject = (Object) table.getModel().getValueAt(selectedRowIndex, 0);
				}
				presenter.onDeleteItemStoreButtonClick((int)selectedObject);
				
			}
		});
		btnNewButton_5.setAlignmentX(Component.CENTER_ALIGNMENT);
		verticalBox.add(btnNewButton_5);
		table = new JTable();
		contentPane.add(table, BorderLayout.CENTER);
		
		presenter.onStoreItemListViewCreated();
	}
	

	@Override
	public void populateListView(List<StoreItemDTO> items) {
		StoreItemListViewTableModel model = new StoreItemListViewTableModel(items);
		table.setModel(model);
		
		// TODO Auto-generated method stub
		
	}
	
	class StoreItemListViewTableModel extends AbstractTableModel{
		
		private Object[][] data;
		String[] columnNames = { "Id", "Name", "Count", "Available", "Unit",
				"Price", "Description" };
		
		public StoreItemListViewTableModel(List<StoreItemDTO> items){
			
			data = new Object[items.size() + 1][columnNames.length];
			data[0] = columnNames;
			int i = 1;
			for (StoreItemDTO item : items) {
				data[i][0] = item.getId();
				data[i][1] = item.getName();
				data[i][2] = item.getCount();
				data[i][3] = item.getAvailable();
				data[i][4] = item.getUnit();
				data[i][5] = item.getPrice();
				data[i][6] = item.getDescription();
				i++;
			}
			
		}

		@Override
		public int getColumnCount() {
			
			return columnNames.length;
		}

		@Override
		public int getRowCount() {
			
			return data.length;
		}

		@Override
		public Object getValueAt(int arg0, int arg1) {
		
			return data[arg0][arg1];
		}
		
	}
	public void ShowReservreStoreItemDialog() {
        int selectedRow = table.getSelectedRow();
        if(selectedRow >= 0) {
            StoreItemDTO storeItemDTO = items.get(selectedRow - 1);
            ReserveStoreItemDialog reserveStoreItemDialog = new ReserveStoreItemDialog(storeItemDTO);
            reserveStoreItemDialog.setVisible(true);
        }

	}

	

	
}
