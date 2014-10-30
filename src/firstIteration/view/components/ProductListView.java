package firstIteration.view.components;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import firstIteration.presenter.IProductPresenter;
import firstIteration.presenter.impl.ProductPresenter;
import firstIteration.view.IProductListView;

public class ProductListView extends JFrame implements IProductListView {

	private IProductPresenter presenter;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public ProductListView() {
		//Presenter
		presenter = new ProductPresenter(this);
		
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

	@Override
	public void ShowCreateProductDialog() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ShowEditProductDialog() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ShowDeleteProductDialog() {
		// TODO Auto-generated method stub
		
	}

}
