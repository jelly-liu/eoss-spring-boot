package com.jelly.eoss.db.mapper.business.iface;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @Author ：jelly.liu
 * @Date ：Created At 3:33 PM 2019/1/8
 * @Description：${description}
 */

@Repository
public interface RoleExtMapper {
    public Integer queryRolePageCount(Map param);
    public List<Map<String, Object>> queryRolePage(Map param);
    public List<Map<String, Object>> queryAllPermissionWithRole(Integer roleId);
    public List<String> queryByUserId(Integer userId);
}
