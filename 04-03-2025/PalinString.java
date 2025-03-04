class Meth extends PalinString{
    void StringPal(){
        String r = "";
        String s = "aba";
    
        for(int i= s.length() - 1;i>=0;i--) {
            r = r + s.charAt(i);
        }
    
        if(r.equals(s)) {
            System.out.println(r+" is a palindrome.");
        }
        else {
            System.out.println(r+" is not a palindrome.");
        }
    }

    void PalinBuild(){
        String s = "cdc";
        StringBuilder s1 = new StringBuilder(s);

        s1.reverse();

        if (s.equals(s1.toString())){
            System.out.print(s+" is a palindrome.");
        }
        else{
            System.out.print(s+" is not a palindrome.");
        }
    }  
}

public class PalinString {
    public static void main(String[] args) {
        Meth g = new Meth();
        g.StringPal();
    }
}
