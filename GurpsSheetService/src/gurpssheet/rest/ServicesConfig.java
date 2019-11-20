package gurpssheet.rest;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
@ApplicationPath("services")
public class ServicesConfig extends ResourceConfig {
	protected static EntityManagerFactory emf= Persistence.createEntityManagerFactory("gurps-persistence-unit");
	protected static EntityManager em = emf.createEntityManager();
	
	static {
		//static initialization code goes here
	}
	public static EntityManagerFactory getEmf() {
		return emf;
	}
	public static EntityManager getEm() {
		return em;
	}
	public static String getDataBaseURL() {
		return dataBaseURL;
	}
	protected static  String dataBaseURL = "jdbc:sqlite:C:/Users/jwalker/sample.db";
	public ServicesConfig()  {
		//register rest services for jaxrs
		packages("com.fasterxml.jackson.jaxrs.json");
		//register application rest services
		packages("gurpssheet");
		packages("gurpssheet.rest");
	}
}
