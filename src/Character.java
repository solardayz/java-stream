import java.util.Arrays;
import java.util.List;

public class Character {
    private String name;
    private boolean introvert;
    private int energy;
    private Type type;
    
    public static List<Character> people = Arrays.asList(
      new Character("James", true, 100, Type.FAST),      
      new Character("Yuri", false, 80, Type.FAST),
      new Character("Joy", false, 70, Type.SLOW),
      new Character("Lorens", true, 10, Type.FAST),
      new Character("Simon", false, 50, Type.SLOW)
    );

    public Character(String name, boolean introvert, int energy, Type type) {
        this.name = name;
        this.introvert = introvert;
        this.energy = energy;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIntrovert() {
        return introvert;
    }

    public void setIntrovert(boolean introvert) {
        this.introvert = introvert;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public enum Type {
        FAST,
        SLOW
    }
}
