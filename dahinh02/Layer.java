import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Layer {
    private List<Shape> shapes = new ArrayList<>();

    /**
     * add.
     */
    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    /**
     * getString.
     */
    public String getInfo() {
        String res = "Layer of crazy shapes:\n";
        for (Shape shape : shapes) {
            res += shape.toString();
            res += '\n';
        }
        return res;
    }

    /**
     * remove.
     */
    public void removeCircles() {
        shapes.removeIf(shape -> Objects.equals(shape.toString().charAt(0), 'C'));
    }

    /**
     * remove duplicates.
     */
    public void removeDuplicates() {
        Set<Shape> set = new LinkedHashSet<>();
        set.addAll(shapes);
        shapes.clear();
        shapes.addAll(set);
    }
}