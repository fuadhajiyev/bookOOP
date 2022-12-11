package models;

import java.util.List;

public class Branch {

    int id;
    String branchName;
    Store store;

    public Branch() {
    }

    public Branch(int id, String branchName) {
        this.id = id;
        this.branchName = branchName;
    }

    public Branch(int id, String branchName, Store store) {
        this.id = id;
        this.branchName = branchName;
        this.store = store;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }
}
