package book3;

public class thingy {
	public Integer fart_count = 0;
	public Boolean doLoudFarts = false;
	
	public thingy(Integer fart_count) {
		this.fart_count = fart_count * 10;
	}
	
	public thingy(Integer fart_count, Boolean doLoudFarts) {
		this(fart_count);
		this.doLoudFarts = doLoudFarts;
	}
	
	public void doFarts() {
		for(Integer i = 1; i <= fart_count; i++) {
			IOPlus.println("Fart #" + i);
			if(doLoudFarts) IOPlus.println("PHHHBBBBTTT!!!");
		}
	}

}
