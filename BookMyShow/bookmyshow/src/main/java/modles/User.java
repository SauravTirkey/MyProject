package modles;

import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class User extends BaseModel{
    private  String name;
    private String email;
    @OneToMany
    private List<Booking> booking;
}
