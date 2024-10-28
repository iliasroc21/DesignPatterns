package structural.flyweight.factory;

import creational.singleton.Database;
import structural.flyweight.TreeType;

import java.util.HashMap;
import java.util.Map;

public final class TreeFactory {
    private static final Map<String , TreeType> treeTypes = new HashMap<>();
    private static  TreeFactory instance  ;
    private TreeFactory() {}

    public static TreeFactory getInstance(){
        if(instance ==null){
            synchronized (TreeFactory.class){
                if(instance==null)instance = new TreeFactory();
            }
        }
        return instance;
    }
    public  TreeType getTreeType(String name, String color, String texture) {
        String key = name + "-" + color + "-" + texture;
        TreeType type = treeTypes.get(key);
        if (type == null) {
            type = new TreeType(name, color, texture);
            treeTypes.put(key, type);
            System.out.println("Creating tree type: " + name + ", Color: " + color + ", Texture: " + texture);
        } else {
            System.out.println("Reusing tree type: " + name);
        }
        return type;
    }
}
