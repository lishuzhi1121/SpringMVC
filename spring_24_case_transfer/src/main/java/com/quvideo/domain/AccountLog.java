package com.quvideo.domain;

public class AccountLog {
    private Integer id;
    private String info;
    private Double money;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "AccountLog{" +
                "id=" + id +
                ", info='" + info + '\'' +
                ", money=" + money +
                '}';
    }
}
