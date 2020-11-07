public class Lv3{
    public static void main(String[] args) {
        DK MrD=new DK();
        Jingdong Shop=new Jingdong();
        MrD.sendRequest("2");
        Shop.receiveRequest("2");
        Shop.sendProduct();
        Shop.info();
        MrD.receiveProduct();
    }
}