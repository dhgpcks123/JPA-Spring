package reJPA;

import reJPA.entity.Member;
import reJPA.entity.MemberType;
import reJPA.entity.Team;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("helloJPA");

        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try{
            //팀 저장
            Team team = new Team();
            team.setName("teamA");
            em.persist(team);;

            //멤버 저장
            Member member = new Member();
//            member.setTeam(team);
//            member.setId(100L);
//            team.getMembers().add(member);
            member.setTeam(team);
            member.setName("안녕");
            member.setRegDate(new Date());
            member.setMemberType(MemberType.USER);

            em.persist(member);

            //
            em.flush();
            em.clear();

            Member findMember = em.find(Member.class, member.getId());
            em.clear();
            findMember.setName("t아카데미");
//            Member findMember = em.find(Member.class, member.getId());
//            Long teamId = findMember.getTeamId();
//            Team findTeam = em.find(Team.class, teamId);
//            Team findTeam = findMember.getTeam();

//            List<Member> members = findTeam.getMembers();
//            for(Member member1 : members){
//                System.out.println("member1 = "+ member1);
//            }

            tx.commit();
        }catch(Exception e){
            tx.rollback();
            e.printStackTrace();
        }finally{
            em.close();
        }
        emf.close();
    }
}
