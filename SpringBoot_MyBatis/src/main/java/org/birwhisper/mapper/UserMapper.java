package org.birwhisper.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.birwhisper.pojo.User;

import java.util.List;

/**
 * @author: RenKeMuHua
 * @date: Created in 20:01 2019.1.7
 * @Description:
 */
@Mapper
public interface UserMapper {

    public List<User> queryUserList();
}
