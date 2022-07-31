package digital_clock;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;

/**
 *
 * @author Rifqi Dzulfikar
 */
public class Main extends javax.swing.JFrame {

    private final int DELAY = 1000;

    public Main() {
        initComponents();
        getContentPane().setBackground(Color.BLACK);
        Timer timer = new Timer(DELAY, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date NOW = new Date();

                // Days in Indonesian
                lbDay.setText(TimeCustom.getNameOfDays(new SimpleDateFormat("EEEE").format(NOW)));

                // Format 24 hours
                lbTime.setText(new SimpleDateFormat("HH:mm:ss").format(NOW));

                // Format 12 hours
//                lbTime.setText(new SimpleDateFormat("hh:mm:ss aa").format(NOW));

                // Date
                String date = new SimpleDateFormat("dd").format(NOW);
                // Month in Indonesian
                String month = TimeCustom.getNameOfMonths(new SimpleDateFormat("MMMM").format(NOW));
                String year = new SimpleDateFormat("yyyy").format(NOW);

                lbDate.setText(String.format("%s, %s %s", date, month, year));
            }
        });
        timer.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbDay = new javax.swing.JLabel();
        lbTime = new javax.swing.JLabel();
        lbDate = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbDay.setFont(new java.awt.Font("Digital-7", 1, 36)); // NOI18N
        lbDay.setForeground(new java.awt.Color(0, 255, 0));
        lbDay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDay.setText("DAY");

        lbTime.setFont(new java.awt.Font("Digital-7", 1, 36)); // NOI18N
        lbTime.setForeground(new java.awt.Color(0, 255, 0));
        lbTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTime.setText("HH:mm:ss");

        lbDate.setFont(new java.awt.Font("Digital-7", 1, 36)); // NOI18N
        lbDate.setForeground(new java.awt.Color(0, 255, 0));
        lbDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDate.setText("date");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbDay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lbTime, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
            .addComponent(lbDate, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbDay, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(lbTime, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(lbDate, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbDate;
    private javax.swing.JLabel lbDay;
    private javax.swing.JLabel lbTime;
    // End of variables declaration//GEN-END:variables
}
