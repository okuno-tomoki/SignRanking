package signRanking;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class SignRankingMain {

	public static void main(String[] args) throws InterruptedException {
		try {
		Scanner scanner = new Scanner(System.in)	;
            int num1 = inputNum("1~12の数を入れてください", scanner);
            System.out.println( num1 + "月ですね");
            
            Scanner scanner1 = new Scanner(System.in)	;
            int num2 = inputNum2("1~31の数を入れてください", scanner1);
            System.out.println( num2 + "日ですね");

            String nu =  birthday_check (num1,num2);
            
            System.out.println("ランキングを出します\n少しお待ちください");
		List<Sign> nummber = new ArrayList<Sign>();
		String[]  name = { "山羊座",  "水瓶座",  "魚座",  "牡羊座"
				, "牡牛座",  "双子座",  "蟹座",  "獅子座",  "乙女座"
				, "天秤座" ,  "蠍座" , "射手座" };
		
		for(int i = 0; i < name.length; i++ ) {
	
		int n = new java.util.Random().nextInt(101);
		nummber.add(new Sign(name[i], n));
		}
		
		Collections.sort(nummber, new SignComparator ());
		 
		Thread.sleep(2500);
		int k = SignSeach(nummber,nu);
		System.out.println(13-k+ "位です" + nu + "の点数は"
				+  nummber.get(k-1).num  +  "点です");
		System.out.println("他の星座の順位はこちらです");
		
		System.out.println("  ");
		System.out.println("  ");
		Thread.sleep(5000);
		
       for(int p=0 ; p<nummber.size() ; p++){
			System.out.println
			((12-p)+ "位の" +  nummber.get(p).name + "の点数は"
			+  nummber.get(p).num  +  "点です");
			Thread.sleep(1250);
       	}
		}catch(NullPointerException e) {
			System.out.println("エラーが起きたので停止します。");
		}finally{
			System.out.println("終了します。");
		}
	}

	static int inputNum(String message, Scanner sc) {
	    while(true) {
	        System.out.println(message);
	        try {
	            int ret = Integer.parseInt(sc.nextLine());
	            if(0 < ret && ret <= 12) {
	                return ret;
	            }System.out.println(ret +"月はありません\nもう一回入力してください");
	        } 
	        catch(Exception e) {
	        	System.out.println("文字の入力でした\n数字をいれてください！");
	        }
	    }
	}
	 static String birthday_check (int mouth , int day) {
	    	if(3 ==mouth && day >=21 || 4 ==mouth && day<=19  ) {
	            System.out.println("あなたは、牡羊座です。");
	           String o= "牡羊座";
	            return o;
	        } else if(4 ==mouth && day >=20 || 5==mouth && day<=20  ) {
	        	
	            System.out.println("あなたは、牡牛座です。");
	            String o= "牡牛座";
	            return o;
	        } else if(5 ==mouth && day >=21 || 6==mouth && day<=21  ) {
	        	
	            System.out.println("あなたは、双子座です。");
	            String o= "双子座";
	            return o;
	        } else if(6 ==mouth && day >=22 || 7==mouth && day<=22  ) {
	        	
	            System.out.println("あなたは、蟹座です。");
	            String o= "蟹座";
	            return o;
	        } else if(7 ==mouth && day >=23 || 8==mouth && day<=22  ) {
	        	
	            System.out.println("あなたは、獅子座です。");
	            String o= "獅子座";
	            return o;
	        } else if(8 ==mouth && day >=23 || 9==mouth && day<=22  ) {
	        	
	            System.out.println("あなたは、乙女座です。");
	            String o= "乙女座";
	            return o;
	        } else if(9 ==mouth && day >=23 || 10==mouth && day<=23  ) {
	        	
	            System.out.println("あなたは、天秤座です。");
	            String o= "天秤座";
	            return o;
	        } else if(10 ==mouth && day >=24 || 11==mouth && day<=22  ) {
	        	
	            System.out.println("あなたは、蠍座です。");
	            String o= "蠍座";
	            return o;
	        } else if(11 ==mouth && day >=23 || 12==mouth && day<=21  ) {
	        	
	            System.out.println("あなたは、射手座です。");
	            String o= "射手座";
	            return o;
	        } else if(12 ==mouth && day >=22 || 1==mouth && day<=20  ) {
	        	
	            System.out.println("あなたは、山羊座です。");
	            String o= "山羊座";
	            return o;
	        } else if(1 ==mouth && day >=21 || 2==mouth && day<=18  ) {
	        	
	            System.out.println("あなたは、水瓶座です。");
	            String o= "水瓶座";
	            return o;
	        } else if(2 ==mouth && day >=19 || 3==mouth && day<=20  ) {
	        	
	            System.out.println("あなたは、魚座です。");
	            String o= "魚座";
	            return o;
	        }
			return null;
			
	    }
    
static int inputNum2(String message, Scanner scanner) {
        while(true) {
            System.out.println(message);
            try {
                int ret = Integer.parseInt(scanner.nextLine());
                if(0 < ret && ret <= 31) {
                	
                    return ret;
                }System.out.println(ret +"日はありません\\nもう一回入力してください");
                
        } catch(Exception e) {
        	System.out.println("文字の入力でした\\n数字をいれてください！");
        }
        }
    }
    
    

    public static int SignSeach(List<Sign> nummber ,String word) {
    	int count =0;
    	if(word.equals("山羊座")) {
    	for(int u = 0 ; u<nummber.size();u++) {
    		 count++;
    		if( nummber.get(u).name.equals("山羊座")) {
    			 return count;
    		}
    	}}
    	if(word.equals("魚座")) {
        	for(int u = 0 ; u<nummber.size();u++) {
        		 count++;
        		if( nummber.get(u).name.equals("魚座")) {
        			 return count;
        		}
        	}}
    	if(word.equals("水瓶座")) {
    	for(int u = 0 ; u<nummber.size();u++) {
   		 count++;
   		if( nummber.get(u).name.equals("水瓶座")) {
   			 return count;
   		}
   	}}
    	if(word.equals("牡羊座")) {
    	for(int u = 0 ; u<nummber.size();u++) {
		 count++;
		if( nummber.get(u).name.equals("牡羊座")) {
			 return count;
		}
	}}
    	if(word.equals("牡牛座")) {
    	for(int u = 0 ; u<nummber.size();u++) {
		 count++;
		if(  nummber.get(u).name.equals("牡牛座")) {
			 return count;
		}
	}}
    	if(word.equals("双子座")) {
    	for(int u = 0 ; u<nummber.size();u++) {
		 count++;
		if( nummber.get(u).name.equals("双子座")) {
			 return count;
		}
	}}if(word.equals("蟹座")) {
    	for(int u = 0 ; u<nummber.size();u++) {
		 count++;
		if( nummber.get(u).name.equals("蟹座")) {
			 return count;
		}
	}}
	if(word.equals("獅子座")) {
    	for(int u = 0 ; u<nummber.size();u++) {
		 count++;
		if( nummber.get(u).name.equals("獅子座")) {
			 return count;
		}
	}}
	if(word.equals("乙女座")) {
    	for(int u = 0 ; u<nummber.size();u++) {
		 count++;
		if( nummber.get(u).name.equals("乙女座")) {
			 return count;
		}
	}}
	if(word.equals("天秤座")) {
    	for(int u = 0 ; u<nummber.size();u++) {
		 count++;
		if( nummber.get(u).name.equals("天秤座")) {
			 return count;
		}
	}}
	if(word.equals("蠍座")) {
    	for(int u = 0 ; u<nummber.size();u++) {
		 count++;
		if( nummber.get(u).name.equals("蠍座")) {
			 return count;
		}
	}}
	if(word.equals("射手座")) {
    	for(int u = 0 ; u<nummber.size();u++) {
		 count++;
		if( nummber.get(u).name.equals("射手座")) {
			 return count;
		}
	
    	}}return 13;
}
 }

