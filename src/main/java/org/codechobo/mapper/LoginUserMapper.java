package org.codechobo.mapper;

import java.util.List;
import org.codechobo.domain.LoginUser;

public interface LoginUserMapper {
    List<LoginUser> getList();

    void insert(LoginUser user);

    LoginUser read(String id);

    int delete(String id);

    int update(LoginUser user);
}