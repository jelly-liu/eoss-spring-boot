
/**
* Author:Collonn, Email:collonn@126.com, QQ:195358385
*/
package com.jelly.eoss.service.basic;

import com.jelly.eoss.db.entity.AdminUser;

import java.util.List;

public interface AdminUserService {


    public List<AdminUser> select(AdminUser adminUser);
    public List<AdminUser> selectPage(AdminUser adminUser);
    public Integer selectCount(AdminUser adminUser);
    public AdminUser selectByPk(Integer id);
    public AdminUser selectOne(AdminUser adminUser);
    public void insert(AdminUser adminUser);
    public void update(AdminUser adminUser);
    public void updateWithNull(AdminUser adminUser);
    public void deleteByPk(Integer id);
    public void deleteByPojo(AdminUser adminUser);
}