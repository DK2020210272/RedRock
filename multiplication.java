public class multiplication implements Runnable {
    String t;
    public void getT(String t){
        this.t=t;
    }
    public void run(){
        try{
            String[]input=t.split("\\*");
            float a=Integer.parseInt(input[0]);
            float b=Integer.parseInt(input[1]);
            System.out.format("%.3f\n",a*b);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

