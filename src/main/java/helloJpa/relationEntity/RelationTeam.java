package helloJpa.relationEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class RelationTeam {

    @Id @GeneratedValue
    private long id;
    private String name;

    @OneToMany(mappedBy = "team")
    private List<RelationMember> members = new ArrayList<RelationMember>();

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public List<RelationMember> getMembers() {
        return members;
    }

    public void setMembers(List<RelationMember> members) {
        this.members = members;
    }
}

