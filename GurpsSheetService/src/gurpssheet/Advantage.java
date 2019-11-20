package gurpssheet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "advantage")
public class Advantage {
	@Id
	@GeneratedValue
	int id;
	@Column(name = "name")
	String name;
	public Advantage() {
		//default
	}
	
		
}
