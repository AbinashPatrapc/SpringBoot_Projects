package com.nt.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Data
@Table(name="DataJPA_Movie")
public class Movie implements Serializable {
    
	
	@Id
	@Column(name="MID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer mid;
	@Column(name="MNAME",length=20)
	private String mname;
	@Column(name="MYEAR",length=20)
	private String mYear;
	@Column(name="RATING")
	private Float rating;
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getmYear() {
		return mYear;
	}
	public void setmYear(String mYear) {
		this.mYear = mYear;
	}
	public Float getRating() {
		return rating;
	}
	public void setRating(Float rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Movie [mid=" + mid + ", mname=" + mname + ", mYear=" + mYear + ", rating=" + rating + "]";
	}
	
	
	
}
