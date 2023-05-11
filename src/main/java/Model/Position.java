package Model;

import Model.users;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Entity
@Table(name = "Position")
public class Position extends Model {
   /* @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    */
    @Column(name = "title")
    private String title;
   // @OneToMany (mappedBy = "position")
    //private Set<Model.users> usersSet = new HashSet<Model.users>();
/*@OneToOne(mappedBy = "position")
    private  Model.users Model.users;

 */
   @ManyToMany(mappedBy = "positions")

   private Set<users> usersSet = new HashSet<users>();

    public Position() {
    }

  /*  public Model.users getUsers() {
        return Model.users;
    }

    public void setUsers(Model.users Model.users) {
        this.Model.users = Model.users;
    }

   */

      public Set<users> getUsersSet() {
            return usersSet;
        }

        public void setUsersSet(Set<users> usersSet) {
            this.usersSet = usersSet;
        }



   /* public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    */

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }



}
