import java.io.*;

public class Fim {
    public static void main(String[] args)throws Exception {
        Spgl shipin=new Spgl();
        BufferedReader sr=new BufferedReader (new InputStreamReader(System.in));
        while(true) {
            System.out.println("请按提示选择以下功能：");
            System.out.println("1.添加食品");
            System.out.println("2.查找食品信息");
            System.out.println("3.修改食品价格");
            System.out.println("4.删除食品");
            System.out.println("0.退出");
            String str=sr.readLine();//读取一行(回车前（\r\n）的所有内容)
            if(str.equals("1")) {
                System.out.println("请输入食品编号：");
                String bh=sr.readLine();
                System.out.println("请输入食品名称：");
                String mc=sr.readLine();
                System.out.println("请输入食品价格：");
                float jg=Float.parseFloat(sr.readLine());
                Sp sp=new Sp(bh,mc,jg);
                shipin.addsp(sp);
            }else if(str.equals("2")) {
                System.out.println("请输入食品编号：");
                String bh=sr.readLine();
                shipin.spxx(bh);
            }else if(str.equals("3")) {
                System.out.println("请输入食品编号：");
                String bh=sr.readLine();
                System.out.println("请输入食品价格：");
                float jg=Float.parseFloat(sr.readLine());
                shipin.spjg(bh,jg);
            }else if(str.equals("4")) {
                System.out.println("请输入食品编号：");
                String bh=sr.readLine();
                shipin.delsp(bh);
            }else if(str.equals("0")) {
                System.out.println("感谢您的使用，再见");
                System.exit(0);
            }else {
                System.out.println("输入有误");
            }
        }
    }
}