import com.hqyj.daoInterface.daointerface;
import com.hqyj.daoInterface.mappingClass;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class accountTest
{
    private InputStream in;
    private SqlSession sqlSession;
    private daointerface daointerfacexxx;
    private daointerface userdao;
    @Before
    public  void init() throws IOException {
        //1、读取配置文件
        in = Resources.getResourceAsStream("sqlMapConfig.xml");
        //2、获取SqlSessionFactory
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //3、获取Sqlsession对象
        sqlSession  = factory.openSession(true);
        //4、获取dao的代理对象
        userdao = sqlSession.getMapper(daointerface.class);
    }
    @After
    public  void destroy() throws IOException {
        //1、提交事务
        sqlSession.commit();
        //2、关闭资源
        sqlSession.close();
        in.close();
    }
    @Test
    public void  testFindAllUser()
    {
        List<mappingClass>  l = userdao.findAll();
        for(mappingClass x : l)
        {
            System.out.println(x);
        }
    }

}
