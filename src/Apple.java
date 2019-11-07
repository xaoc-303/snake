public class Apple {

    public int posX;
    public int posY;

    public Apple(int x, int y) {
        posX = x;
        posY = y;
    }

    public void setRandomPosition() {
        posX = (int) (Math.random() * MainWindow.WIDTH - 1);
        posY = (int) (Math.random() * MainWindow.HEIGHT - 1);
    }
}
