package designmodle.proxy;

import com.crazybunqnq.designpattern.proxy_cglib.ProxyFactory;
import com.crazybunqnq.designpattern.proxy_cglib.RealSubject;
import org.junit.Test;

/**
 * Cglib 测试类
 * Created by CrazyBunQnQ on 17-6-6.
 */
public class CglibProxyTest {
    @Test
    public void test() {
        //目标对象
        RealSubject target = new RealSubject();
        //代理对象
        RealSubject proxy = (RealSubject) new ProxyFactory(target).getProxyInstance();
        //执行代理对象的方法
        proxy.doPrint();
    }
}
