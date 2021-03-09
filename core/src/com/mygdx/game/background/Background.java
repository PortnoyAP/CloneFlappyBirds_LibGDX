package com.mygdx.game.background;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;


public class Background {

    public static final int SPEED_MOVE_IMAGE = 4;
    public static final int NUMBER_OF_PICTURES_BACKGROUND = 2;
    private BackgroundImage[] images;

    public Background() {
        images = new BackgroundImage[NUMBER_OF_PICTURES_BACKGROUND];
        images[0] = new BackgroundImage( new Vector2(0,0));
        images[1] = new BackgroundImage( new Vector2(1000,0));
    }

    public void render(SpriteBatch batch) {

        moveImages();

        for(int i = 0; i<images.length; i++ ) {
            batch.draw( images[i].getBackGroundImage(),
                        images[i].getPosition().x,
                        images[i].getPosition().y);
        }
    }

    private void moveImages() {

        for(int i = 0; i< images.length; i++) {
            images[i].getPosition().x-=SPEED_MOVE_IMAGE;
        }
        if( images[0].getPosition().x<-1000) {
            images[0].setPosition(0);
            images[1].setPosition(1000);
        }
    }



}
