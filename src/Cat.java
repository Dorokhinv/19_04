public class Cat {
    private double weight;
    private String name;
    private int age;
    private String color;

    public Cat(int i, String murka, int i1, String black) {
    }


    public static void main(String[] args) {
        Cat bigCat = new Cat(5500, "Murka", 2, "Black");
//создали "большую кошку"
        Cat smallCat = new Cat(7000, "Kuzya", 1, "White");
//создали "маленькую кошку"
        bigCat.weight += 1; //обратились к полю "вес" большой кошки
        smallCat.weight += 10;
        System.out.println("Вес большой кошки = " + bigCat.weight);
        System.out.println("Вес маленькой кошки = " + smallCat.weight);
    }

    public double getWeight() {
        return weight;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if (age>this.age)
            this.age=age;
    }
    public String getColor(){
        return color;
    }
}