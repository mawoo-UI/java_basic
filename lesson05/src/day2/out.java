package day2;

public class out {

	int money =123456;
	int[] units = {50000,10000,5000,1000,500,100,50,10,5,1};
	int[] counts = new int [10];
	
	int oman = (money/ 50000);
	int ilman =(money % 50000/ 10000);
	int ochaun =(money % 10000/ 5000);
	int ilchun =(money % 5000/ 1000);
	int obackwon =(money % 1000/ 500);
	int backwon =(money % 500/ 100);
	int oshipwon = (money % 100 / 10);
	int shipwon = (money % 100 / 10);
	int owon =(money % 10 / 5);
	int ilwon=(money % 5 / 1);
}
