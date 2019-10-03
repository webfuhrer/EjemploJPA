package paqueteagenda;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ClasePrincipal {

	public static void main(String[] args) {
		/*Contacto c=new Contacto("Pepe", "Perez", "pepe@mailo.com");
		//ProyectoJPA es el nombre del persistence-unit 
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyectoJPA");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		em.close();
		emf.close();
		*/
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyectoJPA");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		List<Contacto> lista_contactos=em.createNamedQuery("Contacto.todos", Contacto.class).getResultList();
		em.getTransaction().commit();
		em.close();
		emf.close();
		System.out.println(lista_contactos);
	}

}
