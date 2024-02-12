package modles;

import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class Screen extends  BaseModel{
    private String name;
    @OneToMany
    private List<Seat> seats;
    private List<Feature> features;
}
