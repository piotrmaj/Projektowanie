package main;

import java.awt.Dialog.ModalExclusionType;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import presenter.IStorePresenter;
import presenter.impl.StorePresenter;
import view.IStoreView;
import dto.ProductDTO;
import dto.StoreItemDTO;

public class StoreView implements IStoreView{
	
	private JFrame frame;
	IStorePresenter presenter;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StoreView window = new StoreView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StoreView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		
		// PRESENTER
		presenter= new StorePresenter(this);
		
		
		Box verticalBox = Box.createVerticalBox();
		panel.add(verticalBox);
		
		JButton btnNewButton_1 = new JButton("Produkty magazynowe");
		verticalBox.add(btnNewButton_1);
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				presenter.onProductsButtonClick();
			}
		});
		
		JButton btnNewButton = new JButton("Pozycje w magazynie");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				presenter.onStoreItemsButtonsClick();
				
			}
		});
		verticalBox.add(btnNewButton);
		btnNewButton.setVerticalAlignment(SwingConstants.BOTTOM);
		
		JButton btnNewButton_2 = new JButton("Aktualne zlecenia");
		verticalBox.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Wyloguj");
		verticalBox.add(btnNewButton_3);
		
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				presenter.onCurrentOrdersButtonClick();
			}
		});
		
		
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				presenter.onLogOutButtonClick();
			}
		});
		
	}
	
	@Override
	public void ShowCurrentOrderListView() {
		return;
	}

	@Override
	public void CloseStoreView() {
		this.frame.dispose();
	}

	@Override
	public void ShowProductListView(List<ProductDTO> products) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductListView magazine = new ProductListView();
					magazine.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	@Override
	public void ShowStoreItemListView(final List<StoreItemDTO> storeItems) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StoreItemListView magazine = new StoreItemListView(storeItems);
					magazine.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

}
