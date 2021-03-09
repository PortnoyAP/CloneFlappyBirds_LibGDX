package com.mygdx.game.bird;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class Bird {
        private boolean isGameStarted;

        private float speedFalling;
        private float gravity;
        private int birdFly = 0;
        private Texture[]imagesBird;
        private Vector2 birdPosition;
        public static final int NUMBER_OF_PICTURES_BIRDS = 4;

    public Bird() {
        imagesBird = new Texture[NUMBER_OF_PICTURES_BIRDS];
        imagesBird[0] = new BirdImage().getBirdWingsUpImage();
        imagesBird[1] = new BirdImage().getBirdWingsUpImage();
        imagesBird[2] = new BirdImage().getBirdWingsDownImage();
        imagesBird[3] = new BirdImage().getBirdWingsDownImage();
        birdPosition = new Vector2(Gdx.graphics.getWidth() / 2 -imagesBird[birdFly].getWidth() /2,
                Gdx.graphics.getHeight() / 2 -imagesBird[birdFly].getHeight() / 2);
        gravity=birdPosition.y;
    }

    public void render(SpriteBatch batch)  {

        keysListener();


        if(isGameStarted) {
            birdPosition();
        }



        switch(birdFly){
            case 0 : birdFly = 1;
                 break;
            case 1 : birdFly = 2;
                break;
            case 2 : birdFly = 3;
                break;
            case 3 : birdFly = 0;
                break;
            default: break;

        }
        batch.draw(imagesBird[birdFly],birdPosition.x,birdPosition.y);

    }

    public void keysListener() {
        if(Gdx.input.isKeyPressed(Input.Keys.SPACE)) {
           isGameStarted=true;
           speedFalling=-7;
        }

    }
    public float getGravity() {
            speedFalling+=0.4;
            return gravity-= speedFalling;

    }

    public void birdPosition(){
        float currentGravity=getGravity();
        birdPosition.set(birdPosition.x,gravity);
    }

    public boolean isGameStarted() {
        return isGameStarted;
    }
}
