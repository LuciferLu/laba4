public class App {
    public static void main(String[] args) {
       // 1 и 2 задание

        Arr<Integer> arr = new Arr<Integer>(1, 2, 3, 4);

       arr.ShowArr();

       arr.ToList();

        arr.ShowList();

        arr.Swap(0,1);

        arr.ToList();

        arr.ShowList();

       // 3 задание

        System.out.println("3 задание");

        Box<Apple> appleBox = new Box<>(new Apple(), new Apple());
        Box<Apple> appleBox1 = new Box<>(new Apple(), new Apple(), new Apple());
        Box<Orange> orangeBox = new Box<Orange>(new Orange(), new Orange(), new Orange());

        appleBox1.addFruit(10);

        System.out.println(appleBox.getWeight());
        System.out.println(appleBox1.getWeight());
        System.out.println(orangeBox.getWeight());

        System.out.println(appleBox1.FruitCount());
        System.out.println(orangeBox.FruitCount());

        System.out.println(appleBox.Compare(orangeBox));

        appleBox1.Transfer(appleBox);
        System.out.println(appleBox.getWeight());
        System.out.println(appleBox1.getWeight());
    }

}
