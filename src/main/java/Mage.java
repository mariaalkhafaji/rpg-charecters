public class Mage extends Character {

    private final int baseVitality = 5;
    private final int baseStrenght = 1;
    private final int baseDexterity = 1;
    private final int baseIntelligence = 8;
    private final int gainedVitality = 3;
    private final int gainedStrenght = 1;
    private final int gainedDexterity = 1;
    private final int gainedIntelligence = 5;


    public Mage(String name, int level) {
        super(name, level);
        this.primaryAttributes = new PrimaryAttributes(baseStrenght, baseDexterity, baseIntelligence, baseVitality);
    }


    @Override
    public void levelUp() {
        primaryAttributes.setStrenght(primaryAttributes.getStrenght() + gainedStrenght);
        primaryAttributes.setDexterity(primaryAttributes.getDexterity() + gainedDexterity);
        primaryAttributes.setIntelligence(primaryAttributes.getIntelligence() + gainedIntelligence);
        primaryAttributes.setVitality(primaryAttributes.getVitality() + gainedVitality);
    }
}
