package modles;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Entity
public class Booking extends BaseModel{
   private BookingStatus bookingStatus;
   @ManyToMany
   private List<ShowSeat> showSeat;
   @ManyToOne
   private User user;
   @ManyToOne
   private  Show show;
   private int amount;

@OneToMany
   private List<Payment> payments;
}
