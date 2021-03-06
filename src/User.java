import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class User {
     private int id;
     private String name;
     private int age;
     private Gender gender;
}
