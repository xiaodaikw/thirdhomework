package guozhengtest;

import guozheng.Car;
import guozheng.ParkFullException;
import guozheng.ParkPlace;
import guozheng.Ticket;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: guozheng
 * Date: 12-12-17
 * Time: 下午2:01
 * To change this template use File | Settings | File Templates.
 */
public class ParkTest {
    public ParkPlace parkplace;
   // public static ParkPlace park;
    @Before
    public  void init(){
        parkplace = new ParkPlace(20);//设置停车场可以停车的数量
    }
    //测试进如一辆车，空位数减去1
    @Test
    public void   parkplace_should_minus_1_if_have_emptyplace(){
           parkplace.parkCar(new Car()) ;
        Assert.assertEquals(19,parkplace.getAvailableNum());
    }
    @Test(expected = ParkFullException.class)
    public void place_should_throws_exception_if_place_is_full(){
         for(int i=0;i<=20;i++){
             parkplace.parkCar(new Car());
         }

    }
    @Test
    public void park_should_get_effective_ticket(){
        Ticket ticket=parkplace.parkCar(new Car());
        Assert.assertNotNull(ticket);
    }
    //测试当进去一辆车的时候，返回过来一个凭证
    @Test
    public void park_should_return_one_ticket_when_push_car(){
        parkplace.parkCar(new Car());
         parkplace.parkCar(new Car());
        Ticket ticket=parkplace.parkCar(new Car());
        //Ticket ticket1=parkplace.parkCar(new Car());
        Car car=parkplace.fetchCar(ticket);
        Assert.assertEquals(parkplace.getAvailableNum(),18);
    }
    //测试凭证和车是不是一样
    @Test
    public  void park_should_return_error_if_ticket_not_match(){
        Car car=new Car();
        Ticket ticket=parkplace.parkCar(car) ;
        Car popCar=parkplace.fetchCar(ticket);
        Assert.assertSame(car,popCar);
    }

}
