package com.quvideo.dao;

import com.quvideo.domain.Account;
import org.apache.ibatis.annotations.*;

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
    @Select("SELECT * FROM t_account WHERE name = #{name}")
    Account findByName(String name);
    @Update("UPDATE t_account SET money = money + #{money} WHERE name = #{name}")
    void inMoney(@Param("name") String name, @Param("money") Double money);
    @Update("UPDATE t_account SET money = money - #{money} WHERE name = #{name}")
    void outMoney(@Param("name") String name, @Param("money") Double money);

}
