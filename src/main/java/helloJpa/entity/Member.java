package helloJpa.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Member {

    @Id //pk
    @GeneratedValue(strategy = GenerationType.AUTO)
    /*
        strategy = GenerationType.IDENTITY -> 데이터베이스에 위임, MY SQL
        SEQUENCE -> Oracle @SequenceGenerator 필요
        TABLE -> 키 생성용 테이블 사용, 모든 DB에서 사용 @TableGenerator 필요
        AUTO -> 방언에 따라 자동 지정, 기본값
    */
    //db 기본 키 제약 조건 :  null 아님, 유일, 변하면 안된다.
    //미래에도.. 만족하는 자연키는 찾기 어렵다. (주민 안 변하겠지... -> 개인정보다 쓰지마!)
    //Long + 대체키 + 키 생성전략 사용 .. 보통 숫자로 쓰잖아. 십억, 이십억이 금방온다. ㅇㅅㅇ..
    private Long id;

    @Column(name="USERNAME")
//  ,insertable = false) insert할 때 이 값이 업데이트 안 됨.
//  ,nullable = false) not null 제약 조건 걸어버림.
//  ,unique = false)
//  ,length = 20)
    private String name;
    private int age;
    @Temporal(TemporalType.TIMESTAMP)
    private Date regDate;
    @Enumerated(EnumType.STRING)
    private MemberType memberType;

    //@Lob -> CLOB(character), BLOB(byte) 매핑
    //@Transient -> 이 필드는 매핑하지 않는다. 애플리케이션에서 DB에 저장하지 않는 필드(웬만하면 쓰지 않아야지)

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

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public MemberType getMemberType() {
        return memberType;
    }

    public void setMemberType(MemberType memberType) {
        this.memberType = memberType;
    }
}