package edunova;

import static edunova.E05MetodaV4.slucajniBroj;

/**
* Ucenje metoda
* @author Antonio
* 2021
*/
public class E01Metode {

static int naRaziniKlase;

/**
* POTPIS METODE
* public - način pristupa
* static - može se izvoditi bez kreiranje instance
* void - tip
* naziv metode (main)
* (u zagradi) lista parametara koje metoda prima. Parametri su odvojeni zarezom
* @param args
*/
public static void main(String[] parametarMetode) {
int unutarMetode=0;
System.out.println("Hello");

//E02MetodaV1.odradiPosao();
//E02MetodaV1.packageScope();
//E03MetodaV2.ispisi(2, 3);
//E03MetodaV2.ispisi('c');
//E03MetodaV2.ispisi('a',5);
int i= E04MetodaV3.zbroji(5, 4);
System.out.println(i);
System.out.println(E04MetodaV3.zbroji(3, 4));


var r = E04MetodaV3.zbroji(7,6);

//static int apsolutnaVrijednost(int i) {
//	i*-1;
//}

System.out.println(E05MetodaV4.slucajniBroj());

System.out.println(slucajniBroj());

}

static boolean isPrime(int number) {
	boolean prime=true;
	for(int i=2;i<number;i++) {
		if(number%i==0) {
			prime=false;
		}
	}
	
	return prime;
}



}