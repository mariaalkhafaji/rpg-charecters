public class Rogue extends Character{

    private final int baseVitality = 8;
    private final int baseStrenght = 2;
    private final int baseDexterity = 6;
    private final int baseIntelligence = 1;

    private final int gainedVitality = 3;
    private final int gainedStrenght = 1;
    private final int gainedDexterity = 4;
    private final int gainedIntelligence = 1;

    public Rogue(String name, int level) {
        super(name, level);
        this.primaryAttributes = new PrimaryAttributes(baseStrenght, baseDexterity,baseIntelligence,baseVitality);

    }

    @Override
    public void levelUp() {

        primaryAttributes.setStrenght(primaryAttributes.getStrenght() + gainedStrenght);
        primaryAttributes.setDexterity(primaryAttributes.getDexterity()+ gainedDexterity);
        primaryAttributes.setIntelligence(primaryAttributes.getIntelligence()+ gainedIntelligence);
        primaryAttributes.setVitality(primaryAttributes.getVitality() + gainedVitality);

    }
}