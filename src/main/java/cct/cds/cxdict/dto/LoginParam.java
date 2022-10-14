package cct.cds.cxdict.dto;

import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class LoginParam {
    
    @NotEmpty
    @ApiModelProperty(value = "用户名",required = true)
    private String name;
    @NotEmpty
    @ApiModelProperty(value = "密码",required = true)
    private String password;
    
}
