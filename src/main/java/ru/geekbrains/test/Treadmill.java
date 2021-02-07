package ru.geekbrains.test;

import ru.geekbrains.participants.Participants;

public class Treadmill implements Test {
    private int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    @Override
    public void passTheTest(Participants participants) {
        participants.run(distance);
    }
    }

