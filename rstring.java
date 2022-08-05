package practice;

public class rstring {

	public static void main(String[] args) {
//hello
		int i;
		String s="hai",k="";
		for(i=0;i<s.length();i++) {
			char j=s.charAt(i);
			k=j+k;
		}
        System.out.println(k);        
        
        String str="hello";
        StringBuilder t=new StringBuilder();
        t.append(str);
        t.reverse();
        System.out.println(t);
	}
}