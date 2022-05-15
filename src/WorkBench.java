//stanok
public class WorkBench {
    private int Oil;
    private boolean isOff;
    private final String name;

    void makeDetails(int amount){
        if (Oil>=amount){
            Oil-=amount;
            System.out.println(name+ ":Works is done");
        }else if (Oil<amount){
            System.out.println(name+":Oil is need");
            isOff=true;
        }
    }
    void reFuel (int refOil){
        Oil+=refOil;
        System.out.println(name+ ":is ready to work");
        isOff=false;
    }
    void start(){
        this.isOff=false;
    }
    public WorkBench (int oil, String name){
        this.Oil=oil;
        this.name=name;
    }

    public static void main(String[] args) {
        WorkBench workBench= new WorkBench( 100, "Stanok" );
                workBench.start();
                workBench.makeDetails( 50 );
                workBench.makeDetails( 100 );
                workBench.reFuel( 50 );
                workBench.makeDetails( 100 );
    }
}

