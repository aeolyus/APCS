/**
 * Class to convert RGB to HSV and HSV to RGB
 * @author: Richard Huang
 */
public class ColorConverter{
    private int red,green,blue;//RGB
    private int hue,sat,value;//HSV
    
    /**
     * Constructor for either rgb or hsv
     * @param type 1 is rgb and 2 is hsv
     * @param value1 first value: red in rgb, hue in hsv
     * @param value2 second value: green in rgb, saturation in hsv
     * @param value3 third value: blue in rgb, brightness in hsv
     */
    public ColorConverter(int type,int value1,int value2,int value3){
        if(type==1){
            red=value1;green=value2;blue=value3;
        } else if(type==2){
            hue=value1;sat=value2;value=value3;
        }
    }
    
    /**
     * Sets rgb
     * @param r red value
     * @param g green value
     * @param b blue value
     */
    public void setRGB(int r,int g,int b){
       red=r;green=g;blue=b;
    }
    
    /**
     * Sets hsv
     * @param h hue value
     * @param s saturation value
     * @param v brightness value
     */
    public void setHSV(int h,int s,int v){
       hue=h;sat=s;value=v; 
    }
    
    /**
     * Private method to get maximum of three numbers
     * @param j first input
     * @param k second input
     * @param l third input
     * @return variable with largest value
     */
    private double getMaximum(double j,double k,double l){
    	if (j>k) {
			if(j>l){return j;}
			else{return l;}
		} else{
			if(k >l) {return k;}
			else{return l;}
		}
    }
    
    /**
     * Private method to get minimum of three numbers
     * @param j first input
     * @param k second input
     * @param l third input
     * @return variable with smallest value
     */
    private double getMinimum(double j,double k,double l){
    	if (j<k) {
			if(j<l){return j;}
			else{return l;}
		} else{
			if(k<l){return k;}
			else{return l;}
		}
    }
    
    /**
     * Calculates hue given rgb values
     * @return hue in terms of hsv
     */
    private int calculateHue(){
    	double redp=red/255.0;
    	double greenp=green/255.0;
    	double bluep=blue/255.0;
    	double cMax=getMaximum(redp, greenp, bluep);
    	double cMin=getMinimum(redp, greenp, bluep);
    	double d=cMax-cMin;
    	int temp=0;
    	if(cMax==redp){
    		temp=60*(int)(((greenp-bluep)/d)%6);
    	}
    	if(cMax==greenp){
    		temp=60*(int)((bluep-redp)/d+2);
    	}
    	if(cMax==bluep){
    		temp=60*(int)((redp-greenp)/d+4);
    	}
    	return temp;
    	//values are wrong if temp var is not used; odd...
    }
    
    /**
     * Calculates saturation given rgb values
     * @return saturation in terms of hsv
     */
    private int calculateSaturation(){
    	double redp=red/255.0;
    	double greenp=green/255.0;
    	double bluep=blue/255.0;
    	double cMax=getMaximum(redp, greenp, bluep);
    	double cMin=getMinimum(redp, greenp, bluep);
    	double d=cMax-cMin;
    	if(cMax==0){
    		return 0;
    	} else{
    		return (int)(100*d/cMax);
    	}      
    }
    
    
    /**
     * Calculates brightness given rgb values
     * @return brightness of in terms of hsv
     */
    private int calculateBrightness(){
    	double redp=red/255.0;
    	double greenp=green/255.0;
    	double bluep=blue/255.0;
        return (int)(100*getMaximum(redp,greenp,bluep));
    }
    
    /**
     * Converts rgb to hsv
     */
    public void RGBtoHSV(){
        hue=calculateHue();
        sat=calculateSaturation();
        value=calculateBrightness();
    }
    
    /**
     * Converts hsv to rgb
     */
    public void HSVtoRGB(){
    	//variables to be used in calculation
    	double c = value/100.0*sat/100.0;
    	double temp,rp,gp,bp;
    	double m = value/100.0-c;
    	//absolute value
    	if((((double)hue/60)%2-1)<0){
    		temp=-(((double)hue/60)%2-1);
    	}else{
    		temp=((double)hue/60)%2-1;
    	}
    	double x = c*(1-(temp));
    	
    	//calculations
    	if(hue>=0&&hue<60){
    		rp=c;gp=x;bp=0;
    	} else if(hue>=60&&hue<120){
    		rp=x;gp=c;bp=0;
    	} else if(hue>=120&&hue<180){
    		rp=0;gp=c;bp=x;
    	} else if(hue>=180&&hue<240){
    		rp=0;gp=x;bp=c;
    	} else if(hue>=240&&hue<300){
    		rp=x;gp=0;bp=c;
    	} else if(hue>=300&&hue<360){
    		rp=c;gp=0;bp=x;
    	} else {
    		rp=gp=bp=0;
    	}
    	
    	//set to rgb
    	red=(int)((rp+m)*255);
    	green=(int)((gp+m)*255);
    	blue=(int)((bp+m)*255);
    	
    	//rounding
    	if(red<255&&red>0){red++;}
    	if(green<255&&green>0){green++;}
    	if(blue<255&&blue>0){blue++;}
    }
    
    /**
     * Prints rbg to hsv conversion
     */
    public void printRGBtoHSV(){
    	char c = 176;
    	System.out.printf("%10s%3d%2s%3d%2s%3d%2s", "\tRGB = (" , red , ", " , green , ", " , blue , ")");
    	System.out.printf("%10s%3d%2s%3d%2s%3d%2s", "HSV = (" , hue , (""+ c+", ") , sat , "%, " , value , "%)\n");
    }
    
    
    /**
     * Prints hsv to rgb conversion
     */
    public void printHSVtoRGB(){
    	char c = 176;
    	System.out.printf("%10s%3d%2s%3d%2s%3d%2s", "HSV = (" , hue , (""+ c+", ") , sat , "%, " , value , "%)");
    	System.out.printf("%10s%3d%2s%3d%2s%3d%2s", "\tRGB = (" , red , ", " , green , ", " , blue , ")\n");
    }

}