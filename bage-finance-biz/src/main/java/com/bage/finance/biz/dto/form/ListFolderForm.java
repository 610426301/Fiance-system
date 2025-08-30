package com.bage.finance.biz.dto.form;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
public class ListFolderForm {
    @ApiModelProperty(value = "上级id")
    @NotNull
    @Min(value = 0)
    private Long pid;
}
