class Meth extends ReverseLine{
    void RevLine(){
        String str ="I Love Java Programming";
        String result = "", word = "";
        boolean spaceFound = false;
            
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                word = ch + word;
                spaceFound = false;
            } else if(!spaceFound && !word.isEmpty()){
                result += word + " ";
                word = "";
                spaceFound = true;
            }
        }
        result += word; 

        System.out.print(result);
    }
}

public class ReverseLine {
    public static void main(String[] args) {
        Meth g = new Meth();
        g.RevLine();
    }
}
