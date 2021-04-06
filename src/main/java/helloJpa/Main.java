package helloJpa;

import helloJpa.entity.Member;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("hello");
        //persistence.xml정보를 가지고 엔티티매니저공장을 만들어라.
        //Factory서버 띄울 때 딱 한번만 로딩하고, 팩토리에서 entityManager 꺼내서 써야한다.
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        /*
        Member member = new Member();
        member.setId(101L);
        member.setName("안녕하세요");
        em.persist(member);
        tx.commit();
        em.close();
        emf.close();
         */

        try {
            Member member = new Member();
            member.setId(100L);
            member.setName("hello");
            em.persist(member);
            tx.commit();
        }catch(Exception e){
            tx.rollback();
        }finally{
            em.close();
        }
        emf.close();
    }
}
