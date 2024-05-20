package com.raven.dashboard;

import com.raven.event.DashboardMenuEvent;
import com.raven.forms.DashboardHome;
import com.raven.forms.DevelopmentPage;
import com.raven.forms.RegisterStudent;
import com.raven.forms.RegisterClasses;
import com.raven.forms.RegisterGrades;
import com.raven.forms.RegisterUsers;
import java.awt.Color;
import com.raven.swing.dashboard.DashboardScrollBar;
import com.sun.org.apache.xpath.internal.XPathAPI;
import javax.swing.JComponent;

public class Dashboard extends javax.swing.JFrame {

    private DashboardHome DashboardHome;
    private RegisterStudent RegisterStudent;
    private DevelopmentPage DevelopmentPage;
    private RegisterClasses RegisterClasses;
    private RegisterGrades RegisterGrades;
    private RegisterUsers RegisterUsers;
  
    
    public Dashboard() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        
        DashboardHome = new DashboardHome();        /* PAGINA 2 */
        RegisterStudent = new RegisterStudent();    /* PAGINA 3 */
        RegisterClasses = new RegisterClasses();    /* PAGINA 4 */
        RegisterGrades = new RegisterGrades();      /* PAGINA 5 */
        RegisterUsers = new RegisterUsers();        /* PAGINA 6 */
        DevelopmentPage = new DevelopmentPage();    /* PAGINA 10 - 13 */
        
        dashboardMenu.initMoving(Dashboard.this);
        dashboardMenu.addEventMenuSelected(new DashboardMenuEvent() {
            
            @Override
            public void selected(int index) {
                if (index == 2) {
                    setForm(DashboardHome);
                } else if (index == 3) {
                    setForm(RegisterStudent);
                } else if (index == 4) {
                    setForm(RegisterClasses);
                } else if (index == 5) {
                    setForm(RegisterGrades);
                } else if (index == 6) {
                    setForm(RegisterUsers); 
                } else if (index == 10 || index == 11 || index == 12 || index == 13){
                    setForm(DevelopmentPage); 
                } else if (index == 14) {
                    System.exit(0);
                }
            }
        });
        setForm(new DashboardHome());
    }

    private void setForm(JComponent com) {
        mainPanel.removeAll();
        mainPanel.add(com);
        mainPanel.repaint();
        mainPanel.revalidate();
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dashboardBorder2 = new com.raven.swing.dashboard.DashboardBorder();
        dashboardMenu = new com.raven.component.dashboard.DashboardMenu();
        dashboardHeader1 = new com.raven.component.dashboard.DashboardHeader();
        mainPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        dashboardBorder2.setBackground(new java.awt.Color(242, 242, 242));
        dashboardBorder2.setPreferredSize(new java.awt.Dimension(1350, 800));

        mainPanel.setOpaque(false);
        mainPanel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout dashboardBorder2Layout = new javax.swing.GroupLayout(dashboardBorder2);
        dashboardBorder2.setLayout(dashboardBorder2Layout);
        dashboardBorder2Layout.setHorizontalGroup(
            dashboardBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardBorder2Layout.createSequentialGroup()
                .addComponent(dashboardMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(dashboardBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dashboardHeader1, javax.swing.GroupLayout.DEFAULT_SIZE, 975, Short.MAX_VALUE)
                    .addGroup(dashboardBorder2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        dashboardBorder2Layout.setVerticalGroup(
            dashboardBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashboardMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
            .addGroup(dashboardBorder2Layout.createSequentialGroup()
                .addComponent(dashboardHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashboardBorder2, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashboardBorder2, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

 
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing.dashboard.DashboardBorder dashboardBorder2;
    private com.raven.component.dashboard.DashboardHeader dashboardHeader1;
    private com.raven.component.dashboard.DashboardMenu dashboardMenu;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
}
