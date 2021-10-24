package com.Re.mapper;

import com.Re.entity.Apply;
import com.Re.entity.LockProcess;
import com.Re.entity.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MasterMapper {
    @Select("select * from product")
    List<Product> selectProductList();

    Apply selectApply();

    Apply selectApplyAndStatus();

    Apply selectApplyAndPerson();

    List<LockProcess> selectProcess(Integer id);

}
