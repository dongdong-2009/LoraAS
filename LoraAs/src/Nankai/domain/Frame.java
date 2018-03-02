package Nankai.domain;

import java.io.Serializable;

/**
 * @author ly
 *	Êý¾ÝÖ¡µÄJavaBean
 */
public class Frame implements Serializable{
	int FrmID;
	char GW;
	int TMST;
	int RecvTimeGw;
	int RecvTimeNs;
	double RSSI;
	double LSNR;
	int ADR;
	int CHAN;
	int RFCH;
	double Freq;
	String Modul;
	int DR;
	double BW;
	int Size;
	char Payload;
	boolean IsValid;
	
	
	
	public int getFrmID() {
		return FrmID;
	}
	public void setFrmID(int frmID) {
		FrmID = frmID;
	}
	public char getGW() {
		return GW;
	}
	public void setGW(char gW) {
		GW = gW;
	}
	public int getTMST() {
		return TMST;
	}
	public void setTMST(int tMST) {
		TMST = tMST;
	}
	public int getRecvTimeGw() {
		return RecvTimeGw;
	}
	public void setRecvTimeGw(int recvTimeGw) {
		RecvTimeGw = recvTimeGw;
	}
	public int getRecvTimeNs() {
		return RecvTimeNs;
	}
	public void setRecvTimeNs(int recvTimeNs) {
		RecvTimeNs = recvTimeNs;
	}
	public double getRSSI() {
		return RSSI;
	}
	public void setRSSI(double rSSI) {
		RSSI = rSSI;
	}
	public double getLSNR() {
		return LSNR;
	}
	public void setLSNR(double lSNR) {
		LSNR = lSNR;
	}
	public int getADR() {
		return ADR;
	}
	public void setADR(int aDR) {
		ADR = aDR;
	}
	public int getCHAN() {
		return CHAN;
	}
	public void setCHAN(int cHAN) {
		CHAN = cHAN;
	}
	public int getRFCH() {
		return RFCH;
	}
	public void setRFCH(int rFCH) {
		RFCH = rFCH;
	}
	public double getFreq() {
		return Freq;
	}
	public void setFreq(double freq) {
		Freq = freq;
	}
	public String getModul() {
		return Modul;
	}
	public void setModul(String modul) {
		Modul = modul;
	}
	public int getDR() {
		return DR;
	}
	public void setDR(int dR) {
		DR = dR;
	}
	public double getBW() {
		return BW;
	}
	public void setBW(double bW) {
		BW = bW;
	}
	public int getSize() {
		return Size;
	}
	public void setSize(int size) {
		Size = size;
	}
	public char getPayload() {
		return Payload;
	}
	public void setPayload(char payload) {
		Payload = payload;
	}
	public boolean isIsValid() {
		return IsValid;
	}
	public void setIsValid(boolean isValid) {
		IsValid = isValid;
	}
	
	
}
