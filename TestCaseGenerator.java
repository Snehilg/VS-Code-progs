import java.io.*;
import java.util.*;
class TestCaseGenerator{
    public static void main(String[] args)throws IOException {

        ArrayList<String> input = new ArrayList<>();
        ArrayList<String> output = new ArrayList<>();

        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Random rm = new Random();
        
        /* Write Your Code Here. */
        
        for(int ii=00;ii<50;ii++){
            String in="";
            String out="";

            int n=rm.nextInt(100000)+10;
            in+=binaryString(n);

            if(in.charAt(0)=='1' && in.charAt(n-1)=='1')    out+="0";
            else if(in.charAt(0)=='0' && in.charAt(n-1)=='0')    out+="1";
            else    out+="either";

            //System.out.println(in);
            System.out.println(out);

            input.add(in);
            output.add(out);
        }//for 
        
        try{
            for(int i = 0; i < input.size(); i++){
                String count = String.valueOf(i);
                if(i / 10 == 0) count = "0" + count;
                FileWriter fw = new FileWriter("Result/input/input" + count + ".txt");
                fw.write(input.get(i));
                fw.close();
            }
        }
        catch (Exception e){
            System.out.println(e);
        }

        try{
            for(int i = 0; i < output.size(); i++){
                String count = String.valueOf(i);
                if(i / 10 == 0) count = "0" + count;
                FileWriter fw = new FileWriter("Result/output/output" + count + ".txt");
                fw.write(output.get(i));
                fw.close();
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    static String binaryString(int n){
        String s="";
        for(int i = 0; i < n; i++)
            {
                int x = (1 + (int)(Math.random() * 100)) % 2;
                s = s + String.valueOf(x);
            }
        return s;
    }

    static String randomIntArray(int[] arr,int l, int r){
        Random rand = new Random();
        String str = "";
        for(int i = 0; i < arr.length; i++){
            arr[i] = rand.ints(l, (r + 1)).findFirst().getAsInt();
            str += (String.valueOf(arr[i]) + " ");
        }
        return str;
    }

    static String randomString(int n){
 
        // choose a Character random from this String
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "abcdefghijklmnopqrstuvxyz";
        
        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(n);
        
        for (int i = 0; i < n; i++) {
        
        // generate a random number between
        // 0 to AlphaNumericString variable length
        int index
            = (int)(AlphaNumericString.length()
            * Math.random());
        
        // add Character one by one in end of sb
        sb.append(AlphaNumericString
            .charAt(index));

        }

        return sb.toString();
    }
 
}

/*randomize array
for (int i=0; i<arr.length; i++) {
		        int randomPosition = rm.nextInt(arr.length);
		        int temp = arr[i];
		        arr[i] = arr[randomPosition];
		        arr[randomPosition] = temp;
		}
*/
