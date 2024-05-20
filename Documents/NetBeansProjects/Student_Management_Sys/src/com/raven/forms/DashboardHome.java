package com.raven.forms;

import com.raven.model.Model_DashboardCard;
import javax.swing.ImageIcon;
import com.raven.model.Model_DashboardStatus;
import com.raven.swing.dashboard.DashboardScrollBar;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JScrollPane;



public class DashboardHome extends javax.swing.JPanel {

    public DashboardHome() {
        initComponents();
        
        
        // AQUI VAI O SELECT DO BD PARA INFORMAÇÕES EXTRAS - QUANTIDADE DE CADA USUARIO NO SISTEMA (SEGUE O MOLDE)
        
        Card1.setData(new Model_DashboardCard(new ImageIcon(getClass().getResource("/com/raven/icon/administrador.png")), "Admins", "10", "Admins cadastrados no sistema"));
        Card2.setData(new Model_DashboardCard(new ImageIcon(getClass().getResource("/com/raven/icon/leitor.png")), "Leitores", "8", "Leitores cadastrados no sistema"));
        Card3.setData(new Model_DashboardCard(new ImageIcon(getClass().getResource("/com/raven/icon/alunos.png")), "Alunos", "350", "Alunos cadastrados no sistema"));
        
   
        dsTable.setVerticalScrollBar(new DashboardScrollBar());
        dsTable.getVerticalScrollBar().setBackground(Color.WHITE);
        dsTable.getViewport().setBackground(Color.WHITE);
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        dsTable.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);
        
        // AQUI VAI UM SELECT ESPECIAL PARA SABER OS USUARIOS QUE ESTAO CADASTRADOS NO SISTEMA, ENTAO DEVE SER VISTO COMO VAI TROCAR OS DADOS (SEGUE O MOLDE)
       
        DashTable.addRow(new Object[]{"Mike Bhand", "mikebhand@gmail.com", "25 Apr,2018", Model_DashboardStatus.ADMIN});
        DashTable.addRow(new Object[]{"Andrew Strauss", "andrewstrauss@gmail.com",  "25 Apr,2018", Model_DashboardStatus.LEITOR});
        DashTable.addRow(new Object[]{"Ross Kopelman", "rosskopelman@gmail.com",  "25 Apr,2018", Model_DashboardStatus.ESTUDANTE});
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelCards = new javax.swing.JLayeredPane();
        Card1 = new com.raven.component.dashboard.DashboardCard();
        Card2 = new com.raven.component.dashboard.DashboardCard();
        Card3 = new com.raven.component.dashboard.DashboardCard();
        dashboardBorder1 = new com.raven.swing.dashboard.DashboardBorder();
        jLabel1 = new javax.swing.JLabel();
        dsTable = new javax.swing.JScrollPane();
        DashTable = new com.raven.swing.dashboard.dashboardTables.DashboardTable();

        setBackground(new java.awt.Color(242, 242, 242));

        PanelCards.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        Card1.setColor1(new java.awt.Color(55, 159, 60));
        Card1.setColor2(new java.awt.Color(22, 84, 20));
        PanelCards.add(Card1);

        Card2.setColor1(new java.awt.Color(255, 165, 0));
        Card2.setColor2(new java.awt.Color(205, 114, 50));
        PanelCards.add(Card2);

        Card3.setColor1(new java.awt.Color(14, 70, 167));
        Card3.setColor2(new java.awt.Color(81, 31, 244));
        PanelCards.add(Card3);

        dashboardBorder1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(127, 127, 127));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(172, 172, 172));
        jLabel1.setText("Dashboard");

        dsTable.setBorder(null);
        dsTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        DashTable.setBackground(new java.awt.Color(255, 255, 255));
        DashTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Email", "Criado em", "Tipo de usuário"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        dsTable.setViewportView(DashTable);
        if (DashTable.getColumnModel().getColumnCount() > 0) {
            DashTable.getColumnModel().getColumn(0).setResizable(false);
        }

        javax.swing.GroupLayout dashboardBorder1Layout = new javax.swing.GroupLayout(dashboardBorder1);
        dashboardBorder1.setLayout(dashboardBorder1Layout);
        dashboardBorder1Layout.setHorizontalGroup(
            dashboardBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardBorder1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(dashboardBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dashboardBorder1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(dsTable))
                .addGap(20, 20, 20))
        );
        dashboardBorder1Layout.setVerticalGroup(
            dashboardBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardBorder1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addComponent(dsTable, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dashboardBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelCards, javax.swing.GroupLayout.DEFAULT_SIZE, 821, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(PanelCards, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(dashboardBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.component.dashboard.DashboardCard Card1;
    private com.raven.component.dashboard.DashboardCard Card2;
    private com.raven.component.dashboard.DashboardCard Card3;
    private com.raven.swing.dashboard.dashboardTables.DashboardTable DashTable;
    private javax.swing.JLayeredPane PanelCards;
    private com.raven.swing.dashboard.DashboardBorder dashboardBorder1;
    private javax.swing.JScrollPane dsTable;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
