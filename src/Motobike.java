public class Motobike {
    public static void main(String[] args) {
        Motobike motobike=new Motobike( 2020,"Honda", "Red" );
        System.out.println(motobike.getModel()+"\n"+motobike.getColor()+"\n"+motobike.getYear());
    }
    int year;
    String model;
    String color;
    public Motobike(int year, String model, String color){
        this.year=year;
        this.model=model;
        this.color=color;
    }
    public int getYear(){
        return year;
    }
    public String getModel(){
        return model;
    }
    public String getColor(){
        return color;
    }
}
