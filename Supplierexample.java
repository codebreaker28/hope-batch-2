import java.util.function.Supplier;

public class Supplierexample {
    public static void main(String[] args) {
        Supplier<Integer> s = () -> (int)(Math.random() * 100);
        System.out.println(s.get());
    }
}
