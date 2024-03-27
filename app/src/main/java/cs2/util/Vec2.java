package cs2.util;

public class Vec2 implements Comparable<Vec2> {
  private double x;
  private double y;

  public int compareTo(Vec2 other) {
    if(this.x < other.x) return -1;
    else if(this.x > other.x) return +1;
    else return 0;
  }

  public Vec2(double inX, double inY) {
    this.x = inX;
    this.y = inY;
  }
  public Vec2() {
    this.x = 0;
    this.y = 0;
  }
  public Vec2(Vec2 toCopy) {
    this.x = toCopy.x;
    this.y = toCopy.y;
  }

  @Override
  public String toString() {
    return "(" + this.x + "," + this.y + ")";
  }


  public static Vec2 random() {
    return new Vec2(Math.random() * 10 - 5, Math.random() * 10 - 5);
  }

  public double getX() { return this.x; }
  public double getY() { return this.y; }

  public void addThis(Vec2 other) {
    this.x += other.x;
    this.y += other.y;
  }

  @Override
  public Vec2 clone() {
    return new Vec2(this.x, this.y);
  }

  /**
   * This version of add produces a new Vec2
   * @param other
   * @return the result of adding this and other
   */
  public Vec2 add(Vec2 other) {
    return new Vec2(this.x + other.x, this.y + other.y);
  }
}
