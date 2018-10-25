package org.crown.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.crown.common.framework.mapper.BaseMapper;
import org.crown.model.entity.UserRole;

/**
 * <p>
 * 系统用户角色关系表 Mapper 接口
 * </p>
 *
 * @author Caratacus
 * @since 2018-10-25
 */
@Mapper
public interface UserRoleMapper extends BaseMapper<UserRole> {

}
