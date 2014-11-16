package firstIteration.view.components;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import dto.ProductDTO;
import firstIteration.presenter.IProductPresenter;
import firstIteration.presenter.impl.ProductPresenter;

public class DeleteProductDialog extends JDialog {
	
	private final JPanel contentPanel = new JPanel();
	private JLabel messageLabel;
	
	private ProductDTO product;
	private IProductPresenter presenter;

	public DeleteProductDialog(IProductPresenter productPresenter) {
		this.presenter = productPresenter;
		initView();
		// TODO Auto-generated constructor stub
	}
	
	private void initView() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			 messageLabel = new JLabel("Czy na pewno chcesz usunac produkt?");
			messageLabel.setHorizontalAlignment(SwingConstants.CENTER);
			contentPanel.add(messageLabel);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Usu\u0144");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						presenter.onConfirmDeleteProductClick(product.getId());
						setVisible(false);
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Anuluj");
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

	public void setProduct(ProductDTO product){
		this.product = product;
		messageLabel.setText("Czy na pewno chcesz usunac produkt o nazwie: " + product.getName() +  " ?");
	}

}
