import weka.classifiers.trees.J48;

public class JavaApplication1 {

    public static void main(String[] args) {
        J48 tree = new J48();
        tree.buildClassifier(data);
    }
}