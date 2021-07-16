public class Main {

    public static void main(String[] args) {

        Mage mage= new Mage("sean", 1);
        Ranger ranger = new Ranger("Maria",2);
        Rogue rogue = new Rogue("Nata", 1);
        mage.levelUp();
        ranger.levelUp();
        rogue.levelUp();


    }
}
