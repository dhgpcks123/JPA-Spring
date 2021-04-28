package helloJpa.relationEntity;

import javax.persistence.*;

@Entity
public class RelationMember {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="USERNAME")
    private String name;
    private int age;

    //단방향
    @ManyToOne(fetch = FetchType.LAZY)//개별로 가져옴.
    // 기본 값은 같이 가져옴. FetchType.EAGER
    // 현업에서 권장하는 건 웬만하면 전부 다 LAZY로.
    @JoinColumn(name = "TEAM_ID")
    private RelationTeam team;
    //양방향을 원하면 relationTeam으로


//    @Column(name="TEAM_ID")
//    private Long teamId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public RelationTeam getTeam() {
        return team;
    }

    public void setTeam(RelationTeam team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "RelationMember{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", team=" + team +
                '}';
    }
}
