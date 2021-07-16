public class Armor extends Item{

/*add a placeholder in armer - like weapon,
* encapsulate the values, and have getters,
* store the values */

    private ArmorType armorType;
    private PrimaryAttributes primaryAttributes;

    public Armor(String name, int requiredLevelToEquipTheItem, Slot slotInWhichTheItemIsEquipped,PrimaryAttributes primaryAttribute) {
        super(name, requiredLevelToEquipTheItem, slotInWhichTheItemIsEquipped);
        this.armorType =armorType;
        this.primaryAttributes= primaryAttributes;
    }

    public ArmorType getArmorType() {
        return armorType;
    }

    public void setArmorType(ArmorType armorType) {
        this.armorType = armorType;
    }

    public PrimaryAttributes getPrimaryAttributes() {
        return primaryAttributes;
    }

    public void setPrimaryAttributes(PrimaryAttributes primaryAttributes) {
        this.primaryAttributes = primaryAttributes;
    }
}
