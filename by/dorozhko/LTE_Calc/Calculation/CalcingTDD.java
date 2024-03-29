package by.dorozhko.LTE_Calc.Calculation;

public class CalcingTDD {
private int band=0;
private double radioFrequancy=0;
private int rfBand;
private int startEARFCN;

	public double startCalcingTDD(int tddEARFCN) {
		
		if (tddEARFCN>=36000 && tddEARFCN<=36199) {
			band=33;
			rfBand=ConstLTE.RF_BAND_33;
			startEARFCN=ConstLTE.BAND_33;
		}else if(tddEARFCN>=36200 && tddEARFCN<=36349) {
			band=34;
			rfBand=ConstLTE.RF_BAND_34;
			startEARFCN=ConstLTE.BAND_34;
		}else if(tddEARFCN>=36350 && tddEARFCN<=36949) {
			band=35;
			rfBand=ConstLTE.RF_BAND_35;
			startEARFCN=ConstLTE.BAND_35;
		}else if(tddEARFCN>=36950 && tddEARFCN<=37549) {
			band=36;
			rfBand=ConstLTE.RF_BAND_36;
			startEARFCN=ConstLTE.BAND_36;
		}else if(tddEARFCN>=37550 && tddEARFCN<=37749) {
			band=37;
			rfBand=ConstLTE.RF_BAND_37;
			startEARFCN=ConstLTE.BAND_37;
		}else if(tddEARFCN>=37750 && tddEARFCN<=38249) {
			band=38;
			rfBand=ConstLTE.RF_BAND_38;
			startEARFCN=ConstLTE.BAND_38;
		}else if(tddEARFCN>=38250 && tddEARFCN<=38649) {
			band=39;
			rfBand=ConstLTE.RF_BAND_39;
			startEARFCN=ConstLTE.BAND_39;
		}else if(tddEARFCN>=38650 && tddEARFCN<=36349) {
			band=34;
			rfBand=ConstLTE.RF_BAND_34;
			startEARFCN=ConstLTE.BAND_34;
		}else if(tddEARFCN>=36200 && tddEARFCN<=39649) {
			band=40;
			rfBand=ConstLTE.RF_BAND_40;
			startEARFCN=ConstLTE.BAND_40;
		}else if(tddEARFCN>=39650 && tddEARFCN<=41589) {
			band=41;
			rfBand=ConstLTE.RF_BAND_41;
			startEARFCN=ConstLTE.BAND_41;
		}else if(tddEARFCN>=41590 && tddEARFCN<=43589) {
			band=42;
			rfBand=ConstLTE.RF_BAND_42;
			startEARFCN=ConstLTE.BAND_42;
		}else if(tddEARFCN>=43590 && tddEARFCN<=45589) {
			band=43;
			rfBand=ConstLTE.RF_BAND_43;
			startEARFCN=ConstLTE.BAND_43;	
		}else {
			band=0;
		}
		
		radioFrequancy=rfBand + 0.1 * (tddEARFCN - startEARFCN);
		return radioFrequancy;
	}
	public int getBand() {
		return band;
	}
}
