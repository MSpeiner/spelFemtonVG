import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

//Klassen Actionlistener implementerar ifrån AtctionListener
public class ActionListner implements ActionListener {
    Huvudkod h;
    ArrayList<JButton> rättadKnappLista;

    //Konstruktor för actionlistenerklassen
    public ActionListner(Huvudkod h, ArrayList<JButton> rättadKnappLista) {
        this.h=h;
        this.rättadKnappLista=rättadKnappLista;
    }

//Skapar en Actionperformed med en actionevent
    @Override
    public void actionPerformed(ActionEvent e) {
        boolean vinst = true;
        for (int i = 0; i < h.knappLista.size(); i++) {
            JButton kontrollKnapp = h.knappLista.get(i);
            JButton rättadListaKontrollknapp = rättadKnappLista.get(i);

            if (!kontrollKnapp.equals(rättadListaKontrollknapp)) {
                vinst = false;
                break;
            }
        }

        if (vinst) {
            h.m.vinstMeddelande.setText("Du har vunnit!");
            h.southPanel.setBackground(Color.GREEN);
        } else {
            h.m.vinstMeddelande.setText("Du är inte klar, något stämmer inte");
            h.southPanel.setBackground(Color.RED);
        }
    }
}
