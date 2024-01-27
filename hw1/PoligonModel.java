package hw1;

import java.util.ArrayList;
import java.util.List;

public class PoligonModel {

public class PoligonalModel {
    public List<Poligon> poligons;
    public List<Texture> textures;

    public PoligonalModel(List<Texture> textures) {
        this.textures = textures;
        poligons = new ArrayList<>();
    }
}
}
