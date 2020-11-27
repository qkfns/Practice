import java.util.ArrayList;

public class GenericPrinter<T> {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
    }
    private T material;

    public void setMaterial(T material){
        this.material = material;
    }

    public T getMaterial(){
        return material;
    }
}
