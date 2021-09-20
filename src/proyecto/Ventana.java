package proyecto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.regex.*;

public class Ventana extends JFrame{

    private JPanel Panel1;
    private JLabel Datos_usuario;
    private JLabel Nombre;
    private JTextField Nombre_input;
    private JLabel Apellido;
    private JTextField Apellido_input;
    private JLabel Correo_electronico;
    private JTextField Correo_electronico_input;
    private JLabel Edad;
    private JTextField Edad_input;
    private JButton ingresarButton;
    private JButton salirButton;
    private JComboBox Lista_enfermedades;
    private JLabel Enfermedad;


    public Ventana(){
        super("Datos personales del usuario");
        setContentPane(Panel1);

        //Aparece mensaje de bienvenida cuando se presiona el boton "Ingresar"
        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //Nombre

                String patron_letras = "[a-zA-z]+";
                Pattern p = Pattern.compile(patron_letras);
                Matcher m = p.matcher(Nombre_input.getText());

                //Apllidos

                Matcher m2 = p.matcher(Apellido_input.getText());

                //Correo
                String patron_email = "(.+)@(.+)[.]com";
                p = Pattern.compile(patron_email);
                Matcher m1 = p.matcher(Correo_electronico_input.getText());

                //Edad

                String patron_edad = "[0-9]+";
                p = Pattern.compile(patron_edad);
                Matcher m3 = p.matcher(Edad_input.getText());

                if(m.matches() && m1.matches() && m2.matches() && m3.matches() && Lista_enfermedades.getSelectedItem().toString().length()!= 0){
                    JOptionPane.showMessageDialog(null, "Bienvenido " + Nombre_input.getText());
                    JFrame frame2 = new Ventana2();
                    frame2.setSize(570, 200);
                    frame2.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, "Error al ingresar los datos");
                }


            }
        });

        //Sale de la aplicación
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                System.exit(0);
            }
        });


        Correo_electronico_input.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {

                super.focusLost(e);
            }
        });
        Nombre_input.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                super.focusLost(e);
            }

        });
        Apellido_input.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                super.focusLost(e);
            }
        });

        Edad_input.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                super.focusLost(e);
            }
        });
        Lista_enfermedades.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                super.focusLost(e);
            }
        });
    }
}
