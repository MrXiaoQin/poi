package com.poitest.entity;
import com.poitest.util.*;

import java.math.BigDecimal;

/**
 *
 * 学生统计信息
 * @author daochuwenziyao
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
public class StudentStatistics
{
    private Integer id;
    @IsNeeded
    private BigDecimal totalGrade;
    @IsNeeded
    private BigDecimal avgGrade;

    @Override
    public String toString()
    {
        return "StudentStatistics [id=" + id + ", totalGrade=" + totalGrade + ", avgGrade=" + avgGrade + "]";
    }
    public Integer getId()
    {
        return id;
    }
    public void setId(Integer id)
    {
        this.id = id;
    }
    public BigDecimal getTotalGrade()
    {
        return totalGrade;
    }
    public void setTotalGrade(BigDecimal totalGrade)
    {
        this.totalGrade = totalGrade;
    }
    public BigDecimal getAvgGrade()
    {
        return avgGrade;
    }
    public void setAvgGrade(BigDecimal avgGrade)
    {
        this.avgGrade = avgGrade;
    }

}
