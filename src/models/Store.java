package models;

import java.util.ArrayList;
import java.util.List;

public class Store {

    int id;

    String storeName; //Ali-nino

    List<Branch> branches; // Ganclik-mall

    public Store(int id, String storeName) {
        this.id = id;
        this.storeName = storeName;
        this.branches = new ArrayList<>();
    }

    public void addBranch(Branch branch) {
        this.branches.add(branch);
    }

    public List<Branch> getBranches() {
        return branches;
    }
}
