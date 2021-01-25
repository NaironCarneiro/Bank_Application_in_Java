/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank.master.interfacegf;

import bank.master.classes.Conta;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Nairon
 */
public class JanelaConfirmaTransferencia extends javax.swing.JFrame {
	int numer = 0;
	double value = 0;

	/**
	 * Creates new form Transacoesbanco
	 */
	public JanelaConfirmaTransferencia(ArrayList<String> transferencia, int numero, double valor) {
		initComponents();
		destino.setText("Destinatário : " + transferencia.get(0));
		numeroConta.setText("Número da conta : " + transferencia.get(2));
		this.numer = Integer.parseInt(transferencia.get(2));
		this.value = valor;
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

		jLabel1 = new javax.swing.JLabel();
		confirmaTransferencia = new javax.swing.JButton();
		destino = new javax.swing.JLabel();
		numeroConta = new javax.swing.JLabel();
		cancelar = new javax.swing.JButton();

		setLocation(new java.awt.Point(350, 100));

		jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jLabel1.setText("Confirme as informações do destinatário");

		confirmaTransferencia.setText("Confirmar");
		confirmaTransferencia.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				confirmaTransferenciaActionPerformed(evt);
			}
		});

		cancelar.setText("Cancelar");
		cancelar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				cancelarActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				layout.createSequentialGroup().addContainerGap().addGroup(layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
						.addComponent(numeroConta, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(destino, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(layout.createSequentialGroup().addGap(0, 20, Short.MAX_VALUE).addComponent(jLabel1))
						.addGroup(layout.createSequentialGroup().addGap(36, 36, 36).addComponent(cancelar)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(confirmaTransferencia).addGap(13, 13, 13)))
						.addGap(26, 26, 26)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jLabel1).addGap(26, 26, 26)
						.addComponent(destino, javax.swing.GroupLayout.PREFERRED_SIZE, 54,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(43, 43, 43)
						.addComponent(numeroConta, javax.swing.GroupLayout.PREFERRED_SIZE, 49,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(confirmaTransferencia).addComponent(cancelar))
						.addContainerGap()));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void confirmaTransferenciaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_confirmaTransferenciaActionPerformed

		Conta conta = new Conta();
		try {
			String mensagem = conta.transferir(numer, value, true).get(0);
			JOptionPane.showMessageDialog(null, mensagem);
		} catch (IOException ex) {
			Logger.getLogger(JanelaConfirmaTransferencia.class.getName()).log(Level.SEVERE, null, ex);
		}
		dispose();
	}// GEN-LAST:event_confirmaTransferenciaActionPerformed

	private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cancelarActionPerformed
		dispose();
	}// GEN-LAST:event_cancelarActionPerformed

	/**
	 * @param args the command line arguments
	 */

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton cancelar;
	private javax.swing.JButton confirmaTransferencia;
	private javax.swing.JLabel destino;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel numeroConta;
	// End of variables declaration//GEN-END:variables
}