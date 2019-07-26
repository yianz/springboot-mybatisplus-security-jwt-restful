package com.github.base.service.interf.manage;

import com.github.base.dto.manage.unit.UnitInsertOneDTO;
import com.github.base.dto.manage.unit.UnitUpdateOneDTO;
import com.github.common.db.entity.primary.Unit;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author WORK, MT
 * @since 2019-04-15
 */
public interface UnitService extends IService<Unit> {

    Long insertOne(UnitInsertOneDTO insertOneReq);

    Boolean deleteOne(Long id);

    Boolean deleteOnePhysical(Long id);

    Boolean updateOne(UnitUpdateOneDTO updateOneReq);

    Unit selectOne(Long id);

    List<Unit> selectList(Boolean isDelete, LinkedHashMap<String, Boolean> orderBy);

}
