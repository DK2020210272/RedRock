public class division implements Runnable {
    String t;
    public void getT(String t){
        this.t=t;
    }
    public void run(){
        try{
            String[]input=t.split("/");
            float a=Integer.parseInt(input[0]);
            float b=Integer.parseInt(input[1]);
            if(b==0)
                System.out.println("表达式不符合规范");
            else
            System.out.format("%.3f\n",a/b);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

