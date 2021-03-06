
package com.imall.iportal.core.shop.repository;

import com.imall.iportal.core.shop.vo.DrugCuringRecordPageVo;
import com.imall.iportal.core.shop.vo.DrugCuringRecordSearchParam;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * (JPA持久化层)
 * @author by imall core generator
 * @version 1.0.0
 */
public interface DrugCuringRecordRepositoryCustom{

    /**
     * 分页查询药品养护记录
     * @param pageable
     * @param drugCuringRecordSearchParam
     * @return
     */
    Page<DrugCuringRecordPageVo> query(Pageable pageable, DrugCuringRecordSearchParam drugCuringRecordSearchParam);

}

