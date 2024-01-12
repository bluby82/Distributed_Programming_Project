/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package client_gc;

import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.math.BigInteger;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTTblWidth;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.STTblWidth;

/**
 *
 * @author Hilmy
 */
public class HistBmiGUI extends javax.swing.JFrame {

    String[] user;
    String[] bmiDetails;
    
    public void getUser(String[] u) {
        user = u;
        txtUsername.setText(user[1]);
        refreshTable();
    }
   

    public HistBmiGUI() {
        initComponents();
        setLocationRelativeTo(null);
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableBMI = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        txtUsername = new javax.swing.JLabel();
        btnPrint = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cmbExt = new javax.swing.JComboBox<>();
        butPlot = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableBMI.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Weight", "Height", "BMI Value", "Classicifation"
            }
        ));
        tableBMI.setEnabled(false);
        jScrollPane1.setViewportView(tableBMI);

        btnBack.setBackground(new java.awt.Color(255, 51, 51));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtUsername.setText("username");

        btnPrint.setBackground(new java.awt.Color(0, 102, 51));
        btnPrint.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnPrint.setForeground(new java.awt.Color(255, 255, 255));
        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        jLabel2.setText("Print the data");

        cmbExt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".pdf", ".docx" }));

        butPlot.setBackground(new java.awt.Color(0, 102, 51));
        butPlot.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        butPlot.setForeground(new java.awt.Color(255, 255, 255));
        butPlot.setText("See on Graph");
        butPlot.setActionCommand("See on Data Graph");
        butPlot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butPlotActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 102, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("BMI HISTORY");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(188, 188, 188))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtUsername)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(butPlot)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbExt, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPrint)
                        .addGap(517, 517, 517)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUsername)
                    .addComponent(butPlot))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbExt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    public void refreshTable() {
        try {
            DefaultTableModel model = (DefaultTableModel) tableBMI.getModel();
            model.setRowCount(0);
            String[] valData = new String[5];
            for (String str : viewListData(user[0])) {
                    bmiDetails = str.split("~");
                    valData[0] = bmiDetails[0];
                    valData[1] = bmiDetails[1];
                    valData[2] = bmiDetails[2];
                    valData[3] = bmiDetails[3];
                    valData[4] = bmiDetails[4];
                    model.addRow(valData);
            }
        } catch (Exception e) {
            System.out.println("errornya di refresh table: " + e);
        }
    }

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        // button print disini jo

        String path = "";

        // DATA TAMBAHAN BUAT EXCEL, tanggal generate, dsb
        Date d = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String strDate = dateFormat.format(d);
        String userName = user[1];

        // MEMILIH LOKASI FILE PENYIMPANAN
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        if (cmbExt.getSelectedItem() == ".pdf") {
            fileChooser.setDialogTitle("Save as PDF");
            FileNameExtensionFilter fnef = new FileNameExtensionFilter("PDF", "pdf");
            fileChooser.setFileFilter(fnef);
            int x = fileChooser.showSaveDialog(this); // if error change to null
            try {
                if (x == JFileChooser.APPROVE_OPTION) {
                    path = fileChooser.getSelectedFile().getPath() + "\\JAR_" + strDate + ".pdf";

                    // Buat DOCUMENT, isi dari PDF
                    Document doc = new Document();

                    PdfWriter.getInstance(doc, new FileOutputStream(path));

                    doc.open();

                    // Font yang digunakan
                    Font fPar = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD);

                    // Data tambahan
                    Paragraph para = new Paragraph("DATA BMI", fPar);
                    Paragraph para1 = new Paragraph("Tanggal Generate: " + strDate, fPar);
                    Paragraph para2 = new Paragraph("User: " + userName, fPar);
                    Paragraph space = new Paragraph(" ");

                    // Tambahkan data tsb ke pdf
                    doc.add(para);
                    doc.add(para1);
                    doc.add(para2);
                    doc.add(space);

                    // DATA TABLE PDF
                    PdfPTable tab = new PdfPTable(5);

                    // Width setiap kolom, mbulet memang
                    tab.setTotalWidth(new float[]{150, 150, 150, 150, 150});
                    //tab.setLockedWidth(true);

                    // Ukuran font dari table nantinya
                    Font fCell = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.NORMAL);

                    // Menambah HEADER table (ADA 5 COLUMN)
                    tab.addCell(new PdfPCell(new Phrase("Tanggal", fCell)));
                    tab.addCell(new PdfPCell(new Phrase("Berat (kg)", fCell)));
                    tab.addCell(new PdfPCell(new Phrase("Tinggi (cm)", fCell)));
                    tab.addCell(new PdfPCell(new Phrase("Nilai BMI", fCell)));
                    tab.addCell(new PdfPCell(new Phrase("Klasifikasi", fCell)));

                    // AMBIL DATA DARI tableDatabase -> PDF
                    for (int r = 0; r < tableBMI.getRowCount(); r++) {
                        for (int c = 0; c < tableBMI.getColumnCount(); c++) {
                            String data = tableBMI.getValueAt(r, c).toString();
                            tab.addCell(new PdfPCell(new Phrase(data, fCell)));
                        }
                    }

                    // Tambah tab ke PDF
                    doc.add(tab);

                    // Warning, jadi
                    JOptionPane.showMessageDialog(null, "Pdf File Downloaded Successfully!");

                    // Dokumen ditutup
                    doc.close();
                }
            } catch (Exception e) {
                System.out.println("ERROR IN PDF CONV:" + e);
            }
        } else if (cmbExt.getSelectedItem() == ".xslx") {
            fileChooser.setDialogTitle("Save as Excel");
            FileNameExtensionFilter fnef = new FileNameExtensionFilter("EXCEL FILES", "xls", "xlsx", "xlsm");
            fileChooser.setFileFilter(fnef);
            int x = fileChooser.showSaveDialog(this); // if error change to null
            try {
                if (x == JFileChooser.APPROVE_OPTION) {
                    path = fileChooser.getSelectedFile().getPath() + "\\JAR_" + strDate + ".xlsx"; // Nama file akan JAR.xlsx;

                    // Buat dokumen Excel
                    XSSFWorkbook workbook = new XSSFWorkbook();

                    // Buat sheet kosong bernama Transaction Data
                    XSSFSheet sheet = workbook.createSheet("Transaction Data");

                    // Width setiap cell, mbulet memang (lagi)
                    sheet.setColumnWidth(0, 25 * 180);
                    sheet.setColumnWidth(1, 25 * 180);
                    sheet.setColumnWidth(2, 25 * 180);
                    sheet.setColumnWidth(3, 25 * 180);
                    sheet.setColumnWidth(4, 25 * 180);

                    // Deklarasi data (Object[]) yang akan ditulis
                    Map<String, Object[]> data = new TreeMap<String, Object[]>();

                    // Data tambahan
                    data.put("0", new Object[]{"DATA BMI"});
                    data.put("1", new Object[]{"Tanggal Generate: " + strDate});
                    //data.put("2", new Object[]{"User: " + userName});

                    // Menambah header Table
                    data.put("2", new Object[]{"Tanggal", "Tinggi (cm)", "Berat (kg)", "Nilai BMI", "Klasifikasi"});

                    // AMBIL DATA DARI tableDatabase -> excel
                    for (int r = 0; r < tableBMI.getRowCount(); r++) {
                        String[] dataTrans = new String[5];
                        for (int c = 0; c < tableBMI.getColumnCount(); c++) {
                            dataTrans[c] = tableBMI.getValueAt(r, c).toString();
                        }
                        //This data needs to be written (Object[])
                        data.put(Integer.toString(r + 3), new Object[]{dataTrans[0], dataTrans[1], dataTrans[2], dataTrans[3], dataTrans[4]});
                    }

                    // Set style
                    CellStyle style = workbook.createCellStyle();

                    style.setBorderTop(BorderStyle.MEDIUM);
                    style.setBorderBottom(BorderStyle.MEDIUM);
                    style.setBorderLeft(BorderStyle.MEDIUM);
                    style.setBorderRight(BorderStyle.MEDIUM);

                    XSSFFont font = workbook.createFont();
                    font.setFontName("Times New Roman");
                    font.setFontHeight(12);
                    style.setFont(font);

                    // Iterasi data terus dan masukkan ke sheet
                    Set<String> keyset = data.keySet();
                    int rownum = 0;
                    for (String key : keyset) {
                        Row row = sheet.createRow(rownum++);
                        Object[] objArr = data.get(key);
                        int cellnum = 0;
                        for (Object obj : objArr) {
                            Cell cell = row.createCell(cellnum++);
                            cell.setCellStyle(style);   // Gunakan style tadi
                            if (obj instanceof String) {
                                cell.setCellValue((String) obj);
                            } else if (obj instanceof Integer) {
                                cell.setCellValue((Integer) obj);
                            }
                        }
                    }
                    // Export ke dokumen excel
                    FileOutputStream out = new FileOutputStream(new File(path));
                    workbook.write(out);
                    out.close();

                    // Pesan berhasil
                    JOptionPane.showMessageDialog(null, "Excel File Downloaded Successfully!");
                }
            } catch (Exception e) {
                System.out.println("ERROR IN EXCEL CONV:" + e);
            }
        } else {
            fileChooser.setDialogTitle("Save as Word");
            FileNameExtensionFilter fnef = new FileNameExtensionFilter("WORD FILES", "docx");
            fileChooser.setFileFilter(fnef);
            int x = fileChooser.showSaveDialog(this); // if error change to null
            try {
                // Jika DISETUJUI, ambil STRING
                if (x == JFileChooser.APPROVE_OPTION) {
                    path = fileChooser.getSelectedFile().getPath() + "\\JAR_" + strDate + ".docx"; // Nama file akan JAR.docx;

                    // Membuat file dokumen u/ word
                    XWPFDocument document = new XWPFDocument();

                    // Menulis di file sys
                    FileOutputStream out = new FileOutputStream(new File(path));

                    XWPFParagraph paragraph = document.createParagraph();
                    XWPFRun runData = paragraph.createRun();
                    XWPFRun runTanggal = paragraph.createRun();
                    XWPFRun runNama = paragraph.createRun();
                    runTanggal.addBreak();
                    runNama.addBreak();
                    String data1 = "DATA BMI";
                    String data2 = "Tanggal Generate: " + strDate;
                    String data3 = "User: " + userName;
                    setRun(runData, data1, 12, true);
                    setRun(runTanggal, data2, 12, true);
                    setRun(runNama, data3, 12, true);

                    // Membuat table
                    XWPFTable table = document.createTable();
                    // Setting lebar table
                    CTTblWidth width = table.getCTTbl().addNewTblPr().addNewTblW();
                    width.setType(STTblWidth.DXA);
                    width.setW(BigInteger.valueOf(9500));

                    // Membuat row pertama
                    XWPFTableRow headerRow = table.insertNewTableRow(0);

                    // Array isi header
                    String[] header = {"Tanggal", "Tinggi (cm)", "Berat (kg)", "Nilai BMI", "Klasifikasi"};

                    // Menambah header
                    for (int h = 0; h <= 4; h++) {
                        XWPFRun runHeader = headerRow.addNewTableCell().addParagraph().createRun();
                        setRun(runHeader, header[h], 12, false);
                    }

                    // Entah kenapa? Bakal ada cell tambahan kosong dibawah, gtw, jadi dihapus
                    int finalRow = 0;

                    // AMBIL DATA DARI tableDatabase -> WORD
                    for (int r = 0; r < tableBMI.getRowCount(); r++) {
                        XWPFTableRow newTable = table.insertNewTableRow(r + 1);
                        finalRow = r;
                        for (int c = 0; c < tableBMI.getColumnCount(); c++) {
                            String data = tableBMI.getValueAt(r, c).toString();

                            XWPFRun run = newTable.addNewTableCell().addParagraph().createRun();
                            setRun(run, data, 12, false);
                        }
                    }
                    // Hapus cell tambahan
                    table.removeRow(finalRow + 2);

                    document.write(out);
                    out.close();

                    // Pesan berhasil
                    JOptionPane.showMessageDialog(null, " Word File Downloaded Successfully!");
                }
            } catch (Exception e) {
                System.out.println("ERROR IN WORD CONV:" + e);
            }
        }
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.setVisible(false);
        HomeGUI home = new HomeGUI();
        home.getUser(user);
        home.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void butPlotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butPlotActionPerformed
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        ArrayList<String> klasifikasi = new ArrayList<String>();

        // AMBIL DATA DARI tableDatabase
        for (int r = 0; r < tableBMI.getRowCount(); r++) {
            String date = "";
            Double bmi = 0.0;
            String klass = "";
            for (int c = 0; c < 5; c++) {
                if (c == 0) {
                    date = tableBMI.getValueAt(r, c).toString();
                } else if (c == 3) {
                    bmi = Double.parseDouble(tableBMI.getValueAt(r, c).toString());
                } else if (c == 4) {
                    klass = tableBMI.getValueAt(r, c).toString();
                }
            }
            dataset.addValue(bmi, "BMI Value", date);
            klasifikasi.add(klass);
        }

        JFreeChart chart = ChartFactory.createLineChart("BMI PROGRESS", "Date", "BMI Value", dataset);

        CategoryPlot plot = chart.getCategoryPlot();
        LineAndShapeRenderer renderer = (LineAndShapeRenderer) plot.getRenderer();
        renderer.setDefaultItemLabelGenerator(new StandardCategoryItemLabelGenerator() {
            public String generateLabel(CategoryDataset dataset, int row, int column) {
                return klasifikasi.get(column);
            }
        });
        renderer.setDefaultItemLabelsVisible(true);

        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(1500, 750));

        JFrame frame = new JFrame("BMI Chart");
        frame.getContentPane().add(chartPanel);
        frame.pack();
        frame.setVisible(true);
    }//GEN-LAST:event_butPlotActionPerformed

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
            java.util.logging.Logger.getLogger(HistBmiGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HistBmiGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HistBmiGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HistBmiGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HistBmiGUI().setVisible(true);
            }
        });
    }

    // METHOD WORD MENAMBAH STRING DENGAN UKURAN DAN JENIS TEXT
    private static void setRun(XWPFRun run, String text, int size, boolean bold) {
        run.setFontFamily("Times New Roman");
        run.setText(text);
        run.setFontSize(size);
        run.setBold(bold);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton butPlot;
    private javax.swing.JComboBox<String> cmbExt;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableBMI;
    private javax.swing.JLabel txtUsername;
    // End of variables declaration//GEN-END:variables

    private static java.util.List<java.lang.String> viewListData(java.lang.String id) {
        com.project.service.ProjectWebService_Service service = new com.project.service.ProjectWebService_Service();
        com.project.service.ProjectWebService port = service.getProjectWebServicePort();
        return port.viewListData(id);
    }






}
