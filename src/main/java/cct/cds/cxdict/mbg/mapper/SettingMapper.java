package cct.cds.cxdict.mbg.mapper;

import cct.cds.cxdict.mbg.model.Setting;
import cct.cds.cxdict.mbg.model.SettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SettingMapper {
    int countByExample(SettingExample example);

    int deleteByExample(SettingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Setting record);

    int insertSelective(Setting record);

    List<Setting> selectByExample(SettingExample example);

    Setting selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Setting record, @Param("example") SettingExample example);

    int updateByExample(@Param("record") Setting record, @Param("example") SettingExample example);

    int updateByPrimaryKeySelective(Setting record);

    int updateByPrimaryKey(Setting record);
}