package baitap.tuan03;

import javax.swing.tree.RowMapper;

public class Feline extends Animal{
    @Override
    protected void roam() {
        System.out.println("Roaming single");
    }
}
