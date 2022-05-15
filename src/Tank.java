public class Tank {

    static final String MODEL ="T-34";
    static int ntanks;

    private int x,y;
    private int dir;
    private int fuel;
    private int n;

    public Tank()
    {
        this(0,0,100);
    }
    public  Tank(int x, int y, int fuel){
        this.x=x;
        this.y=y;
        this.fuel=fuel;
        n=++ntanks;
    }

    public Tank(int i, int i1) {
    }

    public static void main(String[] args) {
        Tank justTank = new Tank();
        Tank anywareTank = new Tank(10, 10);
        Tank customTank = new Tank(20, 30, 200);
        justTank.goForward(200);
        justTank.printPosition();
        anywareTank.goBackward(-200);
        anywareTank.printPosition();
        customTank.goForward(201);
        customTank.printPosition();

    }
    private void goForward(int i) {
        if (i<0 && -i> -fuel)
            i=-fuel;
        if (i>fuel)
            i=fuel;
       if (dir==0)x+=i;
       else if (dir ==1) y+=i;
       else if (dir ==2) x-=i;
       else y-=i;
       fuel-= Math.abs( i );
    }
    //считаем, что dir может принимать 4 значения
    //0  вправо
    //1  - вниз, 2  - влево, 3 - вверх
    void turnRight(){
        dir++;
        if (dir ==4)dir =0;
    }
    void turnLeft(){
        dir--;
        if (dir == -1)dir=3;
    }
    void printPosition(){
        System.out.println("The tank "+MODEL+"-"+n+"is it " + x +","+y +" now");
    }
    void goBackward (int i){
        goForward(-i );
    }
}

