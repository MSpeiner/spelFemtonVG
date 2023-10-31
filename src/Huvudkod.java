import javax.swing.*;
import java.util.ArrayList;

public class Huvudkod extends JFrame {
    //Skapar upp paneler Huvudkod
    final static JPanel jp = new JPanel();
    final static JPanel northPanel = new JPanel();
    final static JPanel centerPanel = new JPanel();
    final static JPanel southPanel = new JPanel();

    //Skapar instans för metoder
    Metoder m = new Metoder(this);
    //Skapar knappLista
    ArrayList<JButton> knappLista = new ArrayList<>();

    Huvudkod() {
        //Lägger till knappar till listan
        m.skapaKnappar(knappLista);

        //Skapar upp en ny lista som blir en kopia av knapplista
        ArrayList<JButton> rättadKnappLista = new ArrayList<JButton>(knappLista);

        //Skapar upp paneler & setLayout på "jp"
        this.add(jp);
        m.läggTillIJP(jp, northPanel, centerPanel, southPanel);

        //Skapar upp knappar för center
        m.läggaTillKnappar(knappLista, centerPanel);

        //Knappar för south
        m.setVinstMeddelande();
    }

        public static void main(String[] args) {
        Huvudkod hk = new Huvudkod();
    }
}

