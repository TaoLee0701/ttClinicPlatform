package clinicplatform.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Hospital {
	private int hospitalId;
	private String hospitalName;
	private String hospitalImg;
	private String hospitalDetail;
	private String hospitalPhone;
	private String hospitalAddress;
	private String hospitalLng;
	private String hospitalLat;
	private double hospitalScore;
	private int hospitalState;
}
