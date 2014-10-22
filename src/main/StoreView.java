package main;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.GridBagLayout;
import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.BorderLayout;

import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.BoxLayout;
import javax.swing.Box;

import presenter.IStorePresenter;
import presenter.impl.StorePresenter;

import java.awt.Dialog.ModalExclusionType;

public class StoreView {
	
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
		presenter= new StorePresenter();
		
		
		Box verticalBox = Box.createVerticalBox();
		panel.add(verticalBox);
		
		JButton btnNewButton_1 = new JButton("Produkty magazynowe");
		verticalBox.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Pozycje w magazynie");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							presenter.onStoreItemsButtonsClick();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		verticalBox.add(btnNewButton);
		btnNewButton.setVerticalAlignment(SwingConstants.BOTTOM);
		
		JButton btnNewButton_2 = new JButton("Aktualne zlecenia");
		verticalBox.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Wyloguj");
		verticalBox.add(btnNewButton_3);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
	}

}
