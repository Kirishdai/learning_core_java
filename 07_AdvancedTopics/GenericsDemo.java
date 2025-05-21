class Box<T, U>{
    T item;
    U value;

    public Box(T item, U value){
        this.item = item;
        this.value = value;
    }
    public T getItem(){
        return item;
    }
    public U getValue(){
        return value;
    }
}
public class GenericsDemo {
    public static void main(String[] args) {

        Box<String, Double> box = new Box<>("Laptop", 42.15);
        Box<String, Integer> box2 = new Box<>("Tablet", 42);

        System.out.println(box.getItem());
        System.out.println(box2.getValue());
    }
}
