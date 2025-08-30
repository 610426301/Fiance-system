package com.bage.finance.biz.dto.form;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
public class ComposeFileForm {
    @ApiModelProperty(value = "文件夹id")
    @NotNull
    @Min(value = 0)
    private Long folderId;

    @ApiModelProperty(value = "总分片大小")
    @NotNull
    private Integer totalChunks;

    @ApiModelProperty(value = "文件名")
    private String fileName;

    @ApiModelProperty(value = "文件唯一编号")
    @Pattern(regexp = "[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}")
    private String uid;
}
