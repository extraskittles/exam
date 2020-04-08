package JavaSe.multithreading;

public class ShareObj {
    private static ThreadLocal<Integer> num=new ThreadLocal<Integer>(){
        @Override
        protected Integer initialValue() {
            return 0;
        }
    };
    public int getNextNum(){
        num.set(num.get()+1);
        return num.get();
    }

    public static void main(String[] args) {
        ShareObj shareObj = new ShareObj();
        Client client1 = new Client(shareObj);
        Client client2 = new Client(shareObj);
        Client client3 = new Client(shareObj);
        client1.start();
        client2.start();
        client3.start();
    }
    private static class Client extends Thread{
        ShareObj shareObj;
        public Client(  ShareObj shareObj){
            this.shareObj=shareObj;
        }

        @Override
        public void run() {
            for(int i=0;i<4;i++){
                System.out.println("当前线程:"+Thread.currentThread().getName()+"，数字是:"+shareObj.getNextNum());
            }
        }
    }
}
