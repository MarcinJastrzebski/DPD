package Rectangle;

public class Rectangle {
    private int height;
    private int width;
    private char[][] array;

    public void drawInConsole(char setLetterOnTheEdges, char setLetterOFTheFirstDiagonal,
                              char setLetterOfTheSecondDiagonal, char setLetterOfTheSurface) {


        double tmpDiagonal = (double) width / (double) height;
        double margin = 0.35;
        //System.out.println(tmpDiagonal);

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {

                //Edges
                if (i == 0 || i == height - 1 || j == 0 || j == width - 1) {
                    array[i][j] = setLetterOnTheEdges;
                }

                //Diagonals Corners in uneven walls
                //left up corner
                if (i == 1 && i < height - 1 && j == 1 && j < width) {
                    array[i][j] = setLetterOFTheFirstDiagonal;
                }
                //right up corner
                if (i == 1 && i < height - 1 && j == width - 2) {
                    array[i][j] = setLetterOfTheSecondDiagonal;
                }
                //left bottom corner
                if (i > 0 && i == height - 2 && j == 1 && j < width) {
                    array[i][j] = setLetterOFTheFirstDiagonal;
                }
                //right bottom corner
                if (i > 0 && i == height - 2 && j > 0 && j == width - 2) {
                    array[i][j] = setLetterOfTheSecondDiagonal;
                }

                if (i > 0 && i < height - 1 && j > 0 && j < width - 1) {
                    if (Math.round((double) (i) * tmpDiagonal) == j) {
                        array[i][j] = setLetterOFTheFirstDiagonal;
                    }

                    if (width - 1 - Math.round((double) (i) * tmpDiagonal) == j) {
                        array[i][j] = setLetterOfTheSecondDiagonal;
                    }
                }

                if (i > 0 && i < height - 1 && j > 0 && j < width - 1) {
                    if (Math.round(((double) i + margin) * tmpDiagonal) == j) {
                        array[i][j] = setLetterOFTheFirstDiagonal;
                    }

                    if (width - 1 - Math.round(((double) i + margin) * tmpDiagonal) == j) {
                        array[i][j] = setLetterOfTheSecondDiagonal;
                    }
                }

                if (array[i][j] == ' ') {
                    array[i][j] = setLetterOfTheSurface;
                }

            }
        }


        //printowanie
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

    }

    public Rectangle(int height, int width) {
        if (height > 0 && width > 0) {
            this.width = width;
            this.height = height;
            this.array = new char[height][width];

            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    array[i][j] = ' ';
                }
            }

        }
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
        this.array = new char [this.height][this.width];


        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < width; j++) {
                array[i][j] = ' ';
            }
        }
    }

    public void setHeight(int height) {
        this.height = height;
        this.array = new char [this.height][this.width];


        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < width; j++) {
                array[i][j] = ' ';
            }
        }
    }
}
