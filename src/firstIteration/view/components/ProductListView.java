package firstIteration.view.components;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
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

import dto.ProductDTO;
import dto.StoreItemDTO;
import firstIteration.presenter.IProductPresenter;
import firstIteration.presenter.impl.ProductPresenter;
import firstIteration.view.IProductListView;

public class ProductListView extends JFrame implements IProductListView {

	private IProductPresenter presenter;
	private JPanel contentPane;
	private JTable table;
	Object[][] data;

	/**
	 * Create the frame.
	 */
	public ProductListView() {
		//Presenter
		presenter = new ProductPresenter(this);
		initView();
		presenter.onViewCreated();
		
		
	}
	
	private void initView(){
		setTitle("Produkty w magazynie");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		
		table = new JTable();
		table.setRowSelectionAllowed(true);
	
		contentPane.add(table, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.EAST);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		Box verticalBox = Box.createVerticalBox();
		verticalBox.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel.add(verticalBox);
		
		JButton createButton = new JButton("Dodaj");
		createButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		createButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				presenter.onCreateProductClick();
			}
		});
		
		Component rigidArea = Box.createRigidArea(new Dimension(100, 0));
		verticalBox.add(rigidArea);
		verticalBox.add(createButton);
		
		Component verticalStrut = Box.createVerticalStrut(10);
		verticalBox.add(verticalStrut);
		
		JButton editButton = new JButton("Edytuj");
		editButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				presenter.onEditProductClick(table.getSelectedRow());
			}
		});
		editButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		verticalBox.add(editButton);
		
		Component verticalStrut_1 = Box.createVerticalStrut(10);
		verticalBox.add(verticalStrut_1);
		
		JButton deleteButton = new JButton("Usu\u0144");
		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				presenter.onDeleteProductClick(table.getSelectedRow());
			}
		});
		deleteButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		verticalBox.add(deleteButton);
		
	}


	@Override
	public void populateListView(List<ProductDTO> items) {
		ProductTableModel model = new ProductTableModel(items);
		table.setModel(model);	
	}
	

	class ProductTableModel extends AbstractTableModel{
		
		private List<ProductDTO> items;
		private String[] columnNames = { "Id", "Name", "Unit", "Description" };
		
		public ProductTableModel(List<ProductDTO> items) {
			this.items = items;
		}
		@Override
		public int getColumnCount() {
			return columnNames.length;
		}
		@Override
		public String getColumnName(int col) {
		        return columnNames[col];
		    }

		@Override
		public int getRowCount() {
			return items.size();
		}

		@Override
		public Object getValueAt(int arg0, int arg1) {
			ProductDTO productDTO = items.get(arg0);
			switch(arg1){
			
			case 0: 
				return productDTO.getId();
			case 1:
				return productDTO.getName();
			case 2:
				return productDTO.getUnit();
			case 3:
				return productDTO.getDescription();
			default: 
				return "--";
			}
			
			
		}
		
	}
}
