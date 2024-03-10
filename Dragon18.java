/**
 * Dragon18
 */
public class Dragon18 {
    int x, y, width, height;

    void moveLeft() {
        if (x > 0) {
            x -= 1;

        } else {
            detectCollision(x, y);
        }
    }

    void moveRight() {
        if (x < width) {
            x += 1;

        } else {
            detectCollision(x, y);
        }
    }

    void moveUp() {
        if (y > 0) {
            y -= 1;

        } else {
            detectCollision(x, y);
        }
    }

    void moveDown() {
        if (y < height) {
            y += 1;
        } else {
            detectCollision(x, y);
        }
    }

    void printPosition() {
        System.out.println("Posisi dragon :(" + x + "," + y + ")");
    }

    void detectCollision(int x, int y) {
        System.out.println("Game Over!");
    }
}