package com.bage.finance.biz.dto.form;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Size;
import java.util.List;

@Data
public class ListFileByIdsForm {
    @ApiModelProperty(value = "文件id")
    @Size(min = 1)
    private List<Long> ids;
}