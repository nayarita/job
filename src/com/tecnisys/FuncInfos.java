package com.tecnisys;

import com.sun.jdi.IncompatibleThreadStateException;

import java.util.Date;

public class FuncInfos {
    private String nomeFunc;
    private Integer hAdcnoturno;
    private Float acrescentar;
    private Integer saldoPagar;
    private Integer horaExtra;
    private Date data;

    public FuncInfos() {
    }

    public String getNomeFunc() {
        return nomeFunc;
    }

    public Integer gethAdcnoturno() {
        return hAdcnoturno;
    }

    public Float getAcrescentar() {
        return acrescentar;
    }

    public Integer getSaldoPagar() {
        return saldoPagar;
    }

    public Integer getHoraExtra() {
        return horaExtra;
    }

    public Date getData() {
        return data;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public void sethAdcnoturno(Integer hAdcnoturno) {
        this.hAdcnoturno = hAdcnoturno;
    }

    public void setAcrescentar(Float acrescentar) {
        this.acrescentar = acrescentar;
    }

    public void setSaldoPagar(Integer saldoPagar) {
        this.saldoPagar = saldoPagar;
    }

    public void setHoraExtra(Integer horaExtra) {
        this.horaExtra = horaExtra;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
