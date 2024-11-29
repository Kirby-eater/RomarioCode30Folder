Ball[] ballGroup;
int pos = 0;

Ball redball, ball2;

void setup() { // Happens once at launch
    size(1280, 720);
    background(200,200,200);
    ballGroup = new Ball[100];
}

void draw() { // Happens constantly (screen refresh)
    background(200,200,200);

    for(int i = 0; i < pos; i++) {
        ballGroup[i].display();
        ballGroup[i].move();
    }

}

void mousePressed() {
    if(pos < ballGroup.length) {
    ballGroup[pos] = new Ball(mouseX, mouseY, 100);
    pos++; // Next empty position
}
}



class Ball {
    int x, y, r;
    int dx, dy; //Speed or Velocity
    int cr, cg, cb; // RGB Values
    int grav; //Gravity
  

    //Constructor
    Ball(int tempx, int tempy, int tempr) {
        x = tempx; // Set the x cord
        y = tempy; // Set the y cord
        r = tempr; // Set the radius

        // Set the colour
        cr = int(random(0, 255));
        cg = int(random(0, 255));
        cb = int(random(0, 255));

        // Set Velocity and Gravity
        dx = int(random(-10, 10));
        dy = int(random(-10, 10));
        grav = 1;
        
    }
    void display() {
        fill(cr, cg, cb);
        circle(x,y,r*2);
    }

    void move() {
        y = y + dy;
        x = x + dx;
        dy = dy - grav;

        if (y >= height-r || y <= 0 + r) {
            //bounce
            dy = dy * -1;

        }

        if (x >= width-r || x <= 0 + r) {
            //bounce
            dx = dx * -1;

        }
    }
}