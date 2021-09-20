package proyecto;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run(){
                    JFrame frame = new Ventana();
                    frame.setSize(520, 200);
                    frame.setVisible(true);
                }
        });
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run(){
                JFrame frame3 = new Ventana3();
                frame3.setSize(350, 600);
                frame3.setVisible(true);
            }
        });

    }
}