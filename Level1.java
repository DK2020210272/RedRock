import java.util.Scanner;
class Person {
    private String name;
    private int hp;
    private int atk;
    private int def;

    public void tell() {
        System.out.println("姓名:" + getName() + "\t生命值：" + getHp() + "\n攻击力:" + getAtk() + "\t防御力：" + getDef());
    }

    public String getName() {
        return name;
    }

    public void setName(String a) {
        name = a;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int b) {
            hp = b;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int c) {
        if (c > 0 && c < 999) {
            atk = c;
        }
    }

    public int getDef() {
        return def;
    }

    public void setDef(int d) {
        if (d > 0 && d < 999) {
            def = d;
        }
    }
}

public class Level1 {
    public static void main(String[] args) {
        Person per=new Person();
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入主角姓名：");
        per.setName(sc.nextLine());
        System.out.println("请输入生命值：");
        per.setHp(sc.nextInt());
        System.out.println("请输入攻击力：");
        per.setAtk(sc.nextInt());
        System.out.println("请输入防御力：");
        per.setDef(sc.nextInt());
        per.tell();

        Person mon=new Person();
        mon.setName("牛头人");
        mon.setHp(30);
        mon.setAtk(4);
        mon.setDef(2);

        if(per.getHp()<0){
            System.out.println("还没出村就没了");
        }else if(per.getAtk()<mon.getDef()){
            System.out.println("没吃饭吗？");
        }else if(per.getDef()> mon.getAtk()){
            System.out.println("毫发无损");
        }

        else {
            while(per.getHp()>=0&&mon.getHp()>=0) {
                int x = mon.getAtk() - per.getDef();
                int y = per.getAtk() - mon.getDef();
                per.setHp(per.getHp() - x);
                mon.setHp(mon.getHp() - y);
                if (per.getHp() > 0 && mon.getHp() > 0) {
                    System.out.println(per.getName() + "对" + mon.getName() + "造成" + y + "点伤害");
                    System.out.println(mon.getName() + "对" + per.getName() + "造成" + x + "点伤害");
                    System.out.println(per.getName() + "的生命值：" + per.getHp());
                    System.out.println(mon.getName() + "的生命值：\n" + mon.getHp());
                }
                if (per.getHp() <= 0 && mon.getHp() > 0) {
                    System.out.println(per.getName() + "对" + mon.getName() + "造成" + y + "点伤害");
                    System.out.println(mon.getName() + "对" + per.getName() + "造成" + x + "点伤害");
                    System.out.println(per.getName() + "的生命值：0");
                    System.out.println(mon.getName() + "的生命值：" + mon.getHp());
                    System.out.println("！危 ！");
                }
                if (per.getHp() > 0 && mon.getHp() <= 0) {
                    System.out.println(per.getName() + "对" + mon.getName() + "造成" + y + "点伤害");
                    System.out.println(mon.getName() + "对" + per.getName() + "造成" + x + "点伤害");
                    System.out.println(per.getName() + "的生命值：" + per.getHp());
                    System.out.println(mon.getName() + "的生命值：0");
                    System.out.println("you win");
                }
                if (per.getHp() <= 0 && mon.getHp() <= 0) {
                    System.out.println(per.getName() + "对" + mon.getName() + "造成" + y + "点伤害");
                    System.out.println(mon.getName() + "对" + per.getName() + "造成" + x + "点伤害");
                    System.out.println("挺尴尬的");
                }
            }
        }
    }
}