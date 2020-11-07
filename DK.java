public class DK implements Getman{
    private Sendman Shop;
    public void setSendman(Sendman jingdong){
        this.Shop=Shop;
    }

    @Override
    public void sendRequest(String request) {
        System.out.println("发送"+request+"号订单");
    }

    @Override
    public void receiveProduct() {
        System.out.println("收到货物");
    }
}