package imanage;

public class Test {

    public static void main(String arg[]){

        System.out.println(isValidTime("02:23:00"));
    }


    /**
     * HH:MM:SS
     * 23: 59:59
     * @param time
     * @return
     *
     * [0-23]{2}:[]
     */
    public static boolean isValidTime(String time){
        String arr [] = time.split(":");
        if(arr.length==3){
            int h =Integer.parseInt(arr[0]);
            int m =Integer.parseInt(arr[1]);
            int s= Integer.parseInt(arr[2]);
            if(h<=23 && m<=59 && s<=59 && h>=0 && m>=0 && s>=0){
                return true;
            }
        }
        return false;
    }
    public void method(){

        String p="111";
        String q="999999";

        int sizeP=p.length()-1;
        int sizeQ=q.length()-1;
        String output="";
        while(sizeP>=0 && sizeQ>=0){
            int a =Integer.parseInt(p.charAt(sizeP) + "");
            int b = Integer.parseInt(q.charAt(sizeQ) + "");
            int c = (a+b)%10;
            output=c+output;
            sizeP--;
            sizeQ--;
        }
        for(int i=0;i<=sizeP;i++){
            output=p.charAt(i)+output;
        }
        for(int i=0;i<=sizeQ;i++){
            output=q.charAt(i)+output;
        }
        System.out.println(Integer.parseInt(output));
    }

}
