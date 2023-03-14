public class ItemTypeBO {
    public void add(ItemType object, ItemType[] itemTypeArray, Integer index) {
        itemTypeArray[index] = object;
        System.out.println("New item added successfully");
    }

    public void search(String search, ItemType[] itemTypeArray) {
        for (ItemType item : itemTypeArray) {
            if (item != null && item.getName().equals(search)) {
                System.out.println("Searched Item Type is:\nName:" + item.getName() + "\nDeposit Amount:" + String.format("%.1f", item.getDeposit()) + "\nCost Per Day:" + String.format("%.1f", item.getCostPerDay()));
                return;
            }
        }
        System.out.println("Searched Item Type not found");
    }

    public void display(ItemType[] itemTypeArray) {
        for (int i = 0; i < itemTypeArray.length; i++) {
            if (itemTypeArray[i] != null) {
                System.out.println("Item Type Number " + (i+1) + ":\nName:" + itemTypeArray[i].getName() + "\nDeposit Amount:" + String.format("%.1f", itemTypeArray[i].getDeposit()) + "\nCost Per Day:" + String.format("%.1f", itemTypeArray[i].getCostPerDay()));
            }
        }
    }
}
