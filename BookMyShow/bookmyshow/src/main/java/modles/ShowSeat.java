package modles;

import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShowSeat extends  BaseModel{
    @ManyToOne
    private Show show;
     @ManyToOne
    private  Seat seat;
    private ShowSeatStatus showSeatStatus;
}
