void main(){
    var rn1 = new Runnable1(1);
    var thread1 = new Thread(rn1);
    thread1.start();

    var rn2 = new Runnable1(2);
    var thread2 = new Thread(rn2);
    thread2.start();
}

class Runnable1 implements Runnable{
    private final int threadNum;

    Runnable1(int thNum){
        this.threadNum = thNum;
    }

    public void run(){
        for (int i = 0; i<=5; i++){
            System.out.println(i +" поток №" + threadNum);

            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}
