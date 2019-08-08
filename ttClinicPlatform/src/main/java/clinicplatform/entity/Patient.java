package clinicplatform.entity;

import java.util.List;

import clinicplatform.entity.User.UserBuilder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Patient {
	private int patientId;
	private String patientName;
	private String patientSex;
	private String patientPhone;
	private String patientIdentity;
	private String patientCard;
	private int patientState;
	private int uId;
}
