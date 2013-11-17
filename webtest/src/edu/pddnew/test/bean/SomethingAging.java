package edu.pddnew.test.bean;

import java.io.Serializable;
import java.util.Date;

public class SomethingAging implements Serializable{
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 2851956854510833311L;
	private Date begin;
	private Date end;
	private int howManyDays;
	private int howManyMonths;
	private int howManyYears;
	public Date getBegin() {
		return begin;
	}
	public void setBegin(Date begin) {
		this.begin = begin;
	}
	public Date getEnd() {
		return end;
	}
	public void setEnd(Date end) {
		this.end = end;
	}
	public int getHowManyDays() {
		return howManyDays;
	}
	public void setHowManyDays(int howManyDays) {
		this.howManyDays = howManyDays;
	}
	public int getHowManyMonths() {
		return howManyMonths;
	}
	public void setHowManyMonths(int howManyMonths) {
		this.howManyMonths = howManyMonths;
	}
	public int getHowManyYears() {
		return howManyYears;
	}
	public void setHowManyYears(int howManyYears) {
		this.howManyYears = howManyYears;
	}
}
