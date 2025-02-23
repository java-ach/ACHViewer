/*
 * ACHFileControlDialog.java
 *
 * Created on April 16, 2007, 7:45 PM
 */

package com.ach.editor.view.dialog;

import com.ach.domain.ACHRecord;
import com.ach.domain.ACHRecordAddenda;

/**
 * 
 * @author John
 */
public class ACHAddendaDialog extends ACHDialog {

	static final long serialVersionUID = 0;

	public static final int SAVE_BUTTON = 1;

	public static final int CANCEL_BUTTON = 2;

	private int buttonSelected = CANCEL_BUTTON;

	private ACHRecordAddenda achRecord = null;

	/** Creates new form ACHFileControlDialog */
	public ACHAddendaDialog(java.awt.Frame parent, boolean modal,
			ACHRecordAddenda achRecord) {
		super(parent, modal);
		initComponents();

		setAchRecord(achRecord);

		getRootPane().setDefaultButton(jButtonSave); // Sets the Save
		// button to default
		setLocationRelativeTo(null); // Centers the window on the screen
		loadDialogValues();
	}

	private void loadDialogValues() {
		jTextFieldRecordTypeCode.setText(String.valueOf(achRecord
				.getRecordTypeCode()));
		jComboBoxAddendaTypeCode
				.setSelectedItem(achRecord.getAddendaTypeCode());
		jTextFieldPaymentRelatedInformation.setText(achRecord.getPaymentRelatedInfo());
		jTextFieldAddendaSequenceNumber.setText(achRecord.getAddendaSeqNbr());
		jTextFieldEntryDetailSequenceNbr.setText(achRecord.getEntryDetailSeqNbr());

	}

	private void retrieveDialogValues() {
		achRecord.setRecordTypeCode(ACHRecord.ADDENDA_TYPE);
		achRecord.setAddendaTypeCode((String) jComboBoxAddendaTypeCode
				.getSelectedItem());
		achRecord.setPaymentRelatedInfo(jTextFieldPaymentRelatedInformation.getText());
		achRecord.setAddendaSeqNbr(jTextFieldAddendaSequenceNumber.getText());
		achRecord.setEntryDetailSeqNbr(jTextFieldEntryDetailSequenceNbr.getText());
	}

	/**
	 * @return the achRecord
	 */
	public synchronized ACHRecordAddenda getAchRecord() {
		return achRecord;
	}

	/**
	 * @param achRecord
	 *            the achRecord to set
	 */
	private synchronized void setAchRecord(ACHRecordAddenda achRecord) {
		this.achRecord = achRecord;
	}

	/**
	 * @return the buttonSelected
	 */
	public synchronized int getButtonSelected() {
		return buttonSelected;
	}

	/**
	 * @param buttonSelected
	 *            the buttonSelected to set
	 */
	public synchronized void setButtonSelected(int buttonSelected) {
		this.buttonSelected = buttonSelected;
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	// <editor-fold defaultstate="collapsed" desc=" Generated Code
	// <editor-fold defaultstate="collapsed" desc=" Generated Code
	// <editor-fold defaultstate="collapsed" desc=" Generated Code
	// <editor-fold defaultstate="collapsed" desc=" Generated Code
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jPanelBatchHeader = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldRecordTypeCode = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxAddendaTypeCode = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldPaymentRelatedInformation = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldAddendaSequenceNumber = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldEntryDetailSequenceNbr = new javax.swing.JTextField();
        jPanelButtons = new javax.swing.JPanel();
        jButtonSave = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ACH Edit Addenda");
        setModal(true);
        jLabel1.setText("Record Type: ");

        jTextFieldRecordTypeCode.setEditable(false);
        jTextFieldRecordTypeCode.setText("7");
        jTextFieldRecordTypeCode.setToolTipText("Must be 7");
        jTextFieldRecordTypeCode.setFocusable(false);
        jTextFieldRecordTypeCode.setName("Record Type");

        jLabel2.setText("Addenda Type Code:");

        jComboBoxAddendaTypeCode.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "05", "98", "99" }));
        jComboBoxAddendaTypeCode.setName("Addenda Type Code");

        jLabel3.setText("Payment Related Information");

        jTextFieldPaymentRelatedInformation.setText("ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGH");
        jTextFieldPaymentRelatedInformation.setToolTipText("");
        jTextFieldPaymentRelatedInformation.setInputVerifier(new StringVerifier(0,83));
        jTextFieldPaymentRelatedInformation.setName("Payment Related Information");

        jLabel4.setText("Addenda Sequence Nbr:");

        jTextFieldAddendaSequenceNumber.setText("1234");
        jTextFieldAddendaSequenceNumber.setToolTipText("");
        jTextFieldAddendaSequenceNumber.setInputVerifier(new NumericVerifier(0,9999));
        jTextFieldAddendaSequenceNumber.setName("Check Digit");

        jLabel5.setText("Entry Detail Seq. Nbr:");

        jTextFieldEntryDetailSequenceNbr.setText("1234567");
        jTextFieldEntryDetailSequenceNbr.setToolTipText("");
        jTextFieldEntryDetailSequenceNbr.setInputVerifier(new StringVerifier(1,17));
        jTextFieldEntryDetailSequenceNbr.setName("DFI Account Number");

        javax.swing.GroupLayout jPanelBatchHeaderLayout = new javax.swing.GroupLayout(jPanelBatchHeader);
        jPanelBatchHeader.setLayout(jPanelBatchHeaderLayout);
        jPanelBatchHeaderLayout.setHorizontalGroup(
            jPanelBatchHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBatchHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBatchHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBatchHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBatchHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldRecordTypeCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxAddendaTypeCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPaymentRelatedInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelBatchHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextFieldAddendaSequenceNumber, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextFieldEntryDetailSequenceNbr, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelBatchHeaderLayout.setVerticalGroup(
            jPanelBatchHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBatchHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBatchHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldRecordTypeCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBatchHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxAddendaTypeCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBatchHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldPaymentRelatedInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBatchHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldAddendaSequenceNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBatchHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldEntryDetailSequenceNbr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jButtonSave.setText("Save");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelButtonsLayout = new javax.swing.GroupLayout(jPanelButtons);
        jPanelButtons.setLayout(jPanelButtonsLayout);
        jPanelButtonsLayout.setHorizontalGroup(
            jPanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCancel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelButtonsLayout.setVerticalGroup(
            jPanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButtonSave)
                .addComponent(jButtonCancel))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelBatchHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(jPanelButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelBatchHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents

	private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonCancelActionPerformed
		dispose();
	}// GEN-LAST:event_jButtonCancelActionPerformed

	private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonSaveActionPerformed
		retrieveDialogValues();
		setButtonSelected(SAVE_BUTTON);
		dispose();
	}// GEN-LAST:event_jButtonSaveActionPerformed

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new ACHAddendaDialog(new javax.swing.JFrame(), true,
						new ACHRecordAddenda()).setVisible(true);
			}
		});
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JComboBox jComboBoxAddendaTypeCode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanelBatchHeader;
    private javax.swing.JPanel jPanelButtons;
    private javax.swing.JTextField jTextFieldAddendaSequenceNumber;
    private javax.swing.JTextField jTextFieldEntryDetailSequenceNbr;
    private javax.swing.JTextField jTextFieldPaymentRelatedInformation;
    private javax.swing.JTextField jTextFieldRecordTypeCode;
    // End of variables declaration//GEN-END:variables

}
