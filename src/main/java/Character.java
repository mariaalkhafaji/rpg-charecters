public abstract class Character {

    private String name;
    private int level;
    protected PrimaryAttributes primaryAttributes;
    protected Weapon equippedWeapon;

    public Character(String name, int level) {
        this.name = name;
        this.level = level;

    }

    public abstract void levelUp();

    public void equipWeapon(Weapon weapon){

        equippedWeapon =weapon;
    }




}
