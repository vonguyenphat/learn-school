package view;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.SanPham;
import model.SanPhamNhapKhau;
import model.SanPhamXuatKhau;
import services.SanPhamServices;
import util.UtilFile;

public class SanPhamView extends javax.swing.JFrame {

    private final DefaultTableModel model = new DefaultTableModel();
    private final SanPhamServices sps = new SanPhamServices();
    public UtilFile utilFile = new UtilFile();
    DecimalFormat df = new DecimalFormat("###,###");

    public SanPhamView() {
        initComponents();
        setLocationRelativeTo(null);
        innitTable();
        napDuLieuVaoTable();
    }

    private void innitTable() {
        String[] colums = new String[]{"Ma san pham", "Ten San Pham", "So Luong", "Nha san xuat", "Gia nhap khau", "Tinh thanh nhap", "Thue nhap khau", "Gia xuat khau", "QG Nhap sp", "Gia ban", "Tong tien"};
        model.setColumnIdentifiers(colums);
        tbSanPham.setModel(model);
    }

    public void themMotDongVaoTable(SanPham sp) {
        if (sp instanceof SanPhamNhapKhau) {
            model.addRow(new Object[]{sp.getMaSanPham(), sp.getTenSanPham(), sp.getSoLuong(), sp.getNhaSanXuat(), df.format(((SanPhamNhapKhau) sp).getGiaNhapKhau()), ((SanPhamNhapKhau) sp).getTinhThanhNhap(), ((SanPhamNhapKhau) sp).getThueNhapKhau(), "", "", df.format(sp.giaBan()), df.format(sp.tongtien())});
        } else {
            SanPhamXuatKhau spxk = (SanPhamXuatKhau) sp;
            model.addRow(new Object[]{spxk.getMaSanPham(), spxk.getTenSanPham(), spxk.getSoLuong(), spxk.getNhaSanXuat(), "", "", "", df.format(spxk.getGiaXuatKhau()), spxk.getQuocGiaNhapSanPham(), df.format(spxk.giaBan()), df.format(spxk.tongtien())});
        }
    }

    public void napDuLieuVaoTable() {
        model.setRowCount(0);
        for (SanPham sp : sps.sanPhams) {
            themMotDongVaoTable(sp);
        }
        model.fireTableDataChanged();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtMasp = new javax.swing.JTextField();
        txtTensp = new javax.swing.JTextField();
        txtSoLuong = new javax.swing.JTextField();
        txtNhaSanXuat = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbLoaiSanPham = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtGiaNhapKhau = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTinhThanhNhap = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtThueNhapKhau = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtGiaXuatKhau = new javax.swing.JTextField();
        txtQGNhapSp = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnAddProduct = new javax.swing.JButton();
        btnEditProduct = new javax.swing.JButton();
        btnDeleteProduct = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbSanPham = new javax.swing.JTable();
        btnInTongGiaBan = new javax.swing.JButton();
        txtInTongGiaBan = new javax.swing.JTextField();
        btnInTheoLoai = new javax.swing.JButton();
        btnSapXepTheoGiaBan = new javax.swing.JButton();
        btnMaxThue = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        btnList = new javax.swing.JButton();
        btnInTongTien = new javax.swing.JButton();
        txtInTongTien = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("Thong tin san pham");

        jLabel2.setText("Ma san pham");

        jLabel3.setText("Ten San Pham");

        jLabel4.setText("So Luong");

        jLabel5.setText("Nha san xuat");

        cbLoaiSanPham.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "San Pham Nhap Khau", "San Pham Xuat Khau" }));

        jLabel6.setText("Loai san pham");

        jLabel7.setText("Gia nhap khau");

        jLabel8.setText("Tinh thanh nhap");

        jLabel9.setText("Thue nhap khau");

        jLabel10.setText("Gia xuat khau");

        txtQGNhapSp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQGNhapSpActionPerformed(evt);
            }
        });

        jLabel11.setText("QG Nhap sp");

        btnAddProduct.setForeground(new java.awt.Color(255, 0, 0));
        btnAddProduct.setText("Them moi");
        btnAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProductActionPerformed(evt);
            }
        });

        btnEditProduct.setForeground(new java.awt.Color(255, 0, 51));
        btnEditProduct.setText("Sua");
        btnEditProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditProductActionPerformed(evt);
            }
        });

        btnDeleteProduct.setForeground(new java.awt.Color(255, 0, 51));
        btnDeleteProduct.setText("Xoa");
        btnDeleteProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteProductActionPerformed(evt);
            }
        });

        btnTimKiem.setForeground(new java.awt.Color(255, 0, 51));
        btnTimKiem.setText("Tim kiem");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        btnReset.setForeground(new java.awt.Color(255, 0, 51));
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtTensp, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtMasp, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNhaSanXuat, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                    .addComponent(txtSoLuong)))
                            .addComponent(cbLoaiSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtThueNhapKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtTinhThanhNhap, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                            .addComponent(txtGiaNhapKhau))))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addComponent(jLabel10))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtQGNhapSp, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtGiaXuatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addComponent(btnTimKiem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnAddProduct)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDeleteProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(208, 208, 208))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(374, 374, 374)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtGiaNhapKhau, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMasp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel7)
                        .addComponent(txtGiaXuatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(btnTimKiem)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTensp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel8)
                        .addComponent(txtTinhThanhNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtQGNhapSp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9)
                    .addComponent(txtThueNhapKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNhaSanXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbLoaiSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(btnAddProduct)
                    .addComponent(btnEditProduct)
                    .addComponent(btnDeleteProduct)
                    .addComponent(btnReset))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(94, 94, 94))
        );

        tbSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbSanPhamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbSanPham);

        btnInTongGiaBan.setForeground(new java.awt.Color(0, 0, 204));
        btnInTongGiaBan.setText("In Tong Gia Ban");
        btnInTongGiaBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInTongGiaBanActionPerformed(evt);
            }
        });

        txtInTongGiaBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInTongGiaBanActionPerformed(evt);
            }
        });

        btnInTheoLoai.setForeground(new java.awt.Color(0, 0, 204));
        btnInTheoLoai.setText("Hien thi thong tin theo loai san pham");
        btnInTheoLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInTheoLoaiActionPerformed(evt);
            }
        });

        btnSapXepTheoGiaBan.setForeground(new java.awt.Color(0, 0, 204));
        btnSapXepTheoGiaBan.setText("Sap xep theo gia ban");
        btnSapXepTheoGiaBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSapXepTheoGiaBanActionPerformed(evt);
            }
        });

        btnMaxThue.setForeground(new java.awt.Color(0, 0, 204));
        btnMaxThue.setText("San pham co thue cao nhat");
        btnMaxThue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaxThueActionPerformed(evt);
            }
        });

        jButton6.setForeground(new java.awt.Color(0, 0, 204));
        jButton6.setText("San pham co gia ban cao nhat");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        btnList.setBackground(new java.awt.Color(255, 0, 0));
        btnList.setForeground(new java.awt.Color(255, 255, 255));
        btnList.setText("Back To List");
        btnList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListActionPerformed(evt);
            }
        });

        btnInTongTien.setForeground(new java.awt.Color(0, 0, 204));
        btnInTongTien.setText("In Tong tien");
        btnInTongTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInTongTienActionPerformed(evt);
            }
        });

        txtInTongTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInTongTienActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnList)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(83, 83, 83))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 11, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnInTheoLoai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnMaxThue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnSapXepTheoGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnInTongTien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnInTongGiaBan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtInTongGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtInTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(21, 21, 21))))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnList)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInTongGiaBan)
                    .addComponent(txtInTongGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInTheoLoai)
                    .addComponent(btnSapXepTheoGiaBan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInTongTien)
                    .addComponent(txtInTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6)
                    .addComponent(btnMaxThue))
                .addContainerGap(159, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtQGNhapSpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQGNhapSpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQGNhapSpActionPerformed

    private void btnInTheoLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInTheoLoaiActionPerformed
        model.setRowCount(0);
        for (SanPham sp : sps.hienThiThongTinTheoLoai(cbLoaiSanPham.getSelectedIndex())) {
            themMotDongVaoTable(sp);
        }
        model.fireTableDataChanged();
    }//GEN-LAST:event_btnInTheoLoaiActionPerformed

    private void btnSapXepTheoGiaBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSapXepTheoGiaBanActionPerformed
        model.setRowCount(0);
        sps.sapXep();
        napDuLieuVaoTable();
    }//GEN-LAST:event_btnSapXepTheoGiaBanActionPerformed

    private void btnAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProductActionPerformed

        if (sps.ktmaSP(txtMasp.getText())) {
            JOptionPane.showMessageDialog(null,"Ma san pham da ton tai vui long doi ma san pham");
            return;
        }
        try {

            if (cbLoaiSanPham.getSelectedIndex() == 0) {
                SanPham sanPham = new SanPhamNhapKhau(txtMasp.getText(), txtTensp.getText(), Long.parseLong(txtSoLuong.getText()), txtNhaSanXuat.getText(),
                        Double.parseDouble(txtGiaNhapKhau.getText()), txtTinhThanhNhap.getText(), Double.parseDouble(txtThueNhapKhau.getText()));
                sps.addNew(sanPham);
            } else {
                SanPham sanPhamnk = new SanPhamXuatKhau(txtMasp.getText(), txtTensp.getText(), Long.parseLong(txtSoLuong.getText()), txtNhaSanXuat.getText(),
                        Double.parseDouble(txtGiaXuatKhau.getText()), txtQGNhapSp.getText());
                sps.addNew(sanPhamnk);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Vui long nhap day du thong tin và chon dung loai san pham can them");
        }
        napDuLieuVaoTable();
    }//GEN-LAST:event_btnAddProductActionPerformed

    private void btnListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListActionPerformed
        model.setRowCount(0);
        for (SanPham sp : sps.sanPhams) {
            themMotDongVaoTable(sp);
        }
        model.fireTableDataChanged();
    }//GEN-LAST:event_btnListActionPerformed

    private void tbSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbSanPhamMouseClicked

    }//GEN-LAST:event_tbSanPhamMouseClicked

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed

        SanPham sp = sps.search(txtTimKiem.getText());
        if (sp != null) {
            model.setRowCount(0);
            themMotDongVaoTable(sp);
        } else {
            JOptionPane.showMessageDialog(null, "khong tim thay san pham  ");
        }
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnDeleteProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteProductActionPerformed

        int choise = JOptionPane.showConfirmDialog(null, "Ban co muon xoa san pham co ma " + txtMasp.getText() + " nay khong", "Thong bao", JOptionPane.YES_NO_OPTION);
        if (choise == JOptionPane.NO_OPTION) {
            return;
        } else {
            if (sps.deleteProduct(txtMasp.getText())) {
                JOptionPane.showMessageDialog(null, "Xoa thanh cong");
                model.setRowCount(0);
                napDuLieuVaoTable();
            } else {
                JOptionPane.showMessageDialog(null, "khong tim thay ma san pham can xoa");
            }
        }

    }//GEN-LAST:event_btnDeleteProductActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtGiaNhapKhau.setText("");
        txtGiaXuatKhau.setText("");
        txtInTongGiaBan.setText("");
        txtMasp.setText("");
        txtNhaSanXuat.setText("");
        txtQGNhapSp.setText("");
        txtSoLuong.setText("");
        txtTensp.setText("");
        txtThueNhapKhau.setText("");
        txtTimKiem.setText("");
        txtTinhThanhNhap.setText("");
        txtInTongTien.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnEditProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditProductActionPerformed

        int choise = JOptionPane.showConfirmDialog(null, "Ban co muon cap nhat thong tin khong", "Thong bao", JOptionPane.YES_NO_OPTION);
        if (choise == JOptionPane.NO_OPTION) {
            return;
        } else {
            for (SanPham sanPham : sps.sanPhams) {
                if (sanPham.getMaSanPham().equalsIgnoreCase(txtMasp.getText())) {
                    if (sanPham instanceof SanPhamNhapKhau) {
                        sanPham.setMaSanPham(txtMasp.getText());
                        sanPham.setTenSanPham(txtTensp.getText());
                        sanPham.setSoLuong(Long.parseLong(txtSoLuong.getText()));
                        sanPham.setNhaSanXuat(txtNhaSanXuat.getText());
                        ((SanPhamNhapKhau) sanPham).setGiaNhapKhau(Double.parseDouble(txtGiaNhapKhau.getText()));
                        ((SanPhamNhapKhau) sanPham).setTinhThanhNhap(txtTinhThanhNhap.getText());
                        ((SanPhamNhapKhau) sanPham).setThueNhapKhau(Double.parseDouble(txtThueNhapKhau.getText()));
                    } else {
                        SanPhamXuatKhau spxk = (SanPhamXuatKhau) sanPham;
                        spxk.setMaSanPham(txtMasp.getText());
                        spxk.setTenSanPham(txtTensp.getText());
                        spxk.setSoLuong(Long.parseLong(txtSoLuong.getText()));
                        spxk.setNhaSanXuat(txtNhaSanXuat.getText());
                        spxk.setGiaXuatKhau(Double.parseDouble(txtGiaXuatKhau.getText()));
                        spxk.setQuocGiaNhapSanPham(txtQGNhapSp.getText());
                    }
                }
            }
        }
        utilFile.writeFile(sps.sanPhams, false);
        napDuLieuVaoTable();

    }//GEN-LAST:event_btnEditProductActionPerformed

    private void btnInTongGiaBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInTongGiaBanActionPerformed

        txtInTongGiaBan.setText(String.valueOf(df.format(sps.tonGiaban())));
        txtInTongGiaBan.setEditable(false);
    }//GEN-LAST:event_btnInTongGiaBanActionPerformed

    private void txtInTongGiaBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInTongGiaBanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInTongGiaBanActionPerformed

    private void btnInTongTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInTongTienActionPerformed
        txtInTongTien.setText(String.valueOf(df.format(sps.tongTienTheoSL())));
        txtInTongTien.setEditable(false);
    }//GEN-LAST:event_btnInTongTienActionPerformed

    private void txtInTongTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInTongTienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInTongTienActionPerformed

    private void btnMaxThueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaxThueActionPerformed
        SanPham sp = sps.thueCaoNhaBtnt();
        if (sp != null) {
            model.setRowCount(0);
            themMotDongVaoTable(sp);
        } else {
            JOptionPane.showMessageDialog(null, "khong tim thay san pham  ");
        }
    }//GEN-LAST:event_btnMaxThueActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        SanPham sp = sps.giaBanMaxbtn();
        if (sp != null) {
            model.setRowCount(0);
            themMotDongVaoTable(sp);
        } else {
            JOptionPane.showMessageDialog(null, "khong tim thay san pham  ");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(SanPhamView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SanPhamView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SanPhamView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SanPhamView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SanPhamView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddProduct;
    private javax.swing.JButton btnDeleteProduct;
    private javax.swing.JButton btnEditProduct;
    private javax.swing.JButton btnInTheoLoai;
    private javax.swing.JButton btnInTongGiaBan;
    private javax.swing.JButton btnInTongTien;
    private javax.swing.JButton btnList;
    private javax.swing.JButton btnMaxThue;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSapXepTheoGiaBan;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JComboBox<String> cbLoaiSanPham;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tbSanPham;
    private javax.swing.JTextField txtGiaNhapKhau;
    private javax.swing.JTextField txtGiaXuatKhau;
    private javax.swing.JTextField txtInTongGiaBan;
    private javax.swing.JTextField txtInTongTien;
    private javax.swing.JTextField txtMasp;
    private javax.swing.JTextField txtNhaSanXuat;
    private javax.swing.JTextField txtQGNhapSp;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTensp;
    private javax.swing.JTextField txtThueNhapKhau;
    private javax.swing.JTextField txtTimKiem;
    private javax.swing.JTextField txtTinhThanhNhap;
    // End of variables declaration//GEN-END:variables
}
