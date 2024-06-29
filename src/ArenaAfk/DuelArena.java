package ArenaAfk;

import java.util.List;

public class DuelArena {

    Arena arena = new Arena("Ring");

    public void startDuel(List<Human> list) {
        for (int i = 0; i < arena.getHumans().size() - 1 ; i++) {
            Human fighter1 = list.get(i);
            Human fighter2 = list.get(i + 1);
            Human winner;
            System.out.println("Начинается дуэль между " + fighter1 + " и " + fighter2);
            fightHuman(fighter1, fighter2);
            if(fighter1.isAlive()){
                System.out.println("Победителем битвы стал: " + fighter1);
                winner = fighter1;
            } else {
                System.out.println("Победителем битвы стал: " + fighter2);
                winner = fighter2;
            }
        }
    }

    private void fightHuman(Human fighter1, Human fighter2) {
        while (fighter1.isAlive() && fighter2.isAlive()) {
            fighter1.takeDamage(fighter2);
            if(fighter2.isAlive()) {
                fighter2.takeDamage(fighter1);
            }
        }
    }


}
