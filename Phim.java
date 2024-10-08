/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.connect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author phu
 */
public class Phim extends javax.swing.JFrame {

    /**
     * Creates new form Phim
     */
    public Phim() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableMain = new javax.swing.JTable();
        btlThem = new javax.swing.JButton();
        btlSua = new javax.swing.JButton();
        btlXoa = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btlMaPhim = new javax.swing.JTextField();
        btlTenPhim = new javax.swing.JTextField();
        btlTheLoai = new javax.swing.JTextField();
        btlThoiLuong = new javax.swing.JTextField();
        btlDaoDien = new javax.swing.JTextField();
        btlDienVien = new javax.swing.JTextField();
        btlNgayKhoiChieu = new javax.swing.JTextField();
        btlNgayKetThuc = new javax.swing.JTextField();
        btlThoat = new javax.swing.JButton();
        btlTimKiem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        tableMain.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã phim", "Tên phim", "Thể loại", "Thời lượng", "Đạo diễn", "Diễn viên", "Ngày khởi chiếu", "Ngày kết thúc"
            }
        ));
        tableMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMainMouseClicked(evt);
            }
        });
        tableMain.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                tableMainComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(tableMain);
        if (tableMain.getColumnModel().getColumnCount() > 0) {
            tableMain.getColumnModel().getColumn(0).setPreferredWidth(40);
            tableMain.getColumnModel().getColumn(2).setPreferredWidth(40);
        }

        btlThem.setText("Thêm");
        btlThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlThemActionPerformed(evt);
            }
        });

        btlSua.setText("Sửa");
        btlSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlSuaActionPerformed(evt);
            }
        });

        btlXoa.setText("Xóa");
        btlXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlXoaActionPerformed(evt);
            }
        });

        jLabel1.setText("Mã phim");

        jLabel2.setText("Tên phim");

        jLabel3.setText("Thể loại");

        jLabel4.setText("Đạo diễn");

        jLabel5.setText("Diễn viên");

        jLabel6.setText("Ngày khởi chiếu");

        jLabel7.setText("Ngày kết thúc");

        jLabel8.setText("Thời lượng");

        btlThoat.setText("Thoát");
        btlThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlThoatActionPerformed(evt);
            }
        });

        btlTimKiem.setText("Tìm kiếm");
        btlTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlTimKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(31, 31, 31)
                        .addComponent(btlMaPhim, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btlThoiLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btlTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btlTenPhim, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btlDaoDien, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btlDienVien, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btlNgayKhoiChieu, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btlNgayKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(116, 116, 116))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(btlThem)
                .addGap(18, 18, 18)
                .addComponent(btlSua)
                .addGap(33, 33, 33)
                .addComponent(btlXoa)
                .addGap(36, 36, 36)
                .addComponent(btlTimKiem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btlThoat)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btlDaoDien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btlDienVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btlNgayKhoiChieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(btlNgayKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btlMaPhim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btlTenPhim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btlTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btlThoiLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btlThem)
                    .addComponent(btlSua)
                    .addComponent(btlXoa)
                    .addComponent(btlTimKiem))
                .addGap(50, 50, 50)
                .addComponent(btlThoat)
                .addGap(55, 55, 55))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ShowDuLieu(){
    try{
        tableMain.removeAll();
        String[] arr = {"Mã phim", "Tên phim", "Thể loại", "Thời lượng", "Đạo diễn", "Diễn viên", "Ngày khởi chiếu", "Ngày kết thúc"};
        DefaultTableModel model = new DefaultTableModel(arr, 0);

        Connection connection = Connect.getConnection();
        if (connection == null) {
            JOptionPane.showMessageDialog(this, "Kết nối cơ sở dữ liệu thất bại!");
            return;
        }
        String query = "SELECT * FROM Phim"; 
        PreparedStatement ps = connection.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            Vector vector = new Vector();
            vector.add(rs.getString("MaPhim"));
            vector.add(rs.getString("TenPhim"));
            vector.add(rs.getString("TheLoai"));
            vector.add(rs.getInt("ThoiLuong")); 
            vector.add(rs.getString("DaoDien"));
            vector.add(rs.getString("DienVien"));
            vector.add(rs.getDate("NgayKhoiChieu")); 
            vector.add(rs.getDate("NgayKetThuc")); 
            model.addRow(vector);
        }
        Connect.closeConnection(connection);
        tableMain.setModel(model);
    }catch(SQLException ex){
        Logger.getLogger(Phim.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    private void btlThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlThemActionPerformed
        // TODO add your handling code here:
          if (btlMaPhim.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Mã phim không được để trống");
        btlMaPhim.requestFocus();
        return;
    } else if (btlTenPhim.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Tên phim không được để trống");
        btlTenPhim.requestFocus();
        return;
    } else if (btlThoiLuong.getText().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Thời lượng không được để trống");
        btlThoiLuong.requestFocus();
        return;
    }

    try {
        Integer.parseInt(btlThoiLuong.getText());
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Lỗi: Thời lượng phải là số.");
        btlThoiLuong.requestFocus();
        return;
    }

    try (Connection connection = Connect.getConnection()) {
        String checkQuery = "SELECT COUNT(*) FROM Phim WHERE MaPhim = ?";
        PreparedStatement checkPs = connection.prepareStatement(checkQuery);
        checkPs.setString(1, btlMaPhim.getText());
        ResultSet checkRs = checkPs.executeQuery();
        checkRs.next();
        int count = checkRs.getInt(1);

        if (count > 0) {
            JOptionPane.showMessageDialog(this, "Mã phim đã tồn tại!");
            btlMaPhim.requestFocus();
            return;
        }

        String insertQuery = "INSERT INTO Phim (MaPhim, TenPhim, TheLoai, ThoiLuong, DaoDien, DienVien, NgayKhoiChieu, NgayKetThuc) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement insertPs = connection.prepareStatement(insertQuery);
        insertPs.setString(1, btlMaPhim.getText());
        insertPs.setString(2, btlTenPhim.getText());
        insertPs.setString(3, btlTheLoai.getText());
        insertPs.setInt(4, Integer.parseInt(btlThoiLuong.getText())); 
        insertPs.setString(5, btlDaoDien.getText());
        insertPs.setString(6, btlDienVien.getText());
        insertPs.setString(7, btlNgayKhoiChieu.getText()); 
        insertPs.setString(8, btlNgayKetThuc.getText()); 

        insertPs.executeUpdate();
        Connect.closeConnection(connection);
        JOptionPane.showMessageDialog(this, "Thêm thành công!");
        ShowDuLieu();

        btlMaPhim.setText("");
        btlTenPhim.setText("");
        btlTheLoai.setText("");
        btlThoiLuong.setText("");
        btlDaoDien.setText("");
        btlDienVien.setText("");
        btlNgayKhoiChieu.setText("");
        btlNgayKetThuc.setText("");

    } catch (SQLException ex) {
        Logger.getLogger(Phim.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(this, "Thêm thất bại! Lỗi: " + ex.getMessage()); 
    }
    }//GEN-LAST:event_btlThemActionPerformed

    private void btlSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlSuaActionPerformed
        // TODO add your handling code here:
          int selectedRow = tableMain.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(null, "Vui lòng chọn một phim để sửa.");
        return;
    }

    String maPhim = tableMain.getModel().getValueAt(selectedRow, 0).toString();

    String tenPhimMoi = btlTenPhim.getText();
    String theLoaiMoi = btlTheLoai.getText();
    int thoiLuong;
    try {
        thoiLuong = Integer.parseInt(btlThoiLuong.getText());
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Lỗi: Thời lượng phải là số nguyên.");
        return;
    }
    String daoDienMoi = btlDaoDien.getText();
    String dienVienMoi = btlDienVien.getText();
    String ngayKhoiChieuMoi = btlNgayKhoiChieu.getText();
    String ngayKetThucMoi = btlNgayKetThuc.getText();

    try (Connection connection = Connect.getConnection()) {
        String query = "UPDATE Phim SET TenPhim = ?, TheLoai = ?, ThoiLuong = ?, DaoDien = ?, DienVien = ?, NgayKhoiChieu = ?, NgayKetThuc = ? WHERE MaPhim = ?";
        PreparedStatement ps = connection.prepareStatement(query);
        ps.setString(1, tenPhimMoi);
        ps.setString(2, theLoaiMoi);
        ps.setInt(3, thoiLuong);
        ps.setString(4, daoDienMoi);
        ps.setString(5, dienVienMoi);
        ps.setString(6, ngayKhoiChieuMoi); 
        ps.setString(7, ngayKetThucMoi); 
        ps.setString(8, maPhim);
        ps.executeUpdate();
        Connect.closeConnection(connection);

        tableMain.setValueAt(tenPhimMoi, selectedRow, 1);
        tableMain.setValueAt(theLoaiMoi, selectedRow, 2);
        tableMain.setValueAt(thoiLuong, selectedRow, 3);
        tableMain.setValueAt(daoDienMoi, selectedRow, 4);
        tableMain.setValueAt(dienVienMoi, selectedRow, 5);
        tableMain.setValueAt(ngayKhoiChieuMoi, selectedRow, 6); 
        tableMain.setValueAt(ngayKetThucMoi, selectedRow, 7); 

        JOptionPane.showMessageDialog(this, "Sửa thành công!");

    } catch (SQLException ex) {
        Logger.getLogger(Phim.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(this, "Sửa thất bại!");
    }

    btlMaPhim.setText("");
    btlTenPhim.setText("");
    btlTheLoai.setText("");
    btlThoiLuong.setText("");
    btlDaoDien.setText("");
    btlDienVien.setText("");
    btlNgayKhoiChieu.setText("");
    btlNgayKetThuc.setText("");
    }//GEN-LAST:event_btlSuaActionPerformed

    private void btlXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlXoaActionPerformed
        // TODO add your handling code here:
         int result = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xóa?");
    if (result == JOptionPane.YES_OPTION) {

        int position = tableMain.getSelectedRow();
        if (position >= 0) {
            String data = tableMain.getModel().getValueAt(position, 0).toString();
            try (Connection connection = Connect.getConnection()) {
                String query = "DELETE FROM Phim WHERE MaPhim = ?"; 
                PreparedStatement ps = connection.prepareStatement(query);
                ps.setString(1, data);
                ps.executeUpdate();
                ShowDuLieu();
                Connect.closeConnection(connection);
                JOptionPane.showMessageDialog(null, "Xóa thành công!");
            } catch (SQLException ex) {
                ex.printStackTrace(); 
                JOptionPane.showMessageDialog(null, "Lỗi khi xóa: " + ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn một hàng để xóa.");
        }
    }
    }//GEN-LAST:event_btlXoaActionPerformed

    private void tableMainComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tableMainComponentShown
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tableMainComponentShown

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        ShowDuLieu();
    }//GEN-LAST:event_formComponentShown

    private void btlThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlThoatActionPerformed
        // TODO add your handling code here:
                                this.dispose();
                // Mở form chính (giả sử bạn có một lớp MainForm)
                Main mainForm = new Main();
                mainForm.setVisible(true);
    }//GEN-LAST:event_btlThoatActionPerformed

    private void tableMainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMainMouseClicked
        // TODO add your handling code here:
            int selectedRow = tableMain.getSelectedRow();

    if (selectedRow >= 0) {
        DefaultTableModel model = (DefaultTableModel) tableMain.getModel();

        // Lấy dữ liệu từ các cột tương ứng và hiển thị lên các trường nhập liệu
        btlMaPhim.setText(model.getValueAt(selectedRow, 0).toString());
        btlTenPhim.setText(model.getValueAt(selectedRow, 1).toString());
        btlTheLoai.setText(model.getValueAt(selectedRow, 2).toString());
        btlDaoDien.setText(model.getValueAt(selectedRow, 3).toString());
        btlDienVien.setText(model.getValueAt(selectedRow, 4).toString());
        btlThoiLuong.setText(model.getValueAt(selectedRow, 5).toString());
        btlNgayKhoiChieu.setText(model.getValueAt(selectedRow, 6).toString());
        btlNgayKetThuc.setText(model.getValueAt(selectedRow, 7).toString());

        // Nếu có các trường nhập liệu khác, bạn có thể thêm tương tự ở đây
    }
    }//GEN-LAST:event_tableMainMouseClicked

    private void btlTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlTimKiemActionPerformed
         // Lấy giá trị từ các trường văn bản
    String maPhim = btlMaPhim.getText().trim();
    String tenPhim = btlTenPhim.getText().trim();
    String daoDien = btlDaoDien.getText().trim();
    String dienVien = btlDienVien.getText().trim();
    String theLoai = btlTheLoai.getText().trim();
    String ngayKhoiChieu = btlNgayKhoiChieu.getText().trim();
    String ngayKetThuc = btlNgayKetThuc.getText().trim();
    String thoiLuong = btlThoiLuong.getText().trim();
    
    // Tạo kết nối tới cơ sở dữ liệu
    try (Connection connection = Connect.getConnection()) { // Sử dụng phương thức kết nối của bạn
        // Tạo câu lệnh SQL
        String sql = "SELECT * FROM Phim WHERE "
                   + "MaPhim LIKE ? AND "
                   + "TenPhim LIKE ? AND "
                   + "DaoDien LIKE ? AND "
                   + "DienVien LIKE ? AND "
                   + "TheLoai LIKE ? AND "
                   + "NgayKhoiChieu LIKE ? AND "
                   + "NgayKetThuc LIKE ? AND "
                   + "ThoiLuong LIKE ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            // Cài đặt tham số cho câu lệnh
            stmt.setString(1, maPhim.isEmpty() ? "%" : maPhim);
            stmt.setString(2, tenPhim.isEmpty() ? "%" : tenPhim);
            stmt.setString(3, daoDien.isEmpty() ? "%" : daoDien);
            stmt.setString(4, dienVien.isEmpty() ? "%" : dienVien);
            stmt.setString(5, theLoai.isEmpty() ? "%" : theLoai);
            stmt.setString(6, ngayKhoiChieu.isEmpty() ? "%" : ngayKhoiChieu);
            stmt.setString(7, ngayKetThuc.isEmpty() ? "%" : ngayKetThuc);
            stmt.setString(8, thoiLuong.isEmpty() ? "%" : thoiLuong);
            
            // Thực thi câu lệnh và nhận kết quả
            try (ResultSet rs = stmt.executeQuery()) {
                // Tạo mô hình dữ liệu cho bảng
                DefaultTableModel model = new DefaultTableModel(new String[]{"MaPhim", "TenPhim", "DaoDien", "DienVien", "TheLoai", "NgayKhoiChieu", "NgayKetThuc", "ThoiLuong"}, 0);
                
                // Đọc dữ liệu từ ResultSet và thêm vào mô hình
                while (rs.next()) {
                    String mp = rs.getString("MaPhim");
                    String tp = rs.getString("TenPhim");
                    String dd = rs.getString("DaoDien");
                    String dv = rs.getString("DienVien");
                    String tl = rs.getString("TheLoai");
                    String nkc = rs.getString("NgayKhoiChieu");
                    String nkt = rs.getString("NgayKetThuc");
                    String tg = rs.getString("ThoiLuong");
                    model.addRow(new Object[]{mp, tp, dd, dv, tl, nkc, nkt, tg});
                }
                
                // Cập nhật bảng với dữ liệu mới
                tableMain.setModel(model);
            }
        }
    } catch (SQLException e) {
        e.printStackTrace(); // Xử lý lỗi
        JOptionPane.showMessageDialog(this, "Lỗi khi tìm kiếm: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btlTimKiemActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Phim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Phim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Phim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Phim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Phim().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField btlDaoDien;
    private javax.swing.JTextField btlDienVien;
    private javax.swing.JTextField btlMaPhim;
    private javax.swing.JTextField btlNgayKetThuc;
    private javax.swing.JTextField btlNgayKhoiChieu;
    private javax.swing.JButton btlSua;
    private javax.swing.JTextField btlTenPhim;
    private javax.swing.JTextField btlTheLoai;
    private javax.swing.JButton btlThem;
    private javax.swing.JButton btlThoat;
    private javax.swing.JTextField btlThoiLuong;
    private javax.swing.JButton btlTimKiem;
    private javax.swing.JButton btlXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableMain;
    // End of variables declaration//GEN-END:variables
}
