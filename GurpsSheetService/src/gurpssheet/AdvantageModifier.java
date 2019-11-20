package gurpssheet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "advantage_modifier")
public class AdvantageModifier {
	@Id
	@GeneratedValue
	int id;
	@Column(name = "name")
	String name;
	@Column(name = "has_levels")
	boolean hasLevels;
	@Column(name = "percentage_cost")
	boolean percentageCost;
	@Column(name = "initial_cost")
	int initialCost;
	@Column(name = "aditional_levels_cost")
	int additionalLevelsCost;
	@Column(name="description")
	String description;
	
	
	
	public AdvantageModifier() {
		// default
	}
	
}
