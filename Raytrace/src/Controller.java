public class Controller {
    public static Layout newLayout;
    public long lastTime = System.nanoTime();
    private long timer = System.currentTimeMillis();
    private final double ns = 1000000000.0 / 60;
    private double delta = 0;
    public int frames = 0;
    
    public Controller(){
        while(true){
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;
            while(delta >= 1){
                //Update 3d shit
                delta--;
            }
            frames++;

            if(System.currentTimeMillis() - timer > 1000){
                timer += 1000;
                newLayout.showInfo(frames);
                frames = 0;
            }
        }
    }
    

}
