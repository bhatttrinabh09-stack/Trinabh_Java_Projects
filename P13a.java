class Numbers implements Runnable{
    public void run(){
        for(int i = 1; i<=5; i++){
            System.out.println(i);
        }
        try{
            Thread.sleep(120);
        }
        catch(Exception e){}
    }
}
class Alphabets extends Thread{
    public void run(){
        for(int i = 1; i<=5; i++){
            System.out.println((char)(i+64));
        }
    try{
            Thread.sleep(130);
        }
        catch(Exception e){}
    }
}
class P13a{
    public static void main(String args[]){
        Numbers n = new Numbers();
        Alphabets a = new Alphabets();
        Thread t1 = new Thread(n);
        Thread t2 = new Thread(a);
        t1.start();
        t2.start();
    }
}