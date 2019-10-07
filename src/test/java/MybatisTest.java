import com.bit.Pack.UserPacking;
import com.bit.mapper.OrderMapper;
import com.bit.mapper.UserMapper;
import com.bit.po.*;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;


public class MybatisTest {
    private SqlSessionFactory sqlSessionFactory;
    @Before
    public void init() {
        try {
            InputStream in= Resources.getResourceAsStream("sqlMapConfig.xml");
            sqlSessionFactory =new SqlSessionFactoryBuilder().build(in);

        }
        catch (Exception e){e.printStackTrace();}
    }
    @Test
    public void test()
    {
        try{
            SqlSession sqlSession=sqlSessionFactory.openSession();
           OrderMapper orderMapper= sqlSession.getMapper(OrderMapper.class);
           // UserPacking userPacking=new UserPacking();
            //UserEx userEx=new UserEx();
           // userEx.setSex("1");
            //userEx.setUsername("je");
            //userPacking.setUserEx(userEx);
           // List<Integer> queryList=new ArrayList<>();
            //queryList.add(25);
            //queryList.add(26);
            //queryList.add(30);
            //userPacking.setIds(queryList);
List<Orders> result=orderMapper.queryOrderByItems();
//List<OrdersEx>result=orderMapper.queryOrdersByUser();
            System.out.println(result);

        }
        catch (Exception ex){ex.printStackTrace();}
    }

}
