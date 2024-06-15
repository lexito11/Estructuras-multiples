import javax.swing.JOptionPane;
public class EstructuDControlM {

	public static void main(String[] args) {
        String animal = JOptionPane.showInputDialog("Ingrese el nombre del animal (perro, gato o ratón):");

        String sonido;

        switch (animal.toLowerCase()) {
            case "perro":
                sonido = "Guau guau";
                break;
            case "gato":
                sonido = "Miau miau";
                break;
            case "ratón":
                sonido = "Chit chit";
                break;
            default:
                sonido = "Animal desconocido";
                break;
        }

        JOptionPane.showMessageDialog(null, "El sonido del " + animal + " es: " + sonido);

	}

}
