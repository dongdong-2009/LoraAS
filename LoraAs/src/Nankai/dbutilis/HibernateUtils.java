package Nankai.dbutilis;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

/**
 * @author Administrator
 * Hibernate的工具类
 *
 */
public class HibernateUtils {
	
	private static SessionFactory sf=null;
	private static SessionFactory sessionFactory;
	static {
		
		  //创建服务注册对象
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure().build();
        //创建会话工厂对象
        sessionFactory = new MetadataSources(serviceRegistry).buildMetadata().buildSessionFactory();
		
		/*//构造调用空参数对象
		
		Configuration config=new Configuration().configure();
		
		
		//得到sessionFactory
		
		sf=config.buildSessionFactory();*/
	}
	
	/**
	 * @return session
	 *	得到一个session 
	 *
	 */
	public static Session openSession() {
		Session session=sessionFactory.openSession();
		return session;
		
	}
	
	public static Session getCurrentSession() {
		Session session=sessionFactory.getCurrentSession();
		return session;
		
	}
	
	
	
}
