package com.mikemyzhao.vo;

import java.io.Serializable;

/**
 * @Auther: zhaomengyi
 * @Date: 2019/9/11 14:39
 * @Description:
 */

@SuppressWarnings("serial")
public class Dept implements Serializable {
    private String deptno;
    private String dname;
    private String loc;

    public String getDeptno() {
        return deptno;
    }

    public void setDeptno(String deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptno='" + deptno + '\'' +
                ", dname='" + dname + '\'' +
                ", loc='" + loc + '\'' +
                '}';
    }
}
