package conversor;

public class Conversor {

	public Conversor() {};
	
	public boolean isOperable(String receibed) {
		try {
	        double number = Double.parseDouble(receibed);
	        return true;
	    } catch (NumberFormatException e) {
	        return false;
	    }
	}
	public Double convertCurrency(String toConvert,int coin) {
		double converted=Double.parseDouble(toConvert);
		double result=0;
		switch(coin) {
		case 1:
			result=converted * 0.059;
            break;
        case 2:
        	result=(converted * 0.053);
            break;
        case 3:
        	result=(Math.round((converted * 0.045)));
            break;
        case 4:
        	result=(Math.round(converted * 8.31));
            break;
        case 5:
        	result=converted * 75.55;
            break;
        case 6:
        	result=(converted * 16.83);
            break;
        case 7:
        	result=(converted * 18.71);
            break;
        case 8:
        	result=(converted * 21.82);
            break;
        case 9:
        	result=(converted * 0.12);
            break;
        case 10:
        	result=(converted * 0.013);
            break;	
		}
		return result;
		
	}
	
	public double convertTemp(String toConvert,int temp) {
		double result=0, converted=Double.parseDouble(toConvert);
		switch(temp){
		case 1:
			result=(converted * 9 / 5) + 32;
			break;
		case 2:
			result=(converted + 273.15);
			break;
		case 3:
			result=((converted - 32) * 5 / 9);
			break;
		case 4:
			result=(converted - 273.15);
			break;
		
		}
		return result;
	}
	public double convertLong(String toConvert, int longs) {
		double result=0;
		double converted=Double.parseDouble(toConvert);
		switch(longs) {
		case 1:
			result=(converted * 0.621371);
			break;
		case 2:
			result=(converted * 1.60934);
			break;
			
		}
		
		return result;
	}
	
}