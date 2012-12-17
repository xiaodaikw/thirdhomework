package guozheng;

/**
 * Created by IntelliJ IDEA.
 * User: guozheng
 * Date: 12-12-17
 * Time: 上午11:25
 * To change this template use File | Settings | File Templates.
 */
/*  使用权限的思想将停车仔和经理给区分开。
将停车仔编上编号
*
* */
public class BoyMessage {
    private int BoyNo;
     private String BoyName;
    private boolean  isManager=false;

    public int getBoyNo() {
        return BoyNo;
    }

    public void setBoyNo(int boyNo) {
        BoyNo = boyNo;
    }

    public String getBoyName() {
        return BoyName;
    }

    public void setBoyName(String boyName) {
        BoyName = boyName;
    }

    public boolean isManager() {
        return isManager;
    }

    public void setManager(boolean manager) {
        isManager = manager;
    }


     public BoyMessage(int BoyNo,String BoyName,boolean isManager){
         this.BoyNo=BoyNo;
         this.BoyName=BoyName;
     }
}
