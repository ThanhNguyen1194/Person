public class Ball {
    float x;
    float y;
    int radius;
    float xDelta;
    float yDelta;

    public Ball() {
    }

    public Ball(float x, float y, int radius, float xDelta, float yDelta) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }

    public float getxDelta() {
        return xDelta;
    }

    public float getyDelta() {
        return yDelta;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }
    public void move(){
        this.x += xDelta;
        this.y += yDelta;
    }
    public void reflectHorizontal(){
        this.xDelta = - xDelta;
    }
    public void reflectVertical(){
        this.yDelta = - yDelta;
    }
    public String toString(){
        final StringBuilder str = new StringBuilder("[");
        str.append("(").append(x).append(",").append(y).append(")");
        str.append(", speed=(").append(xDelta).append(",").append(yDelta).append(")]");
        return  str.toString();
    }
}
