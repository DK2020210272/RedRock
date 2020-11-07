public class Jingdong implements Sendman{
    private Getman MrD;
    public void setGetman(Getman MrD){
        this.MrD=MrD;
    }

    @Override
    public void receiveRequest(String request) {
        System.out.println("京东店铺收到"+request+"号订单");
    }

    @Override
    public void sendProduct() {
        System.out.println("开始派送");
    }

    @Override
    public void info() {
        System.out.println("派送完成");
    }
}