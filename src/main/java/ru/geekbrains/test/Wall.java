package ru.geekbrains.test;

import ru.geekbrains.participants.Participants;

public class Wall implements Test {
    private int height;

    public Wall(int height) {

        this.height = height;
    }

    @Override
    public void passTheTest(Participants participants) {

        participants.heightJump(height);
    }
}
