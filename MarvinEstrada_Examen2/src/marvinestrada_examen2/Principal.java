package marvinestrada_examen2;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class Principal extends javax.swing.JFrame {
    public Principal() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_login = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_username = new javax.swing.JTextField();
        pf_password = new javax.swing.JPasswordField();
        jButton7 = new javax.swing.JButton();
        jd_ingresar = new javax.swing.JDialog();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jd_albums = new javax.swing.JDialog();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_nombre_album = new javax.swing.JTextField();
        tf_artista_album = new javax.swing.JTextField();
        jButton13 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        cb_album = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jd_canciones = new javax.swing.JDialog();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tf_nombre_cancion = new javax.swing.JTextField();
        tf_artista_cancion = new javax.swing.JTextField();
        tf_duracion_cancion = new javax.swing.JTextField();
        tf_genero_cancion = new javax.swing.JTextField();
        jButton14 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        cb_albums = new javax.swing.JComboBox<>();
        jd_usuario = new javax.swing.JDialog();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        tf_nombre_usuario = new javax.swing.JTextField();
        tf_edad_usuario = new javax.swing.JTextField();
        tf_username_usuario = new javax.swing.JTextField();
        pf_password_usuario = new javax.swing.JPasswordField();
        jButton15 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_usuarios = new javax.swing.JTable();
        jd_arbol_playlists = new javax.swing.JDialog();
        jScrollPane4 = new javax.swing.JScrollPane();
        jt_playlists = new javax.swing.JTree();
        jd_explorar = new javax.swing.JDialog();
        cb_albums_explorar = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla_explorar = new javax.swing.JTable();
        pp_menu = new javax.swing.JPopupMenu();
        mi_agregar_playlist = new javax.swing.JMenuItem();
        mi_agregar_favorito = new javax.swing.JMenuItem();
        jd_playlists = new javax.swing.JDialog();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        tf_nombre_playlist = new javax.swing.JTextField();
        jButton16 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Log In");

        jLabel3.setText("Username:");

        jLabel4.setText("Password:");

        jButton7.setText("Ingresar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_loginLayout = new javax.swing.GroupLayout(jd_login.getContentPane());
        jd_login.getContentPane().setLayout(jd_loginLayout);
        jd_loginLayout.setHorizontalGroup(
            jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_loginLayout.createSequentialGroup()
                .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_loginLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel2))
                    .addGroup(jd_loginLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_username)
                            .addComponent(pf_password, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)))
                    .addGroup(jd_loginLayout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jButton7)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jd_loginLayout.setVerticalGroup(
            jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_loginLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel2)
                .addGap(54, 54, 54)
                .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jd_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(pf_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jButton7)
                .addGap(39, 39, 39))
        );

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton8.setText("Explorar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton9.setText("Crear Playlist");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton10.setText("Ver Playlists");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton11.setText("Ver Favoritos");

        jButton12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton12.setText("Salir");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_ingresarLayout = new javax.swing.GroupLayout(jd_ingresar.getContentPane());
        jd_ingresar.getContentPane().setLayout(jd_ingresarLayout);
        jd_ingresarLayout.setHorizontalGroup(
            jd_ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ingresarLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jd_ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_ingresarLayout.createSequentialGroup()
                        .addGroup(jd_ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jd_ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_ingresarLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jd_ingresarLayout.setVerticalGroup(
            jd_ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ingresarLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jd_ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8)
                    .addComponent(jButton9))
                .addGap(49, 49, 49)
                .addGroup(jd_ingresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10)
                    .addComponent(jButton11))
                .addGap(46, 46, 46)
                .addComponent(jButton12)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jLabel5.setText("Nombre:");

        jLabel6.setText("Artista:");

        jButton13.setText("Agregar");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(156, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_nombre_album)
                            .addComponent(tf_artista_album, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(145, 145, 145))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton13)
                        .addGap(238, 238, 238))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_nombre_album, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tf_artista_album, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addComponent(jButton13)
                .addContainerGap(126, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Crear Álbum ", jPanel1);

        cb_album.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_albumItemStateChanged(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Artista", "Duración", "Género"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cb_album, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(cb_album, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Listar y Eliminar", jPanel2);

        javax.swing.GroupLayout jd_albumsLayout = new javax.swing.GroupLayout(jd_albums.getContentPane());
        jd_albums.getContentPane().setLayout(jd_albumsLayout);
        jd_albumsLayout.setHorizontalGroup(
            jd_albumsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jd_albumsLayout.setVerticalGroup(
            jd_albumsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Crear Canción");

        jLabel8.setText("Nombre:");

        jLabel9.setText("Artista:");

        jLabel10.setText("Duración:");

        jLabel11.setText("Género:");

        jButton14.setText("Agregar");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jLabel12.setText("Álbum:");

        javax.swing.GroupLayout jd_cancionesLayout = new javax.swing.GroupLayout(jd_canciones.getContentPane());
        jd_canciones.getContentPane().setLayout(jd_cancionesLayout);
        jd_cancionesLayout.setHorizontalGroup(
            jd_cancionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_cancionesLayout.createSequentialGroup()
                .addGroup(jd_cancionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_cancionesLayout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jLabel7))
                    .addGroup(jd_cancionesLayout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(jd_cancionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jd_cancionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_nombre_cancion)
                            .addComponent(tf_artista_cancion)
                            .addComponent(tf_duracion_cancion)
                            .addComponent(tf_genero_cancion)
                            .addComponent(cb_albums, 0, 182, Short.MAX_VALUE)))
                    .addGroup(jd_cancionesLayout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(jButton14)))
                .addContainerGap(158, Short.MAX_VALUE))
        );
        jd_cancionesLayout.setVerticalGroup(
            jd_cancionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_cancionesLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jd_cancionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jd_cancionesLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel8))
                    .addComponent(tf_nombre_cancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jd_cancionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tf_artista_cancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jd_cancionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tf_duracion_cancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jd_cancionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tf_genero_cancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jd_cancionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cb_albums, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jButton14)
                .addGap(25, 25, 25))
        );

        jLabel13.setText("Nombre:");

        jLabel14.setText("Edad:");

        jLabel15.setText("Username:");

        jLabel16.setText("Password:");

        jButton15.setText("Agregar");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_nombre_usuario)
                    .addComponent(tf_edad_usuario)
                    .addComponent(tf_username_usuario)
                    .addComponent(pf_password_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(229, Short.MAX_VALUE)
                .addComponent(jButton15)
                .addGap(207, 207, 207))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(tf_nombre_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(tf_edad_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(tf_username_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(pf_password_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jButton15)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Crear Usuario", jPanel3);

        tabla_usuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Edad", "Username", "Password"
            }
        ));
        jScrollPane2.setViewportView(tabla_usuarios);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Listar & Eliminar", jPanel4);

        javax.swing.GroupLayout jd_usuarioLayout = new javax.swing.GroupLayout(jd_usuario.getContentPane());
        jd_usuario.getContentPane().setLayout(jd_usuarioLayout);
        jd_usuarioLayout.setHorizontalGroup(
            jd_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );
        jd_usuarioLayout.setVerticalGroup(
            jd_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Playlists");
        jt_playlists.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane4.setViewportView(jt_playlists);

        javax.swing.GroupLayout jd_arbol_playlistsLayout = new javax.swing.GroupLayout(jd_arbol_playlists.getContentPane());
        jd_arbol_playlists.getContentPane().setLayout(jd_arbol_playlistsLayout);
        jd_arbol_playlistsLayout.setHorizontalGroup(
            jd_arbol_playlistsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_arbol_playlistsLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jd_arbol_playlistsLayout.setVerticalGroup(
            jd_arbol_playlistsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_arbol_playlistsLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        cb_albums_explorar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_albums_explorarItemStateChanged(evt);
            }
        });

        tabla_explorar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Artista", "Duración", "Género"
            }
        ));
        tabla_explorar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_explorarMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabla_explorar);

        javax.swing.GroupLayout jd_explorarLayout = new javax.swing.GroupLayout(jd_explorar.getContentPane());
        jd_explorar.getContentPane().setLayout(jd_explorarLayout);
        jd_explorarLayout.setHorizontalGroup(
            jd_explorarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_explorarLayout.createSequentialGroup()
                .addGroup(jd_explorarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_explorarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cb_albums_explorar, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_explorarLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jd_explorarLayout.setVerticalGroup(
            jd_explorarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_explorarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cb_albums_explorar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        mi_agregar_playlist.setText("Agregar a Playlist");
        mi_agregar_playlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_agregar_playlistActionPerformed(evt);
            }
        });
        pp_menu.add(mi_agregar_playlist);

        mi_agregar_favorito.setText("Agregar a Favoritos");
        pp_menu.add(mi_agregar_favorito);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("Crear Playlist");

        jLabel18.setText("Nombre:");

        jButton16.setText("Crear");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_playlistsLayout = new javax.swing.GroupLayout(jd_playlists.getContentPane());
        jd_playlists.getContentPane().setLayout(jd_playlistsLayout);
        jd_playlistsLayout.setHorizontalGroup(
            jd_playlistsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_playlistsLayout.createSequentialGroup()
                .addGroup(jd_playlistsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_playlistsLayout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jButton16))
                    .addGroup(jd_playlistsLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addGroup(jd_playlistsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(tf_nombre_playlist, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jd_playlistsLayout.setVerticalGroup(
            jd_playlistsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_playlistsLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel17)
                .addGap(86, 86, 86)
                .addGroup(jd_playlistsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(tf_nombre_playlist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jButton16)
                .addGap(53, 53, 53))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Usuarios");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Canciones");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Albums");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Log In");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Guardar Usuarios");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Cargar Usuarios");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Reproductor de Música");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel1)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        String nombre, artista;
        try {
            nombre = tf_nombre_album.getText();
            artista = tf_artista_album.getText();
            lista_albums.add(new Albums(nombre, artista));
            JOptionPane.showMessageDialog(this, "El álbum se ha creado exitosamente");
            
            DefaultComboBoxModel modelo = new DefaultComboBoxModel();
            for (Albums temp : lista_albums) {
                modelo.addElement(temp);
            }
            cb_album.setModel(modelo);
            cb_albums.setModel(modelo);
            cb_albums_explorar.setModel(modelo);
        
            tf_nombre_album.setText("");
            tf_artista_album.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un y no se guardaron los datos");
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.jd_usuario.setModal(true);
        this.jd_usuario.pack();
        this.jd_usuario.setLocationRelativeTo(this);
        this.jd_usuario.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (cb_album.getItemCount() == 0){
            JOptionPane.showMessageDialog(this, "Debe haber un álbum en existencia para poder crear una canción");
        } else {
            this.jd_canciones.setModal(true);
            this.jd_canciones.pack();
            this.jd_canciones.setLocationRelativeTo(this);
            this.jd_canciones.setVisible(true);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        Albums al = new Albums();
        String nombre, artista, genero;
        int duracion;
        try {
            nombre = tf_nombre_cancion.getText();
            artista = tf_artista_cancion.getText();
            duracion = Integer.parseInt(tf_duracion_cancion.getText());
            genero = tf_genero_cancion.getText();
            
            al.setCancion(new Canciones(nombre, artista, duracion, genero, (Albums)cb_albums.getSelectedItem()));
            JOptionPane.showMessageDialog(this, "La canción se ha agregado exitosamente");
            
            DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
            Object[] newrow = {nombre, artista, duracion, genero};
            modelo.addRow(newrow);
            tabla.setModel(modelo);
            
            tf_nombre_cancion.setText("");
            tf_artista_cancion.setText("");
            tf_duracion_cancion.setText("");
            tf_genero_cancion.setText("");
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        String nombre, username, password;
        int edad;
        try {
            nombre = tf_nombre_usuario.getText();
            edad = Integer.parseInt(tf_edad_usuario.getText());
            username = tf_username_usuario.getText();
            password = pf_password_usuario.getText();
            user = new Usuarios(nombre, edad, username, password, new Playlists());
            lista_usuarios.add(user);

            JOptionPane.showMessageDialog(this, "Se ha creado el usuario exitosamente");
            
            DefaultTableModel modelo = (DefaultTableModel) tabla_usuarios.getModel();
            Object[] newrow = {nombre, edad, username, password};
            modelo.addRow(newrow);
            tabla_usuarios.setModel(modelo);
            
            tf_nombre_usuario.setText("");
            tf_edad_usuario.setText("");
            tf_username_usuario.setText("");
            pf_password_usuario.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error y no se guardaron los datos");
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.jd_albums.setModal(true);
        this.jd_albums.pack();
        this.jd_albums.setLocationRelativeTo(this);
        this.jd_albums.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.jd_login.setModal(true);
        this.jd_login.pack();
        this.jd_login.setLocationRelativeTo(this);
        this.jd_login.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        boolean entro = false;
        for (Usuarios temp : lista_usuarios) {
            if (temp.getUsername().equals(tf_username.getText()) && temp.getPassword().equals(pf_password.getText())) {
                entro = true;
            }
        }

        if (entro == true) {
            this.jd_ingresar.setModal(true);
            this.jd_ingresar.pack();
            this.jd_ingresar.setLocationRelativeTo(this);
            this.jd_ingresar.setVisible(true);
            tf_username_usuario.setText("");
            pf_password_usuario.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Usuario/Contraseña incorrectos");
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
            au.cargarArchivoBinario();
            au.setLista_usuarios(lista_usuarios);
            au.escribirArchivo();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void cb_albums_explorarItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_albums_explorarItemStateChanged
        tabla_explorar.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][]{},
            new String[]{
                "Nombre", "Artista", "Duración", "Género",}
        ));
        DefaultTableModel modelo = (DefaultTableModel) tabla_explorar.getModel();
        
        
        for (Usuarios temp : lista_usuarios) {
            if (temp.getUsername().equals(tf_username.getText()) && temp.getPassword().equals(pf_password.getText())) {
                for (Albums t : lista_albums) {
                    for (int i = 0; i < t.getCanciones().size(); i++) {
                        Object[] row = {
                            t.getCanciones().get(i).getNombre(),
                            t.getCanciones().get(i).getArtista(),
                            t.getCanciones().get(i).getDuracion(),
                            t.getCanciones().get(i).getGenero()};
                        modelo.addRow(row);
                    }
                    tabla_explorar.setModel(modelo);
                }
            }
        }
    }//GEN-LAST:event_cb_albums_explorarItemStateChanged

    private void cb_albumItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_albumItemStateChanged
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][]{},
            new String[]{
                "Nombre", "Artista", "Duración", "Género",}
        ));
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        
        
        for (Usuarios temp : lista_usuarios) {
            if (temp.getUsername().equals(tf_username.getText()) && temp.getPassword().equals(pf_password.getText())) {
                for (Albums t : lista_albums) {
                    for (int i = 0; i < t.getCanciones().size(); i++) {
                        Object[] row = {
                            t.getCanciones().get(i).getNombre(),
                            t.getCanciones().get(i).getArtista(),
                            t.getCanciones().get(i).getDuracion(),
                            t.getCanciones().get(i).getGenero()};
                        modelo.addRow(row);
                    }
                    tabla.setModel(modelo);
                }
            }
        }

    }//GEN-LAST:event_cb_albumItemStateChanged

    private void tabla_explorarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_explorarMouseClicked
        if (evt.isMetaDown()){
            pp_menu.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_tabla_explorarMouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        this.jd_playlists.setModal(true);
        this.jd_playlists.pack();
        this.jd_playlists.setLocationRelativeTo(this);
        this.jd_playlists.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        try {
            for (Usuarios temp : lista_usuarios) {
                if (temp.getUsername().equals(tf_username.getText()) && temp.getPassword().equals(pf_password.getText())) {
                    nombre_arbol = tf_nombre_playlist.getText();
                    user.setPlaylist(new Playlists(nombre_arbol));
                    JOptionPane.showMessageDialog(this, "Se ha creado la playlist exitosamente");
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        this.jd_arbol_playlists.setModal(true);
        this.jd_arbol_playlists.pack();
        this.jd_arbol_playlists.setLocationRelativeTo(this);
        this.jd_arbol_playlists.setVisible(true);
        
        for (Usuarios temp : lista_usuarios) {
            if (temp.getUsername().equals(tf_username.getText()) && temp.getPassword().equals(pf_password.getText())) {
                DefaultTreeModel m = (DefaultTreeModel) jt_playlists.getModel();
                DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) m.getRoot();
                DefaultMutableTreeNode playlists = new DefaultMutableTreeNode(new Playlists(nombre_arbol));
                DefaultMutableTreeNode cancion;
                for (Usuarios t : lista_usuarios) {
                    for (int i = 0; i < t.getPlaylists().size(); i++) {
                        playlists = new DefaultMutableTreeNode(new Playlists(t.getPlaylists().get(i).getNombre()));
                        for (Albums te : lista_albums) {
                            for (int j = 0; j < te.getCanciones().size(); j++) {
                                cancion = new DefaultMutableTreeNode(new Canciones(te.getCanciones().get(i).getNombre()));
                                playlists.add(cancion);
                            }
                        }
                    }
                }
                raiz.add(playlists);
                DefaultMutableTreeNode fav = new DefaultMutableTreeNode("Favoritos");
                raiz.add(fav);
                m.reload();
            }
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        this.jd_explorar.setModal(true);
        this.jd_explorar.pack();
        this.jd_explorar.setLocationRelativeTo(this);
        this.jd_explorar.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        this.jd_ingresar.dispose();
        tf_username.setText("");
        pf_password.setText("");
    }//GEN-LAST:event_jButton12ActionPerformed

    private void mi_agregar_playlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_agregar_playlistActionPerformed
        for (Albums temp : lista_albums) {
            for (int i = 0; i < temp.getCanciones().size(); i++) {
                
            }
        }
    }//GEN-LAST:event_mi_agregar_playlistActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_album;
    private javax.swing.JComboBox<String> cb_albums;
    private javax.swing.JComboBox<String> cb_albums_explorar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JDialog jd_albums;
    private javax.swing.JDialog jd_arbol_playlists;
    private javax.swing.JDialog jd_canciones;
    private javax.swing.JDialog jd_explorar;
    private javax.swing.JDialog jd_ingresar;
    private javax.swing.JDialog jd_login;
    private javax.swing.JDialog jd_playlists;
    private javax.swing.JDialog jd_usuario;
    private javax.swing.JTree jt_playlists;
    private javax.swing.JMenuItem mi_agregar_favorito;
    private javax.swing.JMenuItem mi_agregar_playlist;
    private javax.swing.JPasswordField pf_password;
    private javax.swing.JPasswordField pf_password_usuario;
    private javax.swing.JPopupMenu pp_menu;
    private javax.swing.JTable tabla;
    private javax.swing.JTable tabla_explorar;
    private javax.swing.JTable tabla_usuarios;
    private javax.swing.JTextField tf_artista_album;
    private javax.swing.JTextField tf_artista_cancion;
    private javax.swing.JTextField tf_duracion_cancion;
    private javax.swing.JTextField tf_edad_usuario;
    private javax.swing.JTextField tf_genero_cancion;
    private javax.swing.JTextField tf_nombre_album;
    private javax.swing.JTextField tf_nombre_cancion;
    private javax.swing.JTextField tf_nombre_playlist;
    private javax.swing.JTextField tf_nombre_usuario;
    private javax.swing.JTextField tf_username;
    private javax.swing.JTextField tf_username_usuario;
    // End of variables declaration//GEN-END:variables
    ArrayList<Albums> lista_albums = new ArrayList();
    ArrayList<Usuarios> lista_usuarios = new ArrayList();
    AdminUsuarios au = new AdminUsuarios("./Usuarios.cbm");
    Usuarios user = new Usuarios();
    String nombre_arbol;
}
