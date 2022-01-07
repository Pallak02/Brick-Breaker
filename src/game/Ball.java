package game;

import javax.swing.ImageIcon;

public class Ball extends Sprite {

    private int xdir, ydir;

    public Ball(){
        initBall();
    }

    private void initBall(){

        xdir = 1;
        ydir = -1;

        loadImage();
        getImageDimensions();
        resetState();

    }

    private void loadImage(){

        var ii = new ImageIcon("src/resources/ball.png");
        image = ii.getImage();
    }

    void move(){

        x += xdir;
        y += ydir;

        if (x == 0){
            setXdir(1);
        }

        if (x == Commons.WIDTH - imageWidth){
            setXdir(-1);
        }

        if (y == 0){
            setYdir(1);
        }

    }

    private void resetState(){
        x=Commons.INIT_BALL_X;
        y=Commons.INIT_BALL_Y;
    }

    void setXdir(int x){
        xdir = x;
    }

    void setYdir(int y){
        ydir = y;
    }

    int getYdir(){
        return ydir;
    }


}
