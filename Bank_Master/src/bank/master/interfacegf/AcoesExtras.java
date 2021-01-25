/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.master.interfacegf;

import bank.master.classes.Conta;
import bank.master.classes.LoginConta;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nairon
 */
public class AcoesExtras extends javax.swing.JFrame {

	/**
	 * Creates new form AcoesExtras
	 */
	public AcoesExtras() throws IOException {
		initComponents();
		Conta cont = new Conta();
		cont.carregarDados(LoginConta.sessao, LoginConta.numConta);
		nomeusuario.setText("");
		nomeusuario.setText("Bem Vindo, " + cont.getNome() + " ! ");
		numeroconta.setText("");
		numeroconta.setText("Conta: " + cont.getNumconta());
		this.setExtendedState(MAXIMIZED_BOTH);

	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPopupMenu1 = new javax.swing.JPopupMenu();
		jPopupMenu2 = new javax.swing.JPopupMenu();
		jButtonSaldo = new javax.swing.JButton();
		jButtonTransfer = new javax.swing.JButton();
		jButtonExtrato = new javax.swing.JButton();
		jLabel4 = new javax.swing.JLabel();
		jButtonSaque = new javax.swing.JButton();
		jButtonSair = new javax.swing.JButton();
		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		nomeusuario = new javax.swing.JLabel();
		numeroconta = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
		setTitle(" ");
		setLocationByPlatform(true);

		jButtonSaldo.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
		jButtonSaldo.setText("Consultar Saldo");
		jButtonSaldo.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonSaldoActionPerformed(evt);
			}
		});

		jButtonTransfer.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
		jButtonTransfer.setText("Transferir");
		jButtonTransfer.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonTransferActionPerformed(evt);
			}
		});

		jButtonExtrato.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
		jButtonExtrato.setText("Consultar Extrato");
		jButtonExtrato.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonExtratoActionPerformed(evt);
			}
		});

		jButtonSaque.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
		jButtonSaque.setText("Sacar");
		jButtonSaque.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonSaqueActionPerformed(evt);
			}
		});

		jButtonSair.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		jButtonSair.setText("Sair da Conta");
		jButtonSair.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonSairActionPerformed(evt);
			}
		});

		jPanel1.setForeground(new java.awt.Color(102, 255, 0));

		jLabel1.setFont(new java.awt.Font("Lucida Calligraphy", 1, 24)); // NOI18N
		jLabel1.setText("Banco Master");

		nomeusuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		nomeusuario.setText("Bem vindo, Nairon Santos");

		numeroconta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		numeroconta.setText("Conta: 09231");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
						.addGroup(jPanel1Layout.createSequentialGroup()
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(nomeusuario))
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(134, 134, 134).addComponent(jLabel1)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 820,
										Short.MAX_VALUE)
								.addComponent(numeroconta)))
						.addContainerGap()));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(18, 18, 18).addComponent(nomeusuario)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(numeroconta).addComponent(jLabel1))
						.addContainerGap(19, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup().addGap(119, 119, 119)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(jButtonExtrato, javax.swing.GroupLayout.PREFERRED_SIZE, 200,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jButtonSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 200,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jButtonSaque, javax.swing.GroupLayout.PREFERRED_SIZE, 200,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(
												jButtonTransfer, javax.swing.GroupLayout.PREFERRED_SIZE, 200,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(133, 133, 133))
				.addGroup(layout.createSequentialGroup().addGroup(layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
								.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(107, 107, 107).addComponent(jLabel4))
						.addGroup(layout.createSequentialGroup().addGap(601, 601, 601).addComponent(jButtonSair,
								javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup().addGap(33, 33, 33).addComponent(jLabel4))
								.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup().addGap(177, 177, 177)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jButtonExtrato, javax.swing.GroupLayout.PREFERRED_SIZE,
														75, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jButtonTransfer, javax.swing.GroupLayout.PREFERRED_SIZE,
														75, javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGroup(layout.createSequentialGroup().addGap(26, 26, 26)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jButtonSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 75,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jButtonSaque, javax.swing.GroupLayout.PREFERRED_SIZE, 75,
														javax.swing.GroupLayout.PREFERRED_SIZE))))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(jButtonSair,
								javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(153, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void jButtonSaldoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonSaldoActionPerformed

		JanelaSaldo saldo = null;
		try {
			saldo = new JanelaSaldo();
		} catch (IOException ex) {
			Logger.getLogger(AcoesExtras.class.getName()).log(Level.SEVERE, null, ex);
		}
		saldo.setVisible(true);
		// this.setEnabled(false);

	}// GEN-LAST:event_jButtonSaldoActionPerformed

	private void jButtonExtratoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonExtratoActionPerformed
		Conta conta = new Conta();
		try {
			conta.carregarDados(LoginConta.sessao, LoginConta.numConta);
		} catch (IOException ex) {
			Logger.getLogger(AcoesExtras.class.getName()).log(Level.SEVERE, null, ex);
		}
		JanelaExtrato extrato = new JanelaExtrato(conta.getExtrato());
		extrato.setVisible(true);
		// this.setEnabled(false);

	}// GEN-LAST:event_jButtonExtratoActionPerformed

	private void jButtonTransferActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonTransferActionPerformed
		JanelaTranferir transferir = new JanelaTranferir();
		transferir.setVisible(true);
		// this.setEnabled(false);

	}// GEN-LAST:event_jButtonTransferActionPerformed

	private void jButtonSaqueActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonSaqueActionPerformed
		JanelaSacar saque = new JanelaSacar();
		saque.setVisible(true);
		// this.setEnabled(false);

	}// GEN-LAST:event_jButtonSaqueActionPerformed

	private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonSairActionPerformed
		LoginConta.sessao = null;
		LoginConta.numConta = 0;

		InicioLogin inic = new InicioLogin();
		inic.setVisible(true);

		hide();

	}// GEN-LAST:event_jButtonSairActionPerformed

	/**
	 * @param args the command line arguments
	 */

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton jButtonExtrato;
	private javax.swing.JButton jButtonSair;
	private javax.swing.JButton jButtonSaldo;
	private javax.swing.JButton jButtonSaque;
	private javax.swing.JButton jButtonTransfer;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPopupMenu jPopupMenu1;
	private javax.swing.JPopupMenu jPopupMenu2;
	private javax.swing.JLabel nomeusuario;
	private javax.swing.JLabel numeroconta;
	// End of variables declaration//GEN-END:variables
}
