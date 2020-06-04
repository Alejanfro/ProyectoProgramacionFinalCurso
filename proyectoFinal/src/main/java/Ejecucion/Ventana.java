package Ejecucion;

import Excepciones.*;
import GruposAlimentos.*;
import Principal.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Alejandro Ríos Díaz
 */

public class Ventana extends JFrame {

    //VARIABLES INTERNAS
    private JPanel Fondo;
    private JTextField TF_Cant_1_Des;
    private JTextField TF_Cant_2_Des;
    private JTextField TF_Cant_A_Des;
    private JTextField TF_1_Des;
    private JTextField TF_2_Des;
    private JTextField TF_A_Des;
    private JTextField TF_Cant_1_Alm;
    private JTextField TF_Cant_2_Alm;
    private JTextField TF_Cant_A_Alm;
    private JTextField TF_1_Alm;
    private JTextField TF_2_Alm;
    private JTextField TF_A_Alm;
    private JTextField TF_Cant_1_Cen;
    private JTextField TF_Cant_2_Cen;
    private JTextField TF_Cant_A_Cen;
    private JTextField TF_1_Cen;
    private JTextField TF_2_Cen;
    private JTextField TF_A_Cen;
    private JList<String> listaBD;
    private JTextPane TXT_dieta;
    
    //Menu es la encargada de almacenar la dieta del dia
    //para luego mostrarla por la interfaz
    private Dia menu;
    //Ponemos la conexion como variables internas de clase
    //Para que se puedan acceder a ellas desde cualquier funcion
    private Connection con;
    private Statement smt;

  
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    Ventana frame = new Ventana();
                    frame.setVisible(true);
                    frame.setLocationRelativeTo(null); //Para que salga centrada la pantalla
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
 
    /*
    * Metodo privado 
    * @param 
    */
    private Alimento crearAlimento(String nombre) throws SQLException, AltoNivelCaloricoException, AlimentoException, BajoNivelCaloricoException {
        ResultSet rs = smt.executeQuery("select * from comesano.alimento where nombre = '" + nombre + "'");
        Alimento alimento;//Usamos el polimorfismo y la conexiona a base de datos 
        rs.next();

        switch (rs.getInt("grupo")) {
            case 1:
                if (rs.getString("nivel").toUpperCase().equals("ALTO")) {
                    alimento = new Grupo1Alto_LecheDerivados(rs.getString("nombre"), rs.getInt("energia"),
                            rs.getInt("grasas"), rs.getInt("proteinas"), rs.getInt("carbohidratos"),
                            rs.getFloat("sal"), rs.getFloat("azucar"), rs.getInt("grasaSaturadas"));
                } else {
                    alimento = new Grupo1Bajo_LecheDerivados(rs.getString("nombre"), rs.getInt("energia"),
                            rs.getInt("grasas"), rs.getInt("proteinas"), rs.getInt("carbohidratos"),
                            rs.getFloat("sal"), rs.getFloat("azucar"), rs.getInt("grasaSaturadas"));
                }
                break;
            case 2:
                if (rs.getString("nivel").toUpperCase().equals("ALTO")) {
                    alimento = new Grupo2Alto_CarnesPescadosHuevos(rs.getString("nombre"), rs.getInt("energia"),
                            rs.getInt("grasas"), rs.getInt("proteinas"), rs.getInt("carbohidratos"),
                            rs.getFloat("sal"), rs.getFloat("azucar"), rs.getInt("grasaSaturadas"));
                } else {
                    alimento = new Grupo2Bajo_CarnesPescadosHuevos(rs.getString("nombre"), rs.getInt("energia"),
                            rs.getInt("grasas"), rs.getInt("proteinas"), rs.getInt("carbohidratos"),
                            rs.getFloat("sal"), rs.getFloat("azucar"), rs.getInt("grasaSaturadas"));
                }
                break;
            case 3:
                if (rs.getString("nivel").toUpperCase().equals("ALTO")) {
                    alimento = new Grupo3Alto_PatatasLegumbresFrutosSecos(rs.getString("nombre"), rs.getInt("energia"),
                            rs.getInt("grasas"), rs.getInt("proteinas"), rs.getInt("carbohidratos"),
                            rs.getFloat("sal"), rs.getFloat("azucar"), rs.getInt("fibra"));
                } else {
                    alimento = new Grupo3Bajo_PatatasLegunbresFrutosSecos(rs.getString("nombre"), rs.getInt("energia"),
                            rs.getInt("grasas"), rs.getInt("proteinas"), rs.getInt("carbohidratos"),
                            rs.getFloat("sal"), rs.getFloat("azucar"), rs.getInt("fibra"));
                }
                break;
            case 4:
                alimento = new Grupo4_VerduraHortalizas(rs.getString("nombre"), rs.getInt("energia"),
                        rs.getInt("grasas"), rs.getInt("proteinas"), rs.getInt("carbohidratos"),
                        rs.getFloat("sal"), rs.getFloat("azucar"), rs.getInt("fibra"));
                break;
            case 5:
                if (rs.getString("nivel").toUpperCase().equals("ALTO")) {
                    alimento = new Grupo5Alto_Frutas(rs.getString("nombre"), rs.getInt("energia"),
                            rs.getInt("grasas"), rs.getInt("proteinas"), rs.getInt("carbohidratos"),
                            rs.getFloat("sal"), rs.getFloat("azucar"), rs.getInt("fibra"));
                } else {
                    alimento = new Grupo5Bajo_Frutas(rs.getString("nombre"), rs.getInt("energia"),
                            rs.getInt("grasas"), rs.getInt("proteinas"), rs.getInt("carbohidratos"),
                            rs.getFloat("sal"), rs.getFloat("azucar"), rs.getInt("fibra"));
                }
                break;
            case 6:
                alimento = new Grupo6_CerealesDeriAzucarDeri(rs.getString("nombre"), rs.getInt("energia"),
                        rs.getInt("grasas"), rs.getInt("proteinas"), rs.getInt("carbohidratos"),
                        rs.getFloat("sal"), rs.getFloat("azucar"), rs.getInt("fibra"));
                break;
            default:    
                alimento = new Grupo7_GrasaAceitesMantequilla(rs.getString("nombre"), rs.getInt("energia"),
                        rs.getInt("grasas"), rs.getInt("proteinas"), rs.getInt("carbohidratos"),
                        rs.getFloat("sal"), rs.getFloat("azucar"), rs.getInt("grasaSaturadas"));
                break;
        }
        rs.close();
        return alimento;
    }
    /*
    Alimento alA = new GrupoXA();
    Alimento alB = new GrupoXB();
    AltoNivelCalorico anc = (AltoNivelCalorico) alA;
    */
    /*
    * Metodo privado 
    * @param 
    */
    private void crearDia() {
        try {
            //DESAYUNO
            AltoNivelCalorico d1 = (AltoNivelCalorico) crearAlimento(TF_1_Des.getText());
            AltoNivelCalorico d2 = (AltoNivelCalorico) crearAlimento(TF_2_Des.getText());
            BajoNivelCalorico da = (BajoNivelCalorico) crearAlimento(TF_A_Des.getText());
            Desayuno desayuno = new Desayuno(
                    d1, Integer.parseInt(TF_Cant_1_Des.getText()),
                    d2, Integer.parseInt(TF_Cant_2_Des.getText()),
                    da, Integer.parseInt(TF_Cant_A_Des.getText()));

            //ALMUERZO
            AltoNivelCalorico a1 = (AltoNivelCalorico) crearAlimento(TF_1_Alm.getText());
            BajoNivelCalorico a2 = (BajoNivelCalorico) crearAlimento(TF_2_Alm.getText());
            BajoNivelCalorico aa = (BajoNivelCalorico) crearAlimento(TF_A_Alm.getText());
            Almuerzo almuerzo = new Almuerzo(
                    a1, Integer.parseInt(TF_Cant_1_Alm.getText()),
                    a2, Integer.parseInt(TF_Cant_2_Alm.getText()),
                    aa, Integer.parseInt(TF_Cant_A_Alm.getText()));

            //CENA
            BajoNivelCalorico c1 = (BajoNivelCalorico) crearAlimento(TF_1_Cen.getText());
            BajoNivelCalorico c2 = (BajoNivelCalorico) crearAlimento(TF_2_Cen.getText());
            BajoNivelCalorico ca = (BajoNivelCalorico) crearAlimento(TF_A_Cen.getText());
            Cena cena = new Cena(
                    c1, Integer.parseInt(TF_Cant_1_Cen.getText()),
                    c2, Integer.parseInt(TF_Cant_2_Cen.getText()),
                    ca, Integer.parseInt(TF_Cant_A_Cen.getText()));

            Dia dia = new Dia(desayuno, almuerzo, cena);
            
            //Inicializamos el menu interno de clase al menu del dia creado
            menu = dia;
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Se ha perdido la conexión con el servidor");
        } catch (AltoNivelCaloricoException ex) {
            //Error al crear el altonivel valorico
            JOptionPane.showMessageDialog(null, "Hay un alimento que no va donde deberia ir");
        } catch (AlimentoException ex) {
            //error al crear el alimento
            JOptionPane.showMessageDialog(null, "Hay un alimento que no va donde deberia ir");
        } catch (BajoNivelCaloricoException ex) {
            //Error al  crear bajo nivel calorico
            JOptionPane.showMessageDialog(null, "Hay un alimento que no va donde deberia ir");
        } catch (ComidaException ex) {
            //error al crear la comida
            JOptionPane.showMessageDialog(null, "Hay un alimento que no va donde deberia ir");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Introduzca cantidades");
        } catch (ClassCastException ex){
            JOptionPane.showMessageDialog(null, "Hay un alimento que no va donde deberia ir");
        } catch (java.lang.NullPointerException ex) {
            //No hacemos nada
        }
    }

    /*
    * Metodo privado 
    * @param 
    */
    private void crearConex() throws SQLException {
        String url = "jdbc:mysql://127.0.0.1:3306/COMESANO?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String usuario = "root";
        String password = "ale";

        con = DriverManager.getConnection(url, usuario, password);
        smt = (Statement) con.createStatement();
    }

    /*
    * Metodo privado 
    * @param 
    */
    private int getNumeroFilas() throws SQLException {
        ResultSet rs = smt.executeQuery("select count(*) from comesano.alimento");
        rs.next();
        int count = rs.getInt(1);
        rs.close();
        return count;
    }

    /*
    * Metodo privado 
    * @param 
    */
    private String[] crearListaAlimentos() {
        try {
            int tamano = getNumeroFilas();
            String[] lista = new String[tamano];
            String alimento;
            int var = 0;
            ResultSet rs = smt.executeQuery("select * from Alimento");//Mediante este metodo selecionamos la tabla

            while (rs.next()) {
                alimento = rs.getString("nombre") + ": Alimento del Grupo " + rs.getString("grupo")
                        + " y de " + rs.getString("nivel") + " nivel calorico con " + rs.getInt("energia") + "Kcal por 100gr";
                lista[var] = alimento;
                var++;
            }
            rs.close();
            return lista;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo crear la lista de valores");
            return null;
        }

    }

    private String getSeleccionado() {
        return listaBD.getSelectedValue();
    }

    /*
    * Metodo privado 
    * @param 
    */
    private String getNombreAlimentoLista() {
        String nombre;
        String recuperado = getSeleccionado();
        //Obtenemos el nombre a partir de los : de la lista de alimentos
        String[] datos = recuperado.split(":");
        nombre = datos[0];  //Lo que está a la izquierda de los :
        return nombre;
    }

    /**
     * Create the frame. 
     * Si no podemos conectar con la base de datos, nos
     * mostrara un mensaje
     */
    public Ventana() {
        try {
            //Primero creamos la conexion
            crearConex();
            //Luego creamos la ventana
            setResizable(false);          
            setTitle("Comer m\u00E1s sano");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setBounds(100, 100, 900, 850);
            Fondo = new JPanel();
            Fondo.setBorder(new EmptyBorder(5, 5, 5, 5));
            setContentPane(Fondo);
            Fondo.setLayout(null);

            JLabel ETI_Nombre = new JLabel("BIENVENIDO A COMESANO");
            ETI_Nombre.setFont(new Font("Consolas", Font.PLAIN, 26));
            ETI_Nombre.setBounds(308, 11, 319, 36);
            Fondo.add(ETI_Nombre);

            JScrollPane SC_ListaBD = new JScrollPane();
            SC_ListaBD.setBounds(412, 96, 450, 195);
            Fondo.add(SC_ListaBD);

            listaBD = new JList<String>();
            listaBD.setToolTipText("");
            listaBD.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            listaBD.setModel(new AbstractListModel() {
                //Accedemos a la BD y creamos la lista de alimentos a elegir
                String[] values = crearListaAlimentos();

                public int getSize() {
                    return values.length;
                }

                public Object getElementAt(int index) {
                    return values[index];
                }
            });
            SC_ListaBD.setViewportView(listaBD);

            JScrollPane SC_dieta = new JScrollPane();
            SC_dieta.setBounds(412, 393, 450, 395);
            Fondo.add(SC_dieta);

            JTextPane TXT_dieta = new JTextPane();
            SC_dieta.setViewportView(TXT_dieta);

            JLabel ETI_ListaAlimentos = new JLabel("Lista de alimentos");
            ETI_ListaAlimentos.setFont(new Font("Consolas", Font.ITALIC, 18));
            ETI_ListaAlimentos.setBounds(533, 59, 210, 36);
            Fondo.add(ETI_ListaAlimentos);

            JLabel ETI_Dieta_Dia = new JLabel("Tu dieta del d\u00EDa");
            ETI_Dieta_Dia.setFont(new Font("Consolas", Font.ITALIC, 18));
            ETI_Dieta_Dia.setBounds(451, 346, 210, 36);
            Fondo.add(ETI_Dieta_Dia);

            JLabel ETI_Desayuno = new JLabel("Elige tu desayuno");
            ETI_Desayuno.setFont(new Font("Consolas", Font.ITALIC, 18));
            ETI_Desayuno.setBounds(32, 36, 210, 36);
            Fondo.add(ETI_Desayuno);

            JLabel ETI_1_Des = new JLabel("Primero (alto calorico)");
            ETI_1_Des.setFont(new Font("Consolas", Font.PLAIN, 14));
            ETI_1_Des.setBounds(32, 86, 219, 20);
            Fondo.add(ETI_1_Des);

            TF_Cant_1_Des = new JTextField();
            TF_Cant_1_Des.setBounds(308, 113, 50, 20);
            Fondo.add(TF_Cant_1_Des);
            TF_Cant_1_Des.setColumns(10);

            JButton BTN_Elegir_1_Des = new JButton("Elegir");
            BTN_Elegir_1_Des.setFont(new Font("Consolas", Font.BOLD, 12));
            BTN_Elegir_1_Des.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent arg0) {
                    TF_1_Des.setText(getNombreAlimentoLista());
                }
            });
            BTN_Elegir_1_Des.setBounds(269, 83, 89, 23);
            Fondo.add(BTN_Elegir_1_Des);

            JButton BTN_Elegir_2_Des = new JButton("Elegir");
            BTN_Elegir_2_Des.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    TF_2_Des.setText(getNombreAlimentoLista());
                }
            });
            BTN_Elegir_2_Des.setFont(new Font("Consolas", Font.BOLD, 12));
            BTN_Elegir_2_Des.setBounds(269, 144, 89, 23);
            Fondo.add(BTN_Elegir_2_Des);

            JLabel ETI_2_Des = new JLabel("Segundo (alto calorico)");
            ETI_2_Des.setFont(new Font("Consolas", Font.PLAIN, 14));
            ETI_2_Des.setBounds(32, 156, 190, 15);
            Fondo.add(ETI_2_Des);

            TF_Cant_2_Des = new JTextField();
            TF_Cant_2_Des.setColumns(10);
            TF_Cant_2_Des.setBounds(308, 179, 50, 20);
            Fondo.add(TF_Cant_2_Des);

            JButton BTN_Elegir_A_Des = new JButton("Elegir");
            BTN_Elegir_A_Des.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    TF_A_Des.setText(getNombreAlimentoLista());
                }
            });
            BTN_Elegir_A_Des.setFont(new Font("Consolas", Font.BOLD, 12));
            BTN_Elegir_A_Des.setBounds(269, 210, 89, 23);
            Fondo.add(BTN_Elegir_A_Des);

            JLabel ETI_A_Des = new JLabel("Acompa\u00F1ante (bajo cal\u00F3rico)");
            ETI_A_Des.setFont(new Font("Consolas", Font.PLAIN, 14));
            ETI_A_Des.setBounds(32, 217, 219, 15);
            Fondo.add(ETI_A_Des);

            TF_Cant_A_Des = new JTextField();
            TF_Cant_A_Des.setColumns(10);
            TF_Cant_A_Des.setBounds(308, 240, 50, 20);
            Fondo.add(TF_Cant_A_Des);

            JLabel ETI_Cant_2_Des = new JLabel("Cant.");
            ETI_Cant_2_Des.setBounds(269, 182, 38, 14);
            Fondo.add(ETI_Cant_2_Des);

            JLabel ETI_Cant_1_Des = new JLabel("Cant.");
            ETI_Cant_1_Des.setBounds(269, 116, 38, 15);
            Fondo.add(ETI_Cant_1_Des);

            JLabel ETI_Cant_A_Des = new JLabel("Cant.");
            ETI_Cant_A_Des.setBounds(269, 244, 38, 14);
            Fondo.add(ETI_Cant_A_Des);

            TF_1_Des = new JTextField();
            TF_1_Des.setEditable(false);
            TF_1_Des.setBounds(32, 114, 190, 20);
            Fondo.add(TF_1_Des);
            TF_1_Des.setColumns(10);

            TF_2_Des = new JTextField();
            TF_2_Des.setEditable(false);
            TF_2_Des.setColumns(10);
            TF_2_Des.setBounds(32, 182, 190, 20);
            Fondo.add(TF_2_Des);

            TF_A_Des = new JTextField();
            TF_A_Des.setEditable(false);
            TF_A_Des.setColumns(10);
            TF_A_Des.setBounds(32, 243, 190, 20);
            Fondo.add(TF_A_Des);

            JLabel ETI_Almuerzo = new JLabel("Elige tu almuerzo");
            ETI_Almuerzo.setFont(new Font("Consolas", Font.ITALIC, 18));
            ETI_Almuerzo.setBounds(32, 309, 210, 36);
            Fondo.add(ETI_Almuerzo);

            JLabel ETI_1_Alm = new JLabel("Primero (alto calorico)");
            ETI_1_Alm.setFont(new Font("Consolas", Font.PLAIN, 14));
            ETI_1_Alm.setBounds(32, 357, 190, 15);
            Fondo.add(ETI_1_Alm);

            TF_Cant_1_Alm = new JTextField();
            TF_Cant_1_Alm.setColumns(10);
            TF_Cant_1_Alm.setBounds(308, 382, 50, 20);
            Fondo.add(TF_Cant_1_Alm);

            JButton BTN_Elegir_1_Alm = new JButton("Elegir");
            BTN_Elegir_1_Alm.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    TF_1_Alm.setText(getNombreAlimentoLista());
                }
            });
            BTN_Elegir_1_Alm.setFont(new Font("Consolas", Font.BOLD, 12));
            BTN_Elegir_1_Alm.setBounds(269, 352, 89, 23);
            Fondo.add(BTN_Elegir_1_Alm);

            JButton BTN_Elegir_2_Alm = new JButton("Elegir");
            BTN_Elegir_2_Alm.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    TF_2_Alm.setText(getNombreAlimentoLista());
                }
            });
            BTN_Elegir_2_Alm.setFont(new Font("Consolas", Font.BOLD, 12));
            BTN_Elegir_2_Alm.setBounds(269, 413, 89, 23);
            Fondo.add(BTN_Elegir_2_Alm);

            JLabel ETI_2_Alm = new JLabel("Segundo (bajo calorico)");
            ETI_2_Alm.setFont(new Font("Consolas", Font.PLAIN, 14));
            ETI_2_Alm.setBounds(32, 422, 190, 15);
            Fondo.add(ETI_2_Alm);

            TF_Cant_2_Alm = new JTextField();
            TF_Cant_2_Alm.setColumns(10);
            TF_Cant_2_Alm.setBounds(308, 446, 50, 20);
            Fondo.add(TF_Cant_2_Alm);

            JButton BTN_Elegir_A_Alm = new JButton("Elegir");
            BTN_Elegir_A_Alm.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    TF_A_Alm.setText(getNombreAlimentoLista());
                }
            });
            BTN_Elegir_A_Alm.setFont(new Font("Consolas", Font.BOLD, 12));
            BTN_Elegir_A_Alm.setBounds(269, 479, 89, 23);
            Fondo.add(BTN_Elegir_A_Alm);

            JLabel ETI_A_Alm = new JLabel("Acompa\u00F1ante (bajo cal\u00F3rico)");
            ETI_A_Alm.setFont(new Font("Consolas", Font.PLAIN, 14));
            ETI_A_Alm.setBounds(32, 483, 219, 15);
            Fondo.add(ETI_A_Alm);

            TF_Cant_A_Alm = new JTextField();
            TF_Cant_A_Alm.setColumns(10);
            TF_Cant_A_Alm.setBounds(308, 509, 50, 20);
            Fondo.add(TF_Cant_A_Alm);

            JLabel ETI_Cant_2_Alm = new JLabel("Cant.");
            ETI_Cant_2_Alm.setBounds(269, 449, 38, 14);
            Fondo.add(ETI_Cant_2_Alm);

            JLabel ETI_Cant_1_Alm = new JLabel("Cant.");
            ETI_Cant_1_Alm.setBounds(269, 393, 38, 15);
            Fondo.add(ETI_Cant_1_Alm);

            JLabel ETI_Cant_A_Alm = new JLabel("Cant.");
            ETI_Cant_A_Alm.setBounds(269, 512, 38, 14);
            Fondo.add(ETI_Cant_A_Alm);

            TF_1_Alm = new JTextField();
            TF_1_Alm.setEditable(false);
            TF_1_Alm.setColumns(10);
            TF_1_Alm.setBounds(32, 380, 190, 20);
            Fondo.add(TF_1_Alm);

            TF_2_Alm = new JTextField();
            TF_2_Alm.setEditable(false);
            TF_2_Alm.setColumns(10);
            TF_2_Alm.setBounds(32, 448, 190, 20);
            Fondo.add(TF_2_Alm);

            TF_A_Alm = new JTextField();
            TF_A_Alm.setEditable(false);
            TF_A_Alm.setColumns(10);
            TF_A_Alm.setBounds(32, 509, 190, 20);
            Fondo.add(TF_A_Alm);

            JLabel ETI_Cena = new JLabel("Elige tu cena");
            ETI_Cena.setFont(new Font("Consolas", Font.ITALIC, 18));
            ETI_Cena.setBounds(32, 568, 210, 36);
            Fondo.add(ETI_Cena);

            JLabel ETI_1_Cen = new JLabel("Primero (bajo calorico)");
            ETI_1_Cen.setFont(new Font("Consolas", Font.PLAIN, 14));
            ETI_1_Cen.setBounds(32, 615, 190, 15);
            Fondo.add(ETI_1_Cen);

            TF_Cant_1_Cen = new JTextField();
            TF_Cant_1_Cen.setColumns(10);
            TF_Cant_1_Cen.setBounds(308, 641, 50, 20);
            Fondo.add(TF_Cant_1_Cen);

            JButton BTN_Elegir_1_Cen = new JButton("Elegir");
            BTN_Elegir_1_Cen.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    TF_1_Cen.setText(getNombreAlimentoLista());
                }
            });
            BTN_Elegir_1_Cen.setFont(new Font("Consolas", Font.BOLD, 12));
            BTN_Elegir_1_Cen.setBounds(269, 611, 89, 23);
            Fondo.add(BTN_Elegir_1_Cen);

            JButton BTN_Elegir_2_Cen = new JButton("Elegir");
            BTN_Elegir_2_Cen.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    TF_2_Cen.setText(getNombreAlimentoLista());
                }
            });
            BTN_Elegir_2_Cen.setFont(new Font("Consolas", Font.BOLD, 12));
            BTN_Elegir_2_Cen.setBounds(269, 672, 89, 23);
            Fondo.add(BTN_Elegir_2_Cen);

            JLabel ETI_2_Cen = new JLabel("Segundo(bajo calorico)");
            ETI_2_Cen.setFont(new Font("Consolas", Font.PLAIN, 14));
            ETI_2_Cen.setBounds(31, 681, 191, 15);
            Fondo.add(ETI_2_Cen);

            TF_Cant_2_Cen = new JTextField();
            TF_Cant_2_Cen.setColumns(10);
            TF_Cant_2_Cen.setBounds(308, 705, 50, 20);
            Fondo.add(TF_Cant_2_Cen);

            JButton BTN_Elegir_A_Cen = new JButton("Elegir");
            //Creamos el controlador del boton de elegir acom. cena
            BTN_Elegir_A_Cen.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    //Obtenemos el valor del alimento seleccionado
                    TF_A_Cen.setText(getNombreAlimentoLista());
                }
            });
            BTN_Elegir_A_Cen.setFont(new Font("Consolas", Font.BOLD, 12));
            BTN_Elegir_A_Cen.setBounds(269, 738, 89, 23);
            Fondo.add(BTN_Elegir_A_Cen);

            JLabel ETI_A_Cen = new JLabel("Acompa\u00F1ante (bajo cal\u00F3rico)");
            ETI_A_Cen.setFont(new Font("Consolas", Font.PLAIN, 14));
            ETI_A_Cen.setBounds(32, 742, 219, 15);
            Fondo.add(ETI_A_Cen);

            TF_Cant_A_Cen = new JTextField();
            TF_Cant_A_Cen.setColumns(10);
            TF_Cant_A_Cen.setBounds(308, 768, 50, 20);
            Fondo.add(TF_Cant_A_Cen);

            JLabel ETI_Cant_2_Cen = new JLabel("Cant.");
            ETI_Cant_2_Cen.setBounds(269, 711, 38, 14);
            Fondo.add(ETI_Cant_2_Cen);

            JLabel ETI_Cant_1_Cen = new JLabel("Cant.");
            ETI_Cant_1_Cen.setBounds(269, 644, 38, 15);
            Fondo.add(ETI_Cant_1_Cen);

            JLabel ETI_Cant_A_Cen = new JLabel("Cant.");
            ETI_Cant_A_Cen.setBounds(269, 774, 38, 14);
            Fondo.add(ETI_Cant_A_Cen);

            TF_1_Cen = new JTextField();
            TF_1_Cen.setEditable(false);
            TF_1_Cen.setColumns(10);
            TF_1_Cen.setBounds(32, 639, 190, 20);
            Fondo.add(TF_1_Cen);

            TF_2_Cen = new JTextField();
            TF_2_Cen.setEditable(false);
            TF_2_Cen.setColumns(10);
            TF_2_Cen.setBounds(32, 707, 190, 20);
            Fondo.add(TF_2_Cen);

            TF_A_Cen = new JTextField();
            TF_A_Cen.setEditable(false);
            TF_A_Cen.setColumns(10);
            TF_A_Cen.setBounds(32, 768, 190, 20);
            Fondo.add(TF_A_Cen);

            JSeparator separator = new JSeparator();
            separator.setBounds(427, 321, 421, 2);
            Fondo.add(separator);

            JButton BTN_CrearMen7u = new JButton("Crear");
            //Creamos el controlador del boton de crear menu
            BTN_CrearMen7u.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    try {
                        //Llamamos a crear un menu del dia y lo mostramos
                        //por el textField
                        crearDia();
                        String menuDato = menu.toString();
                        TXT_dieta.setText(menuDato);
                    } catch (NullPointerException ex) {
                        //No hacemos nada
                    }
                }
            });
            BTN_CrearMen7u.setFont(new Font("Consolas", Font.BOLD, 17));
            BTN_CrearMen7u.setBounds(707, 349, 89, 23);
            Fondo.add(BTN_CrearMen7u);

            JSeparator separator_1 = new JSeparator();
            separator_1.setBounds(58, 289, 265, 2);
            Fondo.add(separator_1);

            JSeparator separator_1_1 = new JSeparator();
            separator_1_1.setBounds(58, 555, 265, 2);
            Fondo.add(separator_1_1);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo conectar con el servidor");
            System.exit(0);
        }
    }
}
