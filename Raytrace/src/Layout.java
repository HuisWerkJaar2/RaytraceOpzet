import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicGraphicsUtils;

public class Layout{
    public JFrame frame; //Frame voor alle content
    public JPanel panel = new JPanel();//Panel voor toevoegen van labels fov en fps
    ImageIcon iconFrame = new ImageIcon("images/fruitschaal.jpg"); //Maakt het icon voor het frame
    private JLabel fpsLabel = new JLabel(); //Label die de fps laat zien
    private JLabel fovLabel = new JLabel(); //Label die de fov laat zien.  Misschien een slider van gaan maken zo dat de fov kan worden aangepast.
    public String title = "RaytraceMakker"; //De titel van het frame
    private int width = 800; //Breedte van het begin frame
    private int height = 600; //Hoogte van het begin frame

    public Layout(){
    	updatePanel();
        makeFrame(); //Roept de functie op die het frame maakt en alle atributen toe voegt
   }
   
   public void makeFrame(){
        frame = new JFrame(); //Nieuw frame
        frame.setMinimumSize(new Dimension(width, height)); //Zet de begin groote van het frame
        frame.getContentPane().setBackground(Color.YELLOW); //Kleur frame achtergrond geel
        frame.add(panel, BorderLayout.WEST); //Voegt het panel toe
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Actie die er voor zorgt dat als je op het kruisje drukt dat hij echt afsluit en niet op achtergrond draait
        frame.setTitle(title); //Zet de titel van het frame neer.
        frame.setVisible(true); //Maakt het frame zichtbaar
        frame.setIconImage(iconFrame.getImage()); //Zet het logo in de frame
        
   }
   
   public void updatePanel() {
	   panel.setBackground(new Color(0,0,0,25)); //Maakt het panel een beetje door zichtig
	   panel.setPreferredSize(new Dimension(100, 100)); //Een minimale hoogte en breedte van het paneel
   }
   
   public void showInfo(int fps) {
	   fpsLabel.setText("fps: " + fps); //Tekst van label fps geplaatst
	   panel.add(fpsLabel); //Voegt fpsLabel toe aan het panel
	   panel.add(fovLabel); //Voegt fovLabel toe aan het panel
   }
}
