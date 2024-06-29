package ArenaAfk;

import java.util.ArrayList;
import java.util.List;

public class Arena extends Place {

    private List<Human> humans;

    public Arena(String name) {
        super(name);
        humans = new ArrayList<>();
    }

    public void findHuman(Human human) {
        humans.add(human);
    }

    public List<Human> getHumans() {
        return humans;
    }



}
