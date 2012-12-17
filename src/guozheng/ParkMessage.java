package guozheng;

/**
 * Created by IntelliJ IDEA.
 * User: guozheng
 * Date: 12-12-17
 * Time: 上午11:08
 * To change this template use File | Settings | File Templates.
 */
public class ParkMessage extends ParkPlace  {
    private int parkNo;//停车场的编号
      private String parkName; //停车场的名称
    private int AllCapacity=0;//所以的空车场位数
    public int getParkNo() {
        return parkNo;
    }
    public void setParkNo(int parkNo) {
        this.parkNo = parkNo;
    }
    public String getParkName() {
        return parkName;
    }
    public void setParkName(String parkName) {
        this.parkName = parkName;
    }
    public ParkMessage(int capacity) { //构造方法
        super(capacity);
    }
    public ParkMessage(int parkNo,String parkName,int capacity ){ //自定义构造方法
        super(capacity);
        AllCapacity=capacity;
        this.parkNo=parkNo;
        this.parkName=parkName;
    }


}
