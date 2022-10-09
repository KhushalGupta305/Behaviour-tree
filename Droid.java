package net.obviam.bt;

import net.obviam.bt.ai.Routine;

@Getter
@Setter
@RequiredArgsConstructor
public class Droid {

    final String name;
    int x, y, range, damage, health;

    Routine routine;
    Board board;

    public void update() {
        if (routine.getState() == null) {
            // hasn't started yet so we start it
            routine.start();
        }
        routine.act(this, board);
    }

    public boolean isAlive() {
        return health > 0;
    }

    @Override
    public String toString() {
        return "Droid{" +
                "name=" + name +
                ", x=" + x +
                ", y=" + y +
                ", health=" + health +
                ", range=" + range +
                ", damage=" + damage +
                '}';
    }
}
