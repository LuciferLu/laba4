import java.util.ArrayList;
public class Box <F extends Fruit> {

    ArrayList<F> fruits = new ArrayList<F>();

    public Box(F... f)
    {
        this.addFruit(f);
    } //Конструктор, который принимает значения

    public Box() //Пустой конструктор
    {
    }

    public float getWeight()//Вывод веса коробки
    {
        float weight = 0f;
        for (int i = 0; i < fruits.size(); i++)
        {
            weight += fruits.get(i).getWeight();
        }
        return weight;
    }

    public String FruitCount()
    {
        return fruits.size()+" фруктов типа "+fruits.get(0).getClass().getName();
    }

    public void addFruit(F... f)//Метод добавления фруктов
    {
        for (int i = 0; i < f.length; i++)
        {
            fruits.add(f[i]);
        }
    }

    public void addFruit(int c)//Метод добавления фруктов
    {
        for (int i = 0; i < c; i++)
        {
            if (fruits.get(0).getClass() == Apple.class)
            {
                fruits.add((F) new Apple());
            }
            else if (fruits.get(0).getClass().getName() == "Orange")
            {
                fruits.add((F) new Orange());
            }
        }
    }

    public boolean Compare(Box<? extends Fruit> another)//Метод сравнивания коробок
    {
        return Math.abs(this.getWeight() - another.getWeight()) <= 0.001f;
    }

    public void Transfer(Box<F> another) //Метод пересыпания из коробки в коробку
    {
        if (another != this)
        {
            another.fruits.addAll(this.fruits);
            this.fruits.clear();
        }
    }
}
