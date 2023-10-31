import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Metoder extends JFrame{
    //Skapar upp Paneler
    JPanel jp;
    JPanel northPanel;
    JPanel centerPanel;
    JPanel southPanel;

    //skapar upp 16 knappar för centerPanel
    JButton knappEtt = new JButton("1");
    JButton knappTvå = new JButton("2");
    JButton knappTre = new JButton("3");
    JButton knappFyra = new JButton("4");
    JButton knappFem = new JButton("5");
    JButton knappSex = new JButton("6");
    JButton knappSju = new JButton("7");
    JButton knappÅtta = new JButton("8");
    JButton knappNio = new JButton("9");
    JButton knappTio = new JButton("10");
    JButton knappElva = new JButton("11");
    JButton knappTolv = new JButton("12");
    JButton knappTretton = new JButton("13");
    JButton knappFjorton = new JButton("14");
    JButton knappFemton = new JButton("15");
    JButton knappSexton = new JButton(" ");

    //Skapar upp 2 knappar för northPanel
    JButton nyttSpel = new JButton("Nytt Spel");
    JButton rättaSpel = new JButton("Rätta ditt spel");

    //South panel
    JLabel vinstMeddelande = new JLabel(" ");
    JLabel antalVinster = new JLabel(" ");
    Huvudkod h;

//Skapar upp konstruktor för Meoder klassen
    Metoder(Huvudkod h){
        this.jp = h.jp;
        this.northPanel = h.northPanel;
        this.centerPanel = h.centerPanel;
        this.southPanel = h.southPanel;
        this.h=h;
    }

    //Skapar upp metod för att lägga till knappar i lista
    public void läggaTillKnappar(ArrayList<JButton> knappLista, JPanel centerPanel){
        for (int i = 0; i <knappLista.size() ; i++) {
            JButton knapp = knappLista.get(i);
            centerPanel.add(knapp);
        }
    }
//Lägger till knappar i knappLista
    public void skapaKnappar (ArrayList<JButton> knappLista){
        knappLista.add(knappEtt);
        knappLista.add(knappTvå);
        knappLista.add(knappTre);
        knappLista.add(knappFyra);
        knappLista.add(knappFem);
        knappLista.add(knappSex);
        knappLista.add(knappSju);
        knappLista.add(knappÅtta);
        knappLista.add(knappNio);
        knappLista.add(knappTio);
        knappLista.add(knappElva);
        knappLista.add(knappTolv);
        knappLista.add(knappTretton);
        knappLista.add(knappFjorton);
        knappLista.add(knappFemton);
        knappLista.add(knappSexton);
    }
    //Metod för att lägga till positionen för alla paneler
    public void läggTillIJP(JPanel jp, JPanel northPanel, JPanel centerPanel, JPanel southPanel){
        jp.setLayout(new BorderLayout());
        jp.add(northPanel, BorderLayout.NORTH);
        jp.add(centerPanel, BorderLayout.CENTER);
        jp.add(southPanel, BorderLayout.SOUTH);
    }
    //Skapar metod för sätta layoten på norh panel
    public void layoutNorthCenterPanel(){
        northPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        centerPanel.setLayout(new GridLayout(4, 4));
        southPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
    }
    //Skapar metod för att skapaKnappar till north panel
    public void skapaKnapparNorthPanel(JButton nyttSpel, JButton rättaSpel){
        northPanel.add(nyttSpel);
        northPanel.add(rättaSpel);
    }
    //Skapar metod för vinstmeddelande
    public void setVinstMeddelande(){
        southPanel.add(vinstMeddelande);
        southPanel.add(antalVinster);
    }
//Skapar metod för att sätta utsendet på programmet storlek osv..
    public void setstil(){
        h.setSize(700, 700);
        h.setResizable(false);
        h.setVisible(true);
        h.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


}
