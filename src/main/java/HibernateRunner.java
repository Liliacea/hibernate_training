import jakarta.persistence.Entity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class HibernateRunner {


        private static SessionFactory sessionFactory = null;

        static {
            Configuration configuration = new Configuration().configure();
            StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().
                    applySettings(configuration.getProperties());

            sessionFactory = configuration.buildSessionFactory(builder.build());

        }
        public static SessionFactory getSessionFactory () {
            return sessionFactory;
        }


    }



