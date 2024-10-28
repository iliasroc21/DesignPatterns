package structural.flyweight;


/*
In a game, there might be thousands of trees scattered across a map. Each tree has:
         1/ Intrinsic State: The tree's type, texture, and color (shared properties).
         2/ Extrinsic State: The tree's specific location on the map (unique properties).
Using the Flyweight Pattern, we create one instance for each unique tree type and reuse
it across different locations on the map.
*/
public class Main {
    public static void main(String[] args) {
        Forest forest = new Forest();

        // Plant multiple trees with shared types
        forest.plantTree(1, 2, "Oak", "Green", "Thick");
        forest.plantTree(3, 5, "Oak", "Green", "Thick");
        forest.plantTree(10, 12, "Pine", "Dark Green", "Thin");
        forest.plantTree(5, 7, "Oak", "Green", "Thick");
        forest.plantTree(15, 17, "Pine", "Dark Green", "Thin");
        // Display all trees
        forest.displayTrees();
    }
}
