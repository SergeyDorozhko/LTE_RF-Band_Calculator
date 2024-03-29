package by.dorozhko.LTE_Calc.Calculation;

public class CalcingFDD {
	private int band;
	private double dlRF;
	private double ulRF;	
	
	
	public void startCalc(int dlEARFCN,int ulEARFCN) {
	
		if(dlEARFCN<=599) {
			band=1;
			dlRF = ConstLTE.RF_DL_BAND_1 + 0.1 * (dlEARFCN - ConstLTE.DL_BAND_1);
            ulRF = ConstLTE.RF_UL_BAND_1 + 0.1 * (ulEARFCN - ConstLTE.UL_BAND_1);
		}else if(dlEARFCN>=600 && dlEARFCN<=1199) {
			band=2;
			dlRF = ConstLTE.RF_DL_BAND_2 + 0.1 * (dlEARFCN - ConstLTE.DL_BAND_2);
            ulRF = ConstLTE.RF_UL_BAND_2 + 0.1 * (ulEARFCN - ConstLTE.UL_BAND_2);
		}else if(dlEARFCN>=1199 && dlEARFCN<=1949) {
			band=3;
			dlRF = ConstLTE.RF_DL_BAND_3 + 0.1 * (dlEARFCN - ConstLTE.DL_BAND_3);
            ulRF = ConstLTE.RF_UL_BAND_3 + 0.1 * (ulEARFCN - ConstLTE.UL_BAND_3);
		}else if(dlEARFCN>=1950 && dlEARFCN<=2399) {
			band=4;
			dlRF = ConstLTE.RF_DL_BAND_4 + 0.1 * (dlEARFCN - ConstLTE.DL_BAND_4);
            ulRF = ConstLTE.RF_UL_BAND_4 + 0.1 * (ulEARFCN - ConstLTE.UL_BAND_4);
		}else if(dlEARFCN>=2400 && dlEARFCN<=2649) {
			band=5;
			dlRF = ConstLTE.RF_DL_BAND_5 + 0.1 * (dlEARFCN - ConstLTE.DL_BAND_5);
            ulRF = ConstLTE.RF_UL_BAND_5 + 0.1 * (ulEARFCN - ConstLTE.UL_BAND_5);
		}else if(dlEARFCN>=2650 && dlEARFCN<=2749) {
			band=6;
			dlRF = ConstLTE.RF_DL_BAND_6 + 0.1 * (dlEARFCN - ConstLTE.DL_BAND_6);
            ulRF = ConstLTE.RF_UL_BAND_6 + 0.1 * (ulEARFCN - ConstLTE.UL_BAND_6);
		}else if(dlEARFCN>=2750 && dlEARFCN<=3449) {
			band=7;
			dlRF = ConstLTE.RF_DL_BAND_7 + 0.1 * (dlEARFCN - ConstLTE.DL_BAND_7);
            ulRF = ConstLTE.RF_UL_BAND_7 + 0.1 * (ulEARFCN - ConstLTE.UL_BAND_7);
		}else if(dlEARFCN>=3450 && dlEARFCN<=3799) {
			band=8;
			dlRF = ConstLTE.RF_DL_BAND_8 + 0.1 * (dlEARFCN - ConstLTE.DL_BAND_8);
            ulRF = ConstLTE.RF_UL_BAND_8 + 0.1 * (ulEARFCN - ConstLTE.UL_BAND_8);
		}else if(dlEARFCN>=3800 && dlEARFCN<=4149) {
			band=9;
			dlRF = ConstLTE.RF_DL_BAND_9 + 0.1 * (dlEARFCN - ConstLTE.DL_BAND_9);
            ulRF = ConstLTE.RF_UL_BAND_9 + 0.1 * (ulEARFCN - ConstLTE.UL_BAND_9);
		}else if(dlEARFCN>=4150 && dlEARFCN<=4749) {
			band=10;
			dlRF = ConstLTE.RF_DL_BAND_10 + 0.1 * (dlEARFCN - ConstLTE.DL_BAND_10);
            ulRF = ConstLTE.RF_UL_BAND_10 + 0.1 * (ulEARFCN - ConstLTE.UL_BAND_10);
		}else if(dlEARFCN>=4750 && dlEARFCN<=4949) {
			band=11;
			dlRF = ConstLTE.RF_DL_BAND_11 + 0.1 * (dlEARFCN - ConstLTE.DL_BAND_11);
            ulRF = ConstLTE.RF_UL_BAND_11 + 0.1 * (ulEARFCN - ConstLTE.UL_BAND_11);
		}else if(dlEARFCN>=5010 && dlEARFCN<=5179) {
			band=12;
			dlRF = ConstLTE.RF_DL_BAND_12 + 0.1 * (dlEARFCN - ConstLTE.DL_BAND_12);
            ulRF = ConstLTE.RF_UL_BAND_12 + 0.1 * (ulEARFCN - ConstLTE.UL_BAND_12);
		}else if(dlEARFCN>=5180 && dlEARFCN<=5279) {
			band=13;
			dlRF = ConstLTE.RF_DL_BAND_13 + 0.1 * (dlEARFCN - ConstLTE.DL_BAND_13);
            ulRF = ConstLTE.RF_UL_BAND_13 + 0.1 * (ulEARFCN - ConstLTE.UL_BAND_13);
		}else if(dlEARFCN>=5280 && dlEARFCN<=5379) {
			band=14;
			dlRF = ConstLTE.RF_DL_BAND_14 + 0.1 * (dlEARFCN - ConstLTE.DL_BAND_14);
            ulRF = ConstLTE.RF_UL_BAND_14 + 0.1 * (ulEARFCN - ConstLTE.UL_BAND_14);
		}else if(dlEARFCN>=5730 && dlEARFCN<=5849) {
			band=17;
			dlRF = ConstLTE.RF_DL_BAND_17 + 0.1 * (dlEARFCN - ConstLTE.DL_BAND_17);
            ulRF = ConstLTE.RF_UL_BAND_17 + 0.1 * (ulEARFCN - ConstLTE.UL_BAND_17);
		}else if(dlEARFCN>=5850 && dlEARFCN<=5999) {
			band=18;
			dlRF = ConstLTE.RF_DL_BAND_18 + 0.1 * (dlEARFCN - ConstLTE.DL_BAND_18);
            ulRF = ConstLTE.RF_UL_BAND_18 + 0.1 * (ulEARFCN - ConstLTE.UL_BAND_18);
		}else if(dlEARFCN>=6000 && dlEARFCN<=6149) {
			band=19;
			dlRF = ConstLTE.RF_DL_BAND_19 + 0.1 * (dlEARFCN - ConstLTE.DL_BAND_19);
            ulRF = ConstLTE.RF_UL_BAND_19 + 0.1 * (ulEARFCN - ConstLTE.UL_BAND_19);
		}else if(dlEARFCN>=6150 && dlEARFCN<=6449) {
			band=20;
			dlRF = ConstLTE.RF_DL_BAND_20 + 0.1 * (dlEARFCN - ConstLTE.DL_BAND_20);
            ulRF = ConstLTE.RF_UL_BAND_20 + 0.1 * (ulEARFCN - ConstLTE.UL_BAND_20);
		}else if(dlEARFCN>=6450 && dlEARFCN<=6599) {
			band=21;
			dlRF = ConstLTE.RF_DL_BAND_21 + 0.1 * (dlEARFCN - ConstLTE.DL_BAND_21);
            ulRF = ConstLTE.RF_UL_BAND_21 + 0.1 * (ulEARFCN - ConstLTE.UL_BAND_21);
		}else if(dlEARFCN>=7500 && dlEARFCN<=7699) {
			band=23;
			dlRF = ConstLTE.RF_DL_BAND_23 + 0.1 * (dlEARFCN - ConstLTE.DL_BAND_23);
            ulRF = ConstLTE.RF_UL_BAND_23 + 0.1 * (ulEARFCN - ConstLTE.UL_BAND_23);
		}else if(dlEARFCN>=7700 && dlEARFCN<=8039) {
			band=24;
			dlRF = ConstLTE.RF_DL_BAND_24 + 0.1 * (dlEARFCN - ConstLTE.DL_BAND_24);
            ulRF = ConstLTE.RF_UL_BAND_24 + 0.1 * (ulEARFCN - ConstLTE.UL_BAND_24);
		}else if(dlEARFCN>=8040 && dlEARFCN<=8689) {
			band=25;
			dlRF = ConstLTE.RF_DL_BAND_25 + 0.1 * (dlEARFCN - ConstLTE.DL_BAND_25);
            ulRF = ConstLTE.RF_UL_BAND_25 + 0.1 * (ulEARFCN - ConstLTE.UL_BAND_25);
		}else {
			band=0;
		}
		
		
	}
	
	public int getBand() {
		return band;
	}
	public double getDLRF() {
		return dlRF;
	}
	public double getULRF() {
		return ulRF;
	}
}
