package lesson12_api;

import java.util.Arrays;

public class Exer {
	public static void main(String[] args) throws MalformedURLExer {		

	String str = "";
	str ="https://search.naver.com/serch.naver?";
	MyUrl myUrl =new MyUrl ();
	URL url = new URL(str);
//	System.out.println(url.getProtocol));
//	System.out.println(url.getHost);
//	System.out.println(url.getPath());
	
//
	public MyUrl(String url) {
		String str = url;
	}
		String protocol;
		String domain;
		String filename;
		String[] querStrings;

		System.out.println(str.indexOf("://"));
	String protocol = str.substring(0, str.indexOf("://"));
	System.out.println(protocol);
	str = str.substring(str.indexOf("://")+3);
	
	System.out.println(str);
	int idx = str.indexOf("/");	
	if(idx<0) {
		domain = str;
		return;
	}
	domain= str.substring(0,idx); 
		str= str.substring(0,idx);

		idx =str.indexOf("?");
		if(idx < 0) {
			filename = str;
			return;
			System.out.println(str);
		}
		filename= str.strip().substring(0,idx);
		Str = str.substring(idx+1);
		
		if(str.length()==0) {
		reture;
		}
		queryString = str.split("&");
		System.out.println(idx);
	}

	@Override
	public String toString() {
		return super.toString("MyUrl [protocol=");
	}
	public void print() {
		System.out.println("protoco"+"protocol+","domain","filename="+filename + ", queryStrings");
		System.out.println(Arrays.toString(queryStrings));
		for(String[] qs:queryStrings);
	}
}

	
