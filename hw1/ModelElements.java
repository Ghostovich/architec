package hw1;
import java.util.List;

public class ModelElements {

public class Scene {
    public int id;
    public List<> models;
    public List<> flashes;

    public Scene(int id, List<> models, List<Flash> flashes) {
        this.id = id;
        this.models = models;
        this.flashes = flashes;
    }


    public <Type> Type method1(Type type) {
        return type;
    }

    public <Type> Type method2(Type type1, Type type2) {
        return type1;
    }
}
}
