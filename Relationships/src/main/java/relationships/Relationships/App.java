package relationships.Relationships;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//parent
//        Learner learner =  new Learner();
//        learner.setCourse("Data science");
//        learner.setLearnerName("Moses kauma");
    	//child
//        Transcript transcript = new Transcript();
//        transcript.setUniversity("Makerere");
//        transcript.setYear(2023);
//        learner.setTranscript(transcript);
//        transcript.setLearner(learner);
    	//create a new learner
    	Learner learner = new Learner();
    	learner.setLearnerName("Mugisha Benson");
    	learner.setCourse("Radiology");
    	//create a new transcript and set the learner
    	Transcript transcript = new Transcript();
    	transcript.setUniversity("Kyambogo university");
    	transcript.setYear(2018);
    	transcript.setLearner(learner);
    	learner.setTranscript(transcript);
    	
  
        
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sef = configuration.buildSessionFactory();
        Session session = sef.openSession();
        Transaction transaction = session.beginTransaction();
        //we persist learner.
        session.persist(learner);
        transaction.commit();
        session.close();
    }
}
