package helloJpa;

public class Main {
//    public static void main(String[] args) {
//
//        EntityManagerFactory emf =
//                Persistence.createEntityManagerFactory("hello");
//        //persistence.xml정보를 가지고 엔티티매니저공장을 만들어라.
//        //Factory서버 띄울 때 딱 한번만 로딩하고, 팩토리에서 entityManager 꺼내서 써야한다.
//        EntityManager em = emf.createEntityManager();
//        EntityTransaction tx = em.getTransaction();
//        tx.begin();
//
//        /*
//        Member member = new Member();
//        member.setId(101L);
//        member.setName("안녕하세요");
//        em.persist(member);
//        tx.commit();
//        em.close();
//        emf.close();
//         */
//
//        /*  Member JPA
//        try {
//            Member member = new Member();
////            member.setId(100L);
//            member.setName("hello");
////            member.setMemberType(MemberType.USER); -> 0
////            member.setMemberType(MemberType.ADMIN); - > 1
////            enum type에 데이터 사이에 추가 된다? db다 꼬임. 그래서 VO에 @Enumerated(EnumType.STRING)꼭 넣어야함
//            member.setMemberType(MemberType.USER);
//            em.persist(member);
//            tx.commit();
//        }catch(Exception e){
//            tx.rollback();
//        }finally{
//            em.close();
//        }
//        */
//        try {
//            //팀 저장
//            RelationTeam team = new RelationTeam();
//            team.setName("teamA");
//            em.persist(team);
//            //회원 저장
//            RelationMember member = new RelationMember();
//            member.setName("hello");
//            member.setTeam(team);
//            em.persist(member);
//            em.flush();
//            //영속성 context db에 다 반영 ( 영속성 컨테스트를 비우진 않음, db 동기화하는 것이라 생각하면 됨)
//            // 트랜잭션 커밋, JPQL 쿼리 실행 시 플러시 자동 호출 일어난다.
//            // JPQL 쿼리 실행시 flush()자동 실행.
//            em.clear();
//            //영속성 안에 있는 cash 다 지워버림
//
//            //테이블을 가져오려면? getId가져오고 다시 team에서 teamId를 가져와야 함
//            //데이터지향적임..객체지향적인 방법이지 못함
//            RelationMember findMember = em.find(RelationMember.class, member.getId());
//            RelationTeam findTeam = findMember.getTeam();
//            findTeam.getName();
//            List<RelationMember> members = findTeam.getMembers();
//            for(RelationMember member1 : members){
//                System.out.println("member1 ="+ member1.toString());
//            }
//            RelationTeam findMemberFromTeam = em.find(RelationTeam.class, team.getId());
//            int memberSize = findMemberFromTeam.getMembers().size();
//            System.out.println(memberSize);
//            tx.commit();
//        }catch(Exception e){
//            tx.rollback();
//        }finally{
//            em.close();
//        }
//        emf.close();
//    }
}
