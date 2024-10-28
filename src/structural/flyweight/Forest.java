package structural.flyweight;

import structural.flyweight.factory.TreeFactory;

import java.util.ArrayList;
import java.util.List;

public class Forest {
    private final List<Tree> trees = new ArrayList<>();
    public void plantTree(int x, int y, String name, String color, String texture) {
        TreeFactory factory = TreeFactory.getInstance();
        TreeType type = factory.getTreeType(name, color, texture);
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }

    public void displayTrees() {
        for (Tree tree : trees) {
            tree.display();
        }
    }
}
