import java.util.*;

public class StreamPractice {
    public static void main(String[] args) {
        getLowEnergyPersonNamesJava7(Character.people).forEach(System.out::println);
    }

    public static List<String> getLowEnergyPersonNamesJava7(List<Character> characters){
        List<Character> lowEnergyPersons = new ArrayList<>();
        for(Character character : characters) {
            if(character.getEnergy() < 60){
                lowEnergyPersons.add(character);
            }
        }
        List<String> lowEnergyPersonNames = new ArrayList<>();
        Collections.sort(lowEnergyPersons, new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return Integer.compare(o1.getEnergy(), o2.getEnergy());
            }
        });

        for(Character character : lowEnergyPersons){
            lowEnergyPersonNames.add(character.getName());
        }
        return lowEnergyPersonNames;
    }

}
