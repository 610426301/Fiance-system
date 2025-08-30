package com.bage.finance.biz.dto.form;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class CreateFolderForm {
    @ApiModelProperty(value = "上级id")
    @NotNull
    @Min(value = 0)
    private Long pid;

    @ApiModelProperty(value = "文件夹名称")
    @NotBlank
    @Length(min = 1, max = 50)
    private String name;

    @ApiModelProperty(value = "顺序")
    @NotNull
    private Integer sort;
}
