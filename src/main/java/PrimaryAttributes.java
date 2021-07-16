public class PrimaryAttributes {

    private int strenght;
    private int dexterity;
    private int intelligence;
    private int vitality;

    public PrimaryAttributes(){}

    public PrimaryAttributes(int strenght, int dexterity, int intelligence, int vitality) {
        this.strenght = strenght;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
        this.vitality = vitality;
    }

    public int getStrenght() {
        return strenght;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }
}
