
/**
* Author:Collonn, Email:collonn@126.com, QQ:195358385
*/
package com.jelly.eoss.db.mapper.basic.iface;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.jelly.eoss.db.entity.AdminRole;

@Mapper
@Repository
public interface AdminRoleMapper {


    public List<AdminRole> select(AdminRole adminRole);
    public List<AdminRole> selectPage(AdminRole adminRole);
    public List<AdminRole> selectAll();
    public Integer selectCount(AdminRole adminRole);
    public AdminRole selectByPk(Integer id);
    public AdminRole selectOne(AdminRole adminRole);
    public void insert(AdminRole adminRole);
    public void update(AdminRole adminRole);
    public void updateWithNull(AdminRole adminRole);
    public void deleteByPk(Integer id);
    public void deleteByPojo(AdminRole adminRole);
}