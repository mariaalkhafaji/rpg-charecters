public abstract class Item {

    private String name;
    private int requiredLevelToEquipTheItem;
    private Slot slotInWhichTheItemIsEquipped;

    public Item(String name, int requiredLevelToEquipTheItem, Slot slotInWhichTheItemIsEquipped) {
        this.name = name;
        this.requiredLevelToEquipTheItem = requiredLevelToEquipTheItem;
        this.slotInWhichTheItemIsEquipped = slotInWhichTheItemIsEquipped;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRequiredLevelToEquipTheItem() {
        return requiredLevelToEquipTheItem;
    }

    public void setRequiredLevelToEquipTheItem(int requiredLevelToEquipTheItem) {
        this.requiredLevelToEquipTheItem = requiredLevelToEquipTheItem;
    }


}
