
class ISRO{

	//Band Spectrum bs 
	//NO of testing sites ts
        int bs=10;

        static int ts=20;

        static{
                System.out.println("Headquater of ISRO in Bangluru");
        }

        ISRO(){
                System.out.println("ISRO centers");
        }

        void m1(){
                System.out.println("Naval Protection");
        }

        static void m2(){
                System.out.println("Testing Facility");
        }
}

class Agnikul extends ISRO{

	//agnikul testing sites ats
	//shocase gallary sg
        int ats=10;

        static int sg=20;

        static{
                System.out.println("Headquater Of Agnikul in Chennai");
        }
	
	Agnikul(){
                System.out.println("Launch Sites of Agnikul");
        }

        void m3(){
                System.out.println("3D Printed Engines");
        }

        static void m4(){
                System.out.println("Satellite Internet");
	}
}

class Space{
	public static void main(String...args){
		Agnikul obj=new Agnikul();
		ISRO obj2=new ISRO();
		obj.m1();
		Agnikul.m2();
		obj.m3();
		Agnikul.m4();
	}
}
