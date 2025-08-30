package com.bage.finance.biz.dto.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Min;
import java.util.Date;

@Data
public class ListFileVo {
    @ApiModelProperty(value = "id")
    @Min(value = 0)
    private Long id;

    @ApiModelProperty(value = "文件名称")
    private String name;

    @ApiModelProperty(value = "文件类型")
    private String extension;

    @ApiModelProperty(value = "上传日期")
    private Date createTime;

    @ApiModelProperty(value = "上传人")
    private String nickName;

    @ApiModelProperty(value = "图片地址")
    private String picUrl;
}
