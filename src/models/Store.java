package models;

import java.util.List;

public class Store {

    int id;

    String storeName; //Ali-nino

    List<Branch> branches; // Ganclik-mall

    public Store() {
    }



    public Store(int id, String storeName, List<Branch> branches) {
        this.id = id;
        this.storeName = storeName;
        this.branches = branches;
    }
}
