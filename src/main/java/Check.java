import Model.Product;
import Model.ProductCategory;
import Model.users;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Check {
    public static void main(String[] args) throws SQLException {
        SessionFactory sessionFactory = HibernateRunner.getSessionFactory();
        Session session = sessionFactory.openSession();
        List<Objects> products = null;
      //  List<Object []> products = null;


        try {
            session.beginTransaction();
           SQLQuery query = session.createSQLQuery("select * from product;");
            query.addEntity(Product.class);
          //  query.addEntity(ProductCategory.class);
         //   query.addJoin("product","product.productCategory"); //в случае запроса с иннер-джойн ("select from product inner join product_category on (product.product_category_id = product_category.id);)
            products = query.list();
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            session.close();
            sessionFactory.close();
        }
       /* for(Object []obj:products){
        System.out.println(obj[0].toString());
        }

        */





    for (Iterator iterator = products.iterator();iterator.hasNext();){
    Product product = (Product) iterator.next();
    System.out.println(product.toString());
}



    }

}

