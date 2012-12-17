package guozheng;


import java.util.ArrayList;
import java.util.List;


/**
 * Created by IntelliJ IDEA.
 * User: guozheng
 * Date: 12-12-17
 * Time: 上午11:04
 * To change this template use File | Settings | File Templates.
 */
/*
* 在定义接口的时候如果将两个数组元素定义成一个数组类的话，会出现异常错误，所以选择两种不同的数组类型来解决“停车场
* 和停车场信息的类”
*
* */
public interface ParkInterface {
    ParkPlace getAvailablePark(List<ParkPlace> parkplace);
    ParkPlace getAvailablePark(ArrayList<ParkMessage> parkMessages);
}
