

public class Weapon extends Item{

    private int damage; //baseDamage
    private int attackSpeed; //attacks per second

    public Weapon(String name, int requiredLevelToEquipTheItem, Slot slotInWhichTheItemIsEquipped, int damage,int attackSpeed) {
        super(name, requiredLevelToEquipTheItem, slotInWhichTheItemIsEquipped);
        this.damage=damage;
        this.attackSpeed=attackSpeed;
    }

    public int getDPS(){
        return damage*attackSpeed;
    }
}
