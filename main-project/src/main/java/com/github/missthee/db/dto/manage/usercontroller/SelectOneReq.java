package com.github.missthee.db.dto.manage.usercontroller;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class SelectOneReq {
    @ApiModelProperty(value = "用户id")
    private Long id;
}