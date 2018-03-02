package Nankai.dbutilis;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

/**
 * @author Administrator
 * Hibernate�Ĺ�����
 *
 */
public class HibernateUtils {
	
	private static SessionFactory sf=null;
	private static SessionFactory sessionFactory;
	static {
		
		  //��������ע�����
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure().build();
        //�����Ự��������
        sessionFactory = new MetadataSources(serviceRegistry).buildMetadata().buildSessionFactory();
		
		/*//������ÿղ�������
		
		Configuration config=new Configuration().configure();
		
		
		//�õ�sessionFactory
		
		sf=config.buildSessionFactory();*/
	}
	
	/**
	 * @return session
	 *	�õ�һ��session 
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
