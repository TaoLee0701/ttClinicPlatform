package clinicplatform.response;

import org.springframework.http.HttpStatus;
/**
 * 返回响应数据
 */
public class ResultResponse {
    /** 错误码 */
    private Integer code;

    /**提示信息 */
    private String msg;

    /**
     * HTTP Response Status Code
     */
    private HttpStatus status;

    /**
     *  具体内容
     *  返回对象
     */
    private Object data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }
}
