package Nankai.domain;
/*
 * 建立数据网关表
 * CREATE TABLE `GATEWAY` (
  `GwID` bigint(64) unsigned NOT NULL AUTO_INCREMENT,
  `GwEUI` varchar(16) DEFAULT NULL,
  `LastFRM` decimal(64,0) NOT NULL COMMENT 'the last frame received',
  `SKEY` varchar(16) DEFAULT NULL,
  `Lat` decimal(10,6) DEFAULT NULL COMMENT 'GPS position for latitude',
  `Longi` decimal(10,6) DEFAULT NULL COMMENT 'GPS position for longitude',
  `Alt` decimal(10,2) DEFAULT NULL COMMENT 'GPS position for altitude ',
  `Temp` decimal(5,2) DEFAULT NULL COMMENT 'Temperature',
  `Batt` decimal(5,2) DEFAULT NULL COMMENT 'battery level, unit %',
  `IsOnline` bit(1) NOT NULL DEFAULT b'0',
  `IsValid` bit(1) NOT NULL DEFAULT b'1',
  PRIMARY KEY (`GwID`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;
 * */

import java.math.BigDecimal;

public class gateway {

	
	
	private Long gwid;		//主键
	private String gweui;
	private BigDecimal lastfrm;
	private String skey;
	private BigDecimal lat;
	private BigDecimal longi;
	private BigDecimal alt;
	private BigDecimal temp;
	private BigDecimal batt;
	private Boolean isOnline;
	private Boolean isValid;
	
	
	public Long getGwid() {
		return gwid;
	}
	public void setGwid(Long gwid) {
		this.gwid = gwid;
	}
	public String getGweui() {
		return gweui;
	}
	public void setGweui(String gweui) {
		this.gweui = gweui;
	}
	public BigDecimal getLastfrm() {
		return lastfrm;
	}
	public void setLastfrm(BigDecimal lastfrm) {
		this.lastfrm = lastfrm;
	}
	public String getSkey() {
		return skey;
	}
	public void setSkey(String skey) {
		this.skey = skey;
	}
	public BigDecimal getLat() {
		return lat;
	}
	public void setLat(BigDecimal lat) {
		this.lat = lat;
	}
	public BigDecimal getLongi() {
		return longi;
	}
	public void setLongi(BigDecimal longi) {
		this.longi = longi;
	}
	public BigDecimal getAlt() {
		return alt;
	}
	public void setAlt(BigDecimal alt) {
		this.alt = alt;
	}
	public BigDecimal getTemp() {
		return temp;
	}
	public void setTemp(BigDecimal temp) {
		this.temp = temp;
	}
	public BigDecimal getBatt() {
		return batt;
	}
	public void setBatt(BigDecimal batt) {
		this.batt = batt;
	}
	public Boolean getIsOnline() {
		return isOnline;
	}
	public void setIsOnline(Boolean isOnline) {
		this.isOnline = isOnline;
	}
	public Boolean getIsValid() {
		return isValid;
	}
	public void setIsValid(Boolean isValid) {
		this.isValid = isValid;
	}
	
	
	
}
