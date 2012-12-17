package guozheng;

/**
 * Created by IntelliJ IDEA.
 * User: guozheng
 * Date: 12-12-3
 * Time: 下午7:44
 * To change this template use File | Settings | File Templates.
 */
public class ParkFullException extends Throwable {
    public ParkFullException(){

    }
    public ParkFullException(String message) {
        super(message);
    }
}
