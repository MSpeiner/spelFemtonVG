import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

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
        m.skapaKnappar();

        //Skapar upp en ny lista som blir en kopia av knapplista
        ArrayList<JButton> rättadKnappLista = new ArrayList<JButton>(knappLista);

        //Skapar upp paneler & setLayout på "jp"
        this.add(jp);
        m.läggTillIJP();

        //North & Center Panel setLayout
        m.layoutNorthCenterPanel();

        //Skapar knappar för North
        m.skapaKnapparNorthPanel();

        //Skapar upp knappar för center
        m.läggaTillKnappar();

        //Knappar för south
        m.setVinstMeddelande();

        //Actionlistener för NyttSpel knapp
        m.nyttSpel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Collections.shuffle(knappLista);
                centerPanel.removeAll();
                for (JButton knapp : knappLista) {
                    centerPanel.add(knapp);
                }
                centerPanel.revalidate();
                repaint();
            }
        });

        //Anropar metoden rättaSpel (Actionlistener)
        m.rättaSpel.addActionListener(new ActionListner(rättadKnappLista, knappLista, m.vinstMeddelande, southPanel));

        //Action listener för samtliga knappar
        final JButton[] FörstaTrycktaKnappen = {new JButton()};
        for (int i = 0; i < knappLista.size(); i++) {
            JButton trycktKnapp = knappLista.get(i);
            trycktKnapp.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (FörstaTrycktaKnappen[0] == null) {
                        FörstaTrycktaKnappen[0] = trycktKnapp;
                    } else {
                        if (FörstaTrycktaKnappen[0] == m.knappSexton || trycktKnapp == m.knappSexton) {
                            int indexEtt = knappLista.indexOf(FörstaTrycktaKnappen[0]);
                            int indexAndra = knappLista.indexOf(trycktKnapp);
                            if (m.kontrolleraGranne(indexEtt, indexAndra)) {
                                Collections.swap(knappLista, indexEtt, indexAndra);
                                centerPanel.removeAll();
                                for (JButton knapp : knappLista) {
                                    centerPanel.add(knapp);
                                }
                                revalidate();
                                repaint();
                            }
                            FörstaTrycktaKnappen[0] = null;
                        }
                    }
                }
            });
        }
        m.setstil();
    }
        public static void main(String[] args) {
        Huvudkod hk = new Huvudkod();
    }
}

