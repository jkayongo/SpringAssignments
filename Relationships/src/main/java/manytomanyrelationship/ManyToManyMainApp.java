package manytomanyrelationship;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToManyMainApp {

	public static void main(String[] args) {
		//create  client objects
		Client client1 = new Client();
		client1.setClientName("Namyonjo Valeria");
		client1.setAge(26);
		client1.setResidence("Mutundwe");
		Client client2 = new Client();
		client2.setClientName("Amanya Monic");
		client2.setAge(28);
		client2.setResidence("Nyabushozi");
		Client client3 = new Client();
		client3.setClientName("Khaukha Charles");
		client3.setAge(18);
		client3.setResidence("Mbale");
		Client client4 = new Client();
		client4.setClientName("Umwiza Halimah");
		client4.setAge(23);
		client4.setResidence("Kisoro");
		//create a Product object
		Product product1 = new Product();
		product1.setProductName("Mutton");
		product1.setPrice(22000);
		Product product2 = new Product();
		product2.setProductName("bean");
		product2.setPrice(28000);
		Product product3 = new Product();
		product3.setProductName("Tilapia");
		product3.setPrice(35000);
		Product product4 = new Product();
		product4.setProductName("Liver");
		product4.setPrice(13000);
		//create a set of clients for product1 rem:a product can be linked to multiple clients
		Set<Client> clientsForProduct1 = new HashSet<>();
		clientsForProduct1.add(client3);
		clientsForProduct1.add(client2);
		clientsForProduct1.add(client1);
		//create a set of  products for a client rem: a client can have multiple products
		
		Set<Product> productsForClient1 = new HashSet();
		productsForClient1.add(product1);
		productsForClient1.add(product4);
		productsForClient1.add(product2);
		productsForClient1.add(product3);
		
		//add a set of of clients to a product
		product1.setClients(clientsForProduct1);
		//add a set of products to a client
		client1.setProducts(productsForClient1);
		//persist product and client
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.persist(product1);
		session.persist(client1);
		transaction.commit();
		session.close();
		
		
		
		
		
		

	}

}
