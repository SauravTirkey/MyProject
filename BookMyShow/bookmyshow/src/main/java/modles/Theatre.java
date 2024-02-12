package modles;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class Theatre extends BaseModel{
    private  String name;
    @ManyToOne
    private  Region region;
    @OneToMany
    private List<Screen> screens;
}
