import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Metoder extends JFrame{

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

    //Skapar Huvudkod h
    Huvudkod h;


//Skapar upp konstruktor för Meoder klassen
    Metoder(Huvudkod h){
        this.h=h;
    }

    //Skapar upp metod för att lägga till knappar i lista
    public void läggaTillKnappar(){
        for (int i = 0; i <h.knappLista.size() ; i++) {
            JButton knapp = h.knappLista.get(i);
            h.centerPanel.add(knapp);
        }
    }

//Lägger till knappar i knappLista
    public void skapaKnappar (){
        h.knappLista.add(knappEtt);
        h.knappLista.add(knappTvå);
        h.knappLista.add(knappTre);
        h.knappLista.add(knappFyra);
        h.knappLista.add(knappFem);
        h.knappLista.add(knappSex);
        h.knappLista.add(knappSju);
        h.knappLista.add(knappÅtta);
        h.knappLista.add(knappNio);
        h.knappLista.add(knappTio);
        h.knappLista.add(knappElva);
        h.knappLista.add(knappTolv);
        h.knappLista.add(knappTretton);
        h.knappLista.add(knappFjorton);
        h.knappLista.add(knappFemton);
        h.knappLista.add(knappSexton);
    }

    //Metod för att lägga till positionen för alla paneler
    public void läggTillIJP(){
        h.jp.setLayout(new BorderLayout());
        h.jp.add(h.northPanel, BorderLayout.NORTH);
        h.jp.add(h.centerPanel, BorderLayout.CENTER);
        h.jp.add(h.southPanel, BorderLayout.SOUTH);
    }

    //Skapar metod för sätta layoten på norh panel
    public void layoutNorthCenterPanel(){
        h.northPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        h.centerPanel.setLayout(new GridLayout(4, 4));
        h.southPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
    }

    //Skapar metod för att skapaKnappar till north panel
    public void skapaKnapparNorthPanel(){
        h.northPanel.add(nyttSpel);
        h.northPanel.add(rättaSpel);
    }

    //Skapar metod för vinstmeddelande
    public void setVinstMeddelande(){
        h.southPanel.add(vinstMeddelande);
    }

    //Metod för att kolla om valda knappar befinner sig bredvid varandra eller inte
    public boolean kontrolleraGranne(int indexEtt, int indexAndra) {
        int antalRutor = 4;
        int radEtt = indexEtt / antalRutor; // 0
        int kolumnEtt = indexEtt % antalRutor; //2
        int radTvå = indexAndra / antalRutor; //1
        int kolumnTvå = indexAndra % antalRutor; //2

        return Math.abs(radEtt - radTvå) + Math.abs(kolumnEtt - kolumnTvå) == 1;
    }

//Skapar metod för att sätta utsendet på programmet storlek osv
    public void setstil(){
        h.setSize(700, 700);
        h.setResizable(false);
        h.setVisible(true);
        h.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
