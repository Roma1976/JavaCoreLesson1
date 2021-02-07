import ru.geekbrains.participants.Cat;
import ru.geekbrains.participants.Human;
import ru.geekbrains.participants.Participants;
import ru.geekbrains.participants.Robot;
import ru.geekbrains.test.Test;
import ru.geekbrains.test.Treadmill;
import ru.geekbrains.test.Wall;

public class MainClass {
    public static void main(String[] args) {
        Participants[] participants = {
                new Cat("Мурзик", 1000, 3),
                new Cat("Яшка", 3200, 5),
                new Human("Фрол", 3000, 1),
                new Human("Никифор", 4200, 0),
                new Robot("R2D2", 5000, 0),
                new Robot("H2O", 6000, 0)
        };

        Test[] obstacles = {
                new Treadmill(2500),
                new Wall(1)
        };

        for (Participants participant : participants) {
            for (Test obstacle : obstacles) {
                obstacle.passTheTest(participant);
                if (!participant.isOnDistance()) {
                    break;
                }
            }
        }
    }
}
