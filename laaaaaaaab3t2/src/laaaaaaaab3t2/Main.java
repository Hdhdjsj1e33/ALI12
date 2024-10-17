package laaaaaaaab3t2;

class Main extends Thread{
    public void run(){
        System.out.println("Thread is running...");
} 
    
    public static void main(String[] args) {
        Table1 t1=new Table1();
        Table2 t2=new Table2();
        t1.start();
        t2.start();
    }
    
}
