package ru.def;

public abstract class Resourse {
    int x, y;
    World world;

    public Resourse(int x, int y, World wrld) {
        this.x = x;
        this.y = y;
        world = wrld;
    }

    public void draw() {

    }
}
