package com.bage.finance.admin.api.controller;

import com.bage.common.dto.ApiResponse;
import com.bage.finance.biz.dto.form.*;
import com.bage.finance.biz.dto.vo.ListFileVo;
import com.bage.finance.biz.service.FileService;
import com.bage.mybatis.help.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import com.bage.finance.biz.service.FileRefMappingService;
import java.util.Set;

@Api(tags = "文件管理")
@RestController
@RequestMapping(value = "/file")
@RequiredArgsConstructor
@Slf4j
public class FileController {
    final FileService fileService;
    final FileRefMappingService fileRefMappingService;

    @ApiOperation(value = "上传文件（大于5M分片，小于等于5M不分片）")
    @PostMapping(value = "/uploadPart")
    public ApiResponse<String> uploadPart(@Valid UploadFileForm form) throws Exception {
        return ApiResponse.success(fileService.uploadPart(form));
    }

    @ApiOperation(value = "合并上传的文件（合并分片）")
    @PostMapping(value = "/composeFile")
    public ApiResponse<String> composeFile(@Valid @RequestBody ComposeFileForm form) throws Exception {
        return ApiResponse.success(fileService.composeFile(form));
    }

    @ApiOperation(value = "查询文件列表")
    @PostMapping(value = "/list")
    public ApiResponse<PageInfo<ListFileVo>> list(@Valid @RequestBody ListFileForm form) throws Exception {
        return ApiResponse.success(fileService.list(form));
    }

    @ApiOperation(value = "查询文件列表")
    @PostMapping(value = "/listByIds")
    public ApiResponse<List<ListFileVo>> listByIds(@Valid @RequestBody ListFileByIdsForm form) throws Exception {
        return ApiResponse.success(fileService.listByIds(form));
    }

    @ApiOperation(value = "获取图片地址")
    @GetMapping(value = "/getPicUrl")
    public ApiResponse<String> getPicUrl(@Valid @NotNull Long id) throws Exception {
        return ApiResponse.success(fileService.getPicUrl(id));
    }

    @ApiOperation(value = "删除图片")
    @PostMapping(value = "/del")
    public ApiResponse<Boolean> del(@Valid @RequestBody DelForm form) {
        return ApiResponse.success(fileService.del(form));
    }

    @ApiOperation(value = "获取文件id列表")
    @PostMapping(value = "/listFileIds")
    public ApiResponse<Set<Long>> listFileIds(@Valid @RequestBody ListFileRefMappingFileIdsForm form) {
        return ApiResponse.success(fileRefMappingService.listFileIds(form));
    }
}
