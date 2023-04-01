package com.quvideo.dao;

public interface BookDao {
    public void save();
    public void update();
    public void delete(Integer id);
    public void select(String name);
}
