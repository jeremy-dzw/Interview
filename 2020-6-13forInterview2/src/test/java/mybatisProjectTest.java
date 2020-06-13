import com.hqyj.mybatisProject.userDao;
import com.hqyj.mybatisProject.userMappingClass;
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

public class mybatisProjectTest
{
    private InputStream in;
    private SqlSession sqlSession;
    private userDao userdao;
    @Before
    public void init() throws IOException
    {
        in = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        sqlSession = factory.openSession(true);
        userdao = sqlSession.getMapper(userDao.class);
    }
    @After
    public void destroy() throws IOException {
        sqlSession.commit();
        sqlSession.close();
        in.close();
    }
    @Test
    public void findAllUser()
    {
        List<userMappingClass> container = userdao.findAllUser();
        for(userMappingClass x : container)
        {
            System.out.println(x);
        }
    }
}
