package com.mygdx.game.bird;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

public class BirdImage {
    private Texture birdWingsUpImage;
    private Texture birdWingsDownImage;

    public BirdImage() {
        birdWingsUpImage = new Texture("bird_wings_up.png");
        birdWingsDownImage = new Texture("bird_wings_down.png");

    }

    public Texture getBirdWingsUpImage() {
        return birdWingsUpImage;
    }

    public Texture getBirdWingsDownImage() {
        return birdWingsDownImage;
    }


}
