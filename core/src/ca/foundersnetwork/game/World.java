package ca.foundersnetwork.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import static ca.foundersnetwork.game.Constants.*;


/**
 * Created by abdulkhan on 3/1/15.
 */
public class World implements InputProcessor {

    /**
     * Camera used to view different areas of the world.
     */
    private OrthographicCamera gameCamera;

    /**
     * LibGDX class used to display images
     */
    private SpriteBatch batch;

    /**
     * LibGDX class used to maintain aspect ratio
     */
    private Viewport viewport;

    /**
     * Data structure for the "Flappy Box"
     */
    private Player player;

    /**
     * Data structure to represent a group of obstacles. Two obstacles make one gate.
     */
    private ObstacleCollection obstacles;

    /**
     * The gravity in world units.
     */
    private float gravity;

    /**
     * The speed we set the box to jump at when we provide the device input.
     */
    private float jumpVelocity;

    /**
     * The state of the game
     */
    private GameState state;

    /**
     * The width of our view in world units.
     */
    private float viewportWidth;

    /**
     * The height of our view in world units.
     */
    private float viewportHeight;

    public World() {

    }

    /**
     *
     * The update method is where we calculate any changes in our data, due to factors such as User input, or
     * in-game environmental factors such as gravity.
     *
     * @param deltaTime The time, as provided by LibGDX, that it takes for one frame to go by
     */
    public void update(float deltaTime) {


    }

    /**
     * Renders the world and its members
     */
    public void render() {




    }

    /**
     * If the game is pending start, we start the game if ANY key is pressed. To jump, we require the user to hit the space bar.
     *
     * @param keycode one of the constants in {@link com.badlogic.gdx.Input.Keys}
     * @return whether the input was processed
     */
    @Override
    public boolean keyDown(int keycode) {


        return false;
    }

    /**
     * Called when a key was released
     *
     * @param keycode one of the constants in {@link com.badlogic.gdx.Input.Keys}
     * @return whether the input was processed
     */
    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    /**
     * Called when a key was typed
     *
     * @param character The character
     * @return whether the input was processed
     */
    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    /**
     * Called when the screen was touched or a mouse button was pressed. The button parameter will be {@link Buttons#LEFT} on iOS.
     *
     * @param screenX The x coordinate, origin is in the upper left corner
     * @param screenY The y coordinate, origin is in the upper left corner
     * @param pointer the pointer for the event.
     * @param button  the button
     * @return whether the input was processed
     */
    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    /**
     * Called when a finger was lifted or a mouse button was released. The button parameter will be {@link Buttons#LEFT} on iOS.
     *
     * @param screenX
     * @param screenY
     * @param pointer the pointer for the event.
     * @param button  the button   @return whether the input was processed
     */
    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    /**
     * Called when a finger or the mouse was dragged.
     *
     * @param screenX
     * @param screenY
     * @param pointer the pointer for the event.  @return whether the input was processed
     */
    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    /**
     * Called when the mouse was moved without any buttons being pressed. Will not be called on iOS.
     *
     * @param screenX
     * @param screenY
     * @return whether the input was processed
     */
    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    /**
     * Called when the mouse wheel was scrolled. Will not be called on iOS.
     *
     * @param amount the scroll amount, -1 or 1 depending on the direction the wheel was scrolled.
     * @return whether the input was processed.
     */
    @Override
    public boolean scrolled(int amount) {
        return false;
    }
}
