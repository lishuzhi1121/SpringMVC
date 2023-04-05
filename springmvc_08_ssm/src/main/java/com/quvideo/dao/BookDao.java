package com.quvideo.dao;

import com.quvideo.domain.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface BookDao {
//    @Insert("INSERT INTO t_book values(null, #{type}, #{name}, #{description}, null)")
    @Insert("INSERT INTO t_book(type, name, description) VALUES(#{type}, #{name}, #{description})")
    public int save(Book book);
    @Delete("DELETE FROM t_book WHERE id = #{id}")
    public int delete(Integer id);
    @Update("UPDATE t_book SET type = #{type}, name = #{name}, description = #{description} WHERE id = #{id}")
    public int update(Book book);
    @Select("SELECT * FROM t_book")
    public List<Book> getAll();
    @Select("SELECT * FROM t_book WHERE id = #{id}")
    public Book getById(Integer id);

}
