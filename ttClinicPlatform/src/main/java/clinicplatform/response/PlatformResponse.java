package clinicplatform.response;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 用于响应平台的请求
 * @author leetao
 * @date 2019/8/16
 */
@Data
public class PlatformResponse <T> implements Serializable {
    /**
     * 响应状态
     */
    private String status;
    /**
     * 集合数据
     */
    private List<T> list;
    /**
     * 单个对象数据
     */
    private T object;
}

