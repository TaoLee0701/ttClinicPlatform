package clinicplatform.entity;

import static org.assertj.core.api.Assertions.useDefaultDateFormatsOnly;

import java.util.List;

import com.baomidou.mybatisplus.annotation.TableField;

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
	@TableField(exist=false)
	private List<String> hiImage;
	@TableField(exist=false)
	private int changeScore;

	public void setChangeScore(int score) {
		switch (score) {
			case 0: this.changeScore=0; break;
			case 1:
			case 2: this.changeScore=1; break;
			case 3:
			case 4: this.changeScore=2; break;
			case 5:
			case 6:
			case 7: this.changeScore=3; break;
			case 8:
			case 9: this.changeScore=4; break;
			case 10: this.changeScore=5; break;
			default:this.changeScore=0;break;
		}
	}
}
