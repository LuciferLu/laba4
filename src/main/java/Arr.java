import java.util.ArrayList;
public class Arr<T> {

    private T[] arr;//Массив
    private ArrayList<T> arrList;//List

    public Arr(T... arr) //Конструктор
    {
        this.arr = arr;
        arrList = new ArrayList<>();
    }

    public T Swap(int i1, int i2) // Метод, который меняет 2 элемента массива
    {
        T t = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = t;
        return (T) arr;
    }

    public T[] getArr() {
        return arr;
    }

    public void ShowArr() // Вывод массива
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }


    public void ShowList() //Вывод List
    {
        System.out.println(arrList);
    }

    public void ToList() // Метод перевода в List
    {
            arrList.clear();
        for (int i = 0; i < arr.length; i++)
        {
            arrList.add(arr[i]);
        }
    }
}
