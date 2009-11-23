package net.nchelluri.projectEuler.problems.p21to30;

public class Problem28
{
    public static void main(String[] args)
    {
        long time = System.currentTimeMillis();

        int[][] spiral = spiral(1001);

        int sum = 0;
        for (int i = 0; i < spiral.length; i++) {
            sum += spiral[i][i];
            if (i != spiral.length - i - 1) {
                sum += spiral[i][spiral.length - i - 1];
            }
        }

        System.out.println(sum);

        System.out.println("Execution time: " + (System.currentTimeMillis() - time) + "ms");
    }

    private enum Direction
    {
        UP, DOWN, LEFT, RIGHT
    };

    public static int[][] spiral(int dim)
    {

        int[][] spiral = new int[dim][dim];

        int remaining = dim * dim;

        int x = dim - 1;
        int y = 0;

        int dimsWorkedOn = 0;

        Direction direction = Direction.LEFT;

        while (remaining > 0) {
            spiral[y][x] = remaining;
            remaining--;

            switch (direction) {
                case LEFT:
                    x--;
                    if (x < dimsWorkedOn) {
                        x = dimsWorkedOn;
                        y++;
                        direction = Direction.DOWN;
                    }
                    break;
                case DOWN:
                    y++;
                    if (y + dimsWorkedOn >= dim) {
                        y--;
                        x++;
                        direction = Direction.RIGHT;
                    }
                    break;
                case RIGHT:
                    x++;
                    if (x >= dim - dimsWorkedOn) {
                        x--;
                        y--;
                        direction = Direction.UP;
                    }
                    break;
                case UP:
                    y--;
                    if (y < dimsWorkedOn + 1) {
                        y++;
                        x--;
                        dimsWorkedOn++;
                        direction = Direction.LEFT;
                    }
                    break;
            }
        }

        return spiral;
    }
}
