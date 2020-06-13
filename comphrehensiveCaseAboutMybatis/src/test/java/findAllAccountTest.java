import com.hqyj.mybatiscase.accountDao;
import com.hqyj.mybatiscase.accountMappingClass;
import com.hqyj.mybatiscase.userDao;
import com.hqyj.mybatiscase.userMappingClass;
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
/**测试查询所有的账户信息**/
public class findAllAccountTest
{
    private InputStream in;
    private SqlSession sqlSession;
    private accountDao accountdao;
    @Before
    public void init() throws IOException
    {
        in = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        sqlSession = factory.openSession(true);
        accountdao = sqlSession.getMapper(accountDao.class);
    }
    @After
    public void destroy() throws IOException {
        sqlSession.commit();
        sqlSession.close();
        in.close();
    }
    @Test/**测试查询所有的账户信息**/
    public void findAllUser()
    {
        List<accountMappingClass> container = accountdao.findAllAccount();
        for(accountMappingClass x : container)
        {
            System.out.println(x);
        }
    }




}
