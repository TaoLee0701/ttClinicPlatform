package clinicplatform.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
	private int userId;
	private String userName;
	private String userAddress;
	private String userPassword;
	private String userPhone;
	private int userState;
	
}
