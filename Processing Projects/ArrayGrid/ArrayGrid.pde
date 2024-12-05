grid g;


void setup() {
    size(1700,800);
    g = new grid(10, 10);
    
}

void draw() {
    background(220);
    g.displayGrid();
}

void mousePressed() {
    g.click(mouseX, mouseY);
}

void keyPressed() {
    if(key == 'c') {
        g.clear();
    }
    else if(key == '5') {
        g.five();
    }
}


class grid {
    int ROWS, COLS;
    boolean[][] gridarray;

    // Constructor
    grid(int r, int c) {
        ROWS = r;
        COLS = c;
        gridarray = new boolean[ROWS] [COLS];

    clear();
    }

void displayGrid() {
    gridarray[4] [3] = true;

    for(int y = 0; y < ROWS; y++) {
        for(int x = 0; x < COLS; x++) {
            if(gridarray[y] [x] == false) {
                fill(255); // white fill
            }
            else {
                fill(0); // black fill
            }
            int cellWidth = width / COLS;
            int cellHeight = height / ROWS;

            // Starts drawing from the top left corner of Rectangle
            rect(x * cellWidth, y * cellHeight, cellWidth, cellHeight);
        }
    }
}

void click(int mx, int my) {
    int cellWidth = width / COLS;
    int cellHeight = height / ROWS;

    int x = mx / cellWidth;
    int y = my / cellHeight;

    if(gridarray[y] [x] == false) {
        gridarray[y] [x] = true; // make it true if it is false
    }
    else{
        gridarray[y] [x] = false; // make it false if is true
    }
}

void clear() {
    for(int y = 0; y < ROWS; y++) {
        for(int x = 0; x < COLS; x++) {
        gridarray[y] [x] = false;
            }
        }
}

void five() {
    for(int y = 0; y < ROWS; y++) {
        for(int x = 0; x < COLS; x++) {
            // Only activate if it is in row #5 or
            if(y== 5 || x ==5) {
                gridarray[y] [x] = true;
            }
        }
    }
}
}