package kreditas;

public class bkreditas extends Kreditai { //paveldziu super klase
private double pa;

    public bkreditas(double a, double k, double l, double is) {
        super(a, k, l, is);
        this.pa =pa;
    }
	
	public bkreditas ()
        {
            super(0,0,0,0);
            this.pa=0;
        }
	
	public void kreditas(){
		
		double Vimk, Ksum; //papildomi kintamieji
		
		if(this.getIs()<5000)
				if(pa<=50)
				{		Ksum=this.kreditosuma(this.getK(),this.getL());
						Vimk=imokosAp(Ksum, this.getL());
						if(((Vimk/this.getA())*100)<=40)
							System.out.println("Kredit� suteikti galima!" + " "
									+ "Viso gra�inti reik�s: " + Ksum + " " 
									+ "Men�sin� �moka bus: " + Vimk);
							else System.out.println("Kredito suteikti negalime! ");}
						else System.out.println("Kredito suteikti negalime! Pastatas Persenas!");
		else System.out.println("Kredito suteikti negalime! J�s� �siskolinimai per dideli");	
		
	}

    void setDuom(double PajamosB, double Ksuma, int laik, double skolos, int pam) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
}