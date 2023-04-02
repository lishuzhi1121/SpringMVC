package com.quvideo.dao;

import com.quvideo.domain.AccountLog;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AccountLogDao {
    @Insert("INSERT INTO t_account_log(info) VALUES (#{info})")
    void log(String info);
    @Select("SELECT * FROM t_account_log")
    List<AccountLog> findAllLogs();
}
