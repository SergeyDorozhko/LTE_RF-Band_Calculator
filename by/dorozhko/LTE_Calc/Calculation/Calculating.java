package by.dorozhko.LTE_Calc.Calculation;

public class Calculating {

		
		public String startCalc(String inEARFCN) {
			String result=null;
		try {	
			
			int inputEARFCN=Integer.parseInt(inEARFCN);
			String technology=null;
			int dlEARFCN=0;
			int ulEARFCN=0;
			
			int band=0;
			double dlRF=0;
			double ulRF=0;
			CalcingFDD calcFDD=new CalcingFDD();
			
			if(inputEARFCN>=0&&inputEARFCN<8690) {
				technology="FDD";
				dlEARFCN=inputEARFCN;
				ulEARFCN=inputEARFCN+18000;
				calcFDD.startCalc(dlEARFCN, ulEARFCN);
				band=calcFDD.getBand();
				if(band!=0) {
				dlRF=calcFDD.getDLRF();
				ulRF=calcFDD.getULRF();
				result="\tРезультат:\n"+"Технология: "+technology+"\n"+"Band: "+band+"\n\n"+"DL EARFCN: "+dlEARFCN+""+"\t"+"UL EARFCN: "+ulEARFCN+"\n\n"+"DL Frequency: "+dlRF+"\t"+"UL Frequency: "+ulRF;

					}else {
					result="Ошибка значения EARFCN\nдля FDD:\nDownLink: 0-4949, 5010-5379, 5730-6599, 7500-8689;\nUplink:18000-22949, 23010-23379, 23730-24599, 25500-26689;\n\n для TDD: 36000-45589;";
					
					}
			}else if(inputEARFCN>=18000&&inputEARFCN<26690) {
				technology="FDD";
				ulEARFCN=inputEARFCN;
				dlEARFCN=inputEARFCN-18000;
				calcFDD.startCalc(dlEARFCN, ulEARFCN);
				band=calcFDD.getBand();
				if(band!=0) {
					dlRF=calcFDD.getDLRF();
					ulRF=calcFDD.getULRF();
					result="\tРезультат:\n"+"Технология: "+technology+"\n"+"Band: "+band+"\n\n"+"DL EARFCN: "+dlEARFCN+""+"\t"+"UL EARFCN: "+ulEARFCN+"\n\n"+"DL Frequency: "+dlRF+"\t"+"UL Frequency: "+ulRF;
	
					}else {
						result="Ошибка значения EARFCN\nдля FDD:\nDownLink: 0-4949, 5010-5379, 5730-6599, 7500-8689;\nUplink:18000-22949, 23010-23379, 23730-24599, 25500-26689;\n\n для TDD: 36000-45589;";

					}
			}else if(inputEARFCN>=36000 && inputEARFCN<45590) {
				technology="TDD";
								
				CalcingTDD calcTDD=new CalcingTDD();
				calcTDD.startCalcingTDD(inputEARFCN); // в TDD UL RF = DL RF
				
				result="\tРезультат:\n"+"Технология: "+technology+"\n"+"Band: "+calcTDD.getBand()+"\n\n"+"EARFCN: "+inputEARFCN+""+"\n\n"+"Frequency: "+calcTDD.startCalcingTDD(inputEARFCN);

			}else {
				result="Ошибка значения EARFCN\nдля FDD:\nDownLink: 0-4949, 5010-5379, 5730-6599, 7500-8689;\nUplink:18000-22949, 23010-23379, 23730-24599, 25500-26689;\n\n для TDD: 36000-45589;";
				
			}
					
		return	result;
		}catch (NumberFormatException ex) {
		return	result="Ошибка значения EARFCN.\nНеобходимо ввести: \n-целое положительно число; \n-допустимый диапазон:\nдля FDD:\n\nDownLink: 0-4949, 5010-5379, 5730-6599, 7500-8689;\n\nUplink:18000-22949, 23010-23379, 23730-24599, 25500-26689;\n\nдля TDD: 36000-45589;\n\nvalue:\n"+ex;
		}
	}

}
