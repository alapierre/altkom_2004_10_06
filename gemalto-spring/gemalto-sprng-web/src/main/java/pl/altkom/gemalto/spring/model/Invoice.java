/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.gemalto.spring.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Student
 */
@Entity
public class Invoice extends BaseEntity {
    
    private static final long serialVersionUID = 1L;
    
    private BigDecimal totalSumNet;
    
    private BigDecimal totalSumGross;

    public BigDecimal getTotalSumNet() {
        return totalSumNet;
    }

    public void setTotalSumNet(BigDecimal totalSumNet) {
        this.totalSumNet = totalSumNet;
    }

    public BigDecimal getTotalSumGross() {
        return totalSumGross;
    }

    public void setTotalSumGross(BigDecimal totalSumGross) {
        this.totalSumGross = totalSumGross;
    }
 
}
