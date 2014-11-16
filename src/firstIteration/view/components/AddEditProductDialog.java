package firstIteration.view.components;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;



import dto.ProductDTO;
import firstIteration.presenter.IProductPresenter;
import firstIteration.presenter.impl.ProductPresenter;

public class AddEditProductDialog  extends JDialog{

	private final JPanel contentPanel = new JPanel();
	private JTextField nameTextField;
	private JTextField unitTextField;
	private JTextField DescriptionTextField;

	ProductDTO product;
	IProductPresenter presenter;
	private boolean edit;

	public AddEditProductDialog(ProductPresenter productPresenter) {
		this.presenter = productPresenter;
		initView();
		edit = false;
		
	}

	private void initView() {
		setBounds(200, 200, 250, 200);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.PAGE_AXIS));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		{
			JLabel lblNewLabel = new JLabel("Nazwa");
			contentPanel.add(lblNewLabel, "2, 2, right, default");
		}
		{
			nameTextField = new JTextField();
			contentPanel.add(nameTextField, "4, 2, fill, default");
			nameTextField.setColumns(10);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Jednstka");
			contentPanel.add(lblNewLabel_1, "2, 4, right, default");
		}
		{
			unitTextField = new JTextField();
			contentPanel.add(unitTextField, "4, 4, fill, default");
			unitTextField.setColumns(10);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Opis");
			contentPanel.add(lblNewLabel_2, "2, 6, right, default");
		}
		{
			DescriptionTextField = new JTextField();
			contentPanel.add(DescriptionTextField, "4, 6, fill, default");
			DescriptionTextField.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Zapisz");
				okButton.addActionListener(new ActionListener() {
					

					public void actionPerformed(ActionEvent arg0) {
						ProductDTO returnProduct = new ProductDTO();
						returnProduct.setName(nameTextField.getText());
						returnProduct.setUnit(unitTextField.getText());
						returnProduct.setDescription(DescriptionTextField.getText());
						
						if(edit){
							returnProduct.setId(product.getId());
							presenter.onConfirmEditProductClick(returnProduct);
						}
						else{
							presenter.onConfirmCreateProductClick(returnProduct);
						}
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

	public void setProduct(ProductDTO product2) {
		this.product = product2;
		edit = true;
		nameTextField.setText(product2.getName());
		unitTextField.setText(product2.getUnit());
		DescriptionTextField.setText(product2.getDescription());
	}

}
