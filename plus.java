public class plus implements Runnable{
    String t;
    public void getT(String t){
        this.t=t;
    }
    public void run(){
        try{
            String[]input=t.split("\\+");//分隔开运算符两边的数字，但做不到分开两个小数
            float a=Integer.parseInt(input[0]);
            float b=Integer.parseInt(input[1]);
            System.out.format("%.3f\n",a+b);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
