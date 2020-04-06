
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Main_Window extends javax.swing.JFrame {

    
    public Main_Window() {
        initComponents();
        filling_song_into_the_Table(song_Table);
        get_Connection();
    }
   
    String Image_Directory = null;
    int position = 0;
   
    public Connection get_Connection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/song_db_1", "root", "");           
            
            return connection;
        } catch (SQLException ex) {
            Logger.getLogger(Main_Window.class.getName()).log(Level.SEVERE, null, ex);
                        
            return null;
        }
    }
    
    //Check Input fields
    public boolean checkInputFields(){
        if(name_field.getText() == null || timing_field.getText() == null || singer_field.getText() == null || id_field.getText() == null){
            return false;
        }else{
            return true;
        }
    }
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        singer_field = new javax.swing.JTextField();
        timing_field = new javax.swing.JTextField();
        id_field = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        name_field = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        song_Table = new javax.swing.JTable();
        clear_all_btn = new javax.swing.JButton();
        insert_btn = new javax.swing.JButton();
        delete_btn = new javax.swing.JButton();
        change_btn = new javax.swing.JButton();
        label_image = new javax.swing.JLabel();
        btn_upload_image = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        success_or_not = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        genre_field1 = new javax.swing.JTextField();
        btn_refresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));

        jLabel1.setText("Singer / Group : ");

        jLabel2.setText("Timing : ");

        jLabel3.setText("Genre : ");

        jLabel4.setText("Year : ");

        jLabel5.setText("Name : ");

        song_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "TIMING", "Sing./Group", "YEAR", "Genre"
            }
        ));
        song_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                song_TableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(song_Table);

        clear_all_btn.setText("Clear All");
        clear_all_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_all_btnActionPerformed(evt);
            }
        });

        insert_btn.setText("Insert");
        insert_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert_btnActionPerformed(evt);
            }
        });

        delete_btn.setText("Delete");
        delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btnActionPerformed(evt);
            }
        });

        change_btn.setText("Change");
        change_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                change_btnActionPerformed(evt);
            }
        });

        label_image.setOpaque(true);

        btn_upload_image.setText("Upload Image");
        btn_upload_image.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_upload_imageActionPerformed(evt);
            }
        });

        jButton1.setText("SEARCH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        success_or_not.setText("jLabel6");

        jLabel6.setText("ID:");

        btn_refresh.setText("REFRESH");
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(timing_field, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(name_field, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(singer_field, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id_field, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(success_or_not)
                        .addGap(224, 224, 224))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(clear_all_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                                    .addComponent(insert_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                                    .addComponent(delete_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                                    .addComponent(change_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(20, 20, 20)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(label_image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(btn_upload_image, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))))
                                        .addGap(18, 18, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(genre_field1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel6))
                        .addContainerGap(20, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(id_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(success_or_not))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timing_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_refresh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(singer_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(genre_field1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_upload_image)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(clear_all_btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(insert_btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(delete_btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(change_btn))
                            .addComponent(label_image, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clear_all_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_all_btnActionPerformed
        name_field.setText("");
        timing_field.setText("");
        singer_field.setText("");
        id_field.setText("");
    }//GEN-LAST:event_clear_all_btnActionPerformed

    private void insert_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert_btnActionPerformed
        String _name = name_field.getText();
        String _timing = timing_field.getText();
        String _singer_field = singer_field.getText();
        String _genre_field = id_field.getText();
        
        // SimpleDateFormat Date_Format = new SimpleDateFormat("yyyy-MM-dd");
        int dateCame_var = dateChooser_Year.getYear();           
        String dateCame = Integer.toString(dateCame_var);
        
        if(name_field.getText().equals("") || timing_field.getText().equals("") || singer_field.getText().equals("") || id_field.getText().equals("") )
        {
            showMessageDialog(null, "Please fill all of the text boxes! ", "Error", ERROR_MESSAGE);
        }else
        {
            if(AddingInfoIntoDB(_name, _timing, _singer_field, dateCame, _genre_field)) 
        {
            success_or_not.setText("Successfully Added");
            btn_refreshActionPerformed(evt);
        }else
        {
            success_or_not.setText("Something Went Wrong");
        }
      }
    }//GEN-LAST:event_insert_btnActionPerformed

    private void delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btnActionPerformed
        if(!id_field.getText().equals("")){
            try {
                Connection connection = get_Connection();
                PreparedStatement PpdSt = connection.prepareStatement("DELETE FROM songs Where id=?");
                int id = Integer.parseInt(id_field.getText());
                
                PpdSt.setInt(1, id);
                PpdSt.executeUpdate();
                
                // filling_song_into_the_Table(song_Table);
                btn_refreshActionPerformed(evt);
                
                JOptionPane.showMessageDialog(null, "Product has been deleted successfully");
            } catch (SQLException ex) {
                Logger.getLogger(Main_Window.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Product has NOT been deleted successfully");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Type a valid ID!");
        }
    }//GEN-LAST:event_delete_btnActionPerformed

    private void change_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_change_btnActionPerformed
        if(checkInputFields() && id_field != null){
            String update_QRY = null;
            PreparedStatement ppdStm = null;
            Connection connection = get_Connection();
            
            // update when there is no image
            if(Image_Directory == null){
                try {
                    update_QRY = "UPDATE songs SET name=?,timing=?,singer=?,year=?,genre=? WHERE id=?";
                    
                    ppdStm = connection.prepareStatement(update_QRY);
                    
                    ppdStm.setString(1, name_field.getText());
                    ppdStm.setString(2, timing_field.getText());
                    ppdStm.setString(3, singer_field.getText());
                    
                    int dateCame_var = dateChooser_Year.getYear();           
                    String dateCame = Integer.toString(dateCame_var);
                    ppdStm.setString(4, dateCame);
                    
                    ppdStm.setString(5, genre_field1.getText());
                    
                    ppdStm.setInt(6, Integer.parseInt(id_field.getText()));
                    
                    ppdStm.executeUpdate();
                    
                    // filling_products_into_the_Table();
                    //filling_song_into_the_Table(song_Table);
                    btn_refreshActionPerformed(evt);
                    
                    JOptionPane.showMessageDialog(null, "Successfully Updated! ");
                } catch (SQLException ex) {
                    Logger.getLogger(Main_Window.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{ //update when there is an image
                try{
                InputStream image = new FileInputStream(new File(Image_Directory));
                
                update_QRY = "UPDATE songs SET name=?,timing=?,singer=?,year=?,genre=?,image=? WHERE id=?";
                
                
                    ppdStm = connection.prepareStatement(update_QRY);
                    
                    ppdStm.setString(1, name_field.getText());
                    ppdStm.setString(2, timing_field.getText());
                    ppdStm.setString(3, singer_field.getText());
                    
                    int dateCame_var = dateChooser_Year.getYear();           
                    String dateCame = Integer.toString(dateCame_var);
                    ppdStm.setString(4, dateCame);
                    
                    ppdStm.setString(5, genre_field1.getText());
                    
                    ppdStm.setBlob(6, image);
                    
                    ppdStm.setInt(7, Integer.parseInt(id_field.getText()));
                    
                    ppdStm.executeUpdate();
                    
                    // filling_products_into_the_Table();
                    //filling_song_into_the_Table(song_Table);
                    btn_refreshActionPerformed(evt);
                    
                    JOptionPane.showMessageDialog(null, "Successfully Updated! ");
                    
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "There is an empty field/fields");
        }
    }//GEN-LAST:event_change_btnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_upload_imageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_upload_imageActionPerformed
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.images", "jpg", "png");
        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(null);
        
        if(result == JFileChooser.APPROVE_OPTION){
            File selectedFile = file.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            label_image.setIcon(ResizeTheImage(path, null));
            Image_Directory = path;
        }else{
            System.out.println("You didn't select any file!");
            success_or_not.setText("You didn't select any file!");
        }
    }//GEN-LAST:event_btn_upload_imageActionPerformed

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
        song_Table.setModel(new DefaultTableModel(null, new Object[]{"ID", "NAME", "TIMING", "Sing./Group", "YEAR", "Genre"}));
        filling_song_into_the_Table(song_Table);
    }//GEN-LAST:event_btn_refreshActionPerformed

    private void song_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_song_TableMouseClicked
        DefaultTableModel DfTblMl_1 = (DefaultTableModel)song_Table.getModel(); 

        int selectedLine = song_Table.getSelectedRow(); 

        id_field.setText(DfTblMl_1.getValueAt(selectedLine, 0).toString()); 
        name_field.setText(DfTblMl_1.getValueAt(selectedLine, 1).toString());        
        timing_field.setText(DfTblMl_1.getValueAt(selectedLine, 2).toString()); 
        singer_field.setText(DfTblMl_1.getValueAt(selectedLine, 3).toString()); 
        
        //String dateValue = DfTblMl_1.getValueAt(selectedLine, 3).toString();
        String dateValue1 = DfTblMl_1.getValueAt(selectedLine, 4).toString();        
        int date= Integer.parseInt(dateValue1);
        dateChooser_Year.setValue(date);
        
        
        genre_field1.setText(DfTblMl_1.getValueAt(selectedLine, 5).toString());
    }//GEN-LAST:event_song_TableMouseClicked

    //Resize Image
    public ImageIcon ResizeTheImage(String Image_Directory, byte[] picture){
        ImageIcon myImage = null;
        
        if(Image_Directory != null){
            myImage = new ImageIcon(Image_Directory);
        }else{
            myImage = new ImageIcon(picture);
        }
        
        Image image_1 = myImage.getImage();
        Image image_2 = image_1.getScaledInstance(label_image.getWidth(), label_image.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(image_2);
        
        return image;
    }
   
    
    //Filling the JTable   
    public void filling_song_into_the_Table(JTable song_Table){
        String slctQry_1 = "SELECT `id`,`name`,`timing`,`singer`,`year`,`genre` FROM `songs`";
        try {
            Connection connection = get_Connection();
            
            PreparedStatement PrepaSt_1 = connection.prepareStatement(slctQry_1);
            ResultSet ResSet_1 = PrepaSt_1.executeQuery();
            DefaultTableModel DftTM1 = (DefaultTableModel)song_Table.getModel();
            Object[] row;
            while(ResSet_1.next() )
            {
                row = new Object[6]; 
                row[0] = ResSet_1.getInt(1);
                row[1] = ResSet_1.getString(2);
                row[2] = ResSet_1.getString(3);
                row[3] = ResSet_1.getString(4);
                row[4] = ResSet_1.getString(5);
                row[5] = ResSet_1.getString(6);
                   
                
                DftTM1.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Main_Window.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private boolean AddingInfoIntoDB(String NM, String TI, String SN, String YR, String GN)
    {       
        String qry = "INSERT INTO `songs`(`name`, `timing`, `singer`,`year`, `genre`, `image`) VALUES (?,?,?,?,?,?)";
        
        try {
            // PreparedStatement PpdSt_1 = get_Connection().prepareStatement(qry);
            
            Connection connection = get_Connection();
            PreparedStatement PpdSt_1 = connection.prepareStatement(qry);
            InputStream img_1;
            try {
            PpdSt_1.setString(1, NM);
            PpdSt_1.setString(2, TI);
            PpdSt_1.setString(3, SN);
            PpdSt_1.setString(4, YR);
            PpdSt_1.setString(5, GN);
            
            
                img_1 = new FileInputStream(new File(Image_Directory));
                PpdSt_1.setBlob(6, img_1);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Main_Window.class.getName()).log(Level.SEVERE, null, ex);
            }
                                                               
            return (PpdSt_1.executeUpdate() > 0);            
            
        } catch (SQLException ex) {
            Logger.getLogger(Main_Window.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }        
    }
    
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
            java.util.logging.Logger.getLogger(Main_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Window().setVisible(true);
            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_refresh;
    private javax.swing.JButton btn_upload_image;
    private javax.swing.JButton change_btn;
    private javax.swing.JButton clear_all_btn;
    private javax.swing.JButton delete_btn;
    private javax.swing.JTextField genre_field1;
    private javax.swing.JTextField id_field;
    private javax.swing.JButton insert_btn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label_image;
    private javax.swing.JTextField name_field;
    private javax.swing.JTextField singer_field;
    private javax.swing.JTable song_Table;
    private javax.swing.JLabel success_or_not;
    private javax.swing.JTextField timing_field;
    // End of variables declaration//GEN-END:variables
    

}
