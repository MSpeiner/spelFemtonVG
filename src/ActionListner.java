import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

//Klassen Actionlistener implementerar ifrån AtctionListener
public class ActionListner implements ActionListener {
    //Skapar upp 2 Arraylist av typen JButton, samt 1 label och 1 Jpanel
    ArrayList<JButton> rättadKnappLista;
    ArrayList<JButton> knappLista;
    JLabel vinstMeddelande;
    JPanel southPanel;
//Skapar en Actionperformed med en actionevent
    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < knappLista.size(); i++) {
            JButton kontrollKnapp = knappLista.get(i);
            JButton rättadListaKontrollknapp = rättadKnappLista.get(i);


            if (kontrollKnapp.equals(rättadListaKontrollknapp)) {
                vinstMeddelande.setText("Du har vunnit!");
                southPanel.setBackground(Color.GREEN);
            } else {
                vinstMeddelande.setText("Du är inte klar, något stämmer inte");
                southPanel.setBackground(Color.RED);
            }


        }
    }
}
