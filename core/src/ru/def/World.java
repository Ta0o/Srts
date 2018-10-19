package ru.def;

import java.util.ArrayList;

public class World {
    final int sizeX, sizeY;
    final ArrayList<Units> units;
    final Resourse[][] resourses;

    public World(int sx, int sy) {
        sizeX = sx;
        sizeY = sy;


        resourses = new Resourse[sizeX][sizeY];
        for (int i = 0; i < resourses.length; i++) {
            for (int j = 0; j < resourses[i].length; j++) {
                if (i < 3 || j < 3 || i > sizeX - 4 || j > sizeY - 4) {
                    resourses[i][j] = new Tree(i, j, this);
                }
            }
        }

        units = new ArrayList<Units>();
        units.add(new Warrior(5, 5, this));
    }

    public void update() {
        for (Units i : units) {
            i.update();
        }
    }

    public void draw() {

        for (int i = 0; i < resourses.length; i++) {
            for (int j = 0; j < resourses[i].length; j++) {
                if (resourses[i][j] != null) {
                    resourses[i][j].draw();
                }
            }
        }

        for (Units i : units) {
            i.draw();
        }
    }
}