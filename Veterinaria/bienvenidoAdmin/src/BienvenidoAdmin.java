import javax.swing.*;

public class BienvenidoAdmin extends JFrame{
    private JPanel BienvenidoAdmin;
    private JButton Crear;
    private JButton Modificar;
    private JButton Desactivar;
    private JLabel Bienvenido;
    private JLabel QueHacer;

    public BienvenidoAdmin(String title){
        super(title);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(BienvenidoAdmin);
        setSize(800,500);
    }
    public static void main(String[] args){
        JFrame frame=new BienvenidoAdmin("veterinaria");
        frame.setVisible(true);
    }
}
