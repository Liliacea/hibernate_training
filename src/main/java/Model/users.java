package Model;

import lombok.Generated;

import javax.management.relation.Role;
import javax.persistence.*;


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/*
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity

 */
@Entity
@Table(name="users")

public class users extends Model{
 /*   @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

  */
    @Column(name = "age")
    private int age;
    @Column(name = "firstname")
    private String firstname;
    @Column(name = "lastname")
    private String lastname;

   // @ManyToOne ()          //targetEntity = Role.class многик одному (Role role;)
    //@JoinColumn(name = "role_id")

  /*  @OneToOne
    @PrimaryKeyJoinColumn
   private Model.Position position;
   */
  @ManyToMany
  @JoinTable(name = "user_position")
  @JoinColumn(name = "user_id")




private  Set<Position> positions = new HashSet<Position>();


    public users() {
        super();
    }

    public users(Integer id) {
        super(id);
      
    }
    /*  public users(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

   */

    public void setId() {
      //  this.id = id;
    }




    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

 /*   public Model.Position getPosition() {
        return position;
    }

    public void setPosition(Model.Position position) {
        this.position = position;
    }

  */

    public Set<Position> getPositions() {
        return positions;
    }

    public void setPositions(Set<Position> positions) {
        this.positions = positions;
    }

    @Override
    public String toString() {
        return "users{" +
                "age=" + age +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", positions=" +
                '}';
    }
}

