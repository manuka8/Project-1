public class LibraryItem {
    private String title;
    private String itemID;
    private boolean checkedOut;

    public LibraryItem() {
    }

    public LibraryItem(String title, String itemID) {
        this.title = title;
        this.itemID = itemID;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public String getItemID() {
        return itemID;
    }

    public void checkOut() {
        checkedOut = true;
    }

    public void checkIn() {
        checkedOut = false;
    }

    public void displayItemDetails() {
        System.out.println("Title : " + title);
        System.out.println("Item ID : " + itemID);
        System.out.println("Item Status : " + (checkedOut ? "Checked Out" : "Checked In"));
    }
}
