package algoritmo.lz.demo.gui;

import algoritmo.lz.demo.src.Compressor;
import algoritmo.lz.demo.src.Descompressor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.Timer;

public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        setCurrentDirectory();
    }

    private void setCurrentDirectory() {
        String currentDir = System.getProperty("user.dir");
        String fileSeparator = System.getProperty("file.separator");
        fileChooser.setCurrentDirectory(new File(currentDir + fileSeparator + "src" + fileSeparator + "file" + fileSeparator));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        btImportar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        btEnviar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        textAreaResultado = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        textAreaDicionario = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        textAreaMsg = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btLimpar = new javax.swing.JButton();
        imageDocument = new javax.swing.JLabel();
        btComprimir = new javax.swing.JButton();

        fileChooser.setFileFilter(new CustomFilter());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Algoritmo LZ");
        setResizable(false);

        btImportar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Text-icon.png"))); // NOI18N
        btImportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btImportarActionPerformed(evt);
            }
        });

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        textArea.setEditable(false);
        textArea.setColumns(20);
        textArea.setLineWrap(true);
        textArea.setRows(5);
        textArea.setWrapStyleWord(true);
        jScrollPane1.setViewportView(textArea);

        btEnviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/download-icon.png"))); // NOI18N
        btEnviar.setToolTipText("");
        btEnviar.setEnabled(false);
        btEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEnviarActionPerformed(evt);
            }
        });

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        textAreaResultado.setEditable(false);
        textAreaResultado.setColumns(20);
        textAreaResultado.setLineWrap(true);
        textAreaResultado.setRows(5);
        textAreaResultado.setWrapStyleWord(true);
        jScrollPane2.setViewportView(textAreaResultado);

        textAreaDicionario.setEditable(false);
        textAreaDicionario.setColumns(20);
        textAreaDicionario.setLineWrap(true);
        textAreaDicionario.setRows(5);
        textAreaDicionario.setWrapStyleWord(true);
        jScrollPane3.setViewportView(textAreaDicionario);

        textAreaMsg.setEditable(false);
        textAreaMsg.setColumns(20);
        textAreaMsg.setLineWrap(true);
        textAreaMsg.setRows(5);
        textAreaMsg.setWrapStyleWord(true);
        jScrollPane4.setViewportView(textAreaMsg);

        jLabel1.setText("Texto Original");

        jLabel2.setText("Dicionário");

        jLabel3.setText("Texto Comprimido");

        jLabel4.setText("Texto Descomprimido");

        btLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Actions-edit-clear-icon.png"))); // NOI18N
        btLimpar.setEnabled(false);
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        imageDocument.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Actions-document-edit-icon (1).png"))); // NOI18N

        btComprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Folder-Archive-zip-icon.png"))); // NOI18N
        btComprimir.setEnabled(false);
        btComprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btComprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btImportar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btComprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(imageDocument, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btComprimir, btImportar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btImportar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btComprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(imageDocument, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1157, 593));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btImportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btImportarActionPerformed
        int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
//            System.out.println("length " + file.length() + " bytes");
            try {
                textArea.read(new FileReader(file.getAbsolutePath()), null);
                btComprimir.setEnabled(true);
            } catch (IOException ex) {
                System.out.println("problem accessing file" + file.getAbsolutePath());
            }
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_btImportarActionPerformed

    private void btEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEnviarActionPerformed
        this.getContentPane().add(new Animacao(imageDocument, false));
    }//GEN-LAST:event_btEnviarActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        textArea.setText("");
        textAreaMsg.setText("");
        textAreaDicionario.setText("");
        textAreaResultado.setText("");
        btEnviar.setEnabled(false);
        btLimpar.setEnabled(false);
        btComprimir.setEnabled(false);
        imageDocument.setBounds(0, 200, 700, 546);
        imageDocument.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Actions-document-edit-icon (1).png"))); // NOI18N
    }//GEN-LAST:event_btLimparActionPerformed

    private void btComprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btComprimirActionPerformed
        compressor = new Compressor(textArea.getText());
        mensagemComprimida = compressor.comprimir();

        this.getContentPane().add(new Animacao(imageDocument, true));
    }//GEN-LAST:event_btComprimirActionPerformed

    private class Animacao extends JComponent implements ActionListener {

        private final JLabel jLabel;
        private int cont;
        private final Boolean importar;

        public Animacao(JLabel jLabel, Boolean importar) {
            this.jLabel = jLabel;
            this.importar = importar;
            cont = jLabel.getX();
            Timer t = new Timer(100, this);
            t.start();
        }

        @Override
        public void actionPerformed(ActionEvent evt) {
            if (importar) {
                if (cont < this.getRootPane().getWidth() / 2) {
                    cont += 10;
                    jLabel.setBounds(cont, 200, 700, 546);
                } else {
                    imageDocument.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/osd-archive-rar-icon (3).png")));
                    ((Timer) evt.getSource()).stop();
                    textAreaDicionario.setText(compressor.getDicionario().toString());
                    textAreaMsg.setText(mensagemComprimida);
                    btEnviar.setEnabled(true);
                    btLimpar.setEnabled(true);
                }
            } else {
                if (cont < this.getRootPane().getWidth()) {
                    cont += 10;
                    jLabel.setBounds(cont, 200, 700, 546);
                } else {
                    ((Timer) evt.getSource()).stop();
                    descompressor = new Descompressor(compressor.getDicionario());
                    textAreaResultado.setText(descompressor.descomprimir(mensagemComprimida));
                }
            }
        }
    }
    private String mensagemComprimida;
    private Compressor compressor;
    private Descompressor descompressor;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btComprimir;
    private javax.swing.JButton btEnviar;
    private javax.swing.JButton btImportar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JLabel imageDocument;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea textArea;
    private javax.swing.JTextArea textAreaDicionario;
    private javax.swing.JTextArea textAreaMsg;
    private javax.swing.JTextArea textAreaResultado;
    // End of variables declaration//GEN-END:variables
}
