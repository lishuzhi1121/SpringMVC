package com.quvideo.dao;

import com.quvideo.domain.Account;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface AccountDao {
    @Insert("INSERT INTO t_account(name, money) VALUES (#{name}, #{money})")
    void save(Account account);
    @Delete("DELETE FROM t_account WHERE id = #{id}")
    void delete(Integer id);
    @Update("UPDATE t_account SET name = #{name}, money = @{money} WHERE id = #{id}")
    void update(Account account);
    @Select("SELECT * FROM t_account")
    List<Account> findAll();
    @Select("SELECT * FROM t_account WHERE id = #{id}")
    Account findById(Integer id);

}
