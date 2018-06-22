import java.util.ArrayList;

class Spgl{
    private ArrayList aa=null;
    Spgl(){
        aa=new ArrayList();
    }
    public void addsp(Sp sp) {
        aa.add(sp);
        System.out.println("添加新食品成功！");
    }
    public void spxx(String bh) {
        int i;
        for(i=0;i<aa.size();i++) {
            Sp sp=(Sp)aa.get(i);
            if(sp.getBianhao().equals(bh)) {
                System.out.println("该食品的信息为：");
                System.out.println("食品编号："+bh);
                System.out.println("食品名称："+sp.getMingcheng());
                System.out.println("食品名称："+sp.getJiage());
                break;
            }
        }
        if(i==aa.size())
            System.out.println("对不起，无此食品！");
    }
    public void spjg(String bh,float jg) {
        int i;
        for(i=0;i<aa.size();i++) {
            Sp sp=(Sp)aa.get(i);
            if(sp.getBianhao().equals(bh)) {
                sp.setJiage(jg);
                System.out.println("修改食品价格成功！");
                break;
            }
        }
        if(i==aa.size())
            System.out.println("对不起，没有找到相应的食品，修改价格失败！");
    }
    public void delsp(String bh) {
        int i;
        if(aa.size()==10) {
            System.out.println("对不起，仓库中已没有任何食品！");
        }
        for(i=0;i<aa.size();i++) {
            Sp sp=(Sp)aa.get(i);
            if(sp.getBianhao().equals(bh)) {
                aa.remove(i);
                System.out.println("删除食品成功！");
                break;
            }
        }
        if(i==aa.size()&&(aa.size()!=0))
            System.out.println("对不起，没有该食品！");
    }
}