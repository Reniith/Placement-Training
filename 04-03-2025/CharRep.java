class Methods extends CharRep{
    void NoBuilt(){
        String in = "t4hj5ui";
            for(int i = 0; i<in.length(); i++) {
                if(Character.isLetter(in.charAt(i))) {
                    System.out.print(in.charAt(i));
                }
                else if(Character.isDigit(in.charAt(i))) {
                    int lim = in.charAt(i)-'0';
                    for(int j = 0; j<lim-1; j++) {
                            if(i>1) {
                                System.out.print(in.charAt(i-2) +""+ in.charAt(i-1));
                            }
                            else
                                System.out.print(in.charAt(i-1));
                    }
                }
            }
        
        
    }
}

public class CharRep {
    public static void main(String[] args){
        Methods g =new Methods();
        g.NoBuilt();
    }
}
