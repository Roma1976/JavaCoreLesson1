package ru.geekbrains.participants;

public class Robot implements Participants {
    private String name;
    private int maxRunDistance;
    private float maxHeightJump;
    private boolean onDistance;

    public Robot(String name, int maxRunDistance, float maxHeightJump) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxHeightJump = maxHeightJump;
        this.onDistance = true;
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(name + " успешно пробежал " + distance + " метров");
        } else {
            System.out.println(name + " не смог пробежать " + distance + " метров");
            onDistance = false;
        }
    }

    @Override
    public void heightJump(int height) {
        if (height <= maxHeightJump) {
            System.out.println(name + " успешно перепрыгнул " + height + " метров стены");
        } else {
            System.out.println(name + " не смог перепрыгнуть " + height + " метров");
            onDistance = false;
        }
    }

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }
}

