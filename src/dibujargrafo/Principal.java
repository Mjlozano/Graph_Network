/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dibujargrafo;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.GroupLayout.Alignment.CENTER;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author jesusdavide
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    ArrayList<Nodo> lista = new ArrayList();
    Nodo seleccionado = null;
    BufferedImage icono = Metodos.cargarImagen("icon");
    BufferedImage iconoSeleccionado = Metodos.cargarImagen("icon-selected");
    BufferedImage icono2 = Metodos.cargarImagen("icon2");
    BufferedImage iconoSeleccionado2 = Metodos.cargarImagen("icon2-selected");
    int xtemp, ytemp, cont = 0;
    boolean with_name = false, first_init = true, green_light = false;

    public Principal() throws IOException {
        initComponents();
        setEnableRec(info, false); //Se inician los componentes del formulario inhabilitados
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        info = new javax.swing.JPanel();
        name_field = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        gender_box = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        agregar = new javax.swing.JButton();
        espanol = new javax.swing.JCheckBox();
        ingles = new javax.swing.JCheckBox();
        frances = new javax.swing.JCheckBox();
        aleman = new javax.swing.JCheckBox();
        mandarin = new javax.swing.JCheckBox();
        todos = new javax.swing.JCheckBox();
        portugues = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 1024, 768));

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setPreferredSize(new java.awt.Dimension(800, 580));
        panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panelMouseReleased(evt);
            }
        });
        panel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                panelComponentShown(evt);
            }
        });
        panel.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                panelPropertyChange(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mapa1.png"))); // NOI18N

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(191, 54, 12));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 58, Short.MAX_VALUE)
        );

        info.setBackground(new java.awt.Color(224, 224, 224));

        name_field.setToolTipText("Nombre");
        name_field.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        name_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_fieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel2.setText("Nombre:");

        gender_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel3.setText("Sexo:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel4.setText("Idiomas:");

        jPanel2.setBackground(new java.awt.Color(191, 54, 12));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );

        agregar.setText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        espanol.setText("Español");
        espanol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                espanolActionPerformed(evt);
            }
        });

        ingles.setText("Inglés");

        frances.setText("Francés");

        aleman.setText("Alemán");

        mandarin.setText("Mandarín");

        todos.setText("Todos");

        portugues.setText("Portugués");

        javax.swing.GroupLayout infoLayout = new javax.swing.GroupLayout(info);
        info.setLayout(infoLayout);
        infoLayout.setHorizontalGroup(
            infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(name_field, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gender_box, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(infoLayout.createSequentialGroup()
                        .addGroup(infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(espanol)
                            .addComponent(aleman))
                        .addGap(10, 10, 10)
                        .addGroup(infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(infoLayout.createSequentialGroup()
                                .addComponent(ingles)
                                .addGap(10, 10, 10)
                                .addComponent(frances))
                            .addGroup(infoLayout.createSequentialGroup()
                                .addComponent(mandarin)
                                .addGap(10, 10, 10)
                                .addComponent(portugues))))
                    .addGroup(infoLayout.createSequentialGroup()
                        .addComponent(todos)
                        .addGap(89, 89, 89)
                        .addComponent(agregar)))
                .addGap(14, 14, 14))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        infoLayout.setVerticalGroup(
            infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(name_field, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gender_box, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(espanol)
                    .addComponent(ingles)
                    .addComponent(frances))
                .addGap(15, 15, 15)
                .addGroup(infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aleman)
                    .addComponent(mandarin)
                    .addComponent(portugues))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(agregar)
                    .addComponent(todos))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(info, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setEnableRec(Component container, boolean enable) {     //Inhabilita y habilita todos los componentes del formulario
        container.setEnabled(enable);
        try {
            Component[] components = ((Container) container).getComponents();
            for (int i = 0; i < components.length; i++) {
                setEnableRec(components[i], enable);
            }
        } catch (ClassCastException e) {

        }
    }

    private void clear() {
        name_field.setText("");

    }

    private void panelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMouseReleased
        xtemp = evt.getX();  //Se obtiene las coordenadas
        ytemp = evt.getY();  //donde se pondra el nodo
        if (Metodos.colisiona(xtemp, ytemp, 50, lista) && cont >= 2) {
            green_light = true;
            setNodeMain(icono, iconoSeleccionado, "noName", 'm', null);
        } else if (Metodos.colisiona(xtemp, ytemp, 50, lista) == false) {
            setEnableRec(info, true);
            with_name = false;
            first_init = false;
        }

    }//GEN-LAST:event_panelMouseReleased

    private void setNodeMain(BufferedImage ico, BufferedImage s_ico, String nam, Character gen, ArrayList<String> idi) {

        int d = 50, r = d / 2;
        int x = xtemp;
        int y = ytemp;

        int ancho = panel.getWidth(), alto = panel.getHeight();
        if (seleccionado == null) {
            seleccionado = Metodos.seleccionar(x, y, d, lista);
            if (seleccionado != null) {
                Metodos.dibujarIcono(s_ico, seleccionado.getX(), seleccionado.getY(), panel);
                System.out.println("Nombre: " + seleccionado.getName());
                System.out.println("Genero: " + seleccionado.getGen());
                System.out.print("Idiomas: ");
                for(String ite : seleccionado.getLeng()){                 
                    System.out.print(ite+", ");
                }
                System.out.println("");
                System.out.println("");
            } else {
                if (Metodos.sePuedeDibujar(x, y, r, ancho, alto)) {
                    if (!Metodos.colisiona(x, y, d, lista)) {
                        int red = (int) (Math.random() * 255);
                        int green = (int) (Math.random() * 255);
                        int blue = (int) (Math.random() * 255);
                        Color c = new Color(red, green, blue);
                        Metodos.dibujarIcono(ico, x, y, panel);
                        lista.add(new Nodo(x, y, d, c, nam, gen, idi));
                    }
                }
            }
        } else {
            Nodo destino = Metodos.seleccionar(x, y, d, lista);
            if (destino != null) {
                Metodos.dibujarLinea(seleccionado.getX(), seleccionado.getY(), destino.getX(), destino.getY(), panel);
                Metodos.dibujarIcono(ico, destino.getX(), destino.getY(), panel);
            }

            Metodos.dibujarIcono(ico, seleccionado.getX(), seleccionado.getY(), panel);
            seleccionado = null;
        }
    }

    private void panelComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_panelComponentShown

    }//GEN-LAST:event_panelComponentShown

    private void panelPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_panelPropertyChange

    }//GEN-LAST:event_panelPropertyChange

    private void name_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_fieldActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        if (name_field.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Llene todos los campos antes de continuar");
        } else {
            if (gender_box.getSelectedItem().toString().equalsIgnoreCase("Masculino")) {
                setNodeMain(icono, iconoSeleccionado, name_field.getText(), 'm', addLang());
                putName();
                cont++;
            } else {
                setNodeMain(icono2, iconoSeleccionado2, name_field.getText(), 'f', addLang());
                putName();
                cont++;
            }

            with_name = true;
            setEnableRec(info, false);
            clear();
        }


    }//GEN-LAST:event_agregarActionPerformed

    private void espanolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_espanolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_espanolActionPerformed

    private void putName() {
        JLabel namelbl = new JLabel(name_field.getText());  //Se crea un nuevo label para mostrar el nombre
        jLabel1.add(namelbl);
        namelbl.setLocation(xtemp - 40, ytemp + 12);
        namelbl.setSize(80, 10);
        namelbl.setHorizontalAlignment(0);
        namelbl.setHorizontalTextPosition(0);
        namelbl.setFont(new Font("Dialog", Font.BOLD, 12));
        namelbl.setBackground(new Color(0, 0, 0, 0));
    }

    private ArrayList<String> addLang() {  //Agrega los idiomas a las persona
        ArrayList<String> idiomas = new ArrayList<String>();
        if (todos.isSelected()) {
            idiomas.add("Español");
            idiomas.add("Inglés");
            idiomas.add("Francés");
            idiomas.add("Alemán");
            idiomas.add("Mandarín");
            idiomas.add("Portugués");
            return (idiomas);
        } else {
            if (espanol.isSelected()) {
                idiomas.add("Español");
            }
            if(ingles.isSelected()){
                idiomas.add("Inglés");
            }
            if(frances.isSelected()){
                idiomas.add("Francés");
            }
            if(aleman.isSelected()){
                idiomas.add("Alemán");
            }
            if(mandarin.isSelected()){
                idiomas.add("Mandarín");
            }
            if(portugues.isSelected()){
                idiomas.add("Portugués");
            }
        }
        return (idiomas);
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Principal().setVisible(true);

                } catch (IOException ex) {
                    Logger.getLogger(Principal.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JCheckBox aleman;
    private javax.swing.JCheckBox espanol;
    private javax.swing.JCheckBox frances;
    private javax.swing.JComboBox<String> gender_box;
    private javax.swing.JPanel info;
    private javax.swing.JCheckBox ingles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JCheckBox mandarin;
    private javax.swing.JTextField name_field;
    private javax.swing.JPanel panel;
    private javax.swing.JCheckBox portugues;
    private javax.swing.JCheckBox todos;
    // End of variables declaration//GEN-END:variables
}
